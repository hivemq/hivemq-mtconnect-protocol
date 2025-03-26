//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * {{block(FileProperties)}} groups one or more {{block(FileProperty)}}
 *         entities for a {{block(File)}}. See {{sect(FileProperty)}}.
 * 
 * <p>Java class for FilePropertiesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FilePropertiesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FileProperty" type="{urn:mtconnect.org:MTConnectAssets:2.0}FilePropertyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@com.fasterxml.jackson.annotation.JsonTypeName(value = "FilePropertiesType")
@XmlType(name = "FilePropertiesType", propOrder = {
    "fileProperty"
})
public class FilePropertiesType {

    /**
     * key-value pair providing additional metadata about a
     *             {{block(File)}}.
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty(value = "FileProperty")
    @XmlElement(name = "FileProperty", required = true)
    protected List<FilePropertyType> fileProperty;

    /**
     * key-value pair providing additional metadata about a
     *             {{block(File)}}.
     * 
     * Gets the value of the fileProperty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileProperty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilePropertyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fileProperty property.
     */
    public List<FilePropertyType> getFileProperty() {
        if (fileProperty == null) {
            fileProperty = new ArrayList<>();
        }
        return this.fileProperty;
    }

}
