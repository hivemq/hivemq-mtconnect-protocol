//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{term(key-value pair)}} published as part of a {{block(Table)}}. >
 *         Note: In the {{term(XML)}} representation, {{block(TableEntry)}}
 *         **MUST** appear as {{block(Entry)}}.
 * 
 * <p>Java class for TableEntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TableEntryType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectStreams:2.1}EntryType">
 *       <sequence>
 *         <element ref="{urn:mtconnect.org:MTConnectStreams:2.1}TableCell" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "TableEntryType")
@XmlType(name = "TableEntryType", propOrder = {
    "tableCell"
})
public class TableEntryType
    extends EntryType
{

    /**
     * A cell of a table
     * 
     */
    @XmlElementRef(name = "TableCell", namespace = "urn:mtconnect.org:MTConnectStreams:2.1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TableCellType>> tableCell;

    /**
     * A cell of a table
     * 
     * Gets the value of the tableCell property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableCell property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTableCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AccelerationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActiveAxesCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActuatorStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdapterSoftwareVersionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdapterURICellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlarmLimitCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageACCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageDCCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularDecelerationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplicationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetChangedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetRemovedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetUpdateRateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisCouplingCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateOverrideCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisInterlockCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link BatteryCapacityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link BatteryChargeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link BatteryStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacityFluidCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacitySpatialCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargeRateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckInterlockCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseChuckCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseDoorCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositionStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConnectionStatusCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlLimitCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeOverrideCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoupledAxesCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingSpeedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link CycleCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateCodeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeactivationCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DecelerationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DensityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionAccelerationVolumetricCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionDensityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionMassCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionRateVolumetricCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositionVolumeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceAddedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceChangedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceRemovedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceUuidCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DewPointCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiameterCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DischargeRateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementAngularCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementLinearCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmergencyStopCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndOfBarCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentTimerCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FixtureIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FollowingErrorAngularCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FollowingErrorCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FollowingErrorLinearCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalPositionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link GravitationalAccelerationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link GravitationalForceCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardnessCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardwareCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HostNameCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityAbsoluteCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumidityRelativeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link HumiditySpecificCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LeakDetectCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LevelCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LibraryCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLabelCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineNumberCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link LockStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MTConnectVersionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaintenanceListCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialChangeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialFeedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLayerCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLoadCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialRetractCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialUnloadCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkPortCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationUpdateRateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenChuckCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenDoorCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpennessCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingSystemCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PHCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartChangeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountTypeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartDetectCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartGroupIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartKindIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartNumberCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartProcessingStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartStatusCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartUniqueIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateOverrideCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedratePerRevolutionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionCartesianCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStatusCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureAbsoluteCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressurizationRateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessAggregateIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessKindIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessOccurrenceIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimerCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramCommentCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditNameCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramHeaderCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramLocationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramLocationTypeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramNestLevelCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryModeCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityOverrideCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorAttachmentCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SerialNumberCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlingErrorAngularCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlingErrorCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlingErrorLinearCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoundLevelCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificationLimitCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleInterlockCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TensionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolAssetIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolGroupCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolNumberCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolOffsetCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link TranslationCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnloadCountCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValveStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageACCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageDCCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeFluidCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeSpatialCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitStateCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link WireCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkOffsetCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkholdingIdCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link XDimensionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link YDimensionCellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ZDimensionCellType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the tableCell property.
     */
    public List<JAXBElement<? extends TableCellType>> getTableCell() {
        if (tableCell == null) {
            tableCell = new ArrayList<>();
        }
        return this.tableCell;
    }

}
