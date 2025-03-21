//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The values of the clamp status
 * 
 * <p>Java class for ChuckStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ChuckStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="CLOSED"/>
 *     <enumeration value="UNLATCHED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ChuckStateValueType")
@XmlType(name = "ChuckStateValueType")
@XmlEnum
public enum ChuckStateValueType {

    OPEN,
    CLOSED,
    UNLATCHED,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ChuckStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
