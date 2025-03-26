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
 * The measurement of the feedrate for the axes, or a single axis,
 *         associated with a path component-a vector.
 * 
 * <p>Java class for PathFeedrateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PathFeedrateType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.6>CommonSampleType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PathFeedrateType")
@XmlType(name = "PathFeedrateType")
public class PathFeedrateType
    extends CommonSampleType
{


}
