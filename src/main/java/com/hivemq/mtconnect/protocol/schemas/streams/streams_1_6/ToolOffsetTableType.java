//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Table of A reference to the tool offset variables applied to the active
 *         cutting tool associated with a path in a controller type component.
 * 
 * <p>Java class for ToolOffsetTableType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ToolOffsetTableType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectStreams:1.6}EventType">
 *       <sequence>
 *         <element name="Entry" type="{urn:mtconnect.org:MTConnectStreams:1.6}ToolOffsetTableEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="count" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.6}CountValueType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ToolOffsetTableType")
@XmlType(name = "ToolOffsetTableType", propOrder = {
    "entry"
})
public class ToolOffsetTableType
    extends EventType
{

    /**
     * An XML element representing a key-value pair published as part
     *                 of a data set.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Entry")
    @XmlElement(name = "Entry")
    protected List<ToolOffsetTableEntryType> entry;
    /**
     * A count of something.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "count")
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;

    /**
     * An XML element representing a key-value pair published as part
     *                 of a data set.
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
     * {@link ToolOffsetTableEntryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the entry property.
     */
    public List<ToolOffsetTableEntryType> getEntry() {
        if (entry == null) {
            entry = new ArrayList<>();
        }
        return this.entry;
    }

    /**
     * A count of something.
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
