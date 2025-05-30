//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

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
 * {{block(CoordinateSystems)}} {{termplural(organize)}}
 *         {{block(CoordinateSystem)}} elements for a {{block(Component)}} and its
 *         children.
 * 
 * <p>Java class for CoordinateSystemsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoordinateSystemsType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.7}AbstractConfigurationType">
 *       <all>
 *         <element name="CoordinateSystem" type="{urn:mtconnect.org:MTConnectDevices:1.7}CoordinateSystemType" maxOccurs="unbounded"/>
 *       </all>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CoordinateSystemsType")
@XmlType(name = "CoordinateSystemsType", propOrder = {
    "content"
})
public class CoordinateSystemsType {

    /**
     * {{block(CoordinateSystems)}} {{termplural(organize)}}
     *         {{block(CoordinateSystem)}} elements for a {{block(Component)}} and its
     *         children.
     * 
     */
    @XmlElementRef(name = "CoordinateSystem", namespace = "urn:mtconnect.org:MTConnectDevices:1.7", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;

    /**
     * {{block(CoordinateSystems)}} {{termplural(organize)}}
     *         {{block(CoordinateSystem)}} elements for a {{block(Component)}} and its
     *         children.
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
     * {@link JAXBElement }{@code <}{@link CoordinateSystemType }{@code >}
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
