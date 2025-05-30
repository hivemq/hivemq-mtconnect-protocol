//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_7;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Events)}} {{termplural(organize)}} the {{block(Event)}}
 *         elements. See {{sect(Event)}} for details on the {{block(Event)}} model.
 * 
 * <p>Java class for EventsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element ref="{urn:mtconnect.org:MTConnectStreams:1.7}Event" maxOccurs="unbounded"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EventsType")
@XmlType(name = "EventsType", propOrder = {

})
public class EventsType {

    /**
     * Something that happens or takes place.
     * 
     */
    @XmlElementRef(name = "Event", namespace = "urn:mtconnect.org:MTConnectStreams:1.7", type = JAXBElement.class)
    protected List<JAXBElement<? extends EventType>> event;

    /**
     * Something that happens or takes place.
     * 
     * Gets the value of the event property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ActiveAxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActuatorStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdapterSoftwareVersionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdapterURIType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlarmLimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlarmType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetChangedType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetRemovedType }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisCouplingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockCountType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseChuckType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseDoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositionStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConnectionStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlLimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoupledAxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceAddedType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceChangedType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceRemovedType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceUuidType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmergencyStopType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndOfBarType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FirmwareType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardnessType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardwareType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntegerEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link LibraryType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLabelType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link MTConnectVersionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialFeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLayerType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialRetractType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialUnloadType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenChuckType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenDoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartDetectType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartGroupIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartKindIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartUniqueIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessAggregateIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessKindIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessOccurrenceIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramCommentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramHeaderType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramLocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramLocationTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramNestLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorAttachmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link SerialNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificationLimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringListEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolAssetIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolAssetIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolNumberDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolOffsetTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolOffsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableDataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link WireType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkOffsetTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkOffsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkholdingIdType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the event property.
     */
    public List<JAXBElement<? extends EventType>> getEvent() {
        if (event == null) {
            event = new ArrayList<>();
        }
        return this.event;
    }

}
