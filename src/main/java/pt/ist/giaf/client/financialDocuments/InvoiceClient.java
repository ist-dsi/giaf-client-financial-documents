package pt.ist.giaf.client.financialDocuments;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import pt.indra.mygiaf.services.ist.entities.external.ArrayOfCriarFatSimplSyncInDetalhe;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncIn;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncInDetalhe;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncInMorada;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncOut;
import pt.indra.mygiaf.services.ist.entities.external.ObjectFactory;
import pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServices;
import pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServicesPortType;

public class InvoiceClient {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String PASSWORD;
    static {
        final InputStream stream = InvoiceClient.class.getResourceAsStream("/configuration.properties");
        final Properties properties = new Properties();
        try {
            properties.load(stream);
            PASSWORD = properties.getProperty("pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServicesPortType.password");
        } catch (final IOException e) {
            throw new Error(e);
        }
    }

    public static String toString(final Date d) {
        return new SimpleDateFormat(DATE_FORMAT).format(d);
    }

    public static Date toDate(final String s) {
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(s);
        } catch (final ParseException e) {
            throw new Error(e);
        }
    }

    public static JsonObject produceInvoice(final JsonObject input) {
        final ISTExternalServices services = new ISTExternalServices();
        final ISTExternalServicesPortType port = services.getISTExternalServicesHttpPort();
        final CriarFatSimplSyncOut service = port.criarFatSimplSync(createSimpleInvoiceInput(input), PASSWORD);

        final JsonObject output = new JsonObject();
        addResponse(output, "documentNumber", service.getDocumentoGIAF());
        addResponse(output, "pdfBase64", service.getPDFBase64());
        addResponse(output, "errorMessage", service.getMensagemErro());
        return output;
    }

    @SuppressWarnings("restriction")
    private static void addResponse(final JsonObject object, final String property, final JAXBElement<String> value) {
        if (value != null && !value.isNil()) {
            object.addProperty(property, value.getValue());
        }
    }

    private static CriarFatSimplSyncIn createSimpleInvoiceInput(final JsonObject o) {
        final ObjectFactory f = new ObjectFactory();

        final CriarFatSimplSyncIn result = new CriarFatSimplSyncIn();
        result.setID(f.createCriarFatSimplSyncInID(get(o, "id")));

        result.setDataDocumento(crateXMLDate(get(o, "date")));

        result.setTipoDocumento(f.createCriarFatSimplSyncInTipoDocumento(get(o, "type")));
        result.setSerie(f.createCriarFatSimplSyncInSerie(get(o, "series")));
        result.setGrupoTerceiro(f.createCriarFatSimplSyncInGrupoTerceiro(getInt(o, "group")));
        result.setEntidadeID(f.createCriarFatSimplSyncInEntidadeID(get(o, "clientId")));
        result.setNIF(f.createCriarFatSimplSyncInNIF(get(o, "vatNumber")));
        result.setNome(f.createCriarFatSimplSyncInNome(get(o, "name")));

        result.setMorada(f.createCriarFatSimplSyncInMorada(createSimpleInvoiceInputMorada(f, o)));

        result.setCondicaoPagamentoID(f.createCriarFatSimplSyncInCondicaoPagamentoID(get(o, "paymentType")));
        result.setVendedorID(f.createCriarFatSimplSyncInVendedorID(get(o, "sellerId")));
        result.setCodigoDivisa(f.createCriarFatSimplSyncInCodigoDivisa(get(o, "currency")));
        result.setUnidadeExploracao(f.createCriarFatSimplSyncInUnidadeExploracao(get(o, "accountingUnit")));
        result.setReferencia(f.createCriarFatSimplSyncInReferencia(get(o, "reference")));
        result.setObservacao(f.createCriarFatSimplSyncInObservacao(get(o, "observation")));
        result.setCodigoUtilizador(f.createCriarFatSimplSyncInCodigoUtilizador(get(o, "username")));

        result.setIdDivida(f.createCriarFatSimplSyncInIdDivida(get(o, "invoiceId")));
        final String dataVencimento = get(o, "dueDate");
        if (dataVencimento != null && !dataVencimento.isEmpty()) {
            result.setDataVencimento(crateXMLDate(dataVencimento));
        }
        final String dataPagamento = get(o, "paymentDate");
        if (dataPagamento != null && !dataPagamento.isEmpty()) {
            result.setDataPagamento(crateXMLDate(dataPagamento));
        }
        result.setMeioPagamento(f.createCriarFatSimplSyncInMeioPagamento(get(o, "paymentMethod")));
        result.setNumeroDocumento(f.createCriarFatSimplSyncInNumeroDocumento(get(o, "documentNumber")));

        final ArrayOfCriarFatSimplSyncInDetalhe array = new ArrayOfCriarFatSimplSyncInDetalhe();
        final JsonArray entries = getArray(o, "entries");
        entries.forEach(e -> createSimpleInvoiceInputDetail(array, f, (JsonObject) e));
        result.setDetalhes(f.createCriarFatSimplSyncInDetalhes(array));

        return result;
    }

    private static XMLGregorianCalendar crateXMLDate(final String s) {
        try {
            final GregorianCalendar c = new GregorianCalendar();
            c.setTime(toDate(s));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (final DatatypeConfigurationException e) {
            throw new Error(e);
        }
    }

    private static CriarFatSimplSyncInMorada createSimpleInvoiceInputMorada(final ObjectFactory f, final JsonObject o) {
        final CriarFatSimplSyncInMorada morada = new CriarFatSimplSyncInMorada();
        morada.setPais(f.createCriarFatSimplSyncInMoradaPais(get(o, "country")));
        morada.setCodigoPostal(f.createCriarFatSimplSyncInMoradaCodigoPostal(get(o, "postalCode")));
        morada.setLocalidade(f.createCriarFatSimplSyncInMoradaLocalidade(get(o, "locality")));
        morada.setRua(f.createCriarFatSimplSyncInMoradaRua(get(o, "street")));
        morada.setNumero(f.createCriarFatSimplSyncInMoradaNumero(getInt(o, "doorNumber")));
        return morada;
    }

    private static void createSimpleInvoiceInputDetail(final ArrayOfCriarFatSimplSyncInDetalhe array, final ObjectFactory f,
            final JsonObject o) {
        final CriarFatSimplSyncInDetalhe r = new CriarFatSimplSyncInDetalhe();
        r.setNumeroLinha(f.createCriarFatSimplSyncInDetalheNumeroLinha(getInt(o, "line")));
        r.setTipoLinha(f.createCriarFatSimplSyncInDetalheTipoLinha(get(o, "type")));
        r.setArtigo(f.createCriarFatSimplSyncInDetalheArtigo(get(o, "article")));
        r.setArmazemID(f.createCriarFatSimplSyncInDetalheRubricaContabilidade(get(o, "rubrica")));
        r.setDescricao(f.createCriarFatSimplSyncInDetalheDescricao(get(o, "description")));
        r.setUnidadeMedida(f.createCriarFatSimplSyncInDetalheUnidadeMedida(get(o, "unitType")));
        r.setQuantidade(f.createCriarFatSimplSyncInDetalheQuantidade(getBigDecimal(o, "quantity")));
        r.setPrecoUnitario(f.createCriarFatSimplSyncInDetalhePrecoUnitario(getBigDecimal(o, "unitPrice")));
        r.setTaxaIVA(f.createCriarFatSimplSyncInDetalheTaxaIVA(getBigDecimal(o, "vat")));
        r.setTaxaDesconto(f.createCriarFatSimplSyncInDetalheTaxaDesconto(getBigDecimal(o, "discount")));
        r.setCentroCusto(f.createCriarFatSimplSyncInDetalheCentroCusto(get(o, "costCenter")));
        r.setCentroResponsabilidade(f.createCriarFatSimplSyncInDetalheCentroResponsabilidade(get(o, "responsible")));
        r.setSubcentro(f.createCriarFatSimplSyncInDetalheSubcentro(get(o, "subCenter")));
        r.setArtigoCIVA(f.createCriarFatSimplSyncInDetalheArtigoCIVA(get(o, "legalArticle")));
        r.setObservacao(f.createCriarFatSimplSyncInDetalheObservacao(get(o, "observation")));
        array.getCriarFatSimplSyncInDetalhe().add(r);
    }

    private static String get(final JsonObject o, final String p) {
        final JsonElement v = o.get(p);
        return v == null ? "" : v.getAsString();
    }

    private static Integer getInt(final JsonObject o, final String p) {
        return o.get(p).getAsInt();
    }

    private static BigDecimal getBigDecimal(final JsonObject o, final String p) {
        return o.get(p).getAsBigDecimal();
    }

    private static JsonArray getArray(final JsonObject o, final String p) {
        return o.get(p).getAsJsonArray();
    }

}
