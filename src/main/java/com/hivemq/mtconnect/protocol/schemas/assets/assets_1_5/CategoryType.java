//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the kind of information provided by a data item.
 * 
 * <p>Java class for CategoryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CategoryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EVENT"/>
 *     <enumeration value="SAMPLE"/>
 *     <enumeration value="CONDITION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CategoryType")
@XmlType(name = "CategoryType")
@XmlEnum
public enum CategoryType {


    /**
     * An event represents a change in state occurs at a point in time.
     *             Note: An event does not occur at predefined frequencies.
     * 
     */
    EVENT,

    /**
     * A sample is a data point for continuous data items, that is, the
     *             value of a data item at a point in time.
     * 
     */
    SAMPLE,

    /**
     * The condition of the device
     * 
     */
    CONDITION;

    public String value() {
        return name();
    }

    public static CategoryType fromValue(String v) {
        return valueOf(v);
    }

}
