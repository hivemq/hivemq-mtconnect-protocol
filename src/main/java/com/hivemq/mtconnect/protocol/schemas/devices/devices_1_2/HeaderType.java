//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_2;

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
 * Message header for protocol information
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
 *         <element name="AssetCounts" type="{urn:mtconnect.org:MTConnectDevices:1.2}AssetCountsType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="version" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}VersionType" />
 *       <attribute name="creationTime" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}CreationTimeType" />
 *       <attribute name="testIndicator" type="{urn:mtconnect.org:MTConnectDevices:1.2}TestIndicatorType" />
 *       <attribute name="instanceId" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}InstanceIdType" />
 *       <attribute name="sender" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}SenderType" />
 *       <attribute name="bufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}BufferSizeType" />
 *       <attribute name="assetBufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}AssetBufferSizeType" />
 *       <attribute name="assetCount" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.2}AssetCountAttrType" />
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
     * The asset statistics
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "AssetCounts")
    @XmlElement(name = "AssetCounts")
    protected AssetCountsType assetCounts;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "version")
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "creationTime")
    @XmlAttribute(name = "creationTime", required = true)
    protected XMLGregorianCalendar creationTime;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "testIndicator")
    @XmlAttribute(name = "testIndicator")
    protected Boolean testIndicator;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "instanceId")
    @XmlAttribute(name = "instanceId", required = true)
    protected BigInteger instanceId;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    @XmlAttribute(name = "sender", required = true)
    protected String sender;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "bufferSize")
    @XmlAttribute(name = "bufferSize", required = true)
    protected long bufferSize;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetBufferSize")
    @XmlAttribute(name = "assetBufferSize", required = true)
    protected long assetBufferSize;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetCount")
    @XmlAttribute(name = "assetCount", required = true)
    protected long assetCount;

    /**
     * The asset statistics
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
     * Gets the value of the version property.
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
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the creationTime property.
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
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the testIndicator property.
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
     */
    public void setTestIndicator(Boolean value) {
        this.testIndicator = value;
    }

    /**
     * Gets the value of the instanceId property.
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
     */
    public void setInstanceId(BigInteger value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the sender property.
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
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the bufferSize property.
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
     * Gets the value of the assetBufferSize property.
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
     * Gets the value of the assetCount property.
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

}
