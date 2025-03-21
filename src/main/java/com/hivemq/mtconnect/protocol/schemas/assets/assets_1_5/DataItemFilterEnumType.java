//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of filter
 * 
 * <p>Java class for DataItemFilterEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemFilterEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MINIMUM_DELTA"/>
 *     <enumeration value="PERIOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemFilterEnumType")
@XmlType(name = "DataItemFilterEnumType")
@XmlEnum
public enum DataItemFilterEnumType {


    /**
     * For filter minimumdelta, a new value MUSTNOT be reported for a data
     *             item unless the measured value has changed from the last reported
     *             value by at least the delta given as the cdata of this element.
     * 
     */
    MINIMUM_DELTA,

    /**
     * The data reported for a data item with this filter is provided on a
     *             periodic basis.
     * 
     */
    PERIOD;

    public String value() {
        return name();
    }

    public static DataItemFilterEnumType fromValue(String v) {
        return valueOf(v);
    }

}
