
package pt.indra.mygiaf.services.ist.istexternalservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeIn;
import pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeOut;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncIn;
import pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncOut;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISTExternalServicesPortType", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
@XmlSeeAlso({
    pt.indra.mygiaf.services.ist.entities.common.ObjectFactory.class,
    pt.indra.mygiaf.services.ist.entities.external.ObjectFactory.class,
    pt.indra.mygiaf.services.ist.istexternalservices.ObjectFactory.class
})
public interface ISTExternalServicesPortType {


    /**
     * 
     * @param input
     * @param password
     * @return
     *     returns pt.indra.mygiaf.services.ist.entities.external.CriarFatSimplSyncOut
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
    @RequestWrapper(localName = "criarFatSimplSync", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices", className = "pt.indra.mygiaf.services.ist.istexternalservices.CriarFatSimplSync")
    @ResponseWrapper(localName = "criarFatSimplSyncResponse", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices", className = "pt.indra.mygiaf.services.ist.istexternalservices.CriarFatSimplSyncResponse")
    public CriarFatSimplSyncOut criarFatSimplSync(
        @WebParam(name = "input", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
        CriarFatSimplSyncIn input,
        @WebParam(name = "password", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
        String password);

    /**
     * 
     * @param input
     * @param password
     * @return
     *     returns pt.indra.mygiaf.services.ist.entities.common.CriarEntidadeOut
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
    @RequestWrapper(localName = "criarEntidade", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices", className = "pt.indra.mygiaf.services.ist.istexternalservices.CriarEntidade")
    @ResponseWrapper(localName = "criarEntidadeResponse", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices", className = "pt.indra.mygiaf.services.ist.istexternalservices.CriarEntidadeResponse")
    public CriarEntidadeOut criarEntidade(
        @WebParam(name = "input", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
        CriarEntidadeIn input,
        @WebParam(name = "password", targetNamespace = "http://ist.services.mygiaf.indra.pt/ISTExternalServices")
        String password);

}
