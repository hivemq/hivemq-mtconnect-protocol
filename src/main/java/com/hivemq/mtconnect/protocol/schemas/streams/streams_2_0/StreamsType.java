//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(Streams)}} groups one or more {{block(DeviceStream)}} entities.
 *         See {{package(Observation Information Model)}} for more detail.
 * 
 * <p>Java class for StreamsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StreamsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeviceStream" type="{urn:mtconnect.org:MTConnectStreams:2.0}DeviceStreamType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "StreamsType")
@XmlType(name = "StreamsType", propOrder = {
    "deviceStream"
})
public class StreamsType {

    /**
     * Description
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "DeviceStream")
    @XmlElement(name = "DeviceStream")
    protected List<DeviceStreamType> deviceStream;

    /**
     * Description
     * 
     * Gets the value of the deviceStream property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceStream property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceStreamType }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceStream property.
     */
    public List<DeviceStreamType> getDeviceStream() {
        if (deviceStream == null) {
            deviceStream = new ArrayList<>();
        }
        return this.deviceStream;
    }

}
