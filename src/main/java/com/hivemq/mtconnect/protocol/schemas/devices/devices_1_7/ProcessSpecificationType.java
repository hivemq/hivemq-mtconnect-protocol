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
 * {{block(ProcessSpecification)}} provides information used to assess the
 *         conformance of a variable to process requirements. See {{sect(Limits for
 *         ProcessSpecification)}} for details on the
 *         {{block(ProcessSpecification)}} model.
 * 
 * <p>Java class for ProcessSpecificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcessSpecificationType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.7}AbstractSpecificationType">
 *       <all>
 *         <element name="ControlLimits" type="{urn:mtconnect.org:MTConnectDevices:1.7}ControlLimitsType" minOccurs="0"/>
 *         <element name="AlarmLimits" type="{urn:mtconnect.org:MTConnectDevices:1.7}AlarmLimitsType" minOccurs="0"/>
 *         <element name="SpecificationLimits" type="{urn:mtconnect.org:MTConnectDevices:1.7}SpecificationLimitsType" minOccurs="0"/>
 *       </all>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ProcessSpecificationType")
@XmlType(name = "ProcessSpecificationType", propOrder = {
    "controlLimits",
    "alarmLimits",
    "specificationLimits"
})
public class ProcessSpecificationType
    extends AbstractSpecificationType
{

    /**
     * A set of limits used to indicate whether a process variable is
     *                 stable and in control.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ControlLimits")
    @XmlElement(name = "ControlLimits")
    protected ControlLimitsType controlLimits;
    /**
     * A set of limits used to trigger warning or alarm indicators.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "AlarmLimits")
    @XmlElement(name = "AlarmLimits")
    protected AlarmLimitsType alarmLimits;
    /**
     * A set of limits defining a range of values designating
     *                 acceptable performance for a variable.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "SpecificationLimits")
    @XmlElement(name = "SpecificationLimits")
    protected SpecificationLimitsType specificationLimits;

    /**
     * A set of limits used to indicate whether a process variable is
     *                 stable and in control.
     * 
     * @return
     *     possible object is
     *     {@link ControlLimitsType }
     *     
     */
    public ControlLimitsType getControlLimits() {
        return controlLimits;
    }

    /**
     * Sets the value of the controlLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlLimitsType }
     *     
     * @see #getControlLimits()
     */
    public void setControlLimits(ControlLimitsType value) {
        this.controlLimits = value;
    }

    /**
     * A set of limits used to trigger warning or alarm indicators.
     * 
     * @return
     *     possible object is
     *     {@link AlarmLimitsType }
     *     
     */
    public AlarmLimitsType getAlarmLimits() {
        return alarmLimits;
    }

    /**
     * Sets the value of the alarmLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmLimitsType }
     *     
     * @see #getAlarmLimits()
     */
    public void setAlarmLimits(AlarmLimitsType value) {
        this.alarmLimits = value;
    }

    /**
     * A set of limits defining a range of values designating
     *                 acceptable performance for a variable.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationLimitsType }
     *     
     */
    public SpecificationLimitsType getSpecificationLimits() {
        return specificationLimits;
    }

    /**
     * Sets the value of the specificationLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationLimitsType }
     *     
     * @see #getSpecificationLimits()
     */
    public void setSpecificationLimits(SpecificationLimitsType value) {
        this.specificationLimits = value;
    }

}
