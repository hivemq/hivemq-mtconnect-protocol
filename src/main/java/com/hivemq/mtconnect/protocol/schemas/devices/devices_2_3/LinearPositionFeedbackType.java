//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * leaf {{block(Component)}} that measures linear motion or position.
 *         **DEPRECATION WARNING** : May be deprecated in the future. Recommend
 *         using {{block(Encoder)}}.
 * 
 * <p>Java class for LinearPositionFeedbackType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LinearPositionFeedbackType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.3}CommonComponentType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "LinearPositionFeedbackType")
@XmlType(name = "LinearPositionFeedbackType")
public class LinearPositionFeedbackType
    extends CommonComponentType
{


}
