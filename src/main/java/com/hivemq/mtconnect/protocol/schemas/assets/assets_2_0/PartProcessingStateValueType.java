//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for PartProcessingState
 * 
 * <p>Java class for PartProcessingStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PartProcessingStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEEDS_PROCESSING"/>
 *     <enumeration value="IN_PROCESS"/>
 *     <enumeration value="PROCESSING_ENDED"/>
 *     <enumeration value="PROCESSING_ENDED_COMPLETE"/>
 *     <enumeration value="PROCESSING_ENDED_STOPPED"/>
 *     <enumeration value="PROCESSING_ENDED_ABORTED"/>
 *     <enumeration value="PROCESSING_ENDED_LOST"/>
 *     <enumeration value="PROCESSING_ENDED_SKIPPED"/>
 *     <enumeration value="PROCESSING_ENDED_REJECTED"/>
 *     <enumeration value="WAITING_FOR_TRANSIT"/>
 *     <enumeration value="IN_TRANSIT"/>
 *     <enumeration value="TRANSIT_COMPLETE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PartProcessingStateValueType")
@XmlType(name = "PartProcessingStateValueType")
@XmlEnum
public enum PartProcessingStateValueType {


    /**
     * part occurrence is not actively being processed, but the processing
     *             has not ended. Processing requirements exist that have not yet been
     *             fulfilled. This is the default entry state when the part occurrence
     *             is originally received. In some cases, the part occurrence may
     *             return to this state while it waits for additional processing to be
     *             performed.
     * 
     */
    NEEDS_PROCESSING,

    /**
     * part occurrence is actively being processed.
     * 
     */
    IN_PROCESS,

    /**
     * part occurrence is no longer being processed. A general state when
     *             the reason for termination is unknown.
     * 
     */
    PROCESSING_ENDED,

    /**
     * part occurrence has completed processing successfully.
     * 
     */
    PROCESSING_ENDED_COMPLETE,

    /**
     * process has been stopped during the processing. The part occurrence
     *             will require special treatment.
     * 
     */
    PROCESSING_ENDED_STOPPED,

    /**
     * processing of the part occurrence has come to a premature end.
     * 
     */
    PROCESSING_ENDED_ABORTED,

    /**
     * terminal state when the part occurrence has been removed from the
     *             equipment by an external entity and it no longer exists at the
     *             equipment.
     * 
     */
    PROCESSING_ENDED_LOST,

    /**
     * part occurrence has been skipped for processing on the piece of
     *             equipment.
     * 
     */
    PROCESSING_ENDED_SKIPPED,

    /**
     * part occurrence has been processed completely. However, the
     *             processing may have a problem.
     * 
     */
    PROCESSING_ENDED_REJECTED,

    /**
     * part occurrence is waiting for transit.
     * 
     */
    WAITING_FOR_TRANSIT,

    /**
     * part occurrence is being transported to its destination.
     * 
     */
    IN_TRANSIT,

    /**
     * part occurrence has been placed at its designated destination.
     * 
     */
    TRANSIT_COMPLETE,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static PartProcessingStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
