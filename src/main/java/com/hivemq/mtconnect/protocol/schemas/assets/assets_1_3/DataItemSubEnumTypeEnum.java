//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The sub-types for a measurement
 * 
 * <p>Java class for DataItemSubEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemSubEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTUAL"/>
 *     <enumeration value="COMMANDED"/>
 *     <enumeration value="MAXIMUM"/>
 *     <enumeration value="MINIMUM"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="OVERRIDE"/>
 *     <enumeration value="PROBE"/>
 *     <enumeration value="TARGET"/>
 *     <enumeration value="GOOD"/>
 *     <enumeration value="BAD"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="CONTROL"/>
 *     <enumeration value="ALTERNATING"/>
 *     <enumeration value="DIRECT"/>
 *     <enumeration value="WEIGHT"/>
 *     <enumeration value="VOLUME"/>
 *     <enumeration value="MOLE"/>
 *     <enumeration value="KINETIC"/>
 *     <enumeration value="DYNAMIC"/>
 *     <enumeration value="NO_SCALE"/>
 *     <enumeration value="A_SCALE"/>
 *     <enumeration value="B_SCALE"/>
 *     <enumeration value="C_SCALE"/>
 *     <enumeration value="D_SCALE"/>
 *     <enumeration value="REQUEST"/>
 *     <enumeration value="RESPONSE"/>
 *     <enumeration value="REMAINING"/>
 *     <enumeration value="JOG"/>
 *     <enumeration value="RAPID"/>
 *     <enumeration value="PROGRAMMED"/>
 *     <enumeration value="PRIMARY"/>
 *     <enumeration value="AUXILIARY"/>
 *     <enumeration value="MANUAL_UNCLAMP"/>
 *     <enumeration value="ROTARY"/>
 *     <enumeration value="LINEAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemSubEnumTypeEnum")
@XmlType(name = "DataItemSubEnumTypeEnum")
@XmlEnum
public enum DataItemSubEnumTypeEnum {

    ACTUAL,
    COMMANDED,
    MAXIMUM,
    MINIMUM,
    OTHER,
    OVERRIDE,
    PROBE,
    TARGET,
    GOOD,
    BAD,
    ALL,
    LINE,
    CONTROL,
    ALTERNATING,
    DIRECT,
    WEIGHT,
    VOLUME,
    MOLE,
    KINETIC,
    DYNAMIC,
    NO_SCALE,
    A_SCALE,
    B_SCALE,
    C_SCALE,
    D_SCALE,
    REQUEST,
    RESPONSE,
    REMAINING,
    JOG,
    RAPID,
    PROGRAMMED,
    PRIMARY,
    AUXILIARY,
    MANUAL_UNCLAMP,
    ROTARY,
    LINEAR;

    public String value() {
        return name();
    }

    public static DataItemSubEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
