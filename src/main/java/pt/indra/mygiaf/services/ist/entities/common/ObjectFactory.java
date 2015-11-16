
package pt.indra.mygiaf.services.ist.entities.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.indra.mygiaf.services.ist.entities.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CriarEntidadeOutMensagemErro_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "mensagemErro");
    private final static QName _CriarEntidadeInModalidadePagamento_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "modalidadePagamento");
    private final static QName _CriarEntidadeInPaisOrigemEntidade_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "paisOrigemEntidade");
    private final static QName _CriarEntidadeInEntidade_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "entidade");
    private final static QName _CriarEntidadeInLocalidade_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "localidade");
    private final static QName _CriarEntidadeInNaturezaJuridica_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "naturezaJuridica");
    private final static QName _CriarEntidadeInCodigoPostal_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "codigoPostal");
    private final static QName _CriarEntidadeInNif_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "nif");
    private final static QName _CriarEntidadeInPaisMoradaAluno_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "paisMoradaAluno");
    private final static QName _CriarEntidadeInMorada_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "morada");
    private final static QName _CriarEntidadeInNomeEntidade_QNAME = new QName("http://common.entities.ist.services.mygiaf.indra.pt", "nomeEntidade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.indra.mygiaf.services.ist.entities.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CriarEntidadeOut }
     * 
     */
    public CriarEntidadeOut createCriarEntidadeOut() {
        return new CriarEntidadeOut();
    }

    /**
     * Create an instance of {@link CriarEntidadeIn }
     * 
     */
    public CriarEntidadeIn createCriarEntidadeIn() {
        return new CriarEntidadeIn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "mensagemErro", scope = CriarEntidadeOut.class)
    public JAXBElement<String> createCriarEntidadeOutMensagemErro(String value) {
        return new JAXBElement<String>(_CriarEntidadeOutMensagemErro_QNAME, String.class, CriarEntidadeOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "modalidadePagamento", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInModalidadePagamento(String value) {
        return new JAXBElement<String>(_CriarEntidadeInModalidadePagamento_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "paisOrigemEntidade", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInPaisOrigemEntidade(String value) {
        return new JAXBElement<String>(_CriarEntidadeInPaisOrigemEntidade_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "entidade", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInEntidade(String value) {
        return new JAXBElement<String>(_CriarEntidadeInEntidade_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "localidade", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInLocalidade(String value) {
        return new JAXBElement<String>(_CriarEntidadeInLocalidade_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "naturezaJuridica", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInNaturezaJuridica(String value) {
        return new JAXBElement<String>(_CriarEntidadeInNaturezaJuridica_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "codigoPostal", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInCodigoPostal(String value) {
        return new JAXBElement<String>(_CriarEntidadeInCodigoPostal_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "nif", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInNif(String value) {
        return new JAXBElement<String>(_CriarEntidadeInNif_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "paisMoradaAluno", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInPaisMoradaAluno(String value) {
        return new JAXBElement<String>(_CriarEntidadeInPaisMoradaAluno_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "morada", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInMorada(String value) {
        return new JAXBElement<String>(_CriarEntidadeInMorada_QNAME, String.class, CriarEntidadeIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.entities.ist.services.mygiaf.indra.pt", name = "nomeEntidade", scope = CriarEntidadeIn.class)
    public JAXBElement<String> createCriarEntidadeInNomeEntidade(String value) {
        return new JAXBElement<String>(_CriarEntidadeInNomeEntidade_QNAME, String.class, CriarEntidadeIn.class, value);
    }

}
