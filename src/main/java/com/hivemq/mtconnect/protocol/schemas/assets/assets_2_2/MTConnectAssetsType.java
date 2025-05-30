//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * root entity of an {{term(MTConnectAssets Response Document)}} that
 *         contains the {{term(Asset Information Model)}} of {{block(Asset)}}
 *         types. ![MTConnectAssets](figures/MTConnectAssets.png
 *         "MTConnectAssets"){: width="0.8"} > Note:
 *         Additional properties of {{block(MTConnectAssets)}} **MAY** be defined
 *         for schema and namespace declaration. See {{sect(Schema and Namespace
 *         Declaration Information)}} for an {{term(XML)}} example.
 * 
 * <p>Java class for MTConnectAssetsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MTConnectAssetsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Header" type="{urn:mtconnect.org:MTConnectAssets:2.2}HeaderType"/>
 *         <element name="Assets" type="{urn:mtconnect.org:MTConnectAssets:2.2}AssetsType"/>
 *       </all>
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

})
public class MTConnectAssetsType {

    /**
     * provides information from an {{term(agent)}} defining version
     *             information, storage capacity, and parameters associated with the
     *             data management within the {{term(agent)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Header")
    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    /**
     * {{block(Assets)}} groups one or more {{block(Asset)}} types. See
     *             {{package(Asset Information Model)}} for more details.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Assets")
    @XmlElement(name = "Assets", required = true)
    protected AssetsType assets;

    /**
     * provides information from an {{term(agent)}} defining version
     *             information, storage capacity, and parameters associated with the
     *             data management within the {{term(agent)}}.
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
     * {{block(Assets)}} groups one or more {{block(Asset)}} types. See
     *             {{package(Asset Information Model)}} for more details.
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
