//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0;

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
 *     <enumeration value="FEED_HOLD"/>
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
     * {{block(Controller)}} is configured to automatically execute a
     *             program.
     * 
     */
    AUTOMATIC,

    /**
     * {{block(Controller)}} is not executing an active program. It is
     *             capable of receiving instructions from an external source –
     *             typically an operator. The {{block(Controller)}} executes operations
     *             based on the instructions received from the external source.
     * 
     */
    MANUAL,

    /**
     * operator can enter a series of operations for the
     *             {{block(Controller)}} to perform. The {{block(Controller)}} will
     *             execute this specific series of operations and then stop.
     * 
     */
    MANUAL_DATA_INPUT,

    /**
     * {{block(Controller)}} is operating in a mode that restricts the
     *             active program from processing its next process step without
     *             operator intervention.
     * 
     */
    SEMI_AUTOMATIC,

    /**
     * {{block(Controller)}} is currently functioning as a programming
     *             device and is not capable of executing an active program.
     * 
     */
    EDIT,

    /**
     * axes of the device are commanded to stop, but the spindle continues
     *             to function.
     * 
     */
    FEED_HOLD,

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
