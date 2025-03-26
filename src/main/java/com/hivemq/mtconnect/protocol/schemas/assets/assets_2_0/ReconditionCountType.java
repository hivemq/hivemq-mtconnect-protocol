//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Description
 * 
 * <p>Java class for ReconditionCountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReconditionCountType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.0>ReconditionCountValueType">
 *       <attribute name="maximumCount" type="{urn:mtconnect.org:MTConnectAssets:2.0}MaximumCountType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ReconditionCountType")
@XmlType(name = "ReconditionCountType", propOrder = {
    "value"
})
public class ReconditionCountType {

    /**
     * The number of times the cutter has been reconditioned
     * 
     */
    @XmlValue
    protected BigInteger value;
    /**
     * The maximum number of times this tool can be reconditioned
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "maximumCount")
    @XmlAttribute(name = "maximumCount")
    protected BigInteger maximumCount;

    /**
     * The number of times the cutter has been reconditioned
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValue()
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * The maximum number of times this tool can be reconditioned
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumCount() {
        return maximumCount;
    }

    /**
     * Sets the value of the maximumCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaximumCount()
     */
    public void setMaximumCount(BigInteger value) {
        this.maximumCount = value;
    }

}
