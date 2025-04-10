//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The vocab for the type of composition
 * 
 * <p>Java class for CompositionEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CompositionEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTUATOR"/>
 *     <enumeration value="AMPLIFIER"/>
 *     <enumeration value="BALLSCREW"/>
 *     <enumeration value="BATTERY"/>
 *     <enumeration value="BELT"/>
 *     <enumeration value="CIRCUIT_BREAKER"/>
 *     <enumeration value="CHAIN"/>
 *     <enumeration value="CHUCK"/>
 *     <enumeration value="CHUTE"/>
 *     <enumeration value="CLAMP"/>
 *     <enumeration value="COMPRESSON"/>
 *     <enumeration value="DOON"/>
 *     <enumeration value="FAN"/>
 *     <enumeration value="FILTER"/>
 *     <enumeration value="GRIPPER"/>
 *     <enumeration value="HOPPER"/>
 *     <enumeration value="MOTOR"/>
 *     <enumeration value="PUMP"/>
 *     <enumeration value="POSITION_FEEDBACK"/>
 *     <enumeration value="POWER_SUPPLY"/>
 *     <enumeration value="SWITCH"/>
 *     <enumeration value="TANK"/>
 *     <enumeration value="TRANSFORMER"/>
 *     <enumeration value="VALVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CompositionEnumTypeEnum")
@XmlType(name = "CompositionEnumTypeEnum")
@XmlEnum
public enum CompositionEnumTypeEnum {

    ACTUATOR,
    AMPLIFIER,
    BALLSCREW,
    BATTERY,
    BELT,
    CIRCUIT_BREAKER,
    CHAIN,
    CHUCK,
    CHUTE,
    CLAMP,
    COMPRESSON,
    DOON,
    FAN,
    FILTER,
    GRIPPER,
    HOPPER,
    MOTOR,
    PUMP,
    POSITION_FEEDBACK,
    POWER_SUPPLY,
    SWITCH,
    TANK,
    TRANSFORMER,
    VALVE;

    public String value() {
        return name();
    }

    public static CompositionEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
