//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * design characteristics for a piece of equipment.
 * 
 * <p>Java class for SpecificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecificationType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.0}AbstractSpecificationType">
 *       <all>
 *         <element name="Maximum" type="{urn:mtconnect.org:MTConnectDevices:2.0}MaximumType" minOccurs="0"/>
 *         <element name="Minimum" type="{urn:mtconnect.org:MTConnectDevices:2.0}MinimumType" minOccurs="0"/>
 *         <element name="Nominal" type="{urn:mtconnect.org:MTConnectDevices:2.0}NominalType" minOccurs="0"/>
 *         <element name="UpperLimit" type="{urn:mtconnect.org:MTConnectDevices:2.0}UpperLimitType" minOccurs="0"/>
 *         <element name="UpperWarning" type="{urn:mtconnect.org:MTConnectDevices:2.0}UpperWarningType" minOccurs="0"/>
 *         <element name="LowerWarning" type="{urn:mtconnect.org:MTConnectDevices:2.0}LowerWarningType" minOccurs="0"/>
 *         <element name="LowerLimit" type="{urn:mtconnect.org:MTConnectDevices:2.0}LowerLimitType" minOccurs="0"/>
 *       </all>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SpecificationType")
@XmlType(name = "SpecificationType", propOrder = {
    "maximum",
    "minimum",
    "nominal",
    "upperLimit",
    "upperWarning",
    "lowerWarning",
    "lowerLimit"
})
public class SpecificationType
    extends AbstractSpecificationType
{

    /**
     * numeric upper constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Maximum")
    @XmlElement(name = "Maximum")
    protected MaximumType maximum;
    /**
     * numeric lower constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Minimum")
    @XmlElement(name = "Minimum")
    protected MinimumType minimum;
    /**
     * numeric target or expected value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Nominal")
    @XmlElement(name = "Nominal")
    protected NominalType nominal;
    /**
     * upper conformance boundary for a variable. > Note: immediate
     *                 concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UpperLimit")
    @XmlElement(name = "UpperLimit")
    protected UpperLimitType upperLimit;
    /**
     * upper boundary indicating increased concern and supervision may
     *                 be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "UpperWarning")
    @XmlElement(name = "UpperWarning")
    protected UpperWarningType upperWarning;
    /**
     * lower boundary indicating increased concern and supervision may
     *                 be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "LowerWarning")
    @XmlElement(name = "LowerWarning")
    protected LowerWarningType lowerWarning;
    /**
     * lower conformance boundary for a variable. > Note: immediate
     *                 concern or action may be required.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "LowerLimit")
    @XmlElement(name = "LowerLimit")
    protected LowerLimitType lowerLimit;

    /**
     * numeric upper constraint.
     * 
     * @return
     *     possible object is
     *     {@link MaximumType }
     *     
     */
    public MaximumType getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumType }
     *     
     * @see #getMaximum()
     */
    public void setMaximum(MaximumType value) {
        this.maximum = value;
    }

    /**
     * numeric lower constraint.
     * 
     * @return
     *     possible object is
     *     {@link MinimumType }
     *     
     */
    public MinimumType getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumType }
     *     
     * @see #getMinimum()
     */
    public void setMinimum(MinimumType value) {
        this.minimum = value;
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
     * upper conformance boundary for a variable. > Note: immediate
     *                 concern or action may be required.
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
     * upper boundary indicating increased concern and supervision may
     *                 be required.
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
     * lower boundary indicating increased concern and supervision may
     *                 be required.
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
     *                 concern or action may be required.
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
