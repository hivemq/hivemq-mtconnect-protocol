//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An indicator of the state of the axis lockout function when power has
 *         been removed and the axis is allowed to move freely.
 * 
 * <p>Java class for AxisInterlockType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AxisInterlockType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectAssets:1.7>EventType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AxisInterlockType")
@XmlType(name = "AxisInterlockType")
public class AxisInterlockType
    extends EventType
{


}
