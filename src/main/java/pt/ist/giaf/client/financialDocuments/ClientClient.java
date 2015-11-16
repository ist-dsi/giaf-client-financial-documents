package pt.ist.giaf.client.financialDocuments;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.bind.JAXBElement;

import com.google.gson.JsonObject;

import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeIn;
import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeOut;
import pt.indra.mygiaf.services.ist.entities.common.ObjectFactory;
import pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServices;
import pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServicesPortType;

public class ClientClient {

    private static final String PASSWORD;
    static {
        final InputStream stream = ClientClient.class.getResourceAsStream("/configuration.properties");
        final Properties properties = new Properties();
        try {
            properties.load(stream);
            PASSWORD = properties.getProperty("pt.indra.mygiaf.services.ist.istexternalservices.ISTExternalServicesPortType.password");
        } catch (final IOException e) {
            throw new Error(e);
        }
    }

    @SuppressWarnings("restriction")
    private static void addResponse(final JsonObject object, final String property, final JAXBElement<String> value) {
        if (value != null && !value.isNil()) {
            object.addProperty(property, value.getValue());
        }
    }

    public static JsonObject createClient(final JsonObject input) {
        final ISTExternalServices services = new ISTExternalServices();
        final ISTExternalServicesPortType port = services.getISTExternalServicesHttpPort();
        final CriarEntidadeOut service = port.criarEntidade(createEntityInput(input), PASSWORD);

        final JsonObject output = new JsonObject();
        addResponse(output, "errorMessage", service.getMensagemErro());
        return output;
    }

    private static CriarEntidadeIn createEntityInput(final JsonObject o) {
        final ObjectFactory f = new ObjectFactory();

        final CriarEntidadeIn result = new CriarEntidadeIn();
        result.setEntidade(f.createCriarEntidadeInEntidade(get(o, "id")));
        result.setNomeEntidade(f.createCriarEntidadeInNomeEntidade(get(o, "name")));
        result.setNaturezaJuridica(f.createCriarEntidadeInNaturezaJuridica(get(o, "type")));
        result.setPaisOrigemEntidade(f.createCriarEntidadeInPaisOrigemEntidade(get(o, "countryOfVatNumber")));
        result.setNif(f.createCriarEntidadeInNif(get(o, "vatNumber")));
        result.setMorada(f.createCriarEntidadeInMorada(get(o, "address")));
        result.setLocalidade(f.createCriarEntidadeInLocalidade(get(o, "locality")));
        result.setCodigoPostal(f.createCriarEntidadeInCodigoPostal(get(o, "postCode")));
        result.setPaisMoradaAluno(f.createCriarEntidadeInPaisMoradaAluno(get(o, "countryOfAddress")));
        result.setModalidadePagamento(f.createCriarEntidadeInModalidadePagamento(get(o, "paymentMethod")));

        return result;
    }

    private static String get(final JsonObject o, final String p) {
        return o.get(p).getAsString();
    }

}
