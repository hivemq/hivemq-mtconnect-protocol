//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * constrained process feed rate for the tool in mm/s. The
 *         {{property(ProcessFeedRate::value)}} **MAY** contain the nominal process
 *         target feed rate if available. If {{block(ProcessFeedRate)}} is
 *         provided, at least one value of {{property(ProcessFeedRate::maximum)}},
 *         {{property(ProcessFeedRate::nominal)}}, or
 *         {{property(ProcessFeedRate::minimum)}} **MUST** be specified.
 * 
 * <p>Java class for ProcessFeedRateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcessFeedRateType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.4>SpeedType">
 *       <attribute name="maximum" type="{urn:mtconnect.org:MTConnectAssets:2.4}MaximumType" />
 *       <attribute name="minimum" type="{urn:mtconnect.org:MTConnectAssets:2.4}MinimumType" />
 *       <attribute name="nominal" type="{urn:mtconnect.org:MTConnectAssets:2.4}NominalType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ProcessFeedRateType")
@XmlType(name = "ProcessFeedRateType", propOrder = {
    "value"
})
public class ProcessFeedRateType {

    /**
     * A speed in RPM or mm/s
     * 
     */
    @XmlValue
    protected String value;
    /**
     * numeric upper constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "maximum")
    @XmlAttribute(name = "maximum")
    protected Float maximum;
    /**
     * numeric lower constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "minimum")
    @XmlAttribute(name = "minimum")
    protected Float minimum;
    /**
     * numeric target or expected value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nominal")
    @XmlAttribute(name = "nominal")
    protected Float nominal;

    /**
     * A speed in RPM or mm/s
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * numeric upper constraint.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMaximum()
     */
    public void setMaximum(Float value) {
        this.maximum = value;
    }

    /**
     * numeric lower constraint.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getMinimum()
     */
    public void setMinimum(Float value) {
        this.minimum = value;
    }

    /**
     * numeric target or expected value.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getNominal()
     */
    public void setNominal(Float value) {
        this.nominal = value;
    }

}
