//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements for the cutting item
 * 
 * <p>Java class for CuttingItemMeasurementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CuttingItemMeasurementType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.2>MeasurementType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CuttingItemMeasurementType")
@XmlType(name = "CuttingItemMeasurementType")
@XmlSeeAlso({
    CuttingDiameterType.class,
    CornerRadiusType.class,
    CuttingEdgeLengthType.class,
    CuttingHeightType.class,
    CuttingReferencePoiintType.class,
    FlangeDiameterType.class,
    FunctionalWidthType.class,
    InclinationAngleType.class,
    IncribedCircleDiameterType.class,
    PointAngleType.class,
    StepDiameterLengthType.class,
    StepIncludedAngleType.class,
    ToolCuttingEdgeAngleType.class,
    ToolLeadAngleType.class,
    WiperEdgeLengthType.class
})
public abstract class CuttingItemMeasurementType
    extends MeasurementType
{


}
