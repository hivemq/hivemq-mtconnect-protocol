//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_4;

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
 * An abstract indicator of the device's condition
 * 
 * <p>Java class for ConditionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConditionType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectStreams:1.4>ConditionDescriptionType">
 *       <attribute name="sequence" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.4}SequenceType" />
 *       <attribute name="timestamp" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.4}TimestampType" />
 *       <attribute name="name" type="{urn:mtconnect.org:MTConnectStreams:1.4}NameType" />
 *       <attribute name="dataItemId" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemIdType" />
 *       <attribute name="compositionId" type="{urn:mtconnect.org:MTConnectStreams:1.4}CompositionIdType" />
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemEnumType" />
 *       <attribute name="nativeCode" type="{urn:mtconnect.org:MTConnectStreams:1.4}NativeCodeType" />
 *       <attribute name="nativeSeverity" type="{urn:mtconnect.org:MTConnectStreams:1.4}NativeSeverityType" />
 *       <attribute name="qualifier" type="{urn:mtconnect.org:MTConnectStreams:1.4}QualifierType" />
 *       <attribute name="statistic" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemStatisticsType" />
 *       <attribute name="subType" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemSubEnumType" />
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sequence")
    @XmlAttribute(name = "sequence", required = true)
    protected BigInteger sequence;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "timestamp")
    @XmlAttribute(name = "timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "dataItemId")
    @XmlAttribute(name = "dataItemId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataItemId;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "compositionId")
    @XmlAttribute(name = "compositionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compositionId;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeCode")
    @XmlAttribute(name = "nativeCode")
    protected String nativeCode;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeSeverity")
    @XmlAttribute(name = "nativeSeverity")
    protected String nativeSeverity;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "qualifier")
    @XmlAttribute(name = "qualifier")
    protected QualifierType qualifier;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "statistic")
    @XmlAttribute(name = "statistic")
    protected String statistic;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "subType")
    @XmlAttribute(name = "subType")
    protected String subType;

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
     * Gets the value of the sequence property.
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
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the timestamp property.
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
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the name property.
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
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataItemId property.
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
     */
    public void setDataItemId(String value) {
        this.dataItemId = value;
    }

    /**
     * Gets the value of the compositionId property.
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
     */
    public void setCompositionId(String value) {
        this.compositionId = value;
    }

    /**
     * Gets the value of the type property.
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
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the nativeCode property.
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
     */
    public void setNativeCode(String value) {
        this.nativeCode = value;
    }

    /**
     * Gets the value of the nativeSeverity property.
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
     */
    public void setNativeSeverity(String value) {
        this.nativeSeverity = value;
    }

    /**
     * Gets the value of the qualifier property.
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
     */
    public void setQualifier(QualifierType value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the statistic property.
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
     */
    public void setStatistic(String value) {
        this.statistic = value;
    }

    /**
     * Gets the value of the subType property.
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
     */
    public void setSubType(String value) {
        this.subType = value;
    }

}
