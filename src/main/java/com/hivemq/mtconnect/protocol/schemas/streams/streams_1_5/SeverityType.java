//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DEPRECATED: The severity of the notification
 * 
 * <p>Java class for SeverityType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SeverityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRITICAL"/>
 *     <enumeration value="ERROR"/>
 *     <enumeration value="WARNING"/>
 *     <enumeration value="INFORMATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SeverityType")
@XmlType(name = "SeverityType")
@XmlEnum
public enum SeverityType {


    /**
     * The notification is critical
     * 
     */
    CRITICAL,

    /**
     * An error has occurred
     * 
     */
    ERROR,

    /**
     * A medium level notification that should be observed
     * 
     */
    WARNING,

    /**
     * This notification is for information purposes only
     * 
     */
    INFORMATION;

    public String value() {
        return name();
    }

    public static SeverityType fromValue(String v) {
        return valueOf(v);
    }

}
