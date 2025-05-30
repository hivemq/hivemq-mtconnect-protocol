//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

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
 * An XML element that provides the information and data reported from a
 *         piece of equipment for those dataitem elements defined with a category
 *         attribute of sample category in the mtconnectdevices document.
 * 
 * <p>Java class for SampleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SampleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attGroup ref="{urn:mtconnect.org:MTConnectAssets:1.5}ObservationType"/>
 *       <attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectAssets:1.5}SampleRateType" />
 *       <attribute name="resetTriggered" type="{urn:mtconnect.org:MTConnectAssets:1.5}DataItemResetValueType" />
 *       <attribute name="statistic" type="{urn:mtconnect.org:MTConnectAssets:1.5}DataItemStatisticsType" />
 *       <attribute name="duration" type="{urn:mtconnect.org:MTConnectAssets:1.5}DurationTimeType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SampleType")
@XmlType(name = "SampleType", propOrder = {
    "content"
})
@XmlSeeAlso({
    ThreeSpaceSampleType.class,
    CommonSampleType.class,
    AbsTimeSeriesType.class
})
public abstract class SampleType {

    /**
     * An XML element that provides the information and data reported from a
     *         piece of equipment for those dataitem elements defined with a category
     *         attribute of sample category in the mtconnectdevices document.
     * 
     */
    @XmlValue
    protected String content;
    /**
     * The rate at which successive samples of a data item are recorded by a
     *           piece of equipment.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sampleRate")
    @XmlAttribute(name = "sampleRate")
    protected Float sampleRate;
    /**
     * For those dataitem elements that report data that may be periodically
     *           reset to an initial value, resettriggered identifies when a reported
     *           value has been reset and what has caused that reset to occur.
     *           resetTriggered is an optional attribute. resettriggered MUST only be
     *           provided for the specific occurrence of a data entity reported in the
     *           mtconnectstreams document when the reset occurred and MUSTNOT be
     *           provided for any other occurrence of the data entity reported in a
     *           mtconnectstreams document.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "resetTriggered")
    @XmlAttribute(name = "resetTriggered")
    protected String resetTriggered;
    /**
     * Describes the type of statistical calculation performed on a series of
     *           data samples to provide the reported data value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "statistic")
    @XmlAttribute(name = "statistic")
    protected String statistic;
    /**
     * The time-period over which the data was collected.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "duration")
    @XmlAttribute(name = "duration")
    protected Float duration;
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
     * An XML element that provides the information and data reported from a
     *         piece of equipment for those dataitem elements defined with a category
     *         attribute of sample category in the mtconnectdevices document.
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
     * The rate at which successive samples of a data item are recorded by a
     *           piece of equipment.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getSampleRate()
     */
    public void setSampleRate(Float value) {
        this.sampleRate = value;
    }

    /**
     * For those dataitem elements that report data that may be periodically
     *           reset to an initial value, resettriggered identifies when a reported
     *           value has been reset and what has caused that reset to occur.
     *           resetTriggered is an optional attribute. resettriggered MUST only be
     *           provided for the specific occurrence of a data entity reported in the
     *           mtconnectstreams document when the reset occurred and MUSTNOT be
     *           provided for any other occurrence of the data entity reported in a
     *           mtconnectstreams document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetTriggered() {
        return resetTriggered;
    }

    /**
     * Sets the value of the resetTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResetTriggered()
     */
    public void setResetTriggered(String value) {
        this.resetTriggered = value;
    }

    /**
     * Describes the type of statistical calculation performed on a series of
     *           data samples to provide the reported data value.
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
     * The time-period over which the data was collected.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getDuration()
     */
    public void setDuration(Float value) {
        this.duration = value;
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
