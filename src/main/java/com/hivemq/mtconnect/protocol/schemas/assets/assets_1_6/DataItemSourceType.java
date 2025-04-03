//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A native data source
 * 
 * <p>Java class for DataItemSourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataItemSourceType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectAssets:1.6>ItemSourceType">
 *       <attribute name="dataItemId" type="{urn:mtconnect.org:MTConnectAssets:1.6}SourceDataItemIdType" />
 *       <attribute name="componentId" type="{urn:mtconnect.org:MTConnectAssets:1.6}SourceComponentIdType" />
 *       <attribute name="compositionId" type="{urn:mtconnect.org:MTConnectAssets:1.6}CompositionIdType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemSourceType")
@XmlType(name = "DataItemSourceType", propOrder = {
    "value"
})
public class DataItemSourceType {

    /**
     * The measurement source
     * 
     */
    @XmlValue
    protected String value;
    /**
     * The identifier attribute of the dataitem that represents the
     *               originally measured value of the data referenced by this data
     *               item.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "dataItemId")
    @XmlAttribute(name = "dataItemId")
    @XmlIDREF
    protected Object dataItemId;
    /**
     * The identifier attribute of the component element that represents
     *               the physical part of a piece of equipment where the data
     *               represented by the dataitem element originated.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "componentId")
    @XmlAttribute(name = "componentId")
    @XmlIDREF
    protected Object componentId;
    /**
     * The identifier attribute of the composition element that the
     *               reported data is most closely associated.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "compositionId")
    @XmlAttribute(name = "compositionId")
    @XmlIDREF
    protected Object compositionId;

    /**
     * The measurement source
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
     * The identifier attribute of the dataitem that represents the
     *               originally measured value of the data referenced by this data
     *               item.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataItemId() {
        return dataItemId;
    }

    /**
     * Sets the value of the dataItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getDataItemId()
     */
    public void setDataItemId(Object value) {
        this.dataItemId = value;
    }

    /**
     * The identifier attribute of the component element that represents
     *               the physical part of a piece of equipment where the data
     *               represented by the dataitem element originated.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getComponentId()
     */
    public void setComponentId(Object value) {
        this.componentId = value;
    }

    /**
     * The identifier attribute of the composition element that the
     *               reported data is most closely associated.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompositionId() {
        return compositionId;
    }

    /**
     * Sets the value of the compositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getCompositionId()
     */
    public void setCompositionId(Object value) {
        this.compositionId = value;
    }

}
