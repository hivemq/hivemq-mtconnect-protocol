//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_7;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * **DEPRECATED:** Replaced with {{block(CONDITION)}} category data items
 *         in Version 1.1.0.
 * 
 * <p>Java class for AlarmType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmType">
 *   <simpleContent>
 *     <extension base="<urn:mtconnect.org:MTConnectStreams:1.7>StringEventType">
 *       <attribute name="code" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.7}NotifcationCodeType" />
 *       <attribute name="severity" type="{urn:mtconnect.org:MTConnectStreams:1.7}SeverityType" />
 *       <attribute name="state" type="{urn:mtconnect.org:MTConnectStreams:1.7}AlarmStateType" />
 *       <attribute name="nativeCode" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.7}NativeNotifcationCodeType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "AlarmType")
@XmlType(name = "AlarmType")
public class AlarmType
    extends StringEventType
{

    /**
     * **DEPRECATED** in *Version 1.1*. The programmatic code being
     *               executed.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "code")
    @XmlAttribute(name = "code", required = true)
    protected NotifcationCodeType code;
    /**
     * The severity
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "severity")
    @XmlAttribute(name = "severity")
    protected SeverityType severity;
    /**
     * The state
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "state")
    @XmlAttribute(name = "state")
    protected AlarmStateType state;
    /**
     * The component specific Notifcation code
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nativeCode")
    @XmlAttribute(name = "nativeCode", required = true)
    protected String nativeCode;

    /**
     * **DEPRECATED** in *Version 1.1*. The programmatic code being
     *               executed.
     * 
     * @return
     *     possible object is
     *     {@link NotifcationCodeType }
     *     
     */
    public NotifcationCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifcationCodeType }
     *     
     * @see #getCode()
     */
    public void setCode(NotifcationCodeType value) {
        this.code = value;
    }

    /**
     * The severity
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     * @see #getSeverity()
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * The state
     * 
     * @return
     *     possible object is
     *     {@link AlarmStateType }
     *     
     */
    public AlarmStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmStateType }
     *     
     * @see #getState()
     */
    public void setState(AlarmStateType value) {
        this.state = value;
    }

    /**
     * The component specific Notifcation code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCode() {
        return nativeCode;
    }

    /**
     * Sets the value of the nativeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNativeCode()
     */
    public void setNativeCode(String value) {
        this.nativeCode = value;
    }

}
