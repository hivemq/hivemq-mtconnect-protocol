//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A tool storage mechanism that holds any number of tools. Tools are
 *         located in {{block(Pot)}}s. {{block(Pot)}}s are moved into position to
 *         transfer tools into or out of the {{block(ToolMagazine)}} by an
 *         {{block(AutomaticToolChanger)}}.
 * 
 * <p>Java class for ToolMagazineType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ToolMagazineType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.7}ToolingDeliveryType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ToolMagazineType")
@XmlType(name = "ToolMagazineType")
public class ToolMagazineType
    extends ToolingDeliveryType
{


}
