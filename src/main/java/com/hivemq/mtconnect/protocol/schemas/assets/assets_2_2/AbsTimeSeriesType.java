//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_2;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The abstract waveform
 * 
 * <p>Java class for AbsTimeSeriesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbsTimeSeriesType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectAssets:2.2}SampleType">
 *       <attribute name="sampleCount" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.2}CountValueType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AbsTimeSeriesType")
@XmlType(name = "AbsTimeSeriesType")
@XmlSeeAlso({
    TimeSeriesType.class
})
public abstract class AbsTimeSeriesType
    extends SampleType
{

    /**
     * The number of samples
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sampleCount")
    @XmlAttribute(name = "sampleCount", required = true)
    protected BigInteger sampleCount;

    /**
     * The number of samples
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleCount() {
        return sampleCount;
    }

    /**
     * Sets the value of the sampleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSampleCount()
     */
    public void setSampleCount(BigInteger value) {
        this.sampleCount = value;
    }

}
