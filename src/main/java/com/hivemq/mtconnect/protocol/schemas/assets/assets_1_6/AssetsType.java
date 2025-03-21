//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used in the path portion of an http request line, by a client software
 *         application, to initiate an asset request to an agent to publish an
 *         mtconnectassets document.
 * 
 * <p>Java class for AssetsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AssetsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element ref="{urn:mtconnect.org:MTConnectAssets:1.6}Asset"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AssetsType")
@XmlType(name = "AssetsType", propOrder = {
    "asset"
})
public class AssetsType {

    @XmlElementRef(name = "Asset", namespace = "urn:mtconnect.org:MTConnectAssets:1.6", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AssetType>> asset;

    /**
     * Gets the value of the asset property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AssetType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolArchetypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the asset property.
     */
    public List<JAXBElement<? extends AssetType>> getAsset() {
        if (asset == null) {
            asset = new ArrayList<>();
        }
        return this.asset;
    }

}
