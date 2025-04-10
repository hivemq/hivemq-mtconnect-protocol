//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An abstract mobile asset
 * 
 * <p>Java class for AssetType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AssetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="assetId" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}AssetIdType" />
 *       <attribute name="timestamp" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}TimestampType" />
 *       <attribute name="deviceUuid" type="{urn:mtconnect.org:MTConnectAssets:1.3}UuidType" />
 *       <attribute name="removed" type="{urn:mtconnect.org:MTConnectAssets:1.3}RemovedType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AssetType")
@XmlType(name = "AssetType")
@XmlSeeAlso({
    CuttingToolType.class,
    CuttingToolArchetypeType.class
})
public abstract class AssetType {

    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetId")
    @XmlAttribute(name = "assetId", required = true)
    protected String assetId;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "timestamp")
    @XmlAttribute(name = "timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "deviceUuid")
    @XmlAttribute(name = "deviceUuid")
    protected String deviceUuid;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "removed")
    @XmlAttribute(name = "removed")
    protected Boolean removed;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the deviceUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceUuid() {
        return deviceUuid;
    }

    /**
     * Sets the value of the deviceUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceUuid(String value) {
        this.deviceUuid = value;
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoved(Boolean value) {
        this.removed = value;
    }

}
