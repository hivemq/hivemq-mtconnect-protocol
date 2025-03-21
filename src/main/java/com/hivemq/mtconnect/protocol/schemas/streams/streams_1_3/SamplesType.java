//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of samples for this component
 * 
 * <p>Java class for SamplesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SamplesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:mtconnect.org:MTConnectStreams:1.3}Sample" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SamplesType")
@XmlType(name = "SamplesType", propOrder = {
    "sample"
})
public class SamplesType {

    /**
     * An abstract sample
     * 
     */
    @XmlElementRef(name = "Sample", namespace = "urn:mtconnect.org:MTConnectStreams:1.3", type = JAXBElement.class)
    protected List<JAXBElement<? extends SampleType>> sample;

    /**
     * An abstract sample
     * 
     * Gets the value of the sample property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sample property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbsTimeSeriesTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClockTimeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClockTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalPositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link PHTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PHType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link SampleType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoundPressureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoundPressureType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltsTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltsType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the sample property.
     */
    public List<JAXBElement<? extends SampleType>> getSample() {
        if (sample == null) {
            sample = new ArrayList<>();
        }
        return this.sample;
    }

}
