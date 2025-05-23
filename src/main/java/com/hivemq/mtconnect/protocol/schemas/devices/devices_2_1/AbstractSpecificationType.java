//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A specification
 * 
 * <p>Java class for AbstractSpecificationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractSpecificationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}IDType" />
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}DataItemEnumType" />
 *       <attribute name="originator" type="{urn:mtconnect.org:MTConnectDevices:2.1}OriginatorEnumType" default="MANUFACTURER" />
 *       <attribute name="subType" type="{urn:mtconnect.org:MTConnectDevices:2.1}DataItemSubEnumType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:2.1}NameType" />
 *       <attribute name="dataItemIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.1}SourceDataItemIdType" />
 *       <attribute name="compositionIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.1}CompositionIdType" />
 *       <attribute name="coordinateSystemIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.1}CoordinateSystemIdRefType" />
 *       <attribute name="units" type="{urn:mtconnect.org:MTConnectDevices:2.1}UnitsType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AbstractSpecificationType")
@XmlType(name = "AbstractSpecificationType")
@XmlSeeAlso({
    SpecificationType.class,
    ProcessSpecificationType.class
})
public abstract class AbstractSpecificationType {

    /**
     * The identity of the Specificaiton
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The type of measurement
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected String type;
    /**
     * A reference to the creator of the Specification
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "originator")
    @XmlAttribute(name = "originator")
    protected String originator;
    /**
     * The type of measurement
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "subType")
    @XmlAttribute(name = "subType")
    protected String subType;
    /**
     * The name of the spec
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The optional data item identifier
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "dataItemIdRef")
    @XmlAttribute(name = "dataItemIdRef")
    @XmlIDREF
    protected Object dataItemIdRef;
    /**
     * The optional composition identifier
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "compositionIdRef")
    @XmlAttribute(name = "compositionIdRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compositionIdRef;
    /**
     * The optional coordinate system identifier
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "coordinateSystemIdRef")
    @XmlAttribute(name = "coordinateSystemIdRef")
    @XmlIDREF
    protected Object coordinateSystemIdRef;
    /**
     * The units
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "units")
    @XmlAttribute(name = "units")
    protected String units;

    /**
     * The identity of the Specificaiton
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
     * The type of measurement
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * A reference to the creator of the Specification
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        if (originator == null) {
            return "MANUFACTURER";
        } else {
            return originator;
        }
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginator()
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * The type of measurement
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSubType()
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * The name of the spec
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
     * The optional data item identifier
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataItemIdRef() {
        return dataItemIdRef;
    }

    /**
     * Sets the value of the dataItemIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getDataItemIdRef()
     */
    public void setDataItemIdRef(Object value) {
        this.dataItemIdRef = value;
    }

    /**
     * The optional composition identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositionIdRef() {
        return compositionIdRef;
    }

    /**
     * Sets the value of the compositionIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompositionIdRef()
     */
    public void setCompositionIdRef(String value) {
        this.compositionIdRef = value;
    }

    /**
     * The optional coordinate system identifier
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoordinateSystemIdRef() {
        return coordinateSystemIdRef;
    }

    /**
     * Sets the value of the coordinateSystemIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getCoordinateSystemIdRef()
     */
    public void setCoordinateSystemIdRef(Object value) {
        this.coordinateSystemIdRef = value;
    }

    /**
     * The units
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnits()
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
