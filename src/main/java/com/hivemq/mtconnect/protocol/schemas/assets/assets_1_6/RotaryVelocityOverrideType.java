//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The value of a command issued to adjust the programmed velocity for a
 *         rotary type axis. This command represents a percentage change to the
 *         velocity calculated by a logic or motion program or set by a switch for
 *         a rotary type axis.
 * 
 * <p>Java class for RotaryVelocityOverrideType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RotaryVelocityOverrideType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.6>FloatEventType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RotaryVelocityOverrideType")
@XmlType(name = "RotaryVelocityOverrideType")
public class RotaryVelocityOverrideType
    extends FloatEventType
{


}
