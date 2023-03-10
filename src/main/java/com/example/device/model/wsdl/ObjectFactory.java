
package com.example.device.model.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example.dummyservice.service package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://example/dummyservice/service", "loginResponse");
    private final static QName _DispositivosRegistradosRequest_QNAME = new QName("http://example/dummyservice/service", "dispositivosRegistradosRequest");
    private final static QName _DispositivosRegistradosResponse_QNAME = new QName("http://example/dummyservice/service", "dispositivosRegistradosResponse");
    private final static QName _LoginRequest_QNAME = new QName("http://example/dummyservice/service", "loginRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example.dummyservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link DispositivosRequestType }
     * 
     */
    public DispositivosRequestType createDispositivosRequestType() {
        return new DispositivosRequestType();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link DispositivosResponseType }
     * 
     */
    public DispositivosResponseType createDispositivosResponseType() {
        return new DispositivosResponseType();
    }

    /**
     * Create an instance of {@link DispositivoType }
     * 
     */
    public DispositivoType createDispositivoType() {
        return new DispositivoType();
    }

    /**
     * Create an instance of {@link DispositivosType }
     * 
     */
    public DispositivosType createDispositivosType() {
        return new DispositivosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/dummyservice/service", name = "loginResponse")
    public JAXBElement<LoginResponseType> createLoginResponse(LoginResponseType value) {
        return new JAXBElement<LoginResponseType>(_LoginResponse_QNAME, LoginResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispositivosRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/dummyservice/service", name = "dispositivosRegistradosRequest")
    public JAXBElement<DispositivosRequestType> createDispositivosRegistradosRequest(DispositivosRequestType value) {
        return new JAXBElement<DispositivosRequestType>(_DispositivosRegistradosRequest_QNAME, DispositivosRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispositivosResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/dummyservice/service", name = "dispositivosRegistradosResponse")
    public JAXBElement<DispositivosResponseType> createDispositivosRegistradosResponse(DispositivosResponseType value) {
        return new JAXBElement<DispositivosResponseType>(_DispositivosRegistradosResponse_QNAME, DispositivosResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/dummyservice/service", name = "loginRequest")
    public JAXBElement<LoginRequestType> createLoginRequest(LoginRequestType value) {
        return new JAXBElement<LoginRequestType>(_LoginRequest_QNAME, LoginRequestType.class, null, value);
    }

}
