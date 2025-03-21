//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * It is the root XML element of an mtconnecterrors response document.
 * 
 * <p>Java class for MTConnectErrorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MTConnectErrorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Header" type="{urn:mtconnect.org:MTConnectError:1.6}HeaderType"/>
 *         <choice>
 *           <element name="Error" type="{urn:mtconnect.org:MTConnectError:1.6}ErrorType"/>
 *           <element name="Errors" type="{urn:mtconnect.org:MTConnectError:1.6}ErrorsType"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "MTConnectErrorType")
@XmlType(name = "MTConnectErrorType", propOrder = {
    "header",
    "error",
    "errors"
})
public class MTConnectErrorType {

    /**
     * An XML container in an mtconnect response document that provides
     *             information from an agent defining version information, storage
     *             capacity, and parameters associated with the data management within
     *             the agent.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Header")
    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    /**
     * An error, XML element, occurs while interpreting a request for
     *               information from a client software application or when an agent
     *               experiences an error while publishing the response to a request
     *               for information.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Error")
    @XmlElement(name = "Error")
    protected ErrorType error;
    /**
     * An XML container element in an mtconnecterrors response document
     *               provided by an agent when an error is encountered associated with
     *               a request for information from a client software application.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Errors")
    @XmlElement(name = "Errors")
    protected ErrorsType errors;

    /**
     * An XML container in an mtconnect response document that provides
     *             information from an agent defining version information, storage
     *             capacity, and parameters associated with the data management within
     *             the agent.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     * @see #getHeader()
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * An error, XML element, occurs while interpreting a request for
     *               information from a client software application or when an agent
     *               experiences an error while publishing the response to a request
     *               for information.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     * @see #getError()
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

    /**
     * An XML container element in an mtconnecterrors response document
     *               provided by an agent when an error is encountered associated with
     *               a request for information from a client software application.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     * @see #getErrors()
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

}
