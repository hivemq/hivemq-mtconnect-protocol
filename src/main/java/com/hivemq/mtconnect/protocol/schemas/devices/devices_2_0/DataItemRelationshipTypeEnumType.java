//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * How the data items are related
 * 
 * <p>Java class for DataItemRelationshipTypeEnumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemRelationshipTypeEnumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATTACHMENT"/>
 *     <enumeration value="COORDINATE_SYSTEM"/>
 *     <enumeration value="LIMIT"/>
 *     <enumeration value="OBSERVATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemRelationshipTypeEnumType")
@XmlType(name = "DataItemRelationshipTypeEnumType")
@XmlEnum
public enum DataItemRelationshipTypeEnumType {


    /**
     * A reference to a DataItem that associates the values with an
     *             external entity
     * 
     */
    ATTACHMENT,

    /**
     * The referenced DataItem provides the id of the effective Coordinate
     *             System
     * 
     */
    COORDINATE_SYSTEM,

    /**
     * The referenced DataItem provides process limits.
     * 
     */
    LIMIT,

    /**
     * The referenced DataItem provides the observed values.
     * 
     */
    OBSERVATION;

    public String value() {
        return name();
    }

    public static DataItemRelationshipTypeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
