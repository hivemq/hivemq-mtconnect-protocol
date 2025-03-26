//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="simple"/>
 *     <enumeration value="extended"/>
 *     <enumeration value="title"/>
 *     <enumeration value="resource"/>
 *     <enumeration value="locator"/>
 *     <enumeration value="arc"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "typeType")
@XmlType(name = "typeType", namespace = "http://www.w3.org/1999/xlink")
@XmlEnum
public enum TypeType {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("extended")
    EXTENDED("extended"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("resource")
    RESOURCE("resource"),
    @XmlEnumValue("locator")
    LOCATOR("locator"),
    @XmlEnumValue("arc")
    ARC("arc");
    private final String value;

    TypeType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TypeType fromValue(String v) {
        for (TypeType c: TypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
