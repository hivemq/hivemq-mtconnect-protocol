//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DEPRECATED: Types of Notifcations
 * 
 * <p>Java class for NotifcationCodeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NotifcationCodeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAILURE"/>
 *     <enumeration value="FAULT"/>
 *     <enumeration value="CRASH"/>
 *     <enumeration value="JAM"/>
 *     <enumeration value="OVERLOAD"/>
 *     <enumeration value="ESTOP"/>
 *     <enumeration value="MATERIAL"/>
 *     <enumeration value="MESSAGE"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "NotifcationCodeType")
@XmlType(name = "NotifcationCodeType")
@XmlEnum
public enum NotifcationCodeType {


    /**
     * A failure
     * 
     */
    FAILURE,

    /**
     * A fault occurred
     * 
     */
    FAULT,

    /**
     * A spindle crash
     * 
     */
    CRASH,

    /**
     * A component has jammed
     * 
     */
    JAM,

    /**
     * The component has been overloaded
     * 
     */
    OVERLOAD,

    /**
     * E-Stop was pushed
     * 
     */
    ESTOP,

    /**
     * A material failure has occurred
     * 
     */
    MATERIAL,

    /**
     * An operators message. Used with INFO severity
     * 
     */
    MESSAGE,

    /**
     * Another Notifcation type
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static NotifcationCodeType fromValue(String v) {
        return valueOf(v);
    }

}
