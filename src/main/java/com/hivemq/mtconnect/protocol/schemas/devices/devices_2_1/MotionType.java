//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * See {{sect(Motion)}}.
 * 
 * <p>Java class for MotionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MotionType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.1}AbstractConfigurationType">
 *       <sequence>
 *         <element name="Description" type="{urn:mtconnect.org:MTConnectDevices:2.1}MotionDescriptionType" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="Origin" type="{urn:mtconnect.org:MTConnectDevices:2.1}OriginType"/>
 *           <element name="Transformation" type="{urn:mtconnect.org:MTConnectDevices:2.1}TransformationType"/>
 *         </choice>
 *         <element name="Axis" type="{urn:mtconnect.org:MTConnectDevices:2.1}MotionAxisType"/>
 *       </sequence>
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}IDType" />
 *       <attribute name="parentIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.1}IdRefType" />
 *       <attribute name="coordinateSystemIdRef" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}CoordinateSystemIdRefType" />
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}MotionTypeEnumType" />
 *       <attribute name="actuation" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.1}ActuationTypeEnumType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "MotionType")
@XmlType(name = "MotionType", propOrder = {
    "content"
})
public class MotionType {

    /**
     * See {{sect(Motion)}}.
     * 
     */
    @XmlElementRefs({
        @XmlElementRef(name = "Description", namespace = "urn:mtconnect.org:MTConnectDevices:2.1", type = JAXBElement.class),
        @XmlElementRef(name = "Origin", namespace = "urn:mtconnect.org:MTConnectDevices:2.1", type = JAXBElement.class),
        @XmlElementRef(name = "Transformation", namespace = "urn:mtconnect.org:MTConnectDevices:2.1", type = JAXBElement.class),
        @XmlElementRef(name = "Axis", namespace = "urn:mtconnect.org:MTConnectDevices:2.1", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    /**
     * The coordinate system identifier
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The parent of the coordinate system
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "parentIdRef")
    @XmlAttribute(name = "parentIdRef")
    @XmlIDREF
    protected Object parentIdRef;
    /**
     * The identifier of the coordinate system that this motion is
     *               relative to
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "coordinateSystemIdRef")
    @XmlAttribute(name = "coordinateSystemIdRef", required = true)
    @XmlIDREF
    protected Object coordinateSystemIdRef;
    /**
     * The motion type
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected MotionTypeEnumType type;
    /**
     * The actuation method
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "actuation")
    @XmlAttribute(name = "actuation", required = true)
    protected ActuationTypeEnumType actuation;

    /**
     * See {{sect(Motion)}}.
     * 
     * Gets the value of the content property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MotionAxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link MotionDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    /**
     * The coordinate system identifier
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
     * The parent of the coordinate system
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
     * The identifier of the coordinate system that this motion is
     *               relative to
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
     * The motion type
     * 
     * @return
     *     possible object is
     *     {@link MotionTypeEnumType }
     *     
     */
    public MotionTypeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionTypeEnumType }
     *     
     * @see #getType()
     */
    public void setType(MotionTypeEnumType value) {
        this.type = value;
    }

    /**
     * The actuation method
     * 
     * @return
     *     possible object is
     *     {@link ActuationTypeEnumType }
     *     
     */
    public ActuationTypeEnumType getActuation() {
        return actuation;
    }

    /**
     * Sets the value of the actuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuationTypeEnumType }
     *     
     * @see #getActuation()
     */
    public void setActuation(ActuationTypeEnumType value) {
        this.actuation = value;
    }

}
