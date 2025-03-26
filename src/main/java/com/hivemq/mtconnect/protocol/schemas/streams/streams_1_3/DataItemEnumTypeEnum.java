//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The types of measurements available
 * 
 * <p>Java class for DataItemEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCELERATION"/>
 *     <enumeration value="ACTIVE_AXES"/>
 *     <enumeration value="ALARM"/>
 *     <enumeration value="AMPERAGE"/>
 *     <enumeration value="ANGLE"/>
 *     <enumeration value="ANGULAR_ACCELERATION"/>
 *     <enumeration value="ANGULAR_VELOCITY"/>
 *     <enumeration value="AVAILABILITY"/>
 *     <enumeration value="AXIS_FEEDRATE"/>
 *     <enumeration value="BLOCK"/>
 *     <enumeration value="CODE"/>
 *     <enumeration value="DIRECTION"/>
 *     <enumeration value="DOOR_STATE"/>
 *     <enumeration value="EMERGENCY_STOP"/>
 *     <enumeration value="EXECUTION"/>
 *     <enumeration value="FREQUENCY"/>
 *     <enumeration value="PART_COUNT"/>
 *     <enumeration value="PART_ID"/>
 *     <enumeration value="PATH_FEEDRATE"/>
 *     <enumeration value="PATH_POSITION"/>
 *     <enumeration value="PATH_MODE"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="CONTROLLER_MODE"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="MESSAGE"/>
 *     <enumeration value="POSITION"/>
 *     <enumeration value="POWER_STATUS"/>
 *     <enumeration value="POWER_STATE"/>
 *     <enumeration value="PRESSURE"/>
 *     <enumeration value="RESET"/>
 *     <enumeration value="PROGRAM"/>
 *     <enumeration value="PROGRAM_COMMENT"/>
 *     <enumeration value="ROTARY_MODE"/>
 *     <enumeration value="COUPLED_AXES"/>
 *     <enumeration value="AXIS_COUPLING"/>
 *     <enumeration value="SPINDLE_SPEED"/>
 *     <enumeration value="TEMPERATURE"/>
 *     <enumeration value="TORQUE"/>
 *     <enumeration value="TOOL_ASSET_ID"/>
 *     <enumeration value="TOOL_ID"/>
 *     <enumeration value="TOOL_NUMBER"/>
 *     <enumeration value="VELOCITY"/>
 *     <enumeration value="VIBRATION"/>
 *     <enumeration value="VOLTAGE"/>
 *     <enumeration value="WATTAGE"/>
 *     <enumeration value="ACCUMULATED_TIME"/>
 *     <enumeration value="ACTUATOR_STATE"/>
 *     <enumeration value="ASSET_CHANGED"/>
 *     <enumeration value="CONCENTRATION"/>
 *     <enumeration value="CONDUCTIVITY"/>
 *     <enumeration value="DISPLACEMENT"/>
 *     <enumeration value="ELECTRICAL_ENERGY"/>
 *     <enumeration value="FILL_LEVEL"/>
 *     <enumeration value="FLOW"/>
 *     <enumeration value="LINEAR_FORCE"/>
 *     <enumeration value="MASS"/>
 *     <enumeration value="PH"/>
 *     <enumeration value="POWER_FACTOR"/>
 *     <enumeration value="RESISTANCE"/>
 *     <enumeration value="ROTARY_VELOCITY"/>
 *     <enumeration value="SOUND_PRESSURE"/>
 *     <enumeration value="STRAIN"/>
 *     <enumeration value="TILT"/>
 *     <enumeration value="VOLT_AMPERE"/>
 *     <enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     <enumeration value="WATT_SECOND"/>
 *     <enumeration value="VISCOSITY"/>
 *     <enumeration value="COMMUNICATIONS"/>
 *     <enumeration value="LOGIC_PROGRAM"/>
 *     <enumeration value="MOTION_PROGRAM"/>
 *     <enumeration value="HARDWARE"/>
 *     <enumeration value="SYSTEM"/>
 *     <enumeration value="LEVEL"/>
 *     <enumeration value="ACTUATOR"/>
 *     <enumeration value="ROTARY_VELOCITY_OVERRIDE"/>
 *     <enumeration value="PATH_FEEDRATE_OVERRIDE"/>
 *     <enumeration value="AXIS_FEEDRATE_OVERRIDE"/>
 *     <enumeration value="PART_ASSET_ID"/>
 *     <enumeration value="PROGRAM_EDIT"/>
 *     <enumeration value="PROGRAM_EDIT_NAME"/>
 *     <enumeration value="CLOCK_TIME"/>
 *     <enumeration value="CHUCK_STATE"/>
 *     <enumeration value="END_OF_BAR"/>
 *     <enumeration value="AUXILIARY_END_OF_BAR"/>
 *     <enumeration value="AXIS_INTERLOCK"/>
 *     <enumeration value="MANUAL_CHUCK_UNCLAMP_INTERLOCK"/>
 *     <enumeration value="LENGTH"/>
 *     <enumeration value="AXIS_STATE"/>
 *     <enumeration value="INTERFACE_STATE"/>
 *     <enumeration value="FUNCTIONAL_MODE"/>
 *     <enumeration value="WORKHOLDING_ID"/>
 *     <enumeration value="PALLET_ID"/>
 *     <enumeration value="OPERATOR_ID"/>
 *     <enumeration value="ASSET_REMOVED"/>
 *     <enumeration value="PROGRAM_HEADER"/>
 *     <enumeration value="MATERIAL_FEED"/>
 *     <enumeration value="MATERIAL_CHANGE"/>
 *     <enumeration value="MATERIAL_RETRACT"/>
 *     <enumeration value="PART_CHANGE"/>
 *     <enumeration value="OPEN_DOOR"/>
 *     <enumeration value="CLOSE_DOOR"/>
 *     <enumeration value="OPEN_CHUCK"/>
 *     <enumeration value="CLOSE_CHUCK"/>
 *     <enumeration value="MATERIAL_LOAD"/>
 *     <enumeration value="MATERIAL_UNLOAD"/>
 *     <enumeration value="SPINDLE_INTERLOCK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemEnumTypeEnum")
@XmlType(name = "DataItemEnumTypeEnum")
@XmlEnum
public enum DataItemEnumTypeEnum {

    ACCELERATION,
    ACTIVE_AXES,
    ALARM,
    AMPERAGE,
    ANGLE,
    ANGULAR_ACCELERATION,
    ANGULAR_VELOCITY,
    AVAILABILITY,
    AXIS_FEEDRATE,
    BLOCK,
    CODE,
    DIRECTION,
    DOOR_STATE,
    EMERGENCY_STOP,
    EXECUTION,
    FREQUENCY,
    PART_COUNT,
    PART_ID,
    PATH_FEEDRATE,
    PATH_POSITION,
    PATH_MODE,
    LINE,
    CONTROLLER_MODE,
    LOAD,
    MESSAGE,
    POSITION,
    POWER_STATUS,
    POWER_STATE,
    PRESSURE,
    RESET,
    PROGRAM,
    PROGRAM_COMMENT,
    ROTARY_MODE,
    COUPLED_AXES,
    AXIS_COUPLING,
    SPINDLE_SPEED,
    TEMPERATURE,
    TORQUE,
    TOOL_ASSET_ID,
    TOOL_ID,
    TOOL_NUMBER,
    VELOCITY,
    VIBRATION,
    VOLTAGE,
    WATTAGE,
    ACCUMULATED_TIME,
    ACTUATOR_STATE,
    ASSET_CHANGED,
    CONCENTRATION,
    CONDUCTIVITY,
    DISPLACEMENT,
    ELECTRICAL_ENERGY,
    FILL_LEVEL,
    FLOW,
    LINEAR_FORCE,
    MASS,
    PH,
    POWER_FACTOR,
    RESISTANCE,
    ROTARY_VELOCITY,
    SOUND_PRESSURE,
    STRAIN,
    TILT,
    VOLT_AMPERE,
    VOLT_AMPERE_REACTIVE,
    WATT_SECOND,
    VISCOSITY,
    COMMUNICATIONS,
    LOGIC_PROGRAM,
    MOTION_PROGRAM,
    HARDWARE,
    SYSTEM,
    LEVEL,
    ACTUATOR,
    ROTARY_VELOCITY_OVERRIDE,
    PATH_FEEDRATE_OVERRIDE,
    AXIS_FEEDRATE_OVERRIDE,
    PART_ASSET_ID,
    PROGRAM_EDIT,
    PROGRAM_EDIT_NAME,
    CLOCK_TIME,
    CHUCK_STATE,
    END_OF_BAR,
    AUXILIARY_END_OF_BAR,
    AXIS_INTERLOCK,
    MANUAL_CHUCK_UNCLAMP_INTERLOCK,
    LENGTH,
    AXIS_STATE,
    INTERFACE_STATE,
    FUNCTIONAL_MODE,
    WORKHOLDING_ID,
    PALLET_ID,
    OPERATOR_ID,
    ASSET_REMOVED,
    PROGRAM_HEADER,
    MATERIAL_FEED,
    MATERIAL_CHANGE,
    MATERIAL_RETRACT,
    PART_CHANGE,
    OPEN_DOOR,
    CLOSE_DOOR,
    OPEN_CHUCK,
    CLOSE_CHUCK,
    MATERIAL_LOAD,
    MATERIAL_UNLOAD,
    SPINDLE_INTERLOCK;

    public String value() {
        return name();
    }

    public static DataItemEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
