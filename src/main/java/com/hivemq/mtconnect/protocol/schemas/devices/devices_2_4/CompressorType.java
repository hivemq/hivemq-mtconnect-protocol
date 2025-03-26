//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * leaf {{block(Component)}} composed of a pump or other mechanism that
 *         reduces volume and increases pressure of gases in order to condense the
 *         gases to drive pneumatically powered pieces of equipment.
 * 
 * <p>Java class for CompressorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompressorType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.4}CommonComponentType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CompressorType")
@XmlType(name = "CompressorType")
public class CompressorType
    extends CommonComponentType
{


}
