//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for LockState
 * 
 * <p>Java class for LockStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LockStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOCKED"/>
 *     <enumeration value="UNLOCKED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "LockStateValueType")
@XmlType(name = "LockStateValueType")
@XmlEnum
public enum LockStateValueType {


    /**
     * mechanism is engaged and preventing the associated
     *             {{block(Component)}} from being opened or operated.
     * 
     */
    LOCKED,

    /**
     * mechanism is disengaged and the associated {{block(Component)}} is
     *             able to be opened or operated.
     * 
     */
    UNLOCKED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static LockStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
