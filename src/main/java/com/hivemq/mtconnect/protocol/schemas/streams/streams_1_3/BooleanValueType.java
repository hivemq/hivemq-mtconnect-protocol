//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A yes/no value
 * 
 * <p>Java class for BooleanValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BooleanValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YES"/>
 *     <enumeration value="NO"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "BooleanValueType")
@XmlType(name = "BooleanValueType")
@XmlEnum
public enum BooleanValueType {

    YES,
    NO,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static BooleanValueType fromValue(String v) {
        return valueOf(v);
    }

}
