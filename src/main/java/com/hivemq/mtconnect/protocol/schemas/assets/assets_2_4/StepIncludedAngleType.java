//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * angle between a major edge on a step of a stepped tool and the same
 *         cutting edge rotated 180 degrees about its tool axis.
 * 
 * <p>Java class for StepIncludedAngleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StepIncludedAngleType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.4>CuttingItemMeasurementType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "StepIncludedAngleType")
@XmlType(name = "StepIncludedAngleType")
public class StepIncludedAngleType
    extends CuttingItemMeasurementType
{


}
