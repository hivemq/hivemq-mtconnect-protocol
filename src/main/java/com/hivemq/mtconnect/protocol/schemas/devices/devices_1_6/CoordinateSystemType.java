//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * For measured values relative to a coordinate system like position
 *         sample, the coordinate system being used may be reported.
 * 
 * <p>Java class for CoordinateSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoordinateSystemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <element name="Origin" type="{urn:mtconnect.org:MTConnectDevices:1.6}OriginType"/>
 *         <element name="Transformation" type="{urn:mtconnect.org:MTConnectDevices:1.6}TransformationType"/>
 *       </choice>
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.6}IDType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.6}NameType" />
 *       <attribute name="nativeName" type="{urn:mtconnect.org:MTConnectDevices:1.6}NameType" />
 *       <attribute name="parentIdRef" type="{urn:mtconnect.org:MTConnectDevices:1.6}IdRefType" />
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.6}CoordinateSystemTypeEnumType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CoordinateSystemType")
@XmlType(name = "CoordinateSystemType", propOrder = {
    "origin",
    "transformation"
})
public class CoordinateSystemType {

    /**
     * The coordinates of the origin position of a coordinate system. The
     *             coordinate MUST be in millimeter3d.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Origin")
    @XmlElement(name = "Origin")
    protected OriginType origin;
    /**
     * The process of transforming to the origin position of the
     *             coordinate system from a parent coordinate system using translation
     *             event and rotation event.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Transformation")
    @XmlElement(name = "Transformation")
    protected TransformationType transformation;
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
     * The common name normally associated with a piece of equipment or an
     *           element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeName")
    @XmlAttribute(name = "nativeName")
    protected String nativeName;
    /**
     * A pointer to the id attribute of the parent coordinatesystem new.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "parentIdRef")
    @XmlAttribute(name = "parentIdRef")
    @XmlIDREF
    protected Object parentIdRef;
    /**
     * The type of either a structural element or a dataitem being measured.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected CoordinateSystemTypeEnumType type;

    /**
     * The coordinates of the origin position of a coordinate system. The
     *             coordinate MUST be in millimeter3d.
     * 
     * @return
     *     possible object is
     *     {@link OriginType }
     *     
     */
    public OriginType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginType }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(OriginType value) {
        this.origin = value;
    }

    /**
     * The process of transforming to the origin position of the
     *             coordinate system from a parent coordinate system using translation
     *             event and rotation event.
     * 
     * @return
     *     possible object is
     *     {@link TransformationType }
     *     
     */
    public TransformationType getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationType }
     *     
     * @see #getTransformation()
     */
    public void setTransformation(TransformationType value) {
        this.transformation = value;
    }

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
     * The common name normally associated with a piece of equipment or an
     *           element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName() {
        return nativeName;
    }

    /**
     * Sets the value of the nativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNativeName()
     */
    public void setNativeName(String value) {
        this.nativeName = value;
    }

    /**
     * A pointer to the id attribute of the parent coordinatesystem new.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentIdRef() {
        return parentIdRef;
    }

    /**
     * Sets the value of the parentIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getParentIdRef()
     */
    public void setParentIdRef(Object value) {
        this.parentIdRef = value;
    }

    /**
     * The type of either a structural element or a dataitem being measured.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemTypeEnumType }
     *     
     */
    public CoordinateSystemTypeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemTypeEnumType }
     *     
     * @see #getType()
     */
    public void setType(CoordinateSystemTypeEnumType value) {
        this.type = value;
    }

}
