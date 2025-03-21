//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The native units of measurement for the reported value of the data item.
 * 
 * <p>Java class for NativeUnitsTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NativeUnitsTypeEnum">
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
 *     <enumeration value="INCH_POUND"/>
 *     <enumeration value="KELVIN"/>
 *     <enumeration value="KILOWATT"/>
 *     <enumeration value="KILOWATT_HOUR"/>
 *     <enumeration value="LITER"/>
 *     <enumeration value="LITER/MINUTE"/>
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
    GRAM_CUBIC_METER("GRAM/CUBIC_METER"),

    /**
     * A measure of Viscosity
     * 
     */
    CENTIPOISE("CENTIPOISE"),

    /**
     * Rotational velocity in degrees per minute
     * 
     */
    @XmlEnumValue("DEGREE/MINUTE")
    DEGREE_MINUTE("DEGREE/MINUTE"),

    /**
     * Temperature in Fahrenheit
     * 
     */
    FAHRENHEIT("FAHRENHEIT"),

    /**
     * Feet
     * 
     */
    FOOT("FOOT"),

    /**
     * Feet per minute
     * 
     */
    @XmlEnumValue("FOOT/MINUTE")
    FOOT_MINUTE("FOOT/MINUTE"),

    /**
     * Feet per second
     * 
     */
    @XmlEnumValue("FOOT/SECOND")
    FOOT_SECOND("FOOT/SECOND"),

    /**
     * Acceleration in feet per second squared
     * 
     */
    @XmlEnumValue("FOOT/SECOND^2")
    FOOT_SECOND_2("FOOT/SECOND^2"),

    /**
     * A point in space identified by X, Y, and Z positions and represented
     *             by a space-delimited set of numbers each expressed in feet.
     * 
     */
    @XmlEnumValue("FOOT_3D")
    FOOT_3_D("FOOT_3D"),

    /**
     * Gallons per minute.
     * 
     */
    @XmlEnumValue("GALLON/MINUTE")
    GALLON_MINUTE("GALLON/MINUTE"),

    /**
     * Inches
     * 
     */
    INCH("INCH"),

    /**
     * Inches per minute
     * 
     */
    @XmlEnumValue("INCH/MINUTE")
    INCH_MINUTE("INCH/MINUTE"),

    /**
     * Inches per second
     * 
     */
    @XmlEnumValue("INCH/SECOND")
    INCH_SECOND("INCH/SECOND"),

    /**
     * Acceleration in inches per second squared
     * 
     */
    @XmlEnumValue("INCH/SECOND^2")
    INCH_SECOND_2("INCH/SECOND^2"),

    /**
     * A point in space identified by X, Y, and Z positions and represented
     *             by a space-delimited set of numbers each expressed in inches.
     * 
     */
    @XmlEnumValue("INCH_3D")
    INCH_3_D("INCH_3D"),

    /**
     * A measure of torque in inch pounds.
     * 
     */
    INCH_POUND("INCH_POUND"),

    /**
     * A measurement of temperature
     * 
     */
    KELVIN("KELVIN"),

    /**
     * A measurement in kilowatt.
     * 
     */
    KILOWATT("KILOWATT"),

    /**
     * Kilowatt hours which is 3.6 mega joules.
     * 
     */
    KILOWATT_HOUR("KILOWATT_HOUR"),

    /**
     * Measurement of rate of flow of a fluid
     * 
     */
    @XmlEnumValue("LITER/MINUTE")
    LITER_MINUTE("LITER/MINUTE"),

    /**
     * Velocity in millimeters per minute
     * 
     */
    @XmlEnumValue("MILLIMETER/MINUTE")
    MILLIMETER_MINUTE("MILLIMETER/MINUTE"),

    /**
     * Unsupported units
     * 
     */
    OTHER("OTHER"),

    /**
     * US pounds
     * 
     */
    POUND("POUND"),

    /**
     * Pressure in pounds per square inch (PSI).
     * 
     */
    @XmlEnumValue("POUND/INCH^2")
    POUND_INCH_2("POUND/INCH^2"),

    /**
     * Angle in radians
     * 
     */
    RADIAN("RADIAN"),

    /**
     * Velocity in radians per minute.
     * 
     */
    @XmlEnumValue("RADIAN/MINUTE")
    RADIAN_MINUTE("RADIAN/MINUTE"),

    /**
     * Velocity in radians per second
     * 
     */
    @XmlEnumValue("RADIAN/SECOND")
    RADIAN_SECOND("RADIAN/SECOND"),

    /**
     * Rotational acceleration in radian per second squared
     * 
     */
    @XmlEnumValue("RADIAN/SECOND^2")
    RADIAN_SECOND_2("RADIAN/SECOND^2"),

    /**
     * Rotational velocity in revolution per second
     * 
     */
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
