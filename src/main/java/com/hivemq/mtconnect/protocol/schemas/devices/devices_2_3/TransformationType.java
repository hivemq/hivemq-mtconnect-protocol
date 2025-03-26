//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;


/**
 * See {{sect(Transformation)}}.
 * 
 * <p>Java class for TransformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TransformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="Translation" type="{urn:mtconnect.org:MTConnectDevices:2.3}ThreeSpaceValueType"/>
 *         <element name="Rotation" type="{urn:mtconnect.org:MTConnectDevices:2.3}ThreeSpaceValueType"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "TransformationType")
@XmlType(name = "TransformationType", propOrder = {

})
public class TransformationType {

    /**
     * translations along X, Y, and Z axes are expressed as x,y, and z
     *             respectively within a 3-dimensional vector.
     * 
     */
    @XmlList
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Translation")
    @XmlElement(name = "Translation", type = Float.class)
    protected List<Float> translation;
    /**
     * rotations about X, Y, and Z axes are expressed in A, B, and C
     *             respectively within a 3-dimensional vector.
     * 
     */
    @XmlList
    @com.fasterxml.jackson.annotation.JsonProperty(value = "Rotation")
    @XmlElement(name = "Rotation", type = Float.class)
    protected List<Float> rotation;

    /**
     * translations along X, Y, and Z axes are expressed as x,y, and z
     *             respectively within a 3-dimensional vector.
     * 
     * Gets the value of the translation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * </p>
     * 
     * 
     * @return
     *     The value of the translation property.
     */
    public List<Float> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<>();
        }
        return this.translation;
    }

    /**
     * rotations about X, Y, and Z axes are expressed in A, B, and C
     *             respectively within a 3-dimensional vector.
     * 
     * Gets the value of the rotation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rotation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * </p>
     * 
     * 
     * @return
     *     The value of the rotation property.
     */
    public List<Float> getRotation() {
        if (rotation == null) {
            rotation = new ArrayList<>();
        }
        return this.rotation;
    }

}
