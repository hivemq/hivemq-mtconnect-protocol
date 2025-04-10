//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * property that determines the characteristic or behavior of an entity.
 * 
 * <p>Java class for ParameterType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParameterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Maximum" type="{urn:mtconnect.org:MTConnectAssets:2.4}LimitValueType" minOccurs="0"/>
 *         <element name="Minimum" type="{urn:mtconnect.org:MTConnectAssets:2.4}LimitValueType" minOccurs="0"/>
 *         <element name="Nominal" type="{urn:mtconnect.org:MTConnectAssets:2.4}LimitValueType" minOccurs="0"/>
 *         <element name="Value" type="{urn:mtconnect.org:MTConnectAssets:2.4}LimitValueType"/>
 *       </all>
 *       <attribute name="identifier" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.4}IDType" />
 *       <attribute name="name" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.4}NameType" />
 *       <attribute name="units" type="{urn:mtconnect.org:MTConnectAssets:2.4}UnitsType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ParameterType")
@XmlType(name = "ParameterType", propOrder = {

})
public class ParameterType {

    /**
     * numeric upper constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Maximum")
    @XmlElement(name = "Maximum")
    protected Float maximum;
    /**
     * numeric lower constraint.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Minimum")
    @XmlElement(name = "Minimum")
    protected Float minimum;
    /**
     * numeric target or expected value.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Nominal")
    @XmlElement(name = "Nominal")
    protected Float nominal;
    /**
     * single data value that is expected to be reported for a
     *             {{block(DataItem)}}. {{property(Constraints::Value)}} **MUST NOT**
     *             be used in conjunction with any other {{block(Constraint)}}
     *             elements.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Value")
    @XmlElement(name = "Value")
    protected float value;
    /**
     * The identifier of the parameter
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "identifier")
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identifier;
    /**
     * identifier of the maintenance activity.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name", required = true)
    protected String name;
    /**
     * same as {{property(DataItem::units)}}. See {{package(Device
     *           Information Model)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "units")
    @XmlAttribute(name = "units")
    protected String units;

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

    /**
     * single data value that is expected to be reported for a
     *             {{block(DataItem)}}. {{property(Constraints::Value)}} **MUST NOT**
     *             be used in conjunction with any other {{block(Constraint)}}
     *             elements.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * The identifier of the parameter
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIdentifier()
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * identifier of the maintenance activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * same as {{property(DataItem::units)}}. See {{package(Device
     *           Information Model)}}.
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
     * @see #getUnits()
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
