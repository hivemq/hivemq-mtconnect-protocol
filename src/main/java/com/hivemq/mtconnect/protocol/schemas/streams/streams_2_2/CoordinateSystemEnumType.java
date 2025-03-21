//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The coordinate system to be used for the position
 * 
 * <p>Java class for CoordinateSystemEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CoordinateSystemEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACHINE"/>
 *     <enumeration value="WORK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CoordinateSystemEnumType")
@XmlType(name = "CoordinateSystemEnumType")
@XmlEnum
public enum CoordinateSystemEnumType {


    /**
     * unchangeable coordinate system that has machine zero as its origin.
     * 
     */
    MACHINE,

    /**
     * coordinate system that represents the working area for a particular
     *             workpiece whose origin is shifted within the `MACHINE` coordinate
     *             system. If the `WORK` coordinates are not currently defined in the
     *             piece of equipment, the `MACHINE` coordinates will be used.
     * 
     */
    WORK;

    public String value() {
        return name();
    }

    public static CoordinateSystemEnumType fromValue(String v) {
        return valueOf(v);
    }

}
