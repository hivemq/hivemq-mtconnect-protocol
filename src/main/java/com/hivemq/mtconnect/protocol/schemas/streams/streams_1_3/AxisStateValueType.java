//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The values for the axis states
 * 
 * <p>Java class for AxisStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AxisStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOME"/>
 *     <enumeration value="TRAVEL"/>
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

    HOME,
    TRAVEL,
    STOPPED,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static AxisStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
