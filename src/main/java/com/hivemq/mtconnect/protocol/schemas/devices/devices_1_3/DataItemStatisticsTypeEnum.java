//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Statistical operations on data
 * 
 * <p>Java class for DataItemStatisticsTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemStatisticsTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MINIMUM"/>
 *     <enumeration value="MAXIMUM"/>
 *     <enumeration value="AVERAGE"/>
 *     <enumeration value="STANDARD_DEVIATION"/>
 *     <enumeration value="ROOT_MEAN_SQUARE"/>
 *     <enumeration value="MEAN"/>
 *     <enumeration value="MODE"/>
 *     <enumeration value="RANGE"/>
 *     <enumeration value="KURTOSIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemStatisticsTypeEnum")
@XmlType(name = "DataItemStatisticsTypeEnum")
@XmlEnum
public enum DataItemStatisticsTypeEnum {

    MINIMUM,
    MAXIMUM,
    AVERAGE,
    STANDARD_DEVIATION,
    ROOT_MEAN_SQUARE,
    MEAN,
    MODE,
    RANGE,
    KURTOSIS;

    public String value() {
        return name();
    }

    public static DataItemStatisticsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
