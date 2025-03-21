//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The types of measurements available
 * 
 * <p>Java class for DataItemEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCELERATION"/>
 *     <enumeration value="ALARM"/>
 *     <enumeration value="AMPERAGE"/>
 *     <enumeration value="ANGLE"/>
 *     <enumeration value="ANGULAR_ACCELERATION"/>
 *     <enumeration value="ANGULAR_VELOCITY"/>
 *     <enumeration value="BLOCK"/>
 *     <enumeration value="CODE"/>
 *     <enumeration value="DISPLACEMENT"/>
 *     <enumeration value="DIRECTION"/>
 *     <enumeration value="EXECUTION"/>
 *     <enumeration value="FREQUENCY"/>
 *     <enumeration value="PATH_FEEDRATE"/>
 *     <enumeration value="AXIS_FEEDRATE"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="CONTROLLER_MODE"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="POSITION"/>
 *     <enumeration value="POWER_STATUS"/>
 *     <enumeration value="PRESSURE"/>
 *     <enumeration value="PROGRAM"/>
 *     <enumeration value="SPINDLE_SPEED"/>
 *     <enumeration value="STATUS"/>
 *     <enumeration value="TEMPERATURE"/>
 *     <enumeration value="TORQUE"/>
 *     <enumeration value="VELOCITY"/>
 *     <enumeration value="VIBRATION"/>
 *     <enumeration value="VOLTAGE"/>
 *     <enumeration value="WATTS"/>
 *     <enumeration value="WATTAGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemEnumType")
@XmlType(name = "DataItemEnumType")
@XmlEnum
public enum DataItemEnumType {

    ACCELERATION,
    ALARM,
    AMPERAGE,
    ANGLE,
    ANGULAR_ACCELERATION,
    ANGULAR_VELOCITY,
    BLOCK,
    CODE,
    DISPLACEMENT,
    DIRECTION,
    EXECUTION,
    FREQUENCY,
    PATH_FEEDRATE,
    AXIS_FEEDRATE,
    LINE,
    CONTROLLER_MODE,
    LOAD,
    OTHER,
    POSITION,
    POWER_STATUS,
    PRESSURE,
    PROGRAM,
    SPINDLE_SPEED,
    STATUS,
    TEMPERATURE,
    TORQUE,
    VELOCITY,
    VIBRATION,
    VOLTAGE,
    WATTS,
    WATTAGE;

    public String value() {
        return name();
    }

    public static DataItemEnumType fromValue(String v) {
        return valueOf(v);
    }

}
