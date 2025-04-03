//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An XML container type element that organizes data returned from an agent
 *         in response to a current httprequest or sample httprequest HTTP request.
 * 
 * <p>Java class for ComponentStreamType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentStreamType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Samples" type="{urn:mtconnect.org:MTConnectStreams:1.5}SamplesType" minOccurs="0"/>
 *         <element name="Events" type="{urn:mtconnect.org:MTConnectStreams:1.5}EventsType" minOccurs="0"/>
 *         <element name="Condition" type="{urn:mtconnect.org:MTConnectStreams:1.5}ConditionListType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="componentId" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}ComponentIdType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectStreams:1.5}NameType" />
 *       <attribute name="nativeName" type="{urn:mtconnect.org:MTConnectStreams:1.5}NameType" />
 *       <attribute name="component" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}NameType" />
 *       <attribute name="uuid" type="{urn:mtconnect.org:MTConnectStreams:1.5}UuidType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ComponentStreamType")
@XmlType(name = "ComponentStreamType", propOrder = {
    "samples",
    "events",
    "condition"
})
public class ComponentStreamType {

    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of sample
     *             category.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Samples")
    @XmlElement(name = "Samples")
    protected SamplesType samples;
    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of event
     *             category.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Events")
    @XmlElement(name = "Events")
    protected EventsType events;
    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of condition
     *             category.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Condition")
    @XmlElement(name = "Condition")
    protected ConditionListType condition;
    /**
     * The identifier attribute of the component element that represents the
     *           physical part of a piece of equipment where the data represented by
     *           the dataitem element originated.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "componentId")
    @XmlAttribute(name = "componentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String componentId;
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
     * An abstract XML element. Replaced in the XML document by types of
     *           component elements representing physical parts and logical functions
     *           of a piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "component")
    @XmlAttribute(name = "component", required = true)
    protected String component;
    /**
     * The unique identifier for an XML element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "uuid")
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of sample
     *             category.
     * 
     * @return
     *     possible object is
     *     {@link SamplesType }
     *     
     */
    public SamplesType getSamples() {
        return samples;
    }

    /**
     * Sets the value of the samples property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplesType }
     *     
     * @see #getSamples()
     */
    public void setSamples(SamplesType value) {
        this.samples = value;
    }

    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of event
     *             category.
     * 
     * @return
     *     possible object is
     *     {@link EventsType }
     *     
     */
    public EventsType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsType }
     *     
     * @see #getEvents()
     */
    public void setEvents(EventsType value) {
        this.events = value;
    }

    /**
     * An XML container type element that organizes the data reported in
     *             the mtconnectstreams document for dataitem elements defined in the
     *             mtconnectdevices document with a category attribute of condition
     *             category.
     * 
     * @return
     *     possible object is
     *     {@link ConditionListType }
     *     
     */
    public ConditionListType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionListType }
     *     
     * @see #getCondition()
     */
    public void setCondition(ConditionListType value) {
        this.condition = value;
    }

    /**
     * The identifier attribute of the component element that represents the
     *           physical part of a piece of equipment where the data represented by
     *           the dataitem element originated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComponentId()
     */
    public void setComponentId(String value) {
        this.componentId = value;
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
     * An abstract XML element. Replaced in the XML document by types of
     *           component elements representing physical parts and logical functions
     *           of a piece of equipment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComponent()
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * The unique identifier for an XML element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUuid()
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
