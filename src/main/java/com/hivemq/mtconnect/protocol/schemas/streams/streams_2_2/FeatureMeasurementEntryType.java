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
 * DataSet of tabular representation of
 *         {{def(EventEnum:FEATURE_MEASUREMENT)}} {{block(FeatureMeasurement)}}
 *         **MAY** include a {{term(characteristic)}} in which case it **MAY**
 *         include a `CHARACTERISTIC_STATUS`.
 * 
 * <p>Java class for FeatureMeasurementEntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FeatureMeasurementEntryType">
 *   <simpleContent>
 *     <restriction base="<urn:mtconnect.org:MTConnectStreams:2.2>EntryType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FeatureMeasurementEntryType")
@XmlType(name = "FeatureMeasurementEntryType")
public class FeatureMeasurementEntryType
    extends EntryType
{


}
