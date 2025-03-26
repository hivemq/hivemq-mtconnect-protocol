//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Description
 * 
 * <p>Java class for DeviceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceType">
 *   <complexContent>
 *     <extension base="{urn:mtconnect.org:MTConnectDevices:2.0}ComponentType">
 *       <attribute name="iso841Class" type="{urn:mtconnect.org:MTConnectDevices:2.0}Iso841ClassType" />
 *       <attribute name="uuid" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.0}UuidType" />
 *       <attribute name="name" use="required" type="{urn:mtconnect.org:MTConnectDevices:2.0}NameType" />
 *       <attribute name="mtconnectVersion" type="{urn:mtconnect.org:MTConnectDevices:2.0}VersionType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DeviceType")
@XmlType(name = "DeviceType")
@XmlSeeAlso({
    AgentType.class
})
public class DeviceType
    extends ComponentType
{

    /**
     * DEPRECATED: The device's ISO-841 classification
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "iso841Class")
    @XmlAttribute(name = "iso841Class")
    protected BigInteger iso841Class;
    /**
     * The components universally unique id. This can be composed of the
     *               manufactures id or name and the serial number.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "uuid")
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    /**
     * The Device name.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    @XmlAttribute(name = "name", required = true)
    protected String name;
    /**
     * MTConnect version of the {{term(Device Information Model)}} used
     *               to configure the information to be published for a piece of
     *               equipment in an {{term(MTConnect Response Document)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "mtconnectVersion")
    @XmlAttribute(name = "mtconnectVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mtconnectVersion;

    /**
     * DEPRECATED: The device's ISO-841 classification
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIso841Class() {
        return iso841Class;
    }

    /**
     * Sets the value of the iso841Class property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getIso841Class()
     */
    public void setIso841Class(BigInteger value) {
        this.iso841Class = value;
    }

    /**
     * The components universally unique id. This can be composed of the
     *               manufactures id or name and the serial number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUuid()
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * The Device name.
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
     * MTConnect version of the {{term(Device Information Model)}} used
     *               to configure the information to be published for a piece of
     *               equipment in an {{term(MTConnect Response Document)}}.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtconnectVersion() {
        return mtconnectVersion;
    }

    /**
     * Sets the value of the mtconnectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMtconnectVersion()
     */
    public void setMtconnectVersion(String value) {
        this.mtconnectVersion = value;
    }

}
