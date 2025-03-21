//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for ConnectionStatus
 * 
 * <p>Java class for ConnectionStatusValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ConnectionStatusValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOSED"/>
 *     <enumeration value="LISTEN"/>
 *     <enumeration value="ESTABLISHED"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ConnectionStatusValueType")
@XmlType(name = "ConnectionStatusValueType")
@XmlEnum
public enum ConnectionStatusValueType {


    /**
     * represents no connection at all.
     * 
     */
    CLOSED,

    /**
     * represents the {{term(Agent)}} waiting for a connection request from
     *             an {{term(Adapter)}}.
     * 
     */
    LISTEN,

    /**
     * represents an open connection. The normal state for the data
     *             transfer phase of the connection.
     * 
     */
    ESTABLISHED,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ConnectionStatusValueType fromValue(String v) {
        return valueOf(v);
    }

}
