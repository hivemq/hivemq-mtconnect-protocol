//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cell of {{def(InterfaceEventEnum:INTERFACE_STATE)}} When the
 *         {{block(InterfaceState)}} is `DISABLED`, the state of all data items
 *         that are specific for the {{term(interaction model)}} associated with
 *         that {{block(Interface)}} **MUST** be set to `NOT_READY`.
 * 
 * <p>Java class for InterfaceStateCellType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InterfaceStateCellType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectStreams:2.2>TableCellType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "InterfaceStateCellType")
@XmlType(name = "InterfaceStateCellType")
public class InterfaceStateCellType
    extends TableCellType
{


}
