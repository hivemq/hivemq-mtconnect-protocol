//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An abstract sample
 * 
 * <p>Java class for SampleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SampleType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectStreams:1.4>ResultType">
 *       <attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectStreams:1.4}SampleRateType" />
 *       <attribute name="resetTriggered" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemResetValueType" />
 *       <attribute name="statistic" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemStatisticsType" />
 *       <attribute name="duration" type="{urn:mtconnect.org:MTConnectStreams:1.4}DurationTimeType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SampleType")
@XmlType(name = "SampleType")
@XmlSeeAlso({
    AmperageType.class,
    GlobalPositionType.class,
    PositionType.class,
    VelocityType.class,
    AccelerationType.class,
    AngularAccelerationType.class,
    AngularVelocityType.class,
    PathFeedrateType.class,
    AxisFeedrateType.class,
    SpindleSpeedType.class,
    RotaryVelocityType.class,
    AngleType.class,
    TemperatureType.class,
    LoadType.class,
    FrequencyType.class,
    VoltsType.class,
    VoltageType.class,
    WattType.class,
    PressureType.class,
    TorqueType.class,
    PathPositionType.class,
    WattageType.class,
    DisplacementType.class,
    TiltType.class,
    AccumulatedTimeType.class,
    PowerFactorType.class,
    StrainType.class,
    FlowType.class,
    SoundPressureType.class,
    ResistanceType.class,
    ConductivityType.class,
    ViscosityType.class,
    ConcentrationType.class,
    ElectricalEnergyType.class,
    FillLevelType.class,
    LinearForceType.class,
    LengthType.class,
    EquipmentTimerType.class,
    VoltAmpereType.class,
    VoltAmpereReactiveType.class,
    LevelType.class,
    PHType.class,
    ClockTimeType.class,
    ProcessTimerType.class,
    TensionType.class,
    AbsTimeSeriesType.class
})
public abstract class SampleType
    extends ResultType
{

    @com.fasterxml.jackson.annotation.JsonProperty(value = "sampleRate")
    @XmlAttribute(name = "sampleRate")
    protected String sampleRate;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "resetTriggered")
    @XmlAttribute(name = "resetTriggered")
    protected String resetTriggered;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "statistic")
    @XmlAttribute(name = "statistic")
    protected String statistic;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "duration")
    @XmlAttribute(name = "duration")
    protected Float duration;

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleRate(String value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the resetTriggered property.
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
     */
    public void setResetTriggered(String value) {
        this.resetTriggered = value;
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
     * Gets the value of the duration property.
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
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

}
