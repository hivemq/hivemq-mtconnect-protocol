//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A {{block(Relationship)}} providing a semantic reference to another
 *         {{block(Specification)}} described by the {{property(type)}} and
 *         {{property(idRef)}} property.
 * 
 * <p>Java class for SpecificationRelationshipType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecificationRelationshipType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.7}AbstractDataItemRelationshipType">
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.7}SpecificationRelationshipTypeEnumType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SpecificationRelationshipType")
@XmlType(name = "SpecificationRelationshipType")
public class SpecificationRelationshipType
    extends AbstractDataItemRelationshipType
{

    /**
     * The type of either a {{term(Structural Element)}} or a
     *               {{block(DataItem)}} being measured.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected SpecificationRelationshipTypeEnumType type;

    /**
     * The type of either a {{term(Structural Element)}} or a
     *               {{block(DataItem)}} being measured.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationRelationshipTypeEnumType }
     *     
     */
    public SpecificationRelationshipTypeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationRelationshipTypeEnumType }
     *     
     * @see #getType()
     */
    public void setType(SpecificationRelationshipTypeEnumType value) {
        this.type = value;
    }

}
