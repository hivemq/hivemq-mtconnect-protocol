//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The values for the chuck interlock state
 * 
 * <p>Java class for ChuckInterlockValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ChuckInterlockValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="INACTIVE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ChuckInterlockValueType")
@XmlType(name = "ChuckInterlockValueType")
@XmlEnum
public enum ChuckInterlockValueType {

    ACTIVE,
    INACTIVE,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ChuckInterlockValueType fromValue(String v) {
        return valueOf(v);
    }

}
