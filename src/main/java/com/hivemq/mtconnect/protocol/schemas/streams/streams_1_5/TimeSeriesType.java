//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An abstract time series with the restriction value
 * 
 * <p>Java class for TimeSeriesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeSeriesType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectStreams:1.5>AbsTimeSeriesType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "TimeSeriesType")
@XmlType(name = "TimeSeriesType")
@XmlSeeAlso({
    AccelerationTimeSeriesType.class,
    AccumulatedTimeTimeSeriesType.class,
    AmperageTimeSeriesType.class,
    AngleTimeSeriesType.class,
    AngularAccelerationTimeSeriesType.class,
    AngularVelocityTimeSeriesType.class,
    AxisFeedrateTimeSeriesType.class,
    ClockTimeTimeSeriesType.class,
    ConcentrationTimeSeriesType.class,
    ConductivityTimeSeriesType.class,
    DisplacementTimeSeriesType.class,
    ElectricalEnergyTimeSeriesType.class,
    EquipmentTimerTimeSeriesType.class,
    FillLevelTimeSeriesType.class,
    FlowTimeSeriesType.class,
    FrequencyTimeSeriesType.class,
    GlobalPositionTimeSeriesType.class,
    LengthTimeSeriesType.class,
    LevelTimeSeriesType.class,
    LinearForceTimeSeriesType.class,
    LoadTimeSeriesType.class,
    MassTimeSeriesType.class,
    PathFeedrateTimeSeriesType.class,
    PHTimeSeriesType.class,
    PositionTimeSeriesType.class,
    PowerFactorTimeSeriesType.class,
    PressureTimeSeriesType.class,
    ProcessTimerTimeSeriesType.class,
    ResistanceTimeSeriesType.class,
    RotaryVelocityTimeSeriesType.class,
    SoundLevelTimeSeriesType.class,
    SpindleSpeedTimeSeriesType.class,
    StrainTimeSeriesType.class,
    TemperatureTimeSeriesType.class,
    TensionTimeSeriesType.class,
    TiltTimeSeriesType.class,
    TorqueTimeSeriesType.class,
    VelocityTimeSeriesType.class,
    ViscosityTimeSeriesType.class,
    VoltAmpereTimeSeriesType.class,
    VoltAmpereReactiveTimeSeriesType.class,
    VoltageTimeSeriesType.class,
    WattageTimeSeriesType.class,
    VolumeSpatialTimeSeriesType.class,
    VolumeFluidTimeSeriesType.class,
    CapacitySpatialTimeSeriesType.class,
    CapacityFluidTimeSeriesType.class,
    DensityTimeSeriesType.class,
    DepositionVolumeTimeSeriesType.class,
    DepositionRateVolumetricTimeSeriesType.class,
    DepositionAccelerationVolumetricTimeSeriesType.class,
    DepositionMassTimeSeriesType.class,
    DepositionDensityTimeSeriesType.class,
    CuttingSpeedTimeSeriesType.class,
    PathFeedratePerRevolutionTimeSeriesType.class
})
public abstract class TimeSeriesType
    extends AbsTimeSeriesType
{


}
