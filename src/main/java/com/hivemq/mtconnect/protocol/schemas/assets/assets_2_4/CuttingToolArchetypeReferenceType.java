//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * reference information about the {{property(Asset::assetId)}} and/or the
 *         URL of the data source of {{block(CuttingToolArchetype)}}.
 * 
 * <p>Java class for CuttingToolArchetypeReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CuttingToolArchetypeReferenceType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.4>AssetIdType">
 *       <attribute name="source" type="{urn:mtconnect.org:MTConnectAssets:2.4}SourceType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CuttingToolArchetypeReferenceType")
@XmlType(name = "CuttingToolArchetypeReferenceType", propOrder = {
    "value"
})
public class CuttingToolArchetypeReferenceType {

    /**
     * The unique id of the asset
     * 
     */
    @XmlValue
    protected String value;
    /**
     * identifies the {{block(Component)}}, {{block(DataItem)}}, or
     *               {{block(Composition)}} from which a measured value originates.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "source")
    @XmlAttribute(name = "source")
    protected String source;

    /**
     * The unique id of the asset
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
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * identifies the {{block(Component)}}, {{block(DataItem)}}, or
     *               {{block(Composition)}} from which a measured value originates.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

}
