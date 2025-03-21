//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for PartCountType
 * 
 * <p>Java class for PartCountTypeValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PartCountTypeValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EACH"/>
 *     <enumeration value="BATCH"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PartCountTypeValueType")
@XmlType(name = "PartCountTypeValueType")
@XmlEnum
public enum PartCountTypeValueType {


    /**
     * count is of individual items.
     * 
     */
    EACH,

    /**
     * pre-specified group of items.
     * 
     */
    BATCH,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static PartCountTypeValueType fromValue(String v) {
        return valueOf(v);
    }

}
