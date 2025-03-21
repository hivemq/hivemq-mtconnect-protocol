//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Component)}} that provides an axis of rotation for the purpose
 *         of rapidly rotating a part or a tool to provide sufficient surface speed
 *         for cutting operations. {{block(Spindle)}} was **DEPRECATED** in
 *         *MTConnect Version 1.1* and was replaced by {{block(RotaryMode)}}.
 * 
 * <p>Java class for SpindleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpindleType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.3}AxisType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SpindleType")
@XmlType(name = "SpindleType")
public class SpindleType
    extends AxisType
{


}
