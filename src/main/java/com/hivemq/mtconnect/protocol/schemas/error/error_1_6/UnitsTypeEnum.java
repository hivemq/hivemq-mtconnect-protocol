//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The unit of measurement for the reported value of the data item.
 * 
 * <p>Java class for UnitsTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UnitsTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PH"/>
 *     <enumeration value="VOLT_AMPERE"/>
 *     <enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     <enumeration value="AMPERE"/>
 *     <enumeration value="CELSIUS"/>
 *     <enumeration value="COUNT"/>
 *     <enumeration value="DECIBEL"/>
 *     <enumeration value="DEGREE"/>
 *     <enumeration value="DEGREE/SECOND"/>
 *     <enumeration value="DEGREE/SECOND^2"/>
 *     <enumeration value="HERTZ"/>
 *     <enumeration value="JOULE"/>
 *     <enumeration value="KILOGRAM"/>
 *     <enumeration value="LITER/SECOND"/>
 *     <enumeration value="MICRO_RADIAN"/>
 *     <enumeration value="MILLIMETER"/>
 *     <enumeration value="MILLIMETER/SECOND"/>
 *     <enumeration value="MILLIMETER/SECOND^2"/>
 *     <enumeration value="MILLIMETER_3D"/>
 *     <enumeration value="NEWTON"/>
 *     <enumeration value="NEWTON_METER"/>
 *     <enumeration value="OHM"/>
 *     <enumeration value="PASCAL"/>
 *     <enumeration value="PASCAL_SECOND"/>
 *     <enumeration value="PERCENT"/>
 *     <enumeration value="REVOLUTION/MINUTE"/>
 *     <enumeration value="SECOND"/>
 *     <enumeration value="SIEMENS/METER"/>
 *     <enumeration value="VOLT"/>
 *     <enumeration value="WATT"/>
 *     <enumeration value="WATT_SECOND"/>
 *     <enumeration value="LITER"/>
 *     <enumeration value="CUBIC_MILLIMETER"/>
 *     <enumeration value="CUBIC_MILLIMETER/SECOND"/>
 *     <enumeration value="CUBIC_MILLIMETER/SECOND^2"/>
 *     <enumeration value="MILLIGRAM/CUBIC_MILLIMETER"/>
 *     <enumeration value="MILLIMETER/REVOLUTION"/>
 *     <enumeration value="DEGREE_3D"/>
 *     <enumeration value="GRAM/CUBIC_METER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "UnitsTypeEnum")
@XmlType(name = "UnitsTypeEnum")
@XmlEnum
public enum UnitsTypeEnum {


    /**
     * A measure of the acidity or alkalinity of a solution.
     * 
     */
    PH("PH"),

    /**
     * The measurement of the apparent power in an electrical circuit,
     *             equal to the product of root-mean-square (RMS) voltage and RMS
     *             current (commonly referred to as VA).
     * 
     */
    VOLT_AMPERE("VOLT_AMPERE"),

    /**
     * The measurement of reactive power in an AC electrical circuit
     *             (commonly referred to as VAR).
     * 
     */
    VOLT_AMPERE_REACTIVE("VOLT_AMPERE_REACTIVE"),

    /**
     * Amps
     * 
     */
    AMPERE("AMPERE"),

    /**
     * Degrees Celsius
     * 
     */
    CELSIUS("CELSIUS"),

    /**
     * A count of something.
     * 
     */
    COUNT("COUNT"),

    /**
     * Sound Level
     * 
     */
    DECIBEL("DECIBEL"),

    /**
     * Angle in degrees
     * 
     */
    DEGREE("DEGREE"),

    /**
     * Angular degrees per second
     * 
     */
    @XmlEnumValue("DEGREE/SECOND")
    DEGREE_SECOND("DEGREE/SECOND"),

    /**
     * Angular acceleration in degrees per second squared
     * 
     */
    @XmlEnumValue("DEGREE/SECOND^2")
    DEGREE_SECOND_2("DEGREE/SECOND^2"),

    /**
     * Frequency measured in cycles per second
     * 
     */
    HERTZ("HERTZ"),

    /**
     * A measurement of energy.
     * 
     */
    JOULE("JOULE"),

    /**
     * Kilograms
     * 
     */
    KILOGRAM("KILOGRAM"),

    /**
     * Liters per second
     * 
     */
    @XmlEnumValue("LITER/SECOND")
    LITER_SECOND("LITER/SECOND"),

    /**
     * Measurement of Tilt
     * 
     */
    MICRO_RADIAN("MICRO_RADIAN"),

    /**
     * Millimeters
     * 
     */
    MILLIMETER("MILLIMETER"),

    /**
     * Millimeters per second
     * 
     */
    @XmlEnumValue("MILLIMETER/SECOND")
    MILLIMETER_SECOND("MILLIMETER/SECOND"),

    /**
     * Acceleration in millimeters per second squared
     * 
     */
    @XmlEnumValue("MILLIMETER/SECOND^2")
    MILLIMETER_SECOND_2("MILLIMETER/SECOND^2"),

    /**
     * A point in space identified by X, Y, and Z positions and represented
     *             by a space-delimited set of numbers each expressed in millimeters.
     * 
     */
    @XmlEnumValue("MILLIMETER_3D")
    MILLIMETER_3_D("MILLIMETER_3D"),

    /**
     * Force in Newtons
     * 
     */
    NEWTON("NEWTON"),

    /**
     * Torque, a unit for force times distance.
     * 
     */
    NEWTON_METER("NEWTON_METER"),

    /**
     * Measure of Electrical Resistance
     * 
     */
    OHM("OHM"),

    /**
     * Pressure in Newtons per square meter
     * 
     */
    PASCAL("PASCAL"),

    /**
     * Measurement of Viscosity
     * 
     */
    PASCAL_SECOND("PASCAL_SECOND"),

    /**
     * Percentage
     * 
     */
    PERCENT("PERCENT"),

    /**
     * Revolutions per minute
     * 
     */
    @XmlEnumValue("REVOLUTION/MINUTE")
    REVOLUTION_MINUTE("REVOLUTION/MINUTE"),

    /**
     * A measurement of time.
     * 
     */
    SECOND("SECOND"),

    /**
     * A measurement of Electrical Conductivity
     * 
     */
    @XmlEnumValue("SIEMENS/METER")
    SIEMENS_METER("SIEMENS/METER"),

    /**
     * Volts
     * 
     */
    VOLT("VOLT"),

    /**
     * Watts
     * 
     */
    WATT("WATT"),

    /**
     * Measurement of electrical energy, equal to one Joule
     * 
     */
    WATT_SECOND("WATT_SECOND"),

    /**
     * Measurement of volume of a fluid
     * 
     */
    LITER("LITER"),

    /**
     * Geometric volume in millimeters
     * 
     */
    CUBIC_MILLIMETER("CUBIC_MILLIMETER"),

    /**
     * Change of geometric volume per second
     * 
     */
    @XmlEnumValue("CUBIC_MILLIMETER/SECOND")
    CUBIC_MILLIMETER_SECOND("CUBIC_MILLIMETER/SECOND"),

    /**
     * Change in geometric volume per second squared
     * 
     */
    @XmlEnumValue("CUBIC_MILLIMETER/SECOND^2")
    CUBIC_MILLIMETER_SECOND_2("CUBIC_MILLIMETER/SECOND^2"),

    /**
     * Milligram per cubic millimeter
     * 
     */
    @XmlEnumValue("MILLIGRAM/CUBIC_MILLIMETER")
    MILLIGRAM_CUBIC_MILLIMETER("MILLIGRAM/CUBIC_MILLIMETER"),

    /**
     * Millimeters per revolution.
     * 
     */
    @XmlEnumValue("MILLIMETER/REVOLUTION")
    MILLIMETER_REVOLUTION("MILLIMETER/REVOLUTION"),

    /**
     * A space-delimited, floating-point representation of the angular
     *             rotation in degrees around the X, Y, and Z axes relative to a
     *             cartesian coordinate system respectively in order as A, B, and C. If
     *             any of the rotations is not known, it MUST be zero (0).
     * 
     */
    @XmlEnumValue("DEGREE_3D")
    DEGREE_3_D("DEGREE_3D"),

    /**
     * Gram per cubic meter.
     * 
     */
    @XmlEnumValue("GRAM/CUBIC_METER")
    GRAM_CUBIC_METER("GRAM/CUBIC_METER");
    private final String value;

    UnitsTypeEnum(String v) {
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
    public static UnitsTypeEnum fromValue(String v) {
        for (UnitsTypeEnum c: UnitsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
