//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * reference is a pointer to information that is associated with another
 *         structural element defined elsewhere in the XML document for a piece of
 *         equipment.
 * 
 * <p>Java class for ReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="idRef" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.6}IdRefType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.6}NameType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ReferenceType")
@XmlType(name = "ReferenceType")
@XmlSeeAlso({
    DataItemRefType.class,
    ComponentRefType.class
})
public abstract class ReferenceType {

    /**
     * A pointer to the id attribute of an element that contains the
     *           information to be associated with this XML element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "idRef")
    @XmlAttribute(name = "idRef", required = true)
    @XmlIDREF
    protected Object idRef;
    /**
     * The name of an element or a piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * A pointer to the id attribute of an element that contains the
     *           information to be associated with this XML element.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdRef() {
        return idRef;
    }

    /**
     * Sets the value of the idRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getIdRef()
     */
    public void setIdRef(Object value) {
        this.idRef = value;
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

}
