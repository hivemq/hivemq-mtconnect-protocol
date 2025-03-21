//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * set of parameters that govern the functionality of the related
 *         {{block(Component)}}.
 * 
 * <p>Java class for ComponentConfigurationParametersType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComponentConfigurationParametersType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectAssets:2.2}AssetType">
 *       <all>
 *         <element name="ParameterSets" type="{urn:mtconnect.org:MTConnectAssets:2.2}ParameterSetsType"/>
 *       </all>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ComponentConfigurationParametersType")
@XmlType(name = "ComponentConfigurationParametersType", propOrder = {
    "parameterSets"
})
public class ComponentConfigurationParametersType
    extends AssetType
{

    /**
     * Groups one or more ParameterSet
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ParameterSets")
    @XmlElement(name = "ParameterSets", required = true)
    protected ParameterSetsType parameterSets;

    /**
     * Groups one or more ParameterSet
     * 
     * @return
     *     possible object is
     *     {@link ParameterSetsType }
     *     
     */
    public ParameterSetsType getParameterSets() {
        return parameterSets;
    }

    /**
     * Sets the value of the parameterSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSetsType }
     *     
     * @see #getParameterSets()
     */
    public void setParameterSets(ParameterSetsType value) {
        this.parameterSets = value;
    }

}
