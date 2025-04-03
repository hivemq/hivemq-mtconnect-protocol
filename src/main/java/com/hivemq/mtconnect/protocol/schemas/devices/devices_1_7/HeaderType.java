//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Supplemental data usually placed at the beginning of a
 *         {{term(Document)}}.
 * 
 * <p>Java class for HeaderType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeaderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetCounts" type="{urn:mtconnect.org:MTConnectDevices:1.7}AssetCountsType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{urn:mtconnect.org:MTConnectDevices:1.7}HeaderAttributesType"/>
 *       <attribute name="bufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.7}BufferSizeType" />
 *       <attribute name="assetBufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.7}AssetBufferSizeType" />
 *       <attribute name="assetCount" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.7}AssetCountAttrType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "HeaderType")
@XmlType(name = "HeaderType", propOrder = {
    "assetCounts"
})
public class HeaderType {

    /**
     * The total number of mtconnect asset in anagent.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "AssetCounts")
    @XmlElement(name = "AssetCounts")
    protected AssetCountsType assetCounts;
    /**
     * The size of the agent's buffer.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "bufferSize")
    @XmlAttribute(name = "bufferSize", required = true)
    protected long bufferSize;
    /**
     * The maximum number of assets
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetBufferSize")
    @XmlAttribute(name = "assetBufferSize", required = true)
    protected long assetBufferSize;
    /**
     * The number of assets we have
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetCount")
    @XmlAttribute(name = "assetCount", required = true)
    protected long assetCount;
    /**
     * unique identifier of the administered item. {{cite(ISO/IEC
     *           11179-:2015)}}
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "version")
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    /**
     * The time the file was created.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "creationTime")
    @XmlAttribute(name = "creationTime", required = true)
    protected XMLGregorianCalendar creationTime;
    /**
     * Indicates that this was a test document
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "testIndicator")
    @XmlAttribute(name = "testIndicator")
    protected Boolean testIndicator;
    /**
     * The unique instance identifier of this agent process
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "instanceId")
    @XmlAttribute(name = "instanceId", required = true)
    protected BigInteger instanceId;
    /**
     * The sender of the message
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    @XmlAttribute(name = "sender", required = true)
    protected String sender;
    /**
     * A timestamp in 8601 format of the last update of the Device
     *           information for any device
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "deviceModelChangeTime")
    @XmlAttribute(name = "deviceModelChangeTime", required = true)
    protected XMLGregorianCalendar deviceModelChangeTime;

    /**
     * The total number of mtconnect asset in anagent.
     * 
     * @return
     *     possible object is
     *     {@link AssetCountsType }
     *     
     */
    public AssetCountsType getAssetCounts() {
        return assetCounts;
    }

    /**
     * Sets the value of the assetCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetCountsType }
     *     
     * @see #getAssetCounts()
     */
    public void setAssetCounts(AssetCountsType value) {
        this.assetCounts = value;
    }

    /**
     * The size of the agent's buffer.
     * 
     */
    public long getBufferSize() {
        return bufferSize;
    }

    /**
     * Sets the value of the bufferSize property.
     * 
     */
    public void setBufferSize(long value) {
        this.bufferSize = value;
    }

    /**
     * The maximum number of assets
     * 
     */
    public long getAssetBufferSize() {
        return assetBufferSize;
    }

    /**
     * Sets the value of the assetBufferSize property.
     * 
     */
    public void setAssetBufferSize(long value) {
        this.assetBufferSize = value;
    }

    /**
     * The number of assets we have
     * 
     */
    public long getAssetCount() {
        return assetCount;
    }

    /**
     * Sets the value of the assetCount property.
     * 
     */
    public void setAssetCount(long value) {
        this.assetCount = value;
    }

    /**
     * unique identifier of the administered item. {{cite(ISO/IEC
     *           11179-:2015)}}
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * The time the file was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreationTime()
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Indicates that this was a test document
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestIndicator() {
        return testIndicator;
    }

    /**
     * Sets the value of the testIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTestIndicator()
     */
    public void setTestIndicator(Boolean value) {
        this.testIndicator = value;
    }

    /**
     * The unique instance identifier of this agent process
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getInstanceId()
     */
    public void setInstanceId(BigInteger value) {
        this.instanceId = value;
    }

    /**
     * The sender of the message
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSender()
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * A timestamp in 8601 format of the last update of the Device
     *           information for any device
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceModelChangeTime() {
        return deviceModelChangeTime;
    }

    /**
     * Sets the value of the deviceModelChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDeviceModelChangeTime()
     */
    public void setDeviceModelChangeTime(XMLGregorianCalendar value) {
        this.deviceModelChangeTime = value;
    }

}
