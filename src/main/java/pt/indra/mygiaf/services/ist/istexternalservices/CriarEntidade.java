
package pt.indra.mygiaf.services.ist.istexternalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeIn;


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
 *         &lt;element name="input" type="{http://common.entities.ist.services.mygiaf.indra.pt}CriarEntidadeIn"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "input",
    "password"
})
@XmlRootElement(name = "criarEntidade")
public class CriarEntidade {

    @XmlElement(required = true, nillable = true)
    protected CriarEntidadeIn input;
    @XmlElement(required = true, nillable = true)
    protected String password;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link CriarEntidadeIn }
     *     
     */
    public CriarEntidadeIn getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriarEntidadeIn }
     *     
     */
    public void setInput(CriarEntidadeIn value) {
        this.input = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
