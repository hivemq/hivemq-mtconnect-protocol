//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Description
 * 
 * <p>Java class for TimeSeriesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TimeSeriesType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectStreams:2.1>AbsTimeSeriesType">
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
    CapacityFluidTimeSeriesType.class,
    CapacitySpatialTimeSeriesType.class,
    ConcentrationTimeSeriesType.class,
    ConductivityTimeSeriesType.class,
    CuttingSpeedTimeSeriesType.class,
    DensityTimeSeriesType.class,
    DepositionAccelerationVolumetricTimeSeriesType.class,
    DepositionDensityTimeSeriesType.class,
    DepositionMassTimeSeriesType.class,
    DepositionRateVolumetricTimeSeriesType.class,
    DepositionVolumeTimeSeriesType.class,
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
    PathFeedratePerRevolutionTimeSeriesType.class,
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
    VoltageTimeSeriesType.class,
    VoltAmpereTimeSeriesType.class,
    VoltAmpereReactiveTimeSeriesType.class,
    VolumeFluidTimeSeriesType.class,
    VolumeSpatialTimeSeriesType.class,
    WattageTimeSeriesType.class,
    AmperageDCTimeSeriesType.class,
    AmperageACTimeSeriesType.class,
    VoltageACTimeSeriesType.class,
    VoltageDCTimeSeriesType.class,
    XDimensionTimeSeriesType.class,
    YDimensionTimeSeriesType.class,
    ZDimensionTimeSeriesType.class,
    DiameterTimeSeriesType.class,
    HumidityRelativeTimeSeriesType.class,
    HumidityAbsoluteTimeSeriesType.class,
    HumiditySpecificTimeSeriesType.class,
    PressurizationRateTimeSeriesType.class,
    DecelerationTimeSeriesType.class,
    AssetUpdateRateTimeSeriesType.class,
    AngularDecelerationTimeSeriesType.class,
    ObservationUpdateRateTimeSeriesType.class,
    PressureAbsoluteTimeSeriesType.class,
    OpennessTimeSeriesType.class,
    DewPointTimeSeriesType.class,
    GravitationalForceTimeSeriesType.class,
    GravitationalAccelerationTimeSeriesType.class,
    BatteryCapacityTimeSeriesType.class,
    DischargeRateTimeSeriesType.class,
    ChargeRateTimeSeriesType.class,
    BatteryChargeTimeSeriesType.class,
    SettlingErrorTimeSeriesType.class,
    SettlingErrorLinearTimeSeriesType.class,
    SettlingErrorAngularTimeSeriesType.class,
    FollowingErrorTimeSeriesType.class,
    FollowingErrorAngularTimeSeriesType.class,
    FollowingErrorLinearTimeSeriesType.class,
    DisplacementLinearTimeSeriesType.class,
    DisplacementAngularTimeSeriesType.class
})
public abstract class TimeSeriesType
    extends AbsTimeSeriesType
{


}
