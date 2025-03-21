//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * angle between the tool rake plane and a plane parallel to the xy-plane
 *         measured in the tool cutting edge plane
 * 
 * <p>Java class for InclinationAngleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InclinationAngleType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.0>CuttingItemMeasurementType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "InclinationAngleType")
@XmlType(name = "InclinationAngleType")
public class InclinationAngleType
    extends CuttingItemMeasurementType
{


}
