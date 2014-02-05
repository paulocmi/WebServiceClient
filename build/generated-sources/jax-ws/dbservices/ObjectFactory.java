
package dbservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dbservices package. 
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

    private final static QName _ConsultInfoResponse_QNAME = new QName("http://dbServices/", "consultInfoResponse");
    private final static QName _ConsultInfo_QNAME = new QName("http://dbServices/", "consultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dbservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultInfo }
     * 
     */
    public ConsultInfo createConsultInfo() {
        return new ConsultInfo();
    }

    /**
     * Create an instance of {@link ConsultInfoResponse }
     * 
     */
    public ConsultInfoResponse createConsultInfoResponse() {
        return new ConsultInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbServices/", name = "consultInfoResponse")
    public JAXBElement<ConsultInfoResponse> createConsultInfoResponse(ConsultInfoResponse value) {
        return new JAXBElement<ConsultInfoResponse>(_ConsultInfoResponse_QNAME, ConsultInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbServices/", name = "consultInfo")
    public JAXBElement<ConsultInfo> createConsultInfo(ConsultInfo value) {
        return new JAXBElement<ConsultInfo>(_ConsultInfo_QNAME, ConsultInfo.class, null, value);
    }

}
