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
 * The upper conformance boundary for a variable. Note to Entry: immediate
 *         concern or action may be required.
 * 
 * <p>Java class for UpperLimitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpperLimitType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectDevices:1.8>ConstraintType">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "UpperLimitType")
@XmlType(name = "UpperLimitType")
public class UpperLimitType
    extends ConstraintType
{


}
