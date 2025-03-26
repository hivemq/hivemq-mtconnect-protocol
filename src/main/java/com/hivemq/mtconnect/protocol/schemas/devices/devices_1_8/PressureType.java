//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Pressure)}} is a system that delivers compressed gas or fluid
 *         and controls the pressure and rate of pressure change to a desired
 *         target set-point. Note: For example, Delivery Method can be a Compressed
 *         Air or N2 tank that is piped via an inlet valve to the chamber.
 * 
 * <p>Java class for PressureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PressureType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.8}EnvironmentalType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PressureType")
@XmlType(name = "PressureType")
public class PressureType
    extends EnvironmentalType
{


}
