
package sk.fillo.ws.consumer.def;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.fillo.ws.consumer.def package. 
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

    private final static QName _ProviderTimeMillisResponse_QNAME = new QName("http://provider.ws.fillo.sk/", "providerTimeMillisResponse");
    private final static QName _ProviderTimeMillis_QNAME = new QName("http://provider.ws.fillo.sk/", "providerTimeMillis");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.fillo.ws.consumer.def
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProviderTimeMillis }
     * 
     */
    public ProviderTimeMillis createProviderTimeMillis() {
        return new ProviderTimeMillis();
    }

    /**
     * Create an instance of {@link ProviderTimeMillisResponse }
     * 
     */
    public ProviderTimeMillisResponse createProviderTimeMillisResponse() {
        return new ProviderTimeMillisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTimeMillisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.ws.fillo.sk/", name = "providerTimeMillisResponse")
    public JAXBElement<ProviderTimeMillisResponse> createProviderTimeMillisResponse(ProviderTimeMillisResponse value) {
        return new JAXBElement<ProviderTimeMillisResponse>(_ProviderTimeMillisResponse_QNAME, ProviderTimeMillisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTimeMillis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.ws.fillo.sk/", name = "providerTimeMillis")
    public JAXBElement<ProviderTimeMillis> createProviderTimeMillis(ProviderTimeMillis value) {
        return new JAXBElement<ProviderTimeMillis>(_ProviderTimeMillis_QNAME, ProviderTimeMillis.class, null, value);
    }

}
