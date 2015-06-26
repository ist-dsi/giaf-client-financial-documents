
package pt.indra.mygiaf.services.ist.entities.external;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCriarFatSimplSyncInDetalhe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCriarFatSimplSyncInDetalhe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CriarFatSimplSyncInDetalhe" type="{http://external.entities.ist.services.mygiaf.indra.pt}CriarFatSimplSyncInDetalhe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCriarFatSimplSyncInDetalhe", propOrder = {
    "criarFatSimplSyncInDetalhe"
})
public class ArrayOfCriarFatSimplSyncInDetalhe {

    @XmlElement(name = "CriarFatSimplSyncInDetalhe", nillable = true)
    protected List<CriarFatSimplSyncInDetalhe> criarFatSimplSyncInDetalhe;

    /**
     * Gets the value of the criarFatSimplSyncInDetalhe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criarFatSimplSyncInDetalhe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriarFatSimplSyncInDetalhe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriarFatSimplSyncInDetalhe }
     * 
     * 
     */
    public List<CriarFatSimplSyncInDetalhe> getCriarFatSimplSyncInDetalhe() {
        if (criarFatSimplSyncInDetalhe == null) {
            criarFatSimplSyncInDetalhe = new ArrayList<CriarFatSimplSyncInDetalhe>();
        }
        return this.criarFatSimplSyncInDetalhe;
    }

}
