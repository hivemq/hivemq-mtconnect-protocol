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
 * Description of a means to interpret data consisting of multiple data
 *         points or samples reported as a single value. representation is an
 *         optional attribute. representation will define a unique format for each
 *         set of data. representation for timeseries representation, discrete
 *         representation, and value representation are defined in MTCPart2 Section
 *         7.2.2.12. If representation is not specified, it MUST be determined to
 *         be value representation.
 * 
 * <p>Java class for RepresentationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RepresentationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISCRETE (normalfont DEPRECATED in Version 1.5)"/>
 *     <enumeration value="TIME_SERIES"/>
 *     <enumeration value="VALUE"/>
 *     <enumeration value="DATA_SET"/>
 *     <enumeration value="DATA_SET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RepresentationType")
@XmlType(name = "RepresentationType")
@XmlEnum
public enum RepresentationType {


    /**
     * A data entity where each discrete occurrence of the data may have
     *             the same value as the previous occurrence of the data.
     * 
     */
    @XmlEnumValue("DISCRETE (normalfont DEPRECATED in Version 1.5)")
    DISCRETE_NORMALFONT_DEPRECATED_IN_VERSION_1_5("DISCRETE (normalfont DEPRECATED in Version 1.5)"),

    /**
     * A series of sampled data.
     * 
     */
    TIME_SERIES("TIME_SERIES"),

    /**
     * The measured value of the sample data.
     * 
     */
    VALUE("VALUE"),

    /**
     * The reported value(s) are represented as a set of key-value pair.
     *             Each reported value in the data set MUST have a unique key.
     * 
     */
    DATA_SET("DATA_SET");
    private final String value;

    RepresentationType(String v) {
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
    public static RepresentationType fromValue(String v) {
        for (RepresentationType c: RepresentationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
