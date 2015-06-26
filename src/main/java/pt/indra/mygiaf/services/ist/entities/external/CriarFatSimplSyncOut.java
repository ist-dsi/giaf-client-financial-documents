
package pt.indra.mygiaf.services.ist.entities.external;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriarFatSimplSyncOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriarFatSimplSyncOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDFBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoGIAF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensagemErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriarFatSimplSyncOut", propOrder = {
    "pdfBase64",
    "documentoGIAF",
    "mensagemErro"
})
public class CriarFatSimplSyncOut {

    @XmlElementRef(name = "PDFBase64", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfBase64;
    @XmlElementRef(name = "documentoGIAF", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentoGIAF;
    @XmlElementRef(name = "mensagemErro", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensagemErro;

    /**
     * Gets the value of the pdfBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDFBase64() {
        return pdfBase64;
    }

    /**
     * Sets the value of the pdfBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDFBase64(JAXBElement<String> value) {
        this.pdfBase64 = value;
    }

    /**
     * Gets the value of the documentoGIAF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentoGIAF() {
        return documentoGIAF;
    }

    /**
     * Sets the value of the documentoGIAF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentoGIAF(JAXBElement<String> value) {
        this.documentoGIAF = value;
    }

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensagemErro(JAXBElement<String> value) {
        this.mensagemErro = value;
    }

}
