//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An XML element representing a key-value pair published as part of a data
 *         set.
 * 
 * <p>Java class for EntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="key" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.6}KeyType" />
 *       <attribute name="removed" type="{urn:mtconnect.org:MTConnectStreams:1.6}RemovedType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EntryType")
@XmlType(name = "EntryType", propOrder = {
    "content"
})
@XmlSeeAlso({
    VariableEntryType.class,
    TableEntryType.class,
    WorkOffsetTableEntryType.class,
    ToolOffsetTableEntryType.class
})
public abstract class EntryType {

    /**
     * An XML element representing a key-value pair published as part of a data
     *         set.
     * 
     */
    @XmlValue
    protected String content;
    /**
     * the key
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "key")
    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String key;
    /**
     * An indicator that the mtconnect asset has been removed from the piece
     *           of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "removed")
    @XmlAttribute(name = "removed")
    protected Boolean removed;

    /**
     * An XML element representing a key-value pair published as part of a data
     *         set.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContent()
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * the key
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * An indicator that the mtconnect asset has been removed from the piece
     *           of equipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRemoved()
     */
    public void setRemoved(Boolean value) {
        this.removed = value;
    }

}
