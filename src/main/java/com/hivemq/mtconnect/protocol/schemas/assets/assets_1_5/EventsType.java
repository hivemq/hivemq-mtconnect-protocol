//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An XML container type element that organizes the data reported in the
 *         mtconnectstreams document for dataitem elements defined in the
 *         mtconnectdevices document with a category attribute of event category.
 * 
 * <p>Java class for EventsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:mtconnect.org:MTConnectAssets:1.5}Event" maxOccurs="unbounded"/>
 *       </sequence>
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
    "event"
})
public class EventsType {

    /**
     * An XML element which provides the information and data reported from a
     *         piece of equipment for those dataitem elements defined with a category
     *         attribute of event category in the mtconnectdevices document.
     * 
     */
    @XmlElementRef(name = "Event", namespace = "urn:mtconnect.org:MTConnectAssets:1.5", type = JAXBElement.class)
    protected List<JAXBElement<? extends EventType>> event;

    /**
     * An XML element which provides the information and data reported from a
     *         piece of equipment for those dataitem elements defined with a category
     *         attribute of event category in the mtconnectdevices document.
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
     * {@link JAXBElement }{@code <}{@link ControllerModeOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoupledAxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceUuidType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmergencyStopType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndOfBarType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardnessType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntegerEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLabelType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialFeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLayerType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialRetractType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialUnloadType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenChuckType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenDoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartDetectType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStatusType }{@code >}
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
     * {@link JAXBElement }{@code <}{@link SerialNumberType }{@code >}
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
     * {@link JAXBElement }{@code <}{@link ToolOffsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link WaitStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link WireType }{@code >}
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
