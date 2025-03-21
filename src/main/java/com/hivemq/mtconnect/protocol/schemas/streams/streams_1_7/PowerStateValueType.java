//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for PowerState
 * 
 * <p>Java class for PowerStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PowerStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ON"/>
 *     <enumeration value="OFF"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PowerStateValueType")
@XmlType(name = "PowerStateValueType")
@XmlEnum
public enum PowerStateValueType {


    /**
     * On state or value.
     * 
     */
    ON,

    /**
     * Off state or value.
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

    public static PowerStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
