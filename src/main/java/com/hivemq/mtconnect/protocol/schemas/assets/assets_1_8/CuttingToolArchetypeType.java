//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The {{block(CuttingToolArchetype)}} represents the static cutting tool
 *         geometries and nominal values as one would expect from a tool catalog.
 * 
 * <p>Java class for CuttingToolArchetypeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CuttingToolArchetypeType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectAssets:1.8}AssetType">
 *       <sequence>
 *         <element name="Description" type="{urn:mtconnect.org:MTConnectAssets:1.8}AssetDescriptionType" minOccurs="0"/>
 *         <choice>
 *           <sequence>
 *             <element name="CuttingToolDefinition" type="{urn:mtconnect.org:MTConnectAssets:1.8}CuttingToolDefinitionType"/>
 *             <element name="CuttingToolLifeCycle" type="{urn:mtconnect.org:MTConnectAssets:1.8}CuttingToolLifeCycleArchetypeType" minOccurs="0"/>
 *           </sequence>
 *           <element name="CuttingToolLifeCycle" type="{urn:mtconnect.org:MTConnectAssets:1.8}CuttingToolLifeCycleArchetypeType"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="toolId" type="{urn:mtconnect.org:MTConnectAssets:1.8}CuttingToolIdType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CuttingToolArchetypeType")
@XmlType(name = "CuttingToolArchetypeType", propOrder = {
    "rest"
})
public class CuttingToolArchetypeType
    extends AssetType
{

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CuttingToolLifeCycle" is used by two different parts of a schema. See: 
     * line 12737 of file:/Users/yingda.cao/coding/HiveMQ/hivemq-mtconnect-protocol/schema/MTConnectAssets_1.8.xsd
     * line 12724 of file:/Users/yingda.cao/coding/HiveMQ/hivemq-mtconnect-protocol/schema/MTConnectAssets_1.8.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:
     * 
     */
    @XmlElementRefs({
        @XmlElementRef(name = "Description", namespace = "urn:mtconnect.org:MTConnectAssets:1.8", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CuttingToolDefinition", namespace = "urn:mtconnect.org:MTConnectAssets:1.8", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CuttingToolLifeCycle", namespace = "urn:mtconnect.org:MTConnectAssets:1.8", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    /**
     * The identifier for a class of cutting tools.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "toolId")
    @XmlAttribute(name = "toolId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String toolId;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CuttingToolLifeCycle" is used by two different parts of a schema. See: 
     * line 12737 of file:/Users/yingda.cao/coding/HiveMQ/hivemq-mtconnect-protocol/schema/MTConnectAssets_1.8.xsd
     * line 12724 of file:/Users/yingda.cao/coding/HiveMQ/hivemq-mtconnect-protocol/schema/MTConnectAssets_1.8.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:
     * 
     * Gets the value of the rest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AssetDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolLifeCycleArchetypeType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the rest property.
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<>();
        }
        return this.rest;
    }

    /**
     * The identifier for a class of cutting tools.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolId() {
        return toolId;
    }

    /**
     * Sets the value of the toolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getToolId()
     */
    public void setToolId(String value) {
        this.toolId = value;
    }

}
