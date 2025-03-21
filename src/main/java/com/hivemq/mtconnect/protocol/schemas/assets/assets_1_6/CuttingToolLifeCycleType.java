//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data regarding the use of this tool.
 * 
 * <p>Java class for CuttingToolLifeCycleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CuttingToolLifeCycleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CutterStatus" type="{urn:mtconnect.org:MTConnectAssets:1.6}CutterStatusType"/>
 *         <element name="ReconditionCount" type="{urn:mtconnect.org:MTConnectAssets:1.6}ReconditionCountType" minOccurs="0"/>
 *         <element name="ToolLife" type="{urn:mtconnect.org:MTConnectAssets:1.6}LifeType" maxOccurs="3" minOccurs="0"/>
 *         <element name="ProgramToolGroup" type="{urn:mtconnect.org:MTConnectAssets:1.6}ProgramToolGroupType" minOccurs="0"/>
 *         <element name="ProgramToolNumber" type="{urn:mtconnect.org:MTConnectAssets:1.6}ProgramToolNumberType" minOccurs="0"/>
 *         <element name="Location" type="{urn:mtconnect.org:MTConnectAssets:1.6}LocationType" minOccurs="0"/>
 *         <element name="ProcessSpindleSpeed" type="{urn:mtconnect.org:MTConnectAssets:1.6}ProcessSpindleSpeedType" minOccurs="0"/>
 *         <element name="ProcessFeedRate" type="{urn:mtconnect.org:MTConnectAssets:1.6}ProcessFeedRateType" minOccurs="0"/>
 *         <element name="ConnectionCodeMachineSide" type="{urn:mtconnect.org:MTConnectAssets:1.6}ConnectionCodeMachineSideType" minOccurs="0"/>
 *         <any maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Measurements" type="{urn:mtconnect.org:MTConnectAssets:1.6}AssemblyMeasurementsType" minOccurs="0"/>
 *         <element name="CuttingItems" type="{urn:mtconnect.org:MTConnectAssets:1.6}CuttingItemsType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CuttingToolLifeCycleType")
@XmlType(name = "CuttingToolLifeCycleType", propOrder = {
    "cutterStatus",
    "reconditionCount",
    "toolLife",
    "programToolGroup",
    "programToolNumber",
    "location",
    "processSpindleSpeed",
    "processFeedRate",
    "connectionCodeMachineSide",
    "any",
    "measurements",
    "cuttingItems"
})
public class CuttingToolLifeCycleType {

    /**
     * The status of this assembly.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CutterStatus")
    @XmlElement(name = "CutterStatus", required = true)
    protected CutterStatusType cutterStatus;
    /**
     * The number of times this cutter has been reconditioned.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ReconditionCount")
    @XmlElement(name = "ReconditionCount")
    protected ReconditionCountType reconditionCount;
    /**
     * The Cutting Tool life as related to this assembly.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ToolLife")
    @XmlElement(name = "ToolLife")
    protected List<LifeType> toolLife;
    /**
     * The tool group this tool is assigned in the part program.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ProgramToolGroup")
    @XmlElement(name = "ProgramToolGroup")
    protected String programToolGroup;
    /**
     * The number of the tool as referenced in the part program.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ProgramToolNumber")
    @XmlElement(name = "ProgramToolNumber")
    protected BigInteger programToolNumber;
    /**
     * The Pot or Spindle this tool currently resides in.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Location")
    @XmlElement(name = "Location")
    protected LocationType location;
    /**
     * The constrained process spindle speed for this tool.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ProcessSpindleSpeed")
    @XmlElement(name = "ProcessSpindleSpeed")
    protected ProcessSpindleSpeedType processSpindleSpeed;
    /**
     * The constrained process feed rate for this tool in mm/s.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ProcessFeedRate")
    @XmlElement(name = "ProcessFeedRate")
    protected ProcessFeedRateType processFeedRate;
    /**
     * Identifier for the capability to connect any component of the
     *             Cutting Tool together, except Assembly Items, on the machine side.
     *             Code: CCMS
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "ConnectionCodeMachineSide")
    @XmlElement(name = "ConnectionCodeMachineSide")
    protected String connectionCodeMachineSide;
    /**
     * A placeholder for an XML element.
     * 
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * The measurements element is a collection of one or more constrained
     *             scalar values associated with this Cutting Tool.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Measurements")
    @XmlElement(name = "Measurements")
    protected AssemblyMeasurementsType measurements;
    /**
     * An optional set of individual Cutting Items.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "CuttingItems")
    @XmlElement(name = "CuttingItems")
    protected CuttingItemsType cuttingItems;

    /**
     * The status of this assembly.
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
     * The number of times this cutter has been reconditioned.
     * 
     * @return
     *     possible object is
     *     {@link ReconditionCountType }
     *     
     */
    public ReconditionCountType getReconditionCount() {
        return reconditionCount;
    }

    /**
     * Sets the value of the reconditionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconditionCountType }
     *     
     * @see #getReconditionCount()
     */
    public void setReconditionCount(ReconditionCountType value) {
        this.reconditionCount = value;
    }

    /**
     * The Cutting Tool life as related to this assembly.
     * 
     * Gets the value of the toolLife property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toolLife property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getToolLife().add(newItem);
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
     *     The value of the toolLife property.
     */
    public List<LifeType> getToolLife() {
        if (toolLife == null) {
            toolLife = new ArrayList<>();
        }
        return this.toolLife;
    }

    /**
     * The tool group this tool is assigned in the part program.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramToolGroup() {
        return programToolGroup;
    }

    /**
     * Sets the value of the programToolGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramToolGroup()
     */
    public void setProgramToolGroup(String value) {
        this.programToolGroup = value;
    }

    /**
     * The number of the tool as referenced in the part program.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgramToolNumber() {
        return programToolNumber;
    }

    /**
     * Sets the value of the programToolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getProgramToolNumber()
     */
    public void setProgramToolNumber(BigInteger value) {
        this.programToolNumber = value;
    }

    /**
     * The Pot or Spindle this tool currently resides in.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     * @see #getLocation()
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * The constrained process spindle speed for this tool.
     * 
     * @return
     *     possible object is
     *     {@link ProcessSpindleSpeedType }
     *     
     */
    public ProcessSpindleSpeedType getProcessSpindleSpeed() {
        return processSpindleSpeed;
    }

    /**
     * Sets the value of the processSpindleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessSpindleSpeedType }
     *     
     * @see #getProcessSpindleSpeed()
     */
    public void setProcessSpindleSpeed(ProcessSpindleSpeedType value) {
        this.processSpindleSpeed = value;
    }

    /**
     * The constrained process feed rate for this tool in mm/s.
     * 
     * @return
     *     possible object is
     *     {@link ProcessFeedRateType }
     *     
     */
    public ProcessFeedRateType getProcessFeedRate() {
        return processFeedRate;
    }

    /**
     * Sets the value of the processFeedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessFeedRateType }
     *     
     * @see #getProcessFeedRate()
     */
    public void setProcessFeedRate(ProcessFeedRateType value) {
        this.processFeedRate = value;
    }

    /**
     * Identifier for the capability to connect any component of the
     *             Cutting Tool together, except Assembly Items, on the machine side.
     *             Code: CCMS
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCodeMachineSide() {
        return connectionCodeMachineSide;
    }

    /**
     * Sets the value of the connectionCodeMachineSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionCodeMachineSide()
     */
    public void setConnectionCodeMachineSide(String value) {
        this.connectionCodeMachineSide = value;
    }

    /**
     * A placeholder for an XML element.
     * 
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * The measurements element is a collection of one or more constrained
     *             scalar values associated with this Cutting Tool.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyMeasurementsType }
     *     
     */
    public AssemblyMeasurementsType getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyMeasurementsType }
     *     
     * @see #getMeasurements()
     */
    public void setMeasurements(AssemblyMeasurementsType value) {
        this.measurements = value;
    }

    /**
     * An optional set of individual Cutting Items.
     * 
     * @return
     *     possible object is
     *     {@link CuttingItemsType }
     *     
     */
    public CuttingItemsType getCuttingItems() {
        return cuttingItems;
    }

    /**
     * Sets the value of the cuttingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuttingItemsType }
     *     
     * @see #getCuttingItems()
     */
    public void setCuttingItems(CuttingItemsType value) {
        this.cuttingItems = value;
    }

}
