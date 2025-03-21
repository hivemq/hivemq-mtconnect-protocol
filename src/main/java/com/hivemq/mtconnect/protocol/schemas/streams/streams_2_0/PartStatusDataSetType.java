//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DataSet of {{def(EventEnum:PART_STATUS)}} If unique identifier is given,
 *         part status is for that individual. If group identifier is given without
 *         a unique identifier, then the status is assumed to be for the whole
 *         group.
 * 
 * <p>Java class for PartStatusDataSetType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartStatusDataSetType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectStreams:2.0}EventType">
 *       <sequence>
 *         <element name="Entry" type="{urn:mtconnect.org:MTConnectStreams:2.0}PartStatusEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="count" use="required" type="{urn:mtconnect.org:MTConnectStreams:2.0}CountValueType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PartStatusDataSetType")
@XmlType(name = "PartStatusDataSetType", propOrder = {
    "entry"
})
public class PartStatusDataSetType
    extends EventType
{

    /**
     * Constraints for Entry Values
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Entry")
    @XmlElement(name = "Entry")
    protected List<PartStatusEntryType> entry;
    /**
     * The number of entries
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "count")
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;

    /**
     * Constraints for Entry Values
     * 
     * Gets the value of the entry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartStatusEntryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the entry property.
     */
    public List<PartStatusEntryType> getEntry() {
        if (entry == null) {
            entry = new ArrayList<>();
        }
        return this.entry;
    }

    /**
     * The number of entries
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getCount()
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

}
