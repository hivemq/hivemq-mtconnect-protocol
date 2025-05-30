//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The category of application that will use this file
 * 
 * <p>Java class for ApplicationCategoryEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApplicationCategoryEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASSEMBLY"/>
 *     <enumeration value="DEVICE"/>
 *     <enumeration value="HANDLING"/>
 *     <enumeration value="MAINTENANCE"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PROCESS"/>
 *     <enumeration value="INSPECTION"/>
 *     <enumeration value="SETUP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "ApplicationCategoryEnum")
@XmlType(name = "ApplicationCategoryEnum")
@XmlEnum
public enum ApplicationCategoryEnum {


    /**
     * Files regarding the fully assembled product
     * 
     */
    ASSEMBLY,

    /**
     * Device related files
     * 
     */
    DEVICE,

    /**
     * Files relating to the handling of material
     * 
     */
    HANDLING,

    /**
     * File relating to equipment maintenance
     * 
     */
    MAINTENANCE,

    /**
     * Files relating to a part
     * 
     */
    PART,

    /**
     * Files related to the manufacturing process
     * 
     */
    PROCESS,

    /**
     * Files related to the quality inspection
     * 
     */
    INSPECTION,

    /**
     * Files related to the setup of a process
     * 
     */
    SETUP;

    public String value() {
        return name();
    }

    public static ApplicationCategoryEnum fromValue(String v) {
        return valueOf(v);
    }

}
