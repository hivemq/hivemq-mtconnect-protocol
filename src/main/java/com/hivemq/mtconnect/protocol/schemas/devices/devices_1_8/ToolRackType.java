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
 * A linear or matrixed tool storage mechanism that holds any number of
 *         tools. Tools are located in {{block(Station)}}s.
 * 
 * <p>Java class for ToolRackType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ToolRackType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.8}ToolingDeliveryType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ToolRackType")
@XmlType(name = "ToolRackType")
public class ToolRackType
    extends ToolingDeliveryType
{


}
