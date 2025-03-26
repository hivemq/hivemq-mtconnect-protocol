//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of coordinate system
 * 
 * <p>Java class for CoordinateSystemTypeEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CoordinateSystemTypeEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WORLD"/>
 *     <enumeration value="BASE"/>
 *     <enumeration value="OBJECT"/>
 *     <enumeration value="TASK"/>
 *     <enumeration value="MECHANICAL_INTERFACE"/>
 *     <enumeration value="TOOL"/>
 *     <enumeration value="MOBILE_PLATFORM"/>
 *     <enumeration value="MACHINE"/>
 *     <enumeration value="CAMERA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CoordinateSystemTypeEnumType")
@XmlType(name = "CoordinateSystemTypeEnumType")
@XmlEnum
public enum CoordinateSystemTypeEnumType {


    /**
     * The world
     * 
     */
    WORLD,

    /**
     * The base of the manipulator chain
     * 
     */
    BASE,

    /**
     * The object
     * 
     */
    OBJECT,

    /**
     * The current task
     * 
     */
    TASK,

    /**
     * The last joint in the chain
     * 
     */
    MECHANICAL_INTERFACE,

    /**
     * The tool's coord
     * 
     */
    TOOL,

    /**
     * The platform
     * 
     */
    MOBILE_PLATFORM,

    /**
     * For machine tools, the coordinate system in the work area
     * 
     */
    MACHINE,

    /**
     * For machine tools, the coordinate system in the work area
     * 
     */
    CAMERA;

    public String value() {
        return name();
    }

    public static CoordinateSystemTypeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
