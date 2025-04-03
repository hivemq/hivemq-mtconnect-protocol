//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The root node for MTConnect
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
 *         <element name="Header" type="{urn:mtconnect.org:MTConnectError:1.7}HeaderType"/>
 *         <choice>
 *           <element name="Error" type="{urn:mtconnect.org:MTConnectError:1.7}ErrorType"/>
 *           <element name="Errors" type="{urn:mtconnect.org:MTConnectError:1.7}ErrorsType"/>
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
     * Supplemental data usually placed at the beginning of a
     *             {{term(Document)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Header")
    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    /**
     * Only for backward compatibility with 1.0
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Error")
    @XmlElement(name = "Error")
    protected ErrorType error;
    /**
     * A collection of errors
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Errors")
    @XmlElement(name = "Errors")
    protected ErrorsType errors;

    /**
     * Supplemental data usually placed at the beginning of a
     *             {{term(Document)}}.
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
     * Only for backward compatibility with 1.0
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
     * A collection of errors
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
