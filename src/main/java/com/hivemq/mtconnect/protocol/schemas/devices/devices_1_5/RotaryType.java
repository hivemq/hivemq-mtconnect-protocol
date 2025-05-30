//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_5;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A rotary axis represents any non-linear or rotary movement of a physical
 *         piece of equipment or a portion of the equipment.
 * 
 * <p>Java class for RotaryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RotaryType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.5}AxesType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RotaryType")
@XmlType(name = "RotaryType")
@XmlSeeAlso({
    ChuckType.class
})
public class RotaryType
    extends AxesType
{


}
