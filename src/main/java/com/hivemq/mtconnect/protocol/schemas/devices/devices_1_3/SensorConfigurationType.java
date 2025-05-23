//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Calibration data for a sensor
 * 
 * <p>Java class for SensorConfigurationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SensorConfigurationType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.3}AbstractConfigurationType">
 *       <sequence>
 *         <element name="FirmwareVersion" type="{urn:mtconnect.org:MTConnectDevices:1.3}FirmwareVersionType"/>
 *         <element name="CalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.3}CalibrationDateType" minOccurs="0"/>
 *         <element name="NextCalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.3}NextCalibrationDateType" minOccurs="0"/>
 *         <element name="CalibrationInitials" type="{urn:mtconnect.org:MTConnectDevices:1.3}CalibrationInitialsType" minOccurs="0"/>
 *         <any maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Channels" type="{urn:mtconnect.org:MTConnectDevices:1.3}ChannelsType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SensorConfigurationType")
@XmlType(name = "SensorConfigurationType", propOrder = {
    "firmwareVersion",
    "calibrationDate",
    "nextCalibrationDate",
    "calibrationInitials",
    "any",
    "channels"
})
public class SensorConfigurationType
    extends AbstractConfigurationType
{

    /**
     * The firmware version
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "FirmwareVersion")
    @XmlElement(name = "FirmwareVersion", required = true)
    protected String firmwareVersion;
    /**
     * The date and time the sensor was calibrated
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CalibrationDate")
    @XmlElement(name = "CalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calibrationDate;
    /**
     * The date and time the sensor was calibrated
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "NextCalibrationDate")
    @XmlElement(name = "NextCalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCalibrationDate;
    /**
     * The initials of the person who calibrated this sensor
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CalibrationInitials")
    @XmlElement(name = "CalibrationInitials")
    protected String calibrationInitials;
    /**
     * Any additional properties
     * 
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * The sensor channels
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Channels")
    @XmlElement(name = "Channels")
    protected ChannelsType channels;

    /**
     * The firmware version
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFirmwareVersion()
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * The date and time the sensor was calibrated
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalibrationDate() {
        return calibrationDate;
    }

    /**
     * Sets the value of the calibrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCalibrationDate()
     */
    public void setCalibrationDate(XMLGregorianCalendar value) {
        this.calibrationDate = value;
    }

    /**
     * The date and time the sensor was calibrated
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCalibrationDate() {
        return nextCalibrationDate;
    }

    /**
     * Sets the value of the nextCalibrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNextCalibrationDate()
     */
    public void setNextCalibrationDate(XMLGregorianCalendar value) {
        this.nextCalibrationDate = value;
    }

    /**
     * The initials of the person who calibrated this sensor
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationInitials() {
        return calibrationInitials;
    }

    /**
     * Sets the value of the calibrationInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCalibrationInitials()
     */
    public void setCalibrationInitials(String value) {
        this.calibrationInitials = value;
    }

    /**
     * Any additional properties
     * 
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * The sensor channels
     * 
     * @return
     *     possible object is
     *     {@link ChannelsType }
     *     
     */
    public ChannelsType getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelsType }
     *     
     * @see #getChannels()
     */
    public void setChannels(ChannelsType value) {
        this.channels = value;
    }

}
