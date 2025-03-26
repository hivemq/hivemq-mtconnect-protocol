//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The possible representations of a DataItem
 * 
 * <p>Java class for RepresentationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RepresentationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VALUE"/>
 *     <enumeration value="TIME_SERIES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RepresentationType")
@XmlType(name = "RepresentationType")
@XmlEnum
public enum RepresentationType {

    VALUE,
    TIME_SERIES;

    public String value() {
        return name();
    }

    public static RepresentationType fromValue(String v) {
        return valueOf(v);
    }

}
