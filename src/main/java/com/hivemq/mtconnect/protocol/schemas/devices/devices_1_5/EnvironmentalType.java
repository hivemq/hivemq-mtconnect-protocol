//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_5;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * environmental is an XML container that represents the information for a
 *         unit or function involved in monitoring, managing, or conditioning the
 *         environment around or within a piece of equipment.
 * 
 * <p>Java class for EnvironmentalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnvironmentalType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:1.5}AuxiliariesType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "EnvironmentalType")
@XmlType(name = "EnvironmentalType")
public class EnvironmentalType
    extends AuxiliariesType
{


}
