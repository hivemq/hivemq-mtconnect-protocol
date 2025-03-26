//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Controlled vocabulary for AxisCoupling
 * 
 * <p>Java class for AxisCouplingValueType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AxisCouplingValueType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TANDEM"/>
 *     <enumeration value="SYNCHRONOUS"/>
 *     <enumeration value="MASTER"/>
 *     <enumeration value="SLAVE"/>
 *     <enumeration value="UNAVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AxisCouplingValueType")
@XmlType(name = "AxisCouplingValueType")
@XmlEnum
public enum AxisCouplingValueType {


    /**
     * axes are physically connected to each other and operate as a single
     *             unit.
     * 
     */
    TANDEM,

    /**
     * axes are not physically connected to each other but are operating
     *             together in lockstep.
     * 
     */
    SYNCHRONOUS,

    /**
     * axis is the master of the {{block(CoupledAxes)}}.
     * 
     */
    MASTER,

    /**
     * axis is a slave to the {{block(CoupledAxes)}}.
     * 
     */
    SLAVE,

    /**
     * Value is indeterminate
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static AxisCouplingValueType fromValue(String v) {
        return valueOf(v);
    }

}
