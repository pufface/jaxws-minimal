
package sk.fillo.ws.consumer.def;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "http://ws.fillo.sk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(action = "addNumbers")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNumbers", targetNamespace = "http://ws.fillo.sk/", className = "sk.fillo.ws.consumer.def.AddNumbers")
    @ResponseWrapper(localName = "addNumbersResponse", targetNamespace = "http://ws.fillo.sk/", className = "sk.fillo.ws.consumer.def.AddNumbersResponse")
    @Action(input = "addNumbers", output = "http://ws.fillo.sk/Service/addNumbersResponse")
    public int addNumbers(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}