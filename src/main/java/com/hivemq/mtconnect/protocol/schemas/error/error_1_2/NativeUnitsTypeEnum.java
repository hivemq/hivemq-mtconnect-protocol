//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The units supported for the source equipment that can be converted into
 *         MTC Units.
 * 
 * <p>Java class for NativeUnitsTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NativeUnitsTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMPERE"/>
 *     <enumeration value="CELSIUS"/>
 *     <enumeration value="COUNT"/>
 *     <enumeration value="DEGREE"/>
 *     <enumeration value="DEGREE/SECOND"/>
 *     <enumeration value="DEGREE/SECOND^2"/>
 *     <enumeration value="HERTZ"/>
 *     <enumeration value="JOULE"/>
 *     <enumeration value="KILOGRAM"/>
 *     <enumeration value="LITER"/>
 *     <enumeration value="LITER/SECOND"/>
 *     <enumeration value="MILLIMETER"/>
 *     <enumeration value="MILLIMETER/SECOND"/>
 *     <enumeration value="MILLIMETER/SECOND^2"/>
 *     <enumeration value="MILLIMETER_3D"/>
 *     <enumeration value="NEWTON"/>
 *     <enumeration value="NEWTON_METER"/>
 *     <enumeration value="PASCAL"/>
 *     <enumeration value="PERCENT"/>
 *     <enumeration value="PH"/>
 *     <enumeration value="REVOLUTION/MINUTE"/>
 *     <enumeration value="SECOND"/>
 *     <enumeration value="VOLT"/>
 *     <enumeration value="WATT"/>
 *     <enumeration value="OHM"/>
 *     <enumeration value="SOUND_LEVEL"/>
 *     <enumeration value="SIEMENS/METER"/>
 *     <enumeration value="MICRO_RADIAN"/>
 *     <enumeration value="PASCAL_SECOND"/>
 *     <enumeration value="VOLT_AMPERE"/>
 *     <enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     <enumeration value="WATT_SECOND"/>
 *     <enumeration value="DECIBEL"/>
 *     <enumeration value="CENTIPOISE"/>
 *     <enumeration value="DEGREE/MINUTE"/>
 *     <enumeration value="FAHRENHEIT"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="FOOT/MINUTE"/>
 *     <enumeration value="FOOT/SECOND"/>
 *     <enumeration value="FOOT/SECOND^2"/>
 *     <enumeration value="FOOT_3D"/>
 *     <enumeration value="GALLON/MINUTE"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="INCH/MINUTE"/>
 *     <enumeration value="INCH/SECOND"/>
 *     <enumeration value="INCH/SECOND^2"/>
 *     <enumeration value="INCH_3D"/>
 *     <enumeration value="KILOWATT"/>
 *     <enumeration value="KILOWATT_HOUR"/>
 *     <enumeration value="MILLIMETER/MINUTE"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="POUND"/>
 *     <enumeration value="POUND/INCH^2"/>
 *     <enumeration value="RADIAN"/>
 *     <enumeration value="RADIAN/MINUTE"/>
 *     <enumeration value="RADIAN/SECOND"/>
 *     <enumeration value="RADIAN/SECOND^2"/>
 *     <enumeration value="REVOLUTION/SECOND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "NativeUnitsTypeEnum")
@XmlType(name = "NativeUnitsTypeEnum")
@XmlEnum
public enum NativeUnitsTypeEnum {

    AMPERE("AMPERE"),
    CELSIUS("CELSIUS"),
    COUNT("COUNT"),
    DEGREE("DEGREE"),
    @XmlEnumValue("DEGREE/SECOND")
    DEGREE_SECOND("DEGREE/SECOND"),
    @XmlEnumValue("DEGREE/SECOND^2")
    DEGREE_SECOND_2("DEGREE/SECOND^2"),
    HERTZ("HERTZ"),
    JOULE("JOULE"),
    KILOGRAM("KILOGRAM"),
    LITER("LITER"),
    @XmlEnumValue("LITER/SECOND")
    LITER_SECOND("LITER/SECOND"),
    MILLIMETER("MILLIMETER"),
    @XmlEnumValue("MILLIMETER/SECOND")
    MILLIMETER_SECOND("MILLIMETER/SECOND"),
    @XmlEnumValue("MILLIMETER/SECOND^2")
    MILLIMETER_SECOND_2("MILLIMETER/SECOND^2"),
    @XmlEnumValue("MILLIMETER_3D")
    MILLIMETER_3_D("MILLIMETER_3D"),
    NEWTON("NEWTON"),
    NEWTON_METER("NEWTON_METER"),
    PASCAL("PASCAL"),
    PERCENT("PERCENT"),
    PH("PH"),
    @XmlEnumValue("REVOLUTION/MINUTE")
    REVOLUTION_MINUTE("REVOLUTION/MINUTE"),
    SECOND("SECOND"),
    VOLT("VOLT"),
    WATT("WATT"),
    OHM("OHM"),
    SOUND_LEVEL("SOUND_LEVEL"),
    @XmlEnumValue("SIEMENS/METER")
    SIEMENS_METER("SIEMENS/METER"),
    MICRO_RADIAN("MICRO_RADIAN"),
    PASCAL_SECOND("PASCAL_SECOND"),
    VOLT_AMPERE("VOLT_AMPERE"),
    VOLT_AMPERE_REACTIVE("VOLT_AMPERE_REACTIVE"),
    WATT_SECOND("WATT_SECOND"),
    DECIBEL("DECIBEL"),
    CENTIPOISE("CENTIPOISE"),
    @XmlEnumValue("DEGREE/MINUTE")
    DEGREE_MINUTE("DEGREE/MINUTE"),
    FAHRENHEIT("FAHRENHEIT"),
    FOOT("FOOT"),
    @XmlEnumValue("FOOT/MINUTE")
    FOOT_MINUTE("FOOT/MINUTE"),
    @XmlEnumValue("FOOT/SECOND")
    FOOT_SECOND("FOOT/SECOND"),
    @XmlEnumValue("FOOT/SECOND^2")
    FOOT_SECOND_2("FOOT/SECOND^2"),
    @XmlEnumValue("FOOT_3D")
    FOOT_3_D("FOOT_3D"),
    @XmlEnumValue("GALLON/MINUTE")
    GALLON_MINUTE("GALLON/MINUTE"),
    INCH("INCH"),
    @XmlEnumValue("INCH/MINUTE")
    INCH_MINUTE("INCH/MINUTE"),
    @XmlEnumValue("INCH/SECOND")
    INCH_SECOND("INCH/SECOND"),
    @XmlEnumValue("INCH/SECOND^2")
    INCH_SECOND_2("INCH/SECOND^2"),
    @XmlEnumValue("INCH_3D")
    INCH_3_D("INCH_3D"),
    KILOWATT("KILOWATT"),
    KILOWATT_HOUR("KILOWATT_HOUR"),
    @XmlEnumValue("MILLIMETER/MINUTE")
    MILLIMETER_MINUTE("MILLIMETER/MINUTE"),
    OTHER("OTHER"),
    POUND("POUND"),
    @XmlEnumValue("POUND/INCH^2")
    POUND_INCH_2("POUND/INCH^2"),
    RADIAN("RADIAN"),
    @XmlEnumValue("RADIAN/MINUTE")
    RADIAN_MINUTE("RADIAN/MINUTE"),
    @XmlEnumValue("RADIAN/SECOND")
    RADIAN_SECOND("RADIAN/SECOND"),
    @XmlEnumValue("RADIAN/SECOND^2")
    RADIAN_SECOND_2("RADIAN/SECOND^2"),
    @XmlEnumValue("REVOLUTION/SECOND")
    REVOLUTION_SECOND("REVOLUTION/SECOND");
    private final String value;

    NativeUnitsTypeEnum(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static NativeUnitsTypeEnum fromValue(String v) {
        for (NativeUnitsTypeEnum c: NativeUnitsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
