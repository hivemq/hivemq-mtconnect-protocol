//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2;

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
 *     <enumeration value="WORKHOLDING_ID"/>
 *     <enumeration value="ACCUMULATED_TIME"/>
 *     <enumeration value="ACTUATOR_STATE"/>
 *     <enumeration value="ASSET_CHANGED"/>
 *     <enumeration value="CONCENTRATION"/>
 *     <enumeration value="CONDUCTIVITY"/>
 *     <enumeration value="DISPLACEMENT"/>
 *     <enumeration value="ELECTRICAL_POWER"/>
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
    WORKHOLDING_ID,
    ACCUMULATED_TIME,
    ACTUATOR_STATE,
    ASSET_CHANGED,
    CONCENTRATION,
    CONDUCTIVITY,
    DISPLACEMENT,
    ELECTRICAL_POWER,
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
    ACTUATOR;

    public String value() {
        return name();
    }

    public static DataItemEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
