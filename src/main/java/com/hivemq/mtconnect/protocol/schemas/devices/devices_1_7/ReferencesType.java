//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * References Model
 * 
 * <p>Java class for ReferencesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReferencesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element ref="{urn:mtconnect.org:MTConnectDevices:1.7}Reference" maxOccurs="unbounded"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ReferencesType")
@XmlType(name = "ReferencesType", propOrder = {

})
public class ReferencesType {

    /**
     * {{block(Reference)}} is a pointer to information that is associated with
     *         another {{term(Structural Element)}}.
     * 
     */
    @XmlElementRef(name = "Reference", namespace = "urn:mtconnect.org:MTConnectDevices:1.7", type = JAXBElement.class)
    protected List<JAXBElement<? extends ReferenceType>> reference;

    /**
     * {{block(Reference)}} is a pointer to information that is associated with
     *         another {{term(Structural Element)}}.
     * 
     * Gets the value of the reference property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ComponentRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataItemRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the reference property.
     */
    public List<JAXBElement<? extends ReferenceType>> getReference() {
        if (reference == null) {
            reference = new ArrayList<>();
        }
        return this.reference;
    }

}
