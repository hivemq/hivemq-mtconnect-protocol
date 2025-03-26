//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Deposition)}} represents the information for a system that
 *         manages the addition of material or state change of material being
 *         performed in an additive manufacturing process. For example, this could
 *         describe the portion of a piece of equipment that manages a material
 *         extrusion process or a vat polymerization process.
 * 
 * <p>Java class for DepositionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DepositionType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.8}SystemType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DepositionType")
@XmlType(name = "DepositionType")
public class DepositionType
    extends SystemType
{


}
