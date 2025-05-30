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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * An abstract type for edge measurements
 * 
 * <p>Java class for MeasurementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeasurementType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.4>MeasurementValueType">
 *       <attribute name="significantDigits" type="{urn:mtconnect.org:MTConnectAssets:1.4}SignificantDigitsValueType" />
 *       <attribute name="units" type="{urn:mtconnect.org:MTConnectAssets:1.4}UnitsType" />
 *       <attribute name="nativeUnits" type="{urn:mtconnect.org:MTConnectAssets:1.4}NativeUnitsType" />
 *       <attribute name="code" type="{urn:mtconnect.org:MTConnectAssets:1.4}MeasurementCodeType" />
 *       <attribute name="maximum" type="{urn:mtconnect.org:MTConnectAssets:1.4}MeasurementAttrType" />
 *       <attribute name="minimum" type="{urn:mtconnect.org:MTConnectAssets:1.4}MeasurementAttrType" />
 *       <attribute name="nominal" type="{urn:mtconnect.org:MTConnectAssets:1.4}MeasurementAttrType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "MeasurementType")
@XmlType(name = "MeasurementType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CommonMeasurementType.class,
    AssemblyMeasurementType.class,
    CuttingItemMeasurementType.class
})
public abstract class MeasurementType {

    /**
     * A measurement value
     * 
     */
    @XmlValue
    protected String value;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "significantDigits")
    @XmlAttribute(name = "significantDigits")
    protected BigInteger significantDigits;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "units")
    @XmlAttribute(name = "units")
    protected String units;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeUnits")
    @XmlAttribute(name = "nativeUnits")
    protected String nativeUnits;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "code")
    @XmlAttribute(name = "code")
    protected String code;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "maximum")
    @XmlAttribute(name = "maximum")
    protected Float maximum;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "minimum")
    @XmlAttribute(name = "minimum")
    protected Float minimum;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nominal")
    @XmlAttribute(name = "nominal")
    protected Float nominal;

    /**
     * A measurement value
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
     * Gets the value of the significantDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificantDigits() {
        return significantDigits;
    }

    /**
     * Sets the value of the significantDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificantDigits(BigInteger value) {
        this.significantDigits = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the nativeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeUnits() {
        return nativeUnits;
    }

    /**
     * Sets the value of the nativeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeUnits(String value) {
        this.nativeUnits = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the maximum property.
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
     */
    public void setMaximum(Float value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
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
     */
    public void setMinimum(Float value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the nominal property.
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
     */
    public void setNominal(Float value) {
        this.nominal = value;
    }

}
