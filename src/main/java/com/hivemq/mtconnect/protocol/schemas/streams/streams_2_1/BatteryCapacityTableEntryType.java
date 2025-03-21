//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Table Entry of {{def(SampleEnum:BATTERY_CAPACITY)}}
 * 
 * <p>Java class for BatteryCapacityTableEntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BatteryCapacityTableEntryType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectStreams:2.1}EntryType">
 *       <sequence>
 *         <element name="Cell" type="{urn:mtconnect.org:MTConnectStreams:2.1}BatteryCapacityCellType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "BatteryCapacityTableEntryType")
@XmlType(name = "BatteryCapacityTableEntryType", propOrder = {
    "cell"
})
public class BatteryCapacityTableEntryType
    extends EntryType
{

    /**
     * Constraints for Cell Values
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Cell")
    @XmlElement(name = "Cell")
    protected List<BatteryCapacityCellType> cell;

    /**
     * Constraints for Cell Values
     * 
     * Gets the value of the cell property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatteryCapacityCellType }
     * </p>
     * 
     * 
     * @return
     *     The value of the cell property.
     */
    public List<BatteryCapacityCellType> getCell() {
        if (cell == null) {
            cell = new ArrayList<>();
        }
        return this.cell;
    }

}
