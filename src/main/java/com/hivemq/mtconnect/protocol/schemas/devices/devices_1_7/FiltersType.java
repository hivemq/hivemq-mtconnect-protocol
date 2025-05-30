//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Filters)}} {{termplural(organize)}} the {{block(Filter)}}
 *         elements associated with this {{block(DataItem)}} element.
 * 
 * <p>Java class for FiltersType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FiltersType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Filter" type="{urn:mtconnect.org:MTConnectDevices:1.7}DataItemFilterType" maxOccurs="unbounded"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FiltersType")
@XmlType(name = "FiltersType", propOrder = {

})
public class FiltersType {

    /**
     * Any substance or structure through which liquids or gases are passed
     *             to remove suspended impurities or to recover solids.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Filter")
    @XmlElement(name = "Filter", required = true)
    protected List<DataItemFilterType> filter;

    /**
     * Any substance or structure through which liquids or gases are passed
     *             to remove suspended impurities or to recover solids.
     * 
     * Gets the value of the filter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataItemFilterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the filter property.
     */
    public List<DataItemFilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<>();
        }
        return this.filter;
    }

}
