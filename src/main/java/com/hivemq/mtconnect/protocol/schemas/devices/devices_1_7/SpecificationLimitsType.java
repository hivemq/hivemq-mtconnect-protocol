//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A set of limits defining a range of values designating acceptable
 *         performance for a variable.
 * 
 * <p>Java class for SpecificationLimitsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecificationLimitsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="UpperLimit" type="{urn:mtconnect.org:MTConnectDevices:1.7}UpperLimitType" minOccurs="0"/>
 *         <element name="Nominal" type="{urn:mtconnect.org:MTConnectDevices:1.7}NominalType" minOccurs="0"/>
 *         <element name="LowerLimit" type="{urn:mtconnect.org:MTConnectDevices:1.7}LowerLimitType" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SpecificationLimitsType")
@XmlType(name = "SpecificationLimitsType", propOrder = {

})
public class SpecificationLimitsType {

    /**
     * The upper conformance boundary for a variable. Note to Entry:
     *             immediate concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UpperLimit")
    @XmlElement(name = "UpperLimit")
    protected UpperLimitType upperLimit;
    /**
     * The target or expected value for this data item.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Nominal")
    @XmlElement(name = "Nominal")
    protected NominalType nominal;
    /**
     * The lower conformance boundary for a variable. Note to Entry:
     *             immediate concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "LowerLimit")
    @XmlElement(name = "LowerLimit")
    protected LowerLimitType lowerLimit;

    /**
     * The upper conformance boundary for a variable. Note to Entry:
     *             immediate concern or action may be required.
     * 
     * @return
     *     possible object is
     *     {@link UpperLimitType }
     *     
     */
    public UpperLimitType getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperLimitType }
     *     
     * @see #getUpperLimit()
     */
    public void setUpperLimit(UpperLimitType value) {
        this.upperLimit = value;
    }

    /**
     * The target or expected value for this data item.
     * 
     * @return
     *     possible object is
     *     {@link NominalType }
     *     
     */
    public NominalType getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominalType }
     *     
     * @see #getNominal()
     */
    public void setNominal(NominalType value) {
        this.nominal = value;
    }

    /**
     * The lower conformance boundary for a variable. Note to Entry:
     *             immediate concern or action may be required.
     * 
     * @return
     *     possible object is
     *     {@link LowerLimitType }
     *     
     */
    public LowerLimitType getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerLimitType }
     *     
     * @see #getLowerLimit()
     */
    public void setLowerLimit(LowerLimitType value) {
        this.lowerLimit = value;
    }

}
