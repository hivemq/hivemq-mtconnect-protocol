//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * See {{sect(SolidModel)}}.
 * 
 * <p>Java class for SolidModelType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SolidModelType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.0}AbstractConfigurationType">
 *       <all>
 *         <element name="Transformation" type="{urn:mtconnect.org:MTConnectDevices:2.0}TransformationType" minOccurs="0"/>
 *         <element name="Scale" type="{urn:mtconnect.org:MTConnectDevices:2.0}SolidModelScaleType" minOccurs="0"/>
 *       </all>
 *       <attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.0}IDType" />
 *       <attribute name="solidModelIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.0}SolidModelIdRefType" />
 *       <attribute name="href" type="{http://www.w3.org/1999/xlink}hrefType" />
 *       <attribute ref="{http://www.w3.org/1999/xlink}type fixed="locator""/>
 *       <attribute name="itemRef" type="{urn:mtconnect.org:MTConnectDevices:2.0}ItemRefType" />
 *       <attribute name="mediaType" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.0}SolidModelMediaTypeType" />
 *       <attribute name="coordinateSystemIdRef" type="{urn:mtconnect.org:MTConnectDevices:2.0}CoordinateSystemIdRefType" />
 *       <attribute name="units" type="{urn:mtconnect.org:MTConnectDevices:2.0}UnitsType" />
 *       <attribute name="nativeUnits" type="{urn:mtconnect.org:MTConnectDevices:2.0}NativeUnitsType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "SolidModelType")
@XmlType(name = "SolidModelType", propOrder = {
    "transformation",
    "scale"
})
public class SolidModelType
    extends AbstractConfigurationType
{

    /**
     * See {{sect(Transformation)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Transformation")
    @XmlElement(name = "Transformation")
    protected TransformationType transformation;
    /**
     * See {{sect(Scale)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Scale")
    @XmlElement(name = "Scale")
    protected SolidModelScaleType scale;
    /**
     * the unique identifier for this entity within the MTConnectDevices
     *               document
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    /**
     * The associated model file if an item reference is used
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "solidModelIdRef")
    @XmlAttribute(name = "solidModelIdRef")
    @XmlIDREF
    protected Object solidModelIdRef;
    /**
     * {{term(URL)}} giving the location of the {{block(SolidModel)}}. If
     *               not present, the model referenced in the
     *               {{property(solidModelIdRef,SolidModel)}} is used.
     *               {{property(href,SolidModel)}} is of type `xlink:href` from the W3C
     *               XLink specification.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "href")
    @XmlAttribute(name = "href")
    protected String href;
    /**
     * Description
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    /**
     * The reference to the item within the model within the related
     *               geometry. A modelIdRef MUST be given.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "itemRef")
    @XmlAttribute(name = "itemRef")
    protected String itemRef;
    /**
     * The format of the referenced document
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "mediaType")
    @XmlAttribute(name = "mediaType", required = true)
    protected String mediaType;
    /**
     * The identifier of the coordinate system that this motion is
     *               relative to
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "coordinateSystemIdRef")
    @XmlAttribute(name = "coordinateSystemIdRef")
    @XmlIDREF
    protected Object coordinateSystemIdRef;
    /**
     * The units of the measurement
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "units")
    @XmlAttribute(name = "units")
    protected String units;
    /**
     * The units as expressed by the machine
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeUnits")
    @XmlAttribute(name = "nativeUnits")
    protected String nativeUnits;

    /**
     * See {{sect(Transformation)}}.
     * 
     * @return
     *     possible object is
     *     {@link TransformationType }
     *     
     */
    public TransformationType getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationType }
     *     
     * @see #getTransformation()
     */
    public void setTransformation(TransformationType value) {
        this.transformation = value;
    }

    /**
     * See {{sect(Scale)}}.
     * 
     * @return
     *     possible object is
     *     {@link SolidModelScaleType }
     *     
     */
    public SolidModelScaleType getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidModelScaleType }
     *     
     * @see #getScale()
     */
    public void setScale(SolidModelScaleType value) {
        this.scale = value;
    }

    /**
     * the unique identifier for this entity within the MTConnectDevices
     *               document
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * The associated model file if an item reference is used
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSolidModelIdRef() {
        return solidModelIdRef;
    }

    /**
     * Sets the value of the solidModelIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getSolidModelIdRef()
     */
    public void setSolidModelIdRef(Object value) {
        this.solidModelIdRef = value;
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

    /**
     * The reference to the item within the model within the related
     *               geometry. A modelIdRef MUST be given.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getItemRef()
     */
    public void setItemRef(String value) {
        this.itemRef = value;
    }

    /**
     * The format of the referenced document
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMediaType()
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * The identifier of the coordinate system that this motion is
     *               relative to
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoordinateSystemIdRef() {
        return coordinateSystemIdRef;
    }

    /**
     * Sets the value of the coordinateSystemIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     * @see #getCoordinateSystemIdRef()
     */
    public void setCoordinateSystemIdRef(Object value) {
        this.coordinateSystemIdRef = value;
    }

    /**
     * The units of the measurement
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

    /**
     * The units as expressed by the machine
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
     * @see #getNativeUnits()
     */
    public void setNativeUnits(String value) {
        this.nativeUnits = value;
    }

}
