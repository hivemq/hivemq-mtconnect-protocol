//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The configuration data associated with this component.
 * 
 * <p>Java class for ComponentConfigurationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentConfigurationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:mtconnect.org:MTConnectDevices:1.6}AbstractConfiguration" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ComponentConfigurationType")
@XmlType(name = "ComponentConfigurationType", propOrder = {
    "content"
})
public class ComponentConfigurationType {

    /**
     * The configuration data associated with this component.
     * 
     */
    @XmlElementRef(name = "AbstractConfiguration", namespace = "urn:mtconnect.org:MTConnectDevices:1.6", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;

    /**
     * The configuration data associated with this component.
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
     * {@link JAXBElement }{@code <}{@link AbstractConfigurationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationshipsType }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorConfigurationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificationsType }{@code >}
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

}
