//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Samples)}} groups one or more {{block(Sample)}} entities. See
 *         {{sect(Sample)}}.
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
 *         <element ref="{urn:mtconnect.org:MTConnectAssets:2.0}Sample" maxOccurs="unbounded"/>
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
     * Description
     * 
     */
    @XmlElementRef(name = "Sample", namespace = "urn:mtconnect.org:MTConnectAssets:2.0", type = JAXBElement.class)
    protected List<JAXBElement<? extends SampleType>> sample;

    /**
     * Description
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
     * {@link JAXBElement }{@code <}{@link AbsTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageACTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageACType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageDCTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageDCType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularDecelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularDecelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetUpdateRateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetUpdateRateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacityFluidTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacityFluidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacitySpatialTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacitySpatialType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonSampleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingSpeedTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingSpeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link DecelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DecelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DensityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DensityType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionAccelerationVolumetricTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionAccelerationVolumetricType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionDensityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionDensityType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionMassTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionMassType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionRateVolumetricTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionRateVolumetricType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionVolumeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionVolumeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiameterTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentTimerTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentTimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalPositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityAbsoluteTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityAbsoluteType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityRelativeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityRelativeType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumiditySpecificTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumiditySpecificType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link LevelTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationUpdateRateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationUpdateRateType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpennessTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpennessType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PHTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PHType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedratePerRevolutionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedratePerRevolutionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureAbsoluteTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureAbsoluteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressurizationRateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressurizationRateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimerTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link SampleType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoundLevelTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoundLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link TensionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ThreeSpaceSampleType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageACTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageACType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageDCTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageDCType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeFluidTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeFluidType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeSpatialTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeSpatialType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageType }{@code >}
     * {@link JAXBElement }{@code <}{@link XDimensionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link XDimensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link YDimensionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link YDimensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ZDimensionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ZDimensionType }{@code >}
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
