//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for WaitState
 * 
 * <p>Java class for WaitStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WaitStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POWERING_UP"/>
 *     <enumeration value="POWERING_DOWN"/>
 *     <enumeration value="PART_LOAD"/>
 *     <enumeration value="PART_UNLOAD"/>
 *     <enumeration value="TOOL_LOAD"/>
 *     <enumeration value="TOOL_UNLOAD"/>
 *     <enumeration value="MATERIAL_LOAD"/>
 *     <enumeration value="MATERIAL_UNLOAD"/>
 *     <enumeration value="SECONDARY_PROCESS"/>
 *     <enumeration value="PAUSING"/>
 *     <enumeration value="RESUMING"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "WaitStateValueType")
@XmlType(name = "WaitStateValueType")
@XmlEnum
public enum WaitStateValueType {


    /**
     * An indication that execution is waiting while the equipment is
     *             powering up and is not currently available to begin producing parts
     *             or products.
     * 
     */
    POWERING_UP,

    /**
     * An indication that the execution is waiting while the equipment is
     *             powering down but has not fully reached a stopped state.
     * 
     */
    POWERING_DOWN,

    /**
     * An indication that the execution is waiting while one or more
     *             discrete workpieces are being loaded.
     * 
     */
    PART_LOAD,

    /**
     * An indication that the execution is waiting while one or more
     *             discrete workpieces are being unloaded.
     * 
     */
    PART_UNLOAD,

    /**
     * An indication that the execution is waiting while a tool or tooling
     *             is being loaded.
     * 
     */
    TOOL_LOAD,

    /**
     * An indication that the execution is waiting while a tool or tooling
     *             is being unloaded.
     * 
     */
    TOOL_UNLOAD,

    /**
     * An indication that the execution is waiting while material is being
     *             loaded.
     * 
     */
    MATERIAL_LOAD,

    /**
     * An indication that the execution is waiting while material is being
     *             unloaded.
     * 
     */
    MATERIAL_UNLOAD,

    /**
     * An indication that the execution is waiting while another process is
     *             completed before the execution can resume.
     * 
     */
    SECONDARY_PROCESS,

    /**
     * An indication that the execution is waiting while the equipment is
     *             pausing but the piece of equipment has not yet reached a fully
     *             paused state.
     * 
     */
    PAUSING,

    /**
     * An indication that the execution is waiting while the equipment is
     *             resuming the production cycle but has not yet resumed execution.
     * 
     */
    RESUMING,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static WaitStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
