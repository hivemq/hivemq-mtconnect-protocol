//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DataSet of tabular {{def(EventEnum::COMPONENT_DATA)}} If the
 *         {{block(Component)}} multiplicity can be determined, the device model
 *         **MUST** use a fixed set of {{block(Component)}}s.
 *         {{block(ComponentData)}} **MUST** provide a {{block(DataItem)}}
 *         {{block(Definition)}}.
 * 
 * <p>Java class for ComponentDataEntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentDataEntryType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectStreams:2.3>EntryType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ComponentDataEntryType")
@XmlType(name = "ComponentDataEntryType")
public class ComponentDataEntryType
    extends EntryType
{


}
