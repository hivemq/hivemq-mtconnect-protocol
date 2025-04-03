//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * {{block(ComponentStream)}} {{termplural(organize)}} the
 *         {{block(Observation)}} entities associated with the
 *         {{block(Component)}}. See {{package(Observation Information Model)}} for
 *         the {{block(ComponentStream)}} model. > Note 1 to entry: In the
 *         {{term(XML)}} representation, {{block(ComponentStream)}} entities **MUST
 *         NOT** appear in the {{term(MTConnectDevices Response Document)}}. >
 *         Note 2 to entry: In the {{term(XML)}} representation,
 *         {{block(ComponentStream)}} entities **MUST** appear only in the
 *         {{term(MTConnectStreams Response Document)}}.
 * 
 * <p>Java class for ComponentStreamType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentStreamType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Samples" type="{urn:mtconnect.org:MTConnectAssets:2.3}SamplesType" minOccurs="0"/>
 *         <element name="Events" type="{urn:mtconnect.org:MTConnectAssets:2.3}EventsType" minOccurs="0"/>
 *         <element name="Condition" type="{urn:mtconnect.org:MTConnectAssets:2.3}ConditionListType" minOccurs="0"/>
 *       </all>
 *       <attribute name="componentId" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.3}ComponentIdType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectAssets:2.3}NameType" />
 *       <attribute name="nativeName" type="{urn:mtconnect.org:MTConnectAssets:2.3}NameType" />
 *       <attribute name="component" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.3}NameType" />
 *       <attribute name="uuid" type="{urn:mtconnect.org:MTConnectAssets:2.3}UuidType" />
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

})
public class ComponentStreamType {

    /**
     * {{block(Samples)}} groups one or more {{block(Sample)}} entities.
     *             See {{sect(Sample)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Samples")
    @XmlElement(name = "Samples")
    protected SamplesType samples;
    /**
     * {{block(Events)}} groups one or more {{block(Event)}} entities. See
     *             {{sect(Event)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Events")
    @XmlElement(name = "Events")
    protected EventsType events;
    /**
     * Description
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Condition")
    @XmlElement(name = "Condition")
    protected ConditionListType condition;
    /**
     * The id of the component (maps to the id from probe)
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "componentId")
    @XmlAttribute(name = "componentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String componentId;
    /**
     * identifier of the maintenance activity.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The device manufacturer component name
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeName")
    @XmlAttribute(name = "nativeName")
    protected String nativeName;
    /**
     * Description
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "component")
    @XmlAttribute(name = "component", required = true)
    protected String component;
    /**
     * The unque identifier for this component
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "uuid")
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * {{block(Samples)}} groups one or more {{block(Sample)}} entities.
     *             See {{sect(Sample)}}.
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
     * {{block(Events)}} groups one or more {{block(Event)}} entities. See
     *             {{sect(Event)}}.
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
     * Description
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
     * The id of the component (maps to the id from probe)
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
     * identifier of the maintenance activity.
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
     * The device manufacturer component name
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
     * Description
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
     * The unque identifier for this component
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
