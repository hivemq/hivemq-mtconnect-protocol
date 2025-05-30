//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ControllerModeOverride
 * 
 * <p>Java class for ControllerModeOverrideValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ControllerModeOverrideValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ON"/>
 *     <enumeration value="OFF"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ControllerModeOverrideValueType")
@XmlType(name = "ControllerModeOverrideValueType")
@XmlEnum
public enum ControllerModeOverrideValueType {


    /**
     * {{block(ControllerModeOverride)}} is in the `ON` state and the mode
     *             override is active.
     * 
     */
    ON,

    /**
     * {{block(ControllerModeOverride)}} is in the `OFF` state and the mode
     *             override is inactive.
     * 
     */
    OFF,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ControllerModeOverrideValueType fromValue(String v) {
        return valueOf(v);
    }

}
