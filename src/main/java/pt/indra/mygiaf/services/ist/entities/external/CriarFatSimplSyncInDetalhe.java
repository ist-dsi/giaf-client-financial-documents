
package pt.indra.mygiaf.services.ist.entities.external;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriarFatSimplSyncInDetalhe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriarFatSimplSyncInDetalhe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="armazemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artigoCIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroResponsabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLinha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precoUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricaContabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subcentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxaDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taxaIVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoLinha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriarFatSimplSyncInDetalhe", propOrder = {
    "armazemID",
    "artigo",
    "artigoCIVA",
    "centroCusto",
    "centroResponsabilidade",
    "descricao",
    "numeroLinha",
    "observacao",
    "precoUnitario",
    "quantidade",
    "referencia",
    "rubricaContabilidade",
    "subcentro",
    "taxaDesconto",
    "taxaIVA",
    "tipoLinha",
    "unidadeMedida"
})
public class CriarFatSimplSyncInDetalhe {

    @XmlElementRef(name = "armazemID", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> armazemID;
    @XmlElementRef(name = "artigo", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> artigo;
    @XmlElementRef(name = "artigoCIVA", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> artigoCIVA;
    @XmlElementRef(name = "centroCusto", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centroCusto;
    @XmlElementRef(name = "centroResponsabilidade", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centroResponsabilidade;
    @XmlElementRef(name = "descricao", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;
    @XmlElementRef(name = "numeroLinha", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroLinha;
    @XmlElementRef(name = "observacao", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "precoUnitario", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> precoUnitario;
    @XmlElementRef(name = "quantidade", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantidade;
    @XmlElementRef(name = "referencia", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "rubricaContabilidade", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rubricaContabilidade;
    @XmlElementRef(name = "subcentro", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subcentro;
    @XmlElementRef(name = "taxaDesconto", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxaDesconto;
    @XmlElementRef(name = "taxaIVA", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxaIVA;
    @XmlElementRef(name = "tipoLinha", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoLinha;
    @XmlElementRef(name = "unidadeMedida", namespace = "http://external.entities.ist.services.mygiaf.indra.pt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadeMedida;

    /**
     * Gets the value of the armazemID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArmazemID() {
        return armazemID;
    }

    /**
     * Sets the value of the armazemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArmazemID(JAXBElement<String> value) {
        this.armazemID = value;
    }

    /**
     * Gets the value of the artigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArtigo() {
        return artigo;
    }

    /**
     * Sets the value of the artigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArtigo(JAXBElement<String> value) {
        this.artigo = value;
    }

    /**
     * Gets the value of the artigoCIVA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArtigoCIVA() {
        return artigoCIVA;
    }

    /**
     * Sets the value of the artigoCIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArtigoCIVA(JAXBElement<String> value) {
        this.artigoCIVA = value;
    }

    /**
     * Gets the value of the centroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCentroCusto() {
        return centroCusto;
    }

    /**
     * Sets the value of the centroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCentroCusto(JAXBElement<String> value) {
        this.centroCusto = value;
    }

    /**
     * Gets the value of the centroResponsabilidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCentroResponsabilidade() {
        return centroResponsabilidade;
    }

    /**
     * Sets the value of the centroResponsabilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCentroResponsabilidade(JAXBElement<String> value) {
        this.centroResponsabilidade = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the numeroLinha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroLinha() {
        return numeroLinha;
    }

    /**
     * Sets the value of the numeroLinha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroLinha(JAXBElement<Integer> value) {
        this.numeroLinha = value;
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
     * Gets the value of the precoUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Sets the value of the precoUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrecoUnitario(JAXBElement<BigDecimal> value) {
        this.precoUnitario = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantidade(JAXBElement<BigDecimal> value) {
        this.quantidade = value;
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
     * Gets the value of the rubricaContabilidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRubricaContabilidade() {
        return rubricaContabilidade;
    }

    /**
     * Sets the value of the rubricaContabilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRubricaContabilidade(JAXBElement<String> value) {
        this.rubricaContabilidade = value;
    }

    /**
     * Gets the value of the subcentro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubcentro() {
        return subcentro;
    }

    /**
     * Sets the value of the subcentro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubcentro(JAXBElement<String> value) {
        this.subcentro = value;
    }

    /**
     * Gets the value of the taxaDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxaDesconto() {
        return taxaDesconto;
    }

    /**
     * Sets the value of the taxaDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxaDesconto(JAXBElement<BigDecimal> value) {
        this.taxaDesconto = value;
    }

    /**
     * Gets the value of the taxaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxaIVA() {
        return taxaIVA;
    }

    /**
     * Sets the value of the taxaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxaIVA(JAXBElement<BigDecimal> value) {
        this.taxaIVA = value;
    }

    /**
     * Gets the value of the tipoLinha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoLinha() {
        return tipoLinha;
    }

    /**
     * Sets the value of the tipoLinha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoLinha(JAXBElement<String> value) {
        this.tipoLinha = value;
    }

    /**
     * Gets the value of the unidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Sets the value of the unidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadeMedida(JAXBElement<String> value) {
        this.unidadeMedida = value;
    }

}
