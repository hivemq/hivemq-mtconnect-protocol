//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Component)}} composed of part(s) comprising the rigid bodies of
 *         the piece of equipment.
 * 
 * <p>Java class for StructureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StructureType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.1}CommonComponentType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "StructureType")
@XmlType(name = "StructureType")
@XmlSeeAlso({
    LinkType.class
})
public class StructureType
    extends CommonComponentType
{


}
