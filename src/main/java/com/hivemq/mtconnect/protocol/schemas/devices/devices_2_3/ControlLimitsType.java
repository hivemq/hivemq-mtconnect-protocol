//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * See {{sect(ControlLimits)}}.
 * 
 * <p>Java class for ControlLimitsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ControlLimitsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="UpperLimit" type="{urn:mtconnect.org:MTConnectDevices:2.3}UpperLimitType" minOccurs="0"/>
 *         <element name="UpperWarning" type="{urn:mtconnect.org:MTConnectDevices:2.3}UpperWarningType" minOccurs="0"/>
 *         <element name="Nominal" type="{urn:mtconnect.org:MTConnectDevices:2.3}NominalType" minOccurs="0"/>
 *         <element name="LowerWarning" type="{urn:mtconnect.org:MTConnectDevices:2.3}LowerWarningType" minOccurs="0"/>
 *         <element name="LowerLimit" type="{urn:mtconnect.org:MTConnectDevices:2.3}LowerLimitType" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ControlLimitsType")
@XmlType(name = "ControlLimitsType", propOrder = {

})
public class ControlLimitsType {

    /**
     * upper conformance boundary for a variable. > Note: immediate
     *             concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UpperLimit")
    @XmlElement(name = "UpperLimit")
    protected UpperLimitType upperLimit;
    /**
     * upper boundary indicating increased concern and supervision may be
     *             required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UpperWarning")
    @XmlElement(name = "UpperWarning")
    protected UpperWarningType upperWarning;
    /**
     * numeric target or expected value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Nominal")
    @XmlElement(name = "Nominal")
    protected NominalType nominal;
    /**
     * lower boundary indicating increased concern and supervision may be
     *             required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "LowerWarning")
    @XmlElement(name = "LowerWarning")
    protected LowerWarningType lowerWarning;
    /**
     * lower conformance boundary for a variable. > Note: immediate
     *             concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "LowerLimit")
    @XmlElement(name = "LowerLimit")
    protected LowerLimitType lowerLimit;

    /**
     * upper conformance boundary for a variable. > Note: immediate
     *             concern or action may be required.
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
     * upper boundary indicating increased concern and supervision may be
     *             required.
     * 
     * @return
     *     possible object is
     *     {@link UpperWarningType }
     *     
     */
    public UpperWarningType getUpperWarning() {
        return upperWarning;
    }

    /**
     * Sets the value of the upperWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperWarningType }
     *     
     * @see #getUpperWarning()
     */
    public void setUpperWarning(UpperWarningType value) {
        this.upperWarning = value;
    }

    /**
     * numeric target or expected value.
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
     * lower boundary indicating increased concern and supervision may be
     *             required.
     * 
     * @return
     *     possible object is
     *     {@link LowerWarningType }
     *     
     */
    public LowerWarningType getLowerWarning() {
        return lowerWarning;
    }

    /**
     * Sets the value of the lowerWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerWarningType }
     *     
     * @see #getLowerWarning()
     */
    public void setLowerWarning(LowerWarningType value) {
        this.lowerWarning = value;
    }

    /**
     * lower conformance boundary for a variable. > Note: immediate
     *             concern or action may be required.
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
