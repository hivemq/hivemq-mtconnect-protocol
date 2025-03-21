//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of power source
 * 
 * <p>Java class for PowerSourceTypeEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PowerSourceTypeEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIMARY"/>
 *     <enumeration value="SECONDARY"/>
 *     <enumeration value="STANDBY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PowerSourceTypeEnumType")
@XmlType(name = "PowerSourceTypeEnumType")
@XmlEnum
public enum PowerSourceTypeEnumType {


    /**
     * main or principle
     * 
     */
    PRIMARY,

    /**
     * alternate or not primary
     * 
     */
    SECONDARY,

    /**
     * held near at hand and ready for use and is uninterruptible
     * 
     */
    STANDBY;

    public String value() {
        return name();
    }

    public static PowerSourceTypeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
