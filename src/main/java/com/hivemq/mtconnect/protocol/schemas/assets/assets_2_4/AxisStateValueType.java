//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for AxisState
 * 
 * <p>Java class for AxisStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AxisStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOME"/>
 *     <enumeration value="TRAVEL"/>
 *     <enumeration value="PARKED"/>
 *     <enumeration value="STOPPED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AxisStateValueType")
@XmlType(name = "AxisStateValueType")
@XmlEnum
public enum AxisStateValueType {


    /**
     * axis is in its home position.
     * 
     */
    HOME,

    /**
     * axis is in motion.
     * 
     */
    TRAVEL,

    /**
     * axis has been moved to a fixed position and is being maintained in
     *             that position either electrically or mechanically. Action is
     *             required to release the axis from this position.
     * 
     */
    PARKED,

    /**
     * axis is stopped.
     * 
     */
    STOPPED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static AxisStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
