//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(System)}} that evacuates gases and liquids from an enclosed and
 *         sealed space to a controlled negative pressure or a molecular density
 *         below the prevailing atmospheric level.
 * 
 * <p>Java class for VacuumType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VacuumType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.1}EnvironmentalType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "VacuumType")
@XmlType(name = "VacuumType")
public class VacuumType
    extends EnvironmentalType
{


}
