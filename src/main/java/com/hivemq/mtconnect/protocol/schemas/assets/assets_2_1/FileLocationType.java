//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * {{term(URL)}} reference to the file location.
 * 
 * <p>Java class for FileLocationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileLocationType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="href" use="required" type="{http://www.w3.org/1999/xlink}hrefType" />
 *       <attribute ref="{http://www.w3.org/1999/xlink}type fixed="locator""/>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FileLocationType")
@XmlType(name = "FileLocationType", propOrder = {
    "value"
})
public class FileLocationType {

    @XmlValue
    protected String value;
    /**
     * {{term(URL)}} giving the location of the {{block(SolidModel)}}. If
     *               not present, the model referenced in the
     *               {{property(solidModelIdRef,SolidModel)}} is used.
     *               {{property(href,SolidModel)}} is of type `xlink:href` from the W3C
     *               XLink specification.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "href")
    @XmlAttribute(name = "href", required = true)
    protected String href;
    /**
     * Description
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;

    /**
     * Gets the value of the value property.
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
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * {{term(URL)}} giving the location of the {{block(SolidModel)}}. If
     *               not present, the model referenced in the
     *               {{property(solidModelIdRef,SolidModel)}} is used.
     *               {{property(href,SolidModel)}} is of type `xlink:href` from the W3C
     *               XLink specification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHref()
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Description
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.LOCATOR;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     * @see #getType()
     */
    public void setType(TypeType value) {
        this.type = value;
    }

}
