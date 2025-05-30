//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for LeakDetect
 * 
 * <p>Java class for LeakDetectValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LeakDetectValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DETECTED"/>
 *     <enumeration value="NOT_DETECTED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "LeakDetectValueType")
@XmlType(name = "LeakDetectValueType")
@XmlEnum
public enum LeakDetectValueType {


    /**
     * leak is currently being detected.
     * 
     */
    DETECTED,

    /**
     * leak is currently not being detected.
     * 
     */
    NOT_DETECTED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static LeakDetectValueType fromValue(String v) {
        return valueOf(v);
    }

}
