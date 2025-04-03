//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Organizes DataItemRelationship and SpecificationRelationship
 * 
 * <p>Java class for DataItemRelationshipsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataItemRelationshipsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:mtconnect.org:MTConnectAssets:2.2}AbstractDataItemRelationship" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemRelationshipsType")
@XmlType(name = "DataItemRelationshipsType", propOrder = {
    "abstractDataItemRelationship"
})
public class DataItemRelationshipsType {

    /**
     * Description
     * 
     */
    @XmlElementRef(name = "AbstractDataItemRelationship", namespace = "urn:mtconnect.org:MTConnectAssets:2.2", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractDataItemRelationshipType>> abstractDataItemRelationship;

    /**
     * Description
     * 
     * Gets the value of the abstractDataItemRelationship property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractDataItemRelationship property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbstractDataItemRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractDataItemRelationshipType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataItemRelationshipType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificationRelationshipType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the abstractDataItemRelationship property.
     */
    public List<JAXBElement<? extends AbstractDataItemRelationshipType>> getAbstractDataItemRelationship() {
        if (abstractDataItemRelationship == null) {
            abstractDataItemRelationship = new ArrayList<>();
        }
        return this.abstractDataItemRelationship;
    }

}
