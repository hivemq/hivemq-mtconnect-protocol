//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for Execution
 * 
 * <p>Java class for ExecutionValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ExecutionValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="READY"/>
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="INTERRUPTED"/>
 *     <enumeration value="FEED_HOLD"/>
 *     <enumeration value="STOPPED"/>
 *     <enumeration value="OPTIONAL_STOP"/>
 *     <enumeration value="PROGRAM_STOPPED"/>
 *     <enumeration value="PROGRAM_COMPLETED"/>
 *     <enumeration value="WAIT"/>
 *     <enumeration value="PROGRAM_OPTIONAL_STOP"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ExecutionValueType")
@XmlType(name = "ExecutionValueType")
@XmlEnum
public enum ExecutionValueType {


    /**
     * {{block(Component)}} is ready to execute instructions. It is
     *             currently idle.
     * 
     */
    READY,

    /**
     * {{block(Component)}} is actively executing an instruction.
     * 
     */
    ACTIVE,

    /**
     * {{block(Component)}} suspends the execution of the program due to an
     *             external signal. Action is required to resume execution.
     * 
     */
    INTERRUPTED,

    /**
     * motion of the active axes are commanded to stop at their current
     *             position.
     * 
     */
    FEED_HOLD,

    /**
     * {{block(Component)}} program is not `READY` to execute.
     * 
     */
    STOPPED,

    /**
     * command from the program has intentionally interrupted execution.
     *             The {{block(Component)}} **MAY** have another state that indicates
     *             if the execution is interrupted or the execution ignores the
     *             interrupt instruction.
     * 
     */
    OPTIONAL_STOP,

    /**
     * command from the program has intentionally interrupted execution.
     *             Action is required to resume execution.
     * 
     */
    PROGRAM_STOPPED,

    /**
     * program completed execution.
     * 
     */
    PROGRAM_COMPLETED,

    /**
     * {{block(Component)}} suspends execution while a secondary operation
     *             executes. Execution resumes automatically once the secondary
     *             operation completes.
     * 
     */
    WAIT,

    /**
     * program has been intentionally optionally stopped using an M01 or
     *             similar code. **DEPRECATED** in *version 1.4* and replaced with
     *             `OPTIONAL_STOP`.
     * 
     */
    PROGRAM_OPTIONAL_STOP,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ExecutionValueType fromValue(String v) {
        return valueOf(v);
    }

}
