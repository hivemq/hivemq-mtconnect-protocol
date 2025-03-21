//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ControllerMode
 * 
 * <p>Java class for ControllerModeValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ControllerModeValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTOMATIC"/>
 *     <enumeration value="MANUAL"/>
 *     <enumeration value="MANUAL_DATA_INPUT"/>
 *     <enumeration value="SEMI_AUTOMATIC"/>
 *     <enumeration value="EDIT"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ControllerModeValueType")
@XmlType(name = "ControllerModeValueType")
@XmlEnum
public enum ControllerModeValueType {


    /**
     * The controller is configured to automatically execute a program.
     * 
     */
    AUTOMATIC,

    /**
     * Operations based on the instructions received from an external
     *             source.
     * 
     */
    MANUAL,

    /**
     * The operator can enter a series of operations for the controller to
     *             perform.
     * 
     */
    MANUAL_DATA_INPUT,

    /**
     * The controller executes a single set of instructions from an active
     *             program and then stops until given a command to execute the next set
     *             of instructions.
     * 
     */
    SEMI_AUTOMATIC,

    /**
     * The controller is currently functioning as a programming device and
     *             is not capable of executing an active program.
     * 
     */
    EDIT,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ControllerModeValueType fromValue(String v) {
        return valueOf(v);
    }

}
