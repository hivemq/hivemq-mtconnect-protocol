//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Abstract cutter life
 * 
 * <p>Java class for LifeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LifeType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:2.0>ToolLifeValueType">
 *       <attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.0}ToolLifeTypeType" />
 *       <attribute name="countDirection" use="required" type="{urn:mtconnect.org:MTConnectAssets:2.0}ToolLifeDirectionType" />
 *       <attribute name="warning" type="{urn:mtconnect.org:MTConnectAssets:2.0}ToolLifeValueType" />
 *       <attribute name="limit" type="{urn:mtconnect.org:MTConnectAssets:2.0}ToolLifeValueType" />
 *       <attribute name="initial" type="{urn:mtconnect.org:MTConnectAssets:2.0}ToolLifeValueType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "LifeType")
@XmlType(name = "LifeType", propOrder = {
    "value"
})
public class LifeType {

    /**
     * The life of the tool in time, wear, or parts
     * 
     */
    @XmlValue
    protected float value;
    /**
     * One of time, part count, or wear
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", required = true)
    protected ToolLifeTypeType type;
    /**
     * The count up or count down
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "countDirection")
    @XmlAttribute(name = "countDirection", required = true)
    protected ToolLifeDirectionType countDirection;
    /**
     * {{term(condition state)}} that requires concern and supervision
     *               and may become hazardous if no action is taken.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "warning")
    @XmlAttribute(name = "warning")
    protected Float warning;
    /**
     * Maximum tool life
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "limit")
    @XmlAttribute(name = "limit")
    protected Float limit;
    /**
     * The life when the tool is new
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "initial")
    @XmlAttribute(name = "initial")
    protected Float initial;

    /**
     * The life of the tool in time, wear, or parts
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
     * One of time, part count, or wear
     * 
     * @return
     *     possible object is
     *     {@link ToolLifeTypeType }
     *     
     */
    public ToolLifeTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolLifeTypeType }
     *     
     * @see #getType()
     */
    public void setType(ToolLifeTypeType value) {
        this.type = value;
    }

    /**
     * The count up or count down
     * 
     * @return
     *     possible object is
     *     {@link ToolLifeDirectionType }
     *     
     */
    public ToolLifeDirectionType getCountDirection() {
        return countDirection;
    }

    /**
     * Sets the value of the countDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolLifeDirectionType }
     *     
     * @see #getCountDirection()
     */
    public void setCountDirection(ToolLifeDirectionType value) {
        this.countDirection = value;
    }

    /**
     * {{term(condition state)}} that requires concern and supervision
     *               and may become hazardous if no action is taken.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getWarning()
     */
    public void setWarning(Float value) {
        this.warning = value;
    }

    /**
     * Maximum tool life
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getLimit()
     */
    public void setLimit(Float value) {
        this.limit = value;
    }

    /**
     * The life when the tool is new
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getInitial()
     */
    public void setInitial(Float value) {
        this.initial = value;
    }

}
