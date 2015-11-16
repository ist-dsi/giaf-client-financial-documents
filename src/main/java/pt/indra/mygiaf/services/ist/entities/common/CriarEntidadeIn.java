
package pt.indra.mygiaf.services.ist.entities.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriarEntidadeIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriarEntidadeIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modalidadePagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisMoradaAluno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisOrigemEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriarEntidadeIn", propOrder = {
    "codigoPostal",
    "entidade",
    "localidade",
    "modalidadePagamento",
    "morada",
    "naturezaJuridica",
    "nif",
    "nomeEntidade",
    "paisMoradaAluno",
    "paisOrigemEntidade"
})
public class CriarEntidadeIn {

    @XmlElementRef(name = "codigoPostal", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPostal;
    @XmlElementRef(name = "entidade", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entidade;
    @XmlElementRef(name = "localidade", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidade;
    @XmlElementRef(name = "modalidadePagamento", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modalidadePagamento;
    @XmlElementRef(name = "morada", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> morada;
    @XmlElementRef(name = "naturezaJuridica", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naturezaJuridica;
    @XmlElementRef(name = "nif", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nif;
    @XmlElementRef(name = "nomeEntidade", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeEntidade;
    @XmlElementRef(name = "paisMoradaAluno", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisMoradaAluno;
    @XmlElementRef(name = "paisOrigemEntidade", namespace = "http://common.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisOrigemEntidade;

    /**
     * Gets the value of the codigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPostal(JAXBElement<String> value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntidade(JAXBElement<String> value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the localidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidade() {
        return localidade;
    }

    /**
     * Sets the value of the localidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidade(JAXBElement<String> value) {
        this.localidade = value;
    }

    /**
     * Gets the value of the modalidadePagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModalidadePagamento() {
        return modalidadePagamento;
    }

    /**
     * Sets the value of the modalidadePagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModalidadePagamento(JAXBElement<String> value) {
        this.modalidadePagamento = value;
    }

    /**
     * Gets the value of the morada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMorada() {
        return morada;
    }

    /**
     * Sets the value of the morada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMorada(JAXBElement<String> value) {
        this.morada = value;
    }

    /**
     * Gets the value of the naturezaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaturezaJuridica() {
        return naturezaJuridica;
    }

    /**
     * Sets the value of the naturezaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaturezaJuridica(JAXBElement<String> value) {
        this.naturezaJuridica = value;
    }

    /**
     * Gets the value of the nif property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNif() {
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
    public void setNif(JAXBElement<String> value) {
        this.nif = value;
    }

    /**
     * Gets the value of the nomeEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEntidade() {
        return nomeEntidade;
    }

    /**
     * Sets the value of the nomeEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEntidade(JAXBElement<String> value) {
        this.nomeEntidade = value;
    }

    /**
     * Gets the value of the paisMoradaAluno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisMoradaAluno() {
        return paisMoradaAluno;
    }

    /**
     * Sets the value of the paisMoradaAluno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisMoradaAluno(JAXBElement<String> value) {
        this.paisMoradaAluno = value;
    }

    /**
     * Gets the value of the paisOrigemEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisOrigemEntidade() {
        return paisOrigemEntidade;
    }

    /**
     * Sets the value of the paisOrigemEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisOrigemEntidade(JAXBElement<String> value) {
        this.paisOrigemEntidade = value;
    }

}
