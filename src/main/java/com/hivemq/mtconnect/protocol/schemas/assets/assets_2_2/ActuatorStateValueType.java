//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ActuatorState
 * 
 * <p>Java class for ActuatorStateValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActuatorStateValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="INACTIVE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ActuatorStateValueType")
@XmlType(name = "ActuatorStateValueType")
@XmlEnum
public enum ActuatorStateValueType {


    /**
     * {{block(Actuator)}} is operating.
     * 
     */
    ACTIVE,

    /**
     * {{block(Actuator)}} is not operating.
     * 
     */
    INACTIVE,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ActuatorStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
