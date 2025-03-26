//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for EquipmentMode
 * 
 * <p>Java class for EquipmentModeValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EquipmentModeValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ON"/>
 *     <enumeration value="OFF"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EquipmentModeValueType")
@XmlType(name = "EquipmentModeValueType")
@XmlEnum
public enum EquipmentModeValueType {


    /**
     * equipment is functioning in the mode designated by the `subType`.
     * 
     */
    ON,

    /**
     * equipment is not functioning in the mode designated by the
     *             `subType`.
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

    public static EquipmentModeValueType fromValue(String v) {
        return valueOf(v);
    }

}
