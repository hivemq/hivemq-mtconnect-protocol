//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Organizes file destinations
 * 
 * <p>Java class for FileDestinationsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileDestinationsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Destination" type="{urn:mtconnect.org:MTConnectAssets:2.0}FileDestinationType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FileDestinationsType")
@XmlType(name = "FileDestinationsType", propOrder = {
    "destination"
})
public class FileDestinationsType {

    /**
     * reference to the target {{block(Device)}} for this {{block(File)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Destination")
    @XmlElement(name = "Destination", required = true)
    protected List<FileDestinationType> destination;

    /**
     * reference to the target {{block(Device)}} for this {{block(File)}}.
     * 
     * Gets the value of the destination property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileDestinationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the destination property.
     */
    public List<FileDestinationType> getDestination() {
        if (destination == null) {
            destination = new ArrayList<>();
        }
        return this.destination;
    }

}
