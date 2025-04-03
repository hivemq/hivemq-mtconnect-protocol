//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An XML element which provides the information and data reported from a
 *         piece of equipment for those dataitem elements defined with a category
 *         attribute of condition category in the mtconnectdevices document.
 * 
 * <p>Java class for ConditionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConditionType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectStreams:1.5>ConditionDescriptionType">
 *       <attGroup ref="{urn:mtconnect.org:MTConnectStreams:1.5}ObservationType"/>
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}DataItemEnumType" />
 *       <attribute name="nativeCode" type="{urn:mtconnect.org:MTConnectStreams:1.5}NativeCodeType" />
 *       <attribute name="nativeSeverity" type="{urn:mtconnect.org:MTConnectStreams:1.5}NativeSeverityType" />
 *       <attribute name="qualifier" type="{urn:mtconnect.org:MTConnectStreams:1.5}QualifierType" />
 *       <attribute name="statistic" type="{urn:mtconnect.org:MTConnectStreams:1.5}DataItemStatisticsType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ConditionType")
@XmlType(name = "ConditionType", propOrder = {
    "value"
})
@XmlSeeAlso({
    UnavailableType.class,
    NormalType.class,
    WarningType.class,
    FaultType.class
})
public abstract class ConditionType {

    /**
     * The description of the Condition
     * 
     */
    @XmlValue
    protected String value;
    /**
     * The type of either a structural element or a dataitem being
     *               measured.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected String type;
    /**
     * The native code (usually an alpha-numeric value) generated by the
     *               controller of a piece of equipment or the element.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeCode")
    @XmlAttribute(name = "nativeCode")
    protected String nativeCode;
    /**
     * If the piece of equipment designates a severity level to a fault,
     *               nativeseverity reports that severity information to a client
     *               software application.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeSeverity")
    @XmlAttribute(name = "nativeSeverity")
    protected String nativeSeverity;
    /**
     * qualifier provides additional information regarding a fault state
     *               associated with the measured value of a process variable.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "qualifier")
    @XmlAttribute(name = "qualifier")
    protected QualifierType qualifier;
    /**
     * Describes the type of statistical calculation performed on a
     *               series of data samples to provide the reported data value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "statistic")
    @XmlAttribute(name = "statistic")
    protected String statistic;
    /**
     * A number representing the sequential position of an occurrence of a
     *           category type in the data buffer of an agent.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sequence")
    @XmlAttribute(name = "sequence", required = true)
    protected BigInteger sequence;
    /**
     * A sub-categorization of the data item type.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "subType")
    @XmlAttribute(name = "subType")
    protected String subType;
    /**
     * The most accurate time available to a piece of equipment that
     *           represents the point in time that the data was reported.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "timestamp")
    @XmlAttribute(name = "timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    /**
     * The name of an element or a piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The identifier attribute of the dataitem that represents the
     *           originally measured value of the data referenced by this data item.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "dataItemId")
    @XmlAttribute(name = "dataItemId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataItemId;
    /**
     * The identifier attribute of the composition element that the reported
     *           data is most closely associated.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "compositionId")
    @XmlAttribute(name = "compositionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compositionId;

    /**
     * The description of the Condition
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The type of either a structural element or a dataitem being
     *               measured.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * The native code (usually an alpha-numeric value) generated by the
     *               controller of a piece of equipment or the element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCode() {
        return nativeCode;
    }

    /**
     * Sets the value of the nativeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNativeCode()
     */
    public void setNativeCode(String value) {
        this.nativeCode = value;
    }

    /**
     * If the piece of equipment designates a severity level to a fault,
     *               nativeseverity reports that severity information to a client
     *               software application.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeSeverity() {
        return nativeSeverity;
    }

    /**
     * Sets the value of the nativeSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNativeSeverity()
     */
    public void setNativeSeverity(String value) {
        this.nativeSeverity = value;
    }

    /**
     * qualifier provides additional information regarding a fault state
     *               associated with the measured value of a process variable.
     * 
     * @return
     *     possible object is
     *     {@link QualifierType }
     *     
     */
    public QualifierType getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifierType }
     *     
     * @see #getQualifier()
     */
    public void setQualifier(QualifierType value) {
        this.qualifier = value;
    }

    /**
     * Describes the type of statistical calculation performed on a
     *               series of data samples to provide the reported data value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * Sets the value of the statistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatistic()
     */
    public void setStatistic(String value) {
        this.statistic = value;
    }

    /**
     * A number representing the sequential position of an occurrence of a
     *           category type in the data buffer of an agent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSequence()
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * A sub-categorization of the data item type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSubType()
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * The most accurate time available to a piece of equipment that
     *           represents the point in time that the data was reported.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTimestamp()
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * The name of an element or a piece of equipment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The identifier attribute of the dataitem that represents the
     *           originally measured value of the data referenced by this data item.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataItemId() {
        return dataItemId;
    }

    /**
     * Sets the value of the dataItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDataItemId()
     */
    public void setDataItemId(String value) {
        this.dataItemId = value;
    }

    /**
     * The identifier attribute of the composition element that the reported
     *           data is most closely associated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositionId() {
        return compositionId;
    }

    /**
     * Sets the value of the compositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompositionId()
     */
    public void setCompositionId(String value) {
        this.compositionId = value;
    }

}
