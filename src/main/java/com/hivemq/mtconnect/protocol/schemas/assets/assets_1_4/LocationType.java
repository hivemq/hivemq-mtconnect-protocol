//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_4;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * The location of the tool in the tool changer (pot) or the station of the
 *         tool
 * 
 * <p>Java class for LocationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LocationType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.4>LocationValueType">
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.4}LocationsType" />
 *       <attribute name="negativeOverlap" type="{urn:mtconnect.org:MTConnectAssets:1.4}OverlapType" />
 *       <attribute name="positiveOverlap" type="{urn:mtconnect.org:MTConnectAssets:1.4}OverlapType" />
 *       <attribute name="turret" type="{urn:mtconnect.org:MTConnectAssets:1.4}TurretLocationType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "LocationType")
@XmlType(name = "LocationType", propOrder = {
    "value"
})
public class LocationType {

    /**
     * The tool location
     * 
     */
    @XmlValue
    protected BigInteger value;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected LocationsType type;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "negativeOverlap")
    @XmlAttribute(name = "negativeOverlap")
    protected BigInteger negativeOverlap;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "positiveOverlap")
    @XmlAttribute(name = "positiveOverlap")
    protected BigInteger positiveOverlap;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "turret")
    @XmlAttribute(name = "turret")
    protected String turret;

    /**
     * The tool location
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValue()
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LocationsType }
     *     
     */
    public LocationsType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationsType }
     *     
     */
    public void setType(LocationsType value) {
        this.type = value;
    }

    /**
     * Gets the value of the negativeOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegativeOverlap() {
        return negativeOverlap;
    }

    /**
     * Sets the value of the negativeOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegativeOverlap(BigInteger value) {
        this.negativeOverlap = value;
    }

    /**
     * Gets the value of the positiveOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositiveOverlap() {
        return positiveOverlap;
    }

    /**
     * Sets the value of the positiveOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositiveOverlap(BigInteger value) {
        this.positiveOverlap = value;
    }

    /**
     * Gets the value of the turret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurret() {
        return turret;
    }

    /**
     * Sets the value of the turret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurret(String value) {
        this.turret = value;
    }

}
