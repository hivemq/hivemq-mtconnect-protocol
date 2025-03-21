//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for FunctionalMode
 * 
 * <p>Java class for FunctionalModeValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FunctionalModeValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRODUCTION"/>
 *     <enumeration value="SETUP"/>
 *     <enumeration value="TEARDOWN"/>
 *     <enumeration value="MAINTENANCE"/>
 *     <enumeration value="PROCESS_DEVELOPMENT"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FunctionalModeValueType")
@XmlType(name = "FunctionalModeValueType")
@XmlEnum
public enum FunctionalModeValueType {


    /**
     * A structural element is currently producing product.
     * 
     */
    PRODUCTION,

    /**
     * A structural element is being prepared or modified to begin
     *             production of product.
     * 
     */
    SETUP,

    /**
     * Typically, a structural element has completed the production of a
     *             product and is being modified or returned to a neutral state such
     *             that it may then be prepared to begin production of a different
     *             product.
     * 
     */
    TEARDOWN,

    /**
     * Action related to maintenance on the piece of equipment.
     * 
     */
    MAINTENANCE,

    /**
     * A structural element is being used to prove-out a new process.
     * 
     */
    PROCESS_DEVELOPMENT,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static FunctionalModeValueType fromValue(String v) {
        return valueOf(v);
    }

}
