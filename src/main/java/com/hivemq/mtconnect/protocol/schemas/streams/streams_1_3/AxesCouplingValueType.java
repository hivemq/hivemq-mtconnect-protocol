//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The method for axes coupling
 * 
 * <p>Java class for AxesCouplingValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AxesCouplingValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TANDEM"/>
 *     <enumeration value="SYCHRONOUS"/>
 *     <enumeration value="MASTER"/>
 *     <enumeration value="SLAVE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AxesCouplingValueType")
@XmlType(name = "AxesCouplingValueType")
@XmlEnum
public enum AxesCouplingValueType {

    TANDEM,
    SYCHRONOUS,
    MASTER,
    SLAVE,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static AxesCouplingValueType fromValue(String v) {
        return valueOf(v);
    }

}
