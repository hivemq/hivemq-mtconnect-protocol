//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for BatteryState
 * 
 * <p>Java class for BatteryStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BatteryStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHARGED"/>
 *     <enumeration value="CHARGING"/>
 *     <enumeration value="DISCHARGING"/>
 *     <enumeration value="DISCHARGED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "BatteryStateValueType")
@XmlType(name = "BatteryStateValueType")
@XmlEnum
public enum BatteryStateValueType {


    /**
     * {{block(Component)}} is at it's maximum rated charge level.
     * 
     */
    CHARGED,

    /**
     * {{block(Component)}}'s charge is increasing.
     * 
     */
    CHARGING,

    /**
     * {{block(Component)}}'s charge is decreasing.
     * 
     */
    DISCHARGING,

    /**
     * {{block(Component)}} is at it's minimum charge level.
     * 
     */
    DISCHARGED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static BatteryStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
