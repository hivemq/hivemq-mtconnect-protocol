//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_6;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hivemq.mtconnect.protocol.schemas.error.error_1_6 package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _MTConnectError_QNAME = new QName("urn:mtconnect.org:MTConnectError:1.6", "MTConnectError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hivemq.mtconnect.protocol.schemas.error.error_1_6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MTConnectErrorType }
     * 
     * @return
     *     the new instance of {@link MTConnectErrorType }
     */
    public MTConnectErrorType createMTConnectErrorType() {
        return new MTConnectErrorType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     * @return
     *     the new instance of {@link ErrorsType }
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     * @return
     *     the new instance of {@link ErrorType }
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTConnectErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MTConnectErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectError:1.6", name = "MTConnectError")
    public JAXBElement<MTConnectErrorType> createMTConnectError(MTConnectErrorType value) {
        return new JAXBElement<>(_MTConnectError_QNAME, MTConnectErrorType.class, null, value);
    }

}
