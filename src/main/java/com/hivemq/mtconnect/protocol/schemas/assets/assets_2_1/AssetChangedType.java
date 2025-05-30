//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{def(EventEnum:ASSET_CHANGED)}}
 * 
 * <p>Java class for AssetChangedType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AssetChangedType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.1>StringEventType">
 *       <attribute name="assetType" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.1}AssetAttrTypeType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AssetChangedType")
@XmlType(name = "AssetChangedType")
public class AssetChangedType
    extends StringEventType
{

    /**
     * The type of asset
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "assetType")
    @XmlAttribute(name = "assetType", required = true)
    protected String assetType;

    /**
     * The type of asset
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssetType()
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

}
