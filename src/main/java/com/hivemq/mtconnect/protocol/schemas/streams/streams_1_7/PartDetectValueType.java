//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for PartDetect
 * 
 * <p>Java class for PartDetectValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PartDetectValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRESENT"/>
 *     <enumeration value="NOT_PRESENT"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PartDetectValueType")
@XmlType(name = "PartDetectValueType")
@XmlEnum
public enum PartDetectValueType {


    /**
     * If a part or work piece has been detected or is present.
     * 
     */
    PRESENT,

    /**
     * If a part or work piece is not detected or is not present.
     * 
     */
    NOT_PRESENT,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static PartDetectValueType fromValue(String v) {
        return valueOf(v);
    }

}
