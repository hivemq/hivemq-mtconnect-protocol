//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_5;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The indication of the status of the source of energy for a structural
 *         element to allow it to perform its intended function or the state of an
 *         enabling signal providing permission for the structural element to
 *         perform its functions.
 * 
 * <p>Java class for PowerStateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PowerStateType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectAssets:1.5>EventType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "PowerStateType")
@XmlType(name = "PowerStateType")
public class PowerStateType
    extends EventType
{


}
