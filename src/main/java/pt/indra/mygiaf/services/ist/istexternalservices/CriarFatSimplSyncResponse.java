
package pt.indra.mygiaf.services.ist.istexternalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncOut;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://external.entities.ist.services.mygiaf.indra.pt}CriarFatSimplSyncOut"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "criarFatSimplSyncResponse")
public class CriarFatSimplSyncResponse {

    @XmlElement(required = true, nillable = true)
    protected CriarFatSimplSyncOut out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link CriarFatSimplSyncOut }
     *     
     */
    public CriarFatSimplSyncOut getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriarFatSimplSyncOut }
     *     
     */
    public void setOut(CriarFatSimplSyncOut value) {
        this.out = value;
    }

}
