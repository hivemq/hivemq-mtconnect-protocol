//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ProgramEdit
 * 
 * <p>Java class for ProgramEditValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ProgramEditValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="READY"/>
 *     <enumeration value="NOT_READY"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ProgramEditValueType")
@XmlType(name = "ProgramEditValueType")
@XmlEnum
public enum ProgramEditValueType {


    /**
     * {{block(Controller)}} is in the program edit mode.
     * 
     */
    ACTIVE,

    /**
     * {{block(Controller)}} is capable of entering the program edit mode
     *             and no function is inhibiting a change to that mode.
     * 
     */
    READY,

    /**
     * {{block(Controller)}} is being inhibited by a function from entering
     *             the program edit mode.
     * 
     */
    NOT_READY,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ProgramEditValueType fromValue(String v) {
        return valueOf(v);
    }

}
