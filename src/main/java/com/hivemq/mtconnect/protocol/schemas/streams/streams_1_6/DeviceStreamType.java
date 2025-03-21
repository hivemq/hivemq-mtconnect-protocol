//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_6;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An XML container element provided in the streams container in the
 *         mtconnectstreams document.
 * 
 * <p>Java class for DeviceStreamType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceStreamType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComponentStream" type="{urn:mtconnect.org:MTConnectStreams:1.6}ComponentStreamType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="name" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.6}NameType" />
 *       <attribute name="uuid" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.6}UuidType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DeviceStreamType")
@XmlType(name = "DeviceStreamType", propOrder = {
    "componentStream"
})
public class DeviceStreamType {

    /**
     * An XML container type element that organizes data returned from an
     *             agent in response to a current httprequest or sample httprequest
     *             HTTP request.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ComponentStream")
    @XmlElement(name = "ComponentStream")
    protected List<ComponentStreamType> componentStream;
    /**
     * The name of an element or a piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name", required = true)
    protected String name;
    /**
     * The unique identifier for an XML element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "uuid")
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;

    /**
     * An XML container type element that organizes data returned from an
     *             agent in response to a current httprequest or sample httprequest
     *             HTTP request.
     * 
     * Gets the value of the componentStream property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentStream property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getComponentStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentStreamType }
     * </p>
     * 
     * 
     * @return
     *     The value of the componentStream property.
     */
    public List<ComponentStreamType> getComponentStream() {
        if (componentStream == null) {
            componentStream = new ArrayList<>();
        }
        return this.componentStream;
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
