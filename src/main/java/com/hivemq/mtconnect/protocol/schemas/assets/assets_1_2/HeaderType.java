//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="version" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}VersionType" />
 *       <attribute name="creationTime" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}CreationTimeType" />
 *       <attribute name="testIndicator" type="{urn:mtconnect.org:MTConnectAssets:1.2}TestIndicatorType" />
 *       <attribute name="instanceId" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}InstanceIdType" />
 *       <attribute name="sender" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}SenderType" />
 *       <attribute name="assetBufferSize" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}AssetBufferSizeType" />
 *       <attribute name="assetCount" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}AssetCountAttrType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "HeaderType")
@XmlType(name = "HeaderType", propOrder = {
    "value"
})
public class HeaderType {

    @XmlValue
    protected String value;
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetBufferSize")
    @XmlAttribute(name = "assetBufferSize", required = true)
    protected long assetBufferSize;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetCount")
    @XmlAttribute(name = "assetCount", required = true)
    protected long assetCount;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
