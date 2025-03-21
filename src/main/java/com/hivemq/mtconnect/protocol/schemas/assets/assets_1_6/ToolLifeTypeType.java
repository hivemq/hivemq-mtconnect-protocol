//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The direction of tool life count
 * 
 * <p>Java class for ToolLifeTypeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ToolLifeTypeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MINUTES"/>
 *     <enumeration value="PART_COUNT"/>
 *     <enumeration value="WEAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ToolLifeTypeType")
@XmlType(name = "ToolLifeTypeType")
@XmlEnum
public enum ToolLifeTypeType {


    /**
     * The tool life measured in minutes
     * 
     */
    MINUTES,

    /**
     * The tool life measured in parts made
     * 
     */
    PART_COUNT,

    /**
     * Measurement of tool life in tool wear
     * 
     */
    WEAR;

    public String value() {
        return name();
    }

    public static ToolLifeTypeType fromValue(String v) {
        return valueOf(v);
    }

}
