//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An edge into a tool assembly
 * 
 * <p>Java class for CuttingItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CuttingItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Description" type="{urn:mtconnect.org:MTConnectAssets:1.2}AssetDescriptionType" minOccurs="0"/>
 *         <element name="CutterStatus" type="{urn:mtconnect.org:MTConnectAssets:1.2}CutterStatusType" minOccurs="0"/>
 *         <element name="Locus" type="{urn:mtconnect.org:MTConnectAssets:1.2}LocusType" minOccurs="0"/>
 *         <element name="ItemLife" type="{urn:mtconnect.org:MTConnectAssets:1.2}LifeType" maxOccurs="3" minOccurs="0"/>
 *         <element name="Measurements" type="{urn:mtconnect.org:MTConnectAssets:1.2}CuttingItemMeasurementsType" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="indices" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.2}IndexRangeType" />
 *       <attribute name="itemId" type="{urn:mtconnect.org:MTConnectAssets:1.2}ItemIdType" />
 *       <attribute name="grade" type="{urn:mtconnect.org:MTConnectAssets:1.2}GradeType" />
 *       <attribute name="manufacturers" type="{urn:mtconnect.org:MTConnectAssets:1.2}ManufacturersType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CuttingItemType")
@XmlType(name = "CuttingItemType", propOrder = {
    "description",
    "cutterStatus",
    "locus",
    "itemLife",
    "measurements"
})
public class CuttingItemType {

    /**
     * The description of the cutting item
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Description")
    @XmlElement(name = "Description")
    protected AssetDescriptionType description;
    /**
     * The status of an individual cutting item
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CutterStatus")
    @XmlElement(name = "CutterStatus")
    protected CutterStatusType cutterStatus;
    /**
     * The cutting item's location on the cutting tool
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Locus")
    @XmlElement(name = "Locus")
    protected String locus;
    /**
     * The life of an edge
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ItemLife")
    @XmlElement(name = "ItemLife")
    protected List<LifeType> itemLife;
    /**
     * A set of measurements associated with the cutting tool
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Measurements")
    @XmlElement(name = "Measurements")
    protected CuttingItemMeasurementsType measurements;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "indices")
    @XmlAttribute(name = "indices", required = true)
    protected String indices;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "itemId")
    @XmlAttribute(name = "itemId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemId;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "grade")
    @XmlAttribute(name = "grade")
    protected String grade;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "manufacturers")
    @XmlAttribute(name = "manufacturers")
    protected String manufacturers;

    /**
     * The description of the cutting item
     * 
     * @return
     *     possible object is
     *     {@link AssetDescriptionType }
     *     
     */
    public AssetDescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetDescriptionType }
     *     
     * @see #getDescription()
     */
    public void setDescription(AssetDescriptionType value) {
        this.description = value;
    }

    /**
     * The status of an individual cutting item
     * 
     * @return
     *     possible object is
     *     {@link CutterStatusType }
     *     
     */
    public CutterStatusType getCutterStatus() {
        return cutterStatus;
    }

    /**
     * Sets the value of the cutterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutterStatusType }
     *     
     * @see #getCutterStatus()
     */
    public void setCutterStatus(CutterStatusType value) {
        this.cutterStatus = value;
    }

    /**
     * The cutting item's location on the cutting tool
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocus() {
        return locus;
    }

    /**
     * Sets the value of the locus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocus()
     */
    public void setLocus(String value) {
        this.locus = value;
    }

    /**
     * The life of an edge
     * 
     * Gets the value of the itemLife property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLife property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getItemLife().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the itemLife property.
     */
    public List<LifeType> getItemLife() {
        if (itemLife == null) {
            itemLife = new ArrayList<>();
        }
        return this.itemLife;
    }

    /**
     * A set of measurements associated with the cutting tool
     * 
     * @return
     *     possible object is
     *     {@link CuttingItemMeasurementsType }
     *     
     */
    public CuttingItemMeasurementsType getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuttingItemMeasurementsType }
     *     
     * @see #getMeasurements()
     */
    public void setMeasurements(CuttingItemMeasurementsType value) {
        this.measurements = value;
    }

    /**
     * Gets the value of the indices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndices() {
        return indices;
    }

    /**
     * Sets the value of the indices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndices(String value) {
        this.indices = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the manufacturers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturers() {
        return manufacturers;
    }

    /**
     * Sets the value of the manufacturers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturers(String value) {
        this.manufacturers = value;
    }

}
