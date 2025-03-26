//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The root node for MTConnect
 * 
 * <p>Java class for MTConnectAssetsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MTConnectAssetsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Header" type="{urn:mtconnect.org:MTConnectAssets:1.4}HeaderType"/>
 *         <element name="Assets" type="{urn:mtconnect.org:MTConnectAssets:1.4}AssetsType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "MTConnectAssetsType")
@XmlType(name = "MTConnectAssetsType", propOrder = {
    "header",
    "assets"
})
public class MTConnectAssetsType {

    /**
     * Protocol dependent information
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Header")
    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    /**
     * The assets
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Assets")
    @XmlElement(name = "Assets", required = true)
    protected AssetsType assets;

    /**
     * Protocol dependent information
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     * @see #getHeader()
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * The assets
     * 
     * @return
     *     possible object is
     *     {@link AssetsType }
     *     
     */
    public AssetsType getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsType }
     *     
     * @see #getAssets()
     */
    public void setAssets(AssetsType value) {
        this.assets = value;
    }

}
