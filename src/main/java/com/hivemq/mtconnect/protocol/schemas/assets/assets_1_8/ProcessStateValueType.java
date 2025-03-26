//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_8;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ProcessState
 * 
 * <p>Java class for ProcessStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ProcessStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INITIALIZING"/>
 *     <enumeration value="READY"/>
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="COMPLETE"/>
 *     <enumeration value="INTERRUPTED"/>
 *     <enumeration value="ABORTED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ProcessStateValueType")
@XmlType(name = "ProcessStateValueType")
@XmlEnum
public enum ProcessStateValueType {


    /**
     * The device is preparing to execute the process occurrence.
     * 
     */
    INITIALIZING,

    /**
     * The process occurrence is ready to be executed.
     * 
     */
    READY,

    /**
     * The process occurrence is actively executing.
     * 
     */
    ACTIVE,

    /**
     * The process occurrence is now finished.
     * 
     */
    COMPLETE,

    /**
     * The process occurrence has been stopped and may be resumed.
     * 
     */
    INTERRUPTED,

    /**
     * The process occurrence has come to a premature end and cannot be
     *             resumed.
     * 
     */
    ABORTED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ProcessStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
