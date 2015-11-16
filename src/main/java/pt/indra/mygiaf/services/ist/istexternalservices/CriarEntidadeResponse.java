
package pt.indra.mygiaf.services.ist.istexternalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeOut;


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
 *         &lt;element name="out" type="{http://common.entities.ist.services.mygiaf.indra.pt}CriarEntidadeOut"/>
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
@XmlRootElement(name = "criarEntidadeResponse")
public class CriarEntidadeResponse {

    @XmlElement(required = true, nillable = true)
    protected CriarEntidadeOut out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link CriarEntidadeOut }
     *     
     */
    public CriarEntidadeOut getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriarEntidadeOut }
     *     
     */
    public void setOut(CriarEntidadeOut value) {
        this.out = value;
    }

}
