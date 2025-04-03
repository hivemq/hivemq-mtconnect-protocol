//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Reference)}} is a pointer to information that is associated with
 *         another {{term(Structural Element)}}.
 * 
 * <p>Java class for ReferenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReferenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="idRef" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.8}IdRefType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.8}NameType" />
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
     * A reference to an id in the MTConnectDevices model
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "idRef")
    @XmlAttribute(name = "idRef", required = true)
    @XmlIDREF
    protected Object idRef;
    /**
     * An optional name of the referenced item, used for documentation
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * A reference to an id in the MTConnectDevices model
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
     * An optional name of the referenced item, used for documentation
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
