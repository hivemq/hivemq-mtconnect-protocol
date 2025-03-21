//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An XML container in an mtconnect response document that provides
 *         information from an agent defining version information, storage
 *         capacity, and parameters associated with the data management within the
 *         agent.
 * 
 * <p>Java class for HeaderType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeaderType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="version" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}VersionType" />
 *       <attribute name="creationTime" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}CreationTimeType" />
 *       <attribute name="nextSequence" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}SequenceType" />
 *       <attribute name="lastSequence" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}SequenceType" />
 *       <attribute name="firstSequence" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}SequenceType" />
 *       <attribute name="testIndicator" type="{urn:mtconnect.org:MTConnectStreams:1.5}TestIndicatorType" />
 *       <attribute name="instanceId" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}InstanceIdType" />
 *       <attribute name="sender" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}SenderType" />
 *       <attribute name="bufferSize" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.5}BufferSizeType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "HeaderType")
@XmlType(name = "HeaderType", propOrder = {
    "value"
})
public class HeaderType {

    @XmlValue
    protected String value;
    /**
     * The protocol version number.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "version")
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    /**
     * The time the response was created.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "creationTime")
    @XmlAttribute(name = "creationTime", required = true)
    protected XMLGregorianCalendar creationTime;
    /**
     * A number representing the sequence number of the piece of
     *               streaming data that is the next piece of data to be retrieved from
     *               the buffer of the agent that was not included in the response
     *               document published by the agent.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nextSequence")
    @XmlAttribute(name = "nextSequence", required = true)
    protected BigInteger nextSequence;
    /**
     * A number representing the sequence number assigned to the last
     *               piece of streaming data that was added to the buffer of the agent
     *               immediately prior to the time that the agent published the
     *               response document.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lastSequence")
    @XmlAttribute(name = "lastSequence", required = true)
    protected BigInteger lastSequence;
    /**
     * A number representing the sequence number assigned to the oldest
     *               piece of streaming data stored in the buffer of the agent
     *               immediately prior to the time that the agent published the
     *               response document.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "firstSequence")
    @XmlAttribute(name = "firstSequence", required = true)
    protected BigInteger firstSequence;
    /**
     * Optional flag that indicates the system is operating in test mode.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "testIndicator")
    @XmlAttribute(name = "testIndicator")
    protected Boolean testIndicator;
    /**
     * A number indicating which invocation of the agent.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "instanceId")
    @XmlAttribute(name = "instanceId", required = true)
    protected BigInteger instanceId;
    /**
     * The agent identification information.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    @XmlAttribute(name = "sender", required = true)
    protected String sender;
    /**
     * A value representing the maximum number of data entity that MAY be
     *               retained in the agent that published the response document at any
     *               point in time.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "bufferSize")
    @XmlAttribute(name = "bufferSize", required = true)
    protected long bufferSize;

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
     * The protocol version number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * The time the response was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreationTime()
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * A number representing the sequence number of the piece of
     *               streaming data that is the next piece of data to be retrieved from
     *               the buffer of the agent that was not included in the response
     *               document published by the agent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextSequence() {
        return nextSequence;
    }

    /**
     * Sets the value of the nextSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNextSequence()
     */
    public void setNextSequence(BigInteger value) {
        this.nextSequence = value;
    }

    /**
     * A number representing the sequence number assigned to the last
     *               piece of streaming data that was added to the buffer of the agent
     *               immediately prior to the time that the agent published the
     *               response document.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastSequence() {
        return lastSequence;
    }

    /**
     * Sets the value of the lastSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLastSequence()
     */
    public void setLastSequence(BigInteger value) {
        this.lastSequence = value;
    }

    /**
     * A number representing the sequence number assigned to the oldest
     *               piece of streaming data stored in the buffer of the agent
     *               immediately prior to the time that the agent published the
     *               response document.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstSequence() {
        return firstSequence;
    }

    /**
     * Sets the value of the firstSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getFirstSequence()
     */
    public void setFirstSequence(BigInteger value) {
        this.firstSequence = value;
    }

    /**
     * Optional flag that indicates the system is operating in test mode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestIndicator() {
        return testIndicator;
    }

    /**
     * Sets the value of the testIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTestIndicator()
     */
    public void setTestIndicator(Boolean value) {
        this.testIndicator = value;
    }

    /**
     * A number indicating which invocation of the agent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getInstanceId()
     */
    public void setInstanceId(BigInteger value) {
        this.instanceId = value;
    }

    /**
     * The agent identification information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSender()
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * A value representing the maximum number of data entity that MAY be
     *               retained in the agent that published the response document at any
     *               point in time.
     * 
     */
    public long getBufferSize() {
        return bufferSize;
    }

    /**
     * Sets the value of the bufferSize property.
     * 
     */
    public void setBufferSize(long value) {
        this.bufferSize = value;
    }

}
