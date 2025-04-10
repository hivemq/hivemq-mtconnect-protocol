//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An XML element that describes the association between two pieces of
 *         equipment that function independently but together perform a
 *         manufacturing operation. It may also be used to define the association
 *         between two components within a piece of equipment.
 * 
 * <p>Java class for RelationshipType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RelationshipType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.6}IDType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.6}NameType" />
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.6}RelationshipTypeEnumType" />
 *       <attribute name="criticality" type="{urn:mtconnect.org:MTConnectDevices:1.6}CriticalityEnumType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RelationshipType")
@XmlType(name = "RelationshipType")
@XmlSeeAlso({
    ComponentRelationshipType.class,
    DeviceRelationshipType.class
})
public abstract class RelationshipType {

    /**
     * The unique identifier for this element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The name of an element or a piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The type of either a structural element or a dataitem being measured.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected RelationshipTypeEnumType type;
    /**
     * Defines whether the services or functions provided by the associated
     *           piece of equipment is required for the operation of this piece of
     *           equipment. criticality is an optional attribute. The value provided
     *           for criticality MUST be one of the following values: tab critical: The
     *           services or functions provided by the associated piece of equipment is
     *           required for the operation of this piece of equipment. tab
     *           noncritical: The services or functions provided by the associated
     *           piece of equipment is not required for the operation of this piece of
     *           equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "criticality")
    @XmlAttribute(name = "criticality")
    protected CriticalityEnumType criticality;

    /**
     * The unique identifier for this element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * The name of an element or a piece of equipment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The type of either a structural element or a dataitem being measured.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTypeEnumType }
     *     
     */
    public RelationshipTypeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTypeEnumType }
     *     
     * @see #getType()
     */
    public void setType(RelationshipTypeEnumType value) {
        this.type = value;
    }

    /**
     * Defines whether the services or functions provided by the associated
     *           piece of equipment is required for the operation of this piece of
     *           equipment. criticality is an optional attribute. The value provided
     *           for criticality MUST be one of the following values: tab critical: The
     *           services or functions provided by the associated piece of equipment is
     *           required for the operation of this piece of equipment. tab
     *           noncritical: The services or functions provided by the associated
     *           piece of equipment is not required for the operation of this piece of
     *           equipment.
     * 
     * @return
     *     possible object is
     *     {@link CriticalityEnumType }
     *     
     */
    public CriticalityEnumType getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriticalityEnumType }
     *     
     * @see #getCriticality()
     */
    public void setCriticality(CriticalityEnumType value) {
        this.criticality = value;
    }

}
