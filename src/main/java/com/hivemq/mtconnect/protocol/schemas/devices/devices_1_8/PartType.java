//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{term(Part)}} is a discrete item that has both defined and measurable
 *         physical characteristics including mass, material, and features, and is
 *         created by applying one or more manufacturing process steps to a
 *         workpiece
 * 
 * <p>Java class for PartType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.8}CommonComponentType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PartType")
@XmlType(name = "PartType")
@XmlSeeAlso({
    PartOccurrenceType.class
})
public class PartType
    extends CommonComponentType
{


}
