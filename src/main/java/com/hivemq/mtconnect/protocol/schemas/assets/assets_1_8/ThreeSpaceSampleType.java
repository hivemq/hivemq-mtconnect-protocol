//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A sample with a three tuple floating point value
 * 
 * <p>Java class for ThreeSpaceSampleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ThreeSpaceSampleType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectAssets:1.8>SampleType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ThreeSpaceSampleType")
@XmlType(name = "ThreeSpaceSampleType")
@XmlSeeAlso({
    PathPositionType.class,
    OrientationType.class
})
public class ThreeSpaceSampleType
    extends SampleType
{


}
