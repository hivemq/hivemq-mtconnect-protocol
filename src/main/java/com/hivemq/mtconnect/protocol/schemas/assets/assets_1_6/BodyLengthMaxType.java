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
 * The distance measured along the X axis from that point of the item
 *         closest to the workpiece, including the Cutting Item for a Tool Item but
 *         excluding a protruding locking mechanism for an Adaptive Item, to either
 *         the front of the flange on a flanged body or the beginning of the
 *         connection interface feature on the machine side for cylindrical or
 *         prismatic shanks.
 * 
 * <p>Java class for BodyLengthMaxType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BodyLengthMaxType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.6>AssemblyMeasurementType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "BodyLengthMaxType")
@XmlType(name = "BodyLengthMaxType")
public class BodyLengthMaxType
    extends AssemblyMeasurementType
{


}
