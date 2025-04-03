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
 * An abstract event
 * 
 * <p>Java class for EventType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectStreams:1.4>ResultType">
 *       <attribute name="resetTriggered" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemResetValueType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EventType")
@XmlType(name = "EventType")
@XmlSeeAlso({
    CodeType.class,
    LineType.class,
    PowerStatusType.class,
    DirectionType.class,
    ProgramType.class,
    ExecutionType.class,
    ControllerModeType.class,
    PartIdType.class,
    DoorStateType.class,
    RotaryModeType.class,
    ActiveAxesType.class,
    CoupledAxesType.class,
    AxesCouplingType.class,
    EmergencyStopType.class,
    AvailabilityType.class,
    ActuatorStateType.class,
    PathModeType.class,
    PowerStateType.class,
    AssetChangedType.class,
    AssetRemovedType.class,
    WorkholdingIdType.class,
    ChuckStateType.class,
    EndOfBarType.class,
    AxisInterlockType.class,
    ChuckInterlockType.class,
    AxisStateType.class,
    PathFeedrateOverrideType.class,
    AxisFeedrateOverrideType.class,
    RotaryVelocityOverrideType.class,
    PartAssetIdType.class,
    FunctionalModeType.class,
    ProgramCommentType.class,
    ProgramHeaderType.class,
    OperatorIdType.class,
    ProgramEditType.class,
    ProgramEditNameType.class,
    LineLabelType.class,
    LineNumberType.class,
    PartCountType.class,
    ToolIdType.class,
    ToolNumberType.class,
    ToolAssetIdType.class,
    PalletIdType.class,
    MessageType.class,
    BlockType.class,
    TransformationType.class,
    UserType.class,
    PartNumberType.class,
    AlarmType.class,
    InterfaceEventType.class,
    InterfaceStateType.class,
    AxisCouplingType.class,
    SpindleInterlockType.class,
    MaterialType.class,
    CompositionStateType.class,
    BlockCountType.class,
    ControllerModeOverrideType.class,
    EquipmentModeType.class,
    HardnessType.class,
    SerialNumberType.class,
    ToolOffsetType.class,
    WireType.class,
    WorkOffsetType.class
})
public abstract class EventType
    extends ResultType
{

    @com.fasterxml.jackson.annotation.JsonProperty(value = "resetTriggered")
    @XmlAttribute(name = "resetTriggered")
    protected String resetTriggered;

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

}
