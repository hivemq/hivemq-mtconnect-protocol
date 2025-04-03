//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rotation Direction
 * 
 * <p>Java class for DirectionValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DirectionValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOCKWISE"/>
 *     <enumeration value="COUNTER_CLOCKWISE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DirectionValueType")
@XmlType(name = "DirectionValueType")
@XmlEnum
public enum DirectionValueType {

    CLOCKWISE,
    COUNTER_CLOCKWISE,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static DirectionValueType fromValue(String v) {
        return valueOf(v);
    }

}
