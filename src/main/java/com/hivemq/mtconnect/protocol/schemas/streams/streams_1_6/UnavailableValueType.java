//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The observation value for indeterminent data
 * 
 * <p>Java class for UnavailableValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UnavailableValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "UnavailableValueType")
@XmlType(name = "UnavailableValueType")
@XmlEnum
public enum UnavailableValueType {


    /**
     * Data is unavailable
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static UnavailableValueType fromValue(String v) {
        return valueOf(v);
    }

}
