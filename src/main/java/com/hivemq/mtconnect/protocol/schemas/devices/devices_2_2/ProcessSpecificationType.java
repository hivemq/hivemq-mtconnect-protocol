//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Specification)}} that provides information used to assess the
 *         conformance of a variable to process requirements.
 * 
 * <p>Java class for ProcessSpecificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcessSpecificationType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.2}AbstractSpecificationType">
 *       <all>
 *         <element name="ControlLimits" type="{urn:mtconnect.org:MTConnectDevices:2.2}ControlLimitsType" minOccurs="0"/>
 *         <element name="AlarmLimits" type="{urn:mtconnect.org:MTConnectDevices:2.2}AlarmLimitsType" minOccurs="0"/>
 *         <element name="SpecificationLimits" type="{urn:mtconnect.org:MTConnectDevices:2.2}SpecificationLimitsType" minOccurs="0"/>
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
     * See {{sect(ControlLimits)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ControlLimits")
    @XmlElement(name = "ControlLimits")
    protected ControlLimitsType controlLimits;
    /**
     * See {{sect(AlarmLimits)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "AlarmLimits")
    @XmlElement(name = "AlarmLimits")
    protected AlarmLimitsType alarmLimits;
    /**
     * See {{sect(SpecificationLimits)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "SpecificationLimits")
    @XmlElement(name = "SpecificationLimits")
    protected SpecificationLimitsType specificationLimits;

    /**
     * See {{sect(ControlLimits)}}.
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
     * See {{sect(AlarmLimits)}}.
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
     * See {{sect(SpecificationLimits)}}.
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
