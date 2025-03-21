//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The value of a signal or calculation issued to adjust the feedrate of an
 *         individual linear type axis.
 * 
 * <p>Java class for AxisFeedrateOverrideType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AxisFeedrateOverrideType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.8>FloatEventType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AxisFeedrateOverrideType")
@XmlType(name = "AxisFeedrateOverrideType")
public class AxisFeedrateOverrideType
    extends FloatEventType
{


}
