//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The format of the definition
 * 
 * <p>Java class for DefinitionFormatType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DefinitionFormatType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXPRESS"/>
 *     <enumeration value="XML"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="UNDEFINED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DefinitionFormatType")
@XmlType(name = "DefinitionFormatType")
@XmlEnum
public enum DefinitionFormatType {

    EXPRESS,
    XML,
    TEXT,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static DefinitionFormatType fromValue(String v) {
        return valueOf(v);
    }

}
