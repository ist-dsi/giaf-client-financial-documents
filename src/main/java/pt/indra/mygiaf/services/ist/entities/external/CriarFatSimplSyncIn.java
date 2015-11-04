
package pt.indra.mygiaf.services.ist.entities.external;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CriarFatSimplSyncIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriarFatSimplSyncIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUtilizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condicaoPagamentoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="detalhes" type="{http://external.entities.ist.services.mygiaf.indra.pt}ArrayOfCriarFatSimplSyncInDetalhe" minOccurs="0"/>
 *         &lt;element name="entidadeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupoTerceiro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDivida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meioPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morada" type="{http://external.entities.ist.services.mygiaf.indra.pt}CriarFatSimplSyncInMorada" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadeExploracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendedorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriarFatSimplSyncIn", propOrder = {
    "id",
    "nif",
    "codigoDivisa",
    "codigoUtilizador",
    "condicaoPagamentoID",
    "dataDocumento",
    "dataPagamento",
    "dataVencimento",
    "detalhes",
    "entidadeID",
    "grupoTerceiro",
    "idDivida",
    "meioPagamento",
    "morada",
    "nome",
    "numeroDocumento",
    "observacao",
    "referencia",
    "serie",
    "tipoDocumento",
    "unidadeExploracao",
    "vendedorID"
})
public class CriarFatSimplSyncIn {

    @XmlElementRef(name = "ID", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "NIF", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nif;
    @XmlElementRef(name = "codigoDivisa", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoDivisa;
    @XmlElementRef(name = "codigoUtilizador", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoUtilizador;
    @XmlElementRef(name = "condicaoPagamentoID", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condicaoPagamentoID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    @XmlElementRef(name = "detalhes", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCriarFatSimplSyncInDetalhe> detalhes;
    @XmlElementRef(name = "entidadeID", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entidadeID;
    @XmlElementRef(name = "grupoTerceiro", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> grupoTerceiro;
    @XmlElementRef(name = "idDivida", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idDivida;
    @XmlElementRef(name = "meioPagamento", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meioPagamento;
    @XmlElementRef(name = "morada", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<CriarFatSimplSyncInMorada> morada;
    @XmlElementRef(name = "nome", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "numeroDocumento", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumento;
    @XmlElementRef(name = "observacao", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "referencia", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "serie", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElementRef(name = "tipoDocumento", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;
    @XmlElementRef(name = "unidadeExploracao", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadeExploracao;
    @XmlElementRef(name = "vendedorID", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendedorID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setID(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the nif property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNIF() {
        return nif;
    }

    /**
     * Sets the value of the nif property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNIF(JAXBElement<String> value) {
        this.nif = value;
    }

    /**
     * Gets the value of the codigoDivisa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoDivisa() {
        return codigoDivisa;
    }

    /**
     * Sets the value of the codigoDivisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoDivisa(JAXBElement<String> value) {
        this.codigoDivisa = value;
    }

    /**
     * Gets the value of the codigoUtilizador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoUtilizador() {
        return codigoUtilizador;
    }

    /**
     * Sets the value of the codigoUtilizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoUtilizador(JAXBElement<String> value) {
        this.codigoUtilizador = value;
    }

    /**
     * Gets the value of the condicaoPagamentoID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCondicaoPagamentoID() {
        return condicaoPagamentoID;
    }

    /**
     * Sets the value of the condicaoPagamentoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCondicaoPagamentoID(JAXBElement<String> value) {
        this.condicaoPagamentoID = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumento(XMLGregorianCalendar value) {
        this.dataDocumento = value;
    }

    /**
     * Gets the value of the dataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Sets the value of the dataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the dataVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Sets the value of the dataVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Gets the value of the detalhes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriarFatSimplSyncInDetalhe }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCriarFatSimplSyncInDetalhe> getDetalhes() {
        return detalhes;
    }

    /**
     * Sets the value of the detalhes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriarFatSimplSyncInDetalhe }{@code >}
     *     
     */
    public void setDetalhes(JAXBElement<ArrayOfCriarFatSimplSyncInDetalhe> value) {
        this.detalhes = value;
    }

    /**
     * Gets the value of the entidadeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntidadeID() {
        return entidadeID;
    }

    /**
     * Sets the value of the entidadeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntidadeID(JAXBElement<String> value) {
        this.entidadeID = value;
    }

    /**
     * Gets the value of the grupoTerceiro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGrupoTerceiro() {
        return grupoTerceiro;
    }

    /**
     * Sets the value of the grupoTerceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGrupoTerceiro(JAXBElement<Integer> value) {
        this.grupoTerceiro = value;
    }

    /**
     * Gets the value of the idDivida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdDivida() {
        return idDivida;
    }

    /**
     * Sets the value of the idDivida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdDivida(JAXBElement<String> value) {
        this.idDivida = value;
    }

    /**
     * Gets the value of the meioPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeioPagamento() {
        return meioPagamento;
    }

    /**
     * Sets the value of the meioPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeioPagamento(JAXBElement<String> value) {
        this.meioPagamento = value;
    }

    /**
     * Gets the value of the morada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CriarFatSimplSyncInMorada }{@code >}
     *     
     */
    public JAXBElement<CriarFatSimplSyncInMorada> getMorada() {
        return morada;
    }

    /**
     * Sets the value of the morada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CriarFatSimplSyncInMorada }{@code >}
     *     
     */
    public void setMorada(JAXBElement<CriarFatSimplSyncInMorada> value) {
        this.morada = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumento(JAXBElement<String> value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacao(JAXBElement<String> value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia(JAXBElement<String> value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerie(JAXBElement<String> value) {
        this.serie = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the unidadeExploracao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadeExploracao() {
        return unidadeExploracao;
    }

    /**
     * Sets the value of the unidadeExploracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadeExploracao(JAXBElement<String> value) {
        this.unidadeExploracao = value;
    }

    /**
     * Gets the value of the vendedorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendedorID() {
        return vendedorID;
    }

    /**
     * Sets the value of the vendedorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendedorID(JAXBElement<String> value) {
        this.vendedorID = value;
    }

}
