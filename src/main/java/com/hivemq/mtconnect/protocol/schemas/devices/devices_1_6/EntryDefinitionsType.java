//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_6;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The EntryDefinitions aggregates EntryDefinition .
 * 
 * <p>Java class for EntryDefinitionsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntryDefinitionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryDefinition" type="{urn:mtconnect.org:MTConnectDevices:1.6}EntryDefinitionType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EntryDefinitionsType")
@XmlType(name = "EntryDefinitionsType", propOrder = {
    "entryDefinition"
})
public class EntryDefinitionsType {

    /**
     * The semantic definition of an entry
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "EntryDefinition")
    @XmlElement(name = "EntryDefinition", required = true)
    protected List<EntryDefinitionType> entryDefinition;

    /**
     * The semantic definition of an entry
     * 
     * Gets the value of the entryDefinition property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryDefinition property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntryDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryDefinitionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the entryDefinition property.
     */
    public List<EntryDefinitionType> getEntryDefinition() {
        if (entryDefinition == null) {
            entryDefinition = new ArrayList<>();
        }
        return this.entryDefinition;
    }

}
