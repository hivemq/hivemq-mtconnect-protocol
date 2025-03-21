//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An abstract component type. This is a placeholder for all components
 * 
 * <p>Java class for ComponentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Description" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentDescriptionType" minOccurs="0"/>
 *         <element name="Configuration" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentConfigurationType" minOccurs="0"/>
 *         <element name="DataItems" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemsType" minOccurs="0"/>
 *         <element name="Components" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentsType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}IDType" />
 *       <attribute name="nativeName" type="{urn:mtconnect.org:MTConnectDevices:1.3}NameType" />
 *       <attribute name="sampleInterval" type="{urn:mtconnect.org:MTConnectDevices:1.3}SampleIntervalType" />
 *       <attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectDevices:1.3}SampleRateType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ComponentType")
@XmlType(name = "ComponentType", propOrder = {
    "description",
    "configuration",
    "dataItems",
    "components"
})
@XmlSeeAlso({
    DeviceType.class,
    CommonComponentType.class
})
public abstract class ComponentType {

    /**
     * The descriptive information about this component
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Description")
    @XmlElement(name = "Description")
    protected ComponentDescriptionType description;
    /**
     * The configuration information about this component
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Configuration")
    @XmlElement(name = "Configuration")
    protected ComponentConfigurationType configuration;
    /**
     * The component's Data Items
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "DataItems")
    @XmlElement(name = "DataItems")
    protected DataItemsType dataItems;
    /**
     * The sub components
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Components")
    @XmlElement(name = "Components")
    protected ComponentsType components;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeName")
    @XmlAttribute(name = "nativeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nativeName;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sampleInterval")
    @XmlAttribute(name = "sampleInterval")
    protected Float sampleInterval;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sampleRate")
    @XmlAttribute(name = "sampleRate")
    protected Float sampleRate;

    /**
     * The descriptive information about this component
     * 
     * @return
     *     possible object is
     *     {@link ComponentDescriptionType }
     *     
     */
    public ComponentDescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDescriptionType }
     *     
     * @see #getDescription()
     */
    public void setDescription(ComponentDescriptionType value) {
        this.description = value;
    }

    /**
     * The configuration information about this component
     * 
     * @return
     *     possible object is
     *     {@link ComponentConfigurationType }
     *     
     */
    public ComponentConfigurationType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentConfigurationType }
     *     
     * @see #getConfiguration()
     */
    public void setConfiguration(ComponentConfigurationType value) {
        this.configuration = value;
    }

    /**
     * The component's Data Items
     * 
     * @return
     *     possible object is
     *     {@link DataItemsType }
     *     
     */
    public DataItemsType getDataItems() {
        return dataItems;
    }

    /**
     * Sets the value of the dataItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataItemsType }
     *     
     * @see #getDataItems()
     */
    public void setDataItems(DataItemsType value) {
        this.dataItems = value;
    }

    /**
     * The sub components
     * 
     * @return
     *     possible object is
     *     {@link ComponentsType }
     *     
     */
    public ComponentsType getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsType }
     *     
     * @see #getComponents()
     */
    public void setComponents(ComponentsType value) {
        this.components = value;
    }

    /**
     * Gets the value of the id property.
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
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nativeName property.
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
     */
    public void setNativeName(String value) {
        this.nativeName = value;
    }

    /**
     * Gets the value of the sampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleInterval() {
        return sampleInterval;
    }

    /**
     * Sets the value of the sampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleInterval(Float value) {
        this.sampleInterval = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleRate(Float value) {
        this.sampleRate = value;
    }

}
