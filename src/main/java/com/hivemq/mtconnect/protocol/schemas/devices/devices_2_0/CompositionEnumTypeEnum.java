//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The vocab for the type of composition
 * 
 * <p>Java class for CompositionEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CompositionEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTUATOR"/>
 *     <enumeration value="AMPLIFIER"/>
 *     <enumeration value="BALLSCREW"/>
 *     <enumeration value="BELT"/>
 *     <enumeration value="BRAKE"/>
 *     <enumeration value="CHAIN"/>
 *     <enumeration value="CHOPPER"/>
 *     <enumeration value="CHUCK"/>
 *     <enumeration value="CHUTE"/>
 *     <enumeration value="CIRCUIT_BREAKER"/>
 *     <enumeration value="CLAMP"/>
 *     <enumeration value="COMPRESSOR"/>
 *     <enumeration value="DOOR"/>
 *     <enumeration value="DRAIN"/>
 *     <enumeration value="ENCODER"/>
 *     <enumeration value="EXPOSURE_UNIT"/>
 *     <enumeration value="EXTRUSION_UNIT"/>
 *     <enumeration value="FAN"/>
 *     <enumeration value="FILTER"/>
 *     <enumeration value="GALVANOMOTOR"/>
 *     <enumeration value="GRIPPER"/>
 *     <enumeration value="HOPPER"/>
 *     <enumeration value="LINEAR_POSITION_FEEDBACK"/>
 *     <enumeration value="MOTOR"/>
 *     <enumeration value="OIL"/>
 *     <enumeration value="POWER_SUPPLY"/>
 *     <enumeration value="PULLEY"/>
 *     <enumeration value="PUMP"/>
 *     <enumeration value="REEL"/>
 *     <enumeration value="SENSING_ELEMENT"/>
 *     <enumeration value="SPREADER"/>
 *     <enumeration value="STORAGE_BATTERY"/>
 *     <enumeration value="SWITCH"/>
 *     <enumeration value="TABLE"/>
 *     <enumeration value="TANK"/>
 *     <enumeration value="TENSIONER"/>
 *     <enumeration value="TRANSFORMER"/>
 *     <enumeration value="VALVE"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="WATER"/>
 *     <enumeration value="WIRE"/>
 *     <enumeration value="WORKPIECE"/>
 *     <enumeration value="COOLING_TOWER"/>
 *     <enumeration value="POT"/>
 *     <enumeration value="STATION"/>
 *     <enumeration value="TRANSFER_ARM"/>
 *     <enumeration value="TRANSFER_POT"/>
 *     <enumeration value="RETURN_POT"/>
 *     <enumeration value="STAGING_POT"/>
 *     <enumeration value="REMOVAL_POT"/>
 *     <enumeration value="EXPIRED_POT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "CompositionEnumTypeEnum")
@XmlType(name = "CompositionEnumTypeEnum")
@XmlEnum
public enum CompositionEnumTypeEnum {


    /**
     * {{block(Composition)}} composed of a mechanism that moves or
     *             controls a mechanical part of a piece of equipment. It takes energy
     *             usually provided by air, electric current, or liquid and converts
     *             the energy into some kind of motion.
     * 
     */
    ACTUATOR,

    /**
     * {{block(Composition)}} composed of an electronic component or
     *             circuit that amplifies power, electric current, or voltage.
     * 
     */
    AMPLIFIER,

    /**
     * {{block(Composition)}} composed of a mechanical structure that
     *             transforms rotary motion into linear motion.
     * 
     */
    BALLSCREW,

    /**
     * {{block(Composition)}} composed of an endless flexible band that
     *             transmits motion for a piece of equipment or conveys materials and
     *             objects.
     * 
     */
    BELT,

    /**
     * {{block(Composition)}} composed of a mechanism that slows down or
     *             stops a moving object by the absorption or transfer of the energy of
     *             momentum, usually by means of friction, electrical force, or
     *             magnetic force.
     * 
     */
    BRAKE,

    /**
     * {{block(Composition)}} composed of an interconnected series of
     *             objects that band together and transmit motion for a piece of
     *             equipment or to convey materials and objects.
     * 
     */
    CHAIN,

    /**
     * {{block(Composition)}} composed of a mechanism that breaks material
     *             into smaller pieces.
     * 
     */
    CHOPPER,

    /**
     * {{block(Composition)}} composed of a mechanism that holds a part,
     *             stock material, or any other item in place.
     * 
     */
    CHUCK,

    /**
     * {{block(Composition)}} composed of an inclined channel that conveys
     *             material.
     * 
     */
    CHUTE,

    /**
     * {{block(Composition)}} composed of a mechanism that interrupts an
     *             electric circuit.
     * 
     */
    CIRCUIT_BREAKER,

    /**
     * {{block(Composition)}} composed of a mechanism that strengthens,
     *             supports, or fastens objects in place.
     * 
     */
    CLAMP,

    /**
     * {{block(Composition)}} composed of a pump or other mechanism that
     *             reduces volume and increases pressure of gases in order to condense
     *             the gases to drive pneumatically powered pieces of equipment.
     * 
     */
    COMPRESSOR,

    /**
     * {{block(Composition)}} composed of a mechanical mechanism or closure
     *             that covers a physical access portal into a piece of equipment
     *             allowing or restricting access to other parts of the equipment.
     * 
     */
    DOOR,

    /**
     * {{block(Composition)}} composed of a mechanism that allows material
     *             to flow for the purpose of drainage from, for example, a vessel or
     *             tank.
     * 
     */
    DRAIN,

    /**
     * {{block(Composition)}} composed of a mechanism that measures rotary
     *             position.
     * 
     */
    ENCODER,

    /**
     * {{block(Composition)}} composed of a mechanism that emits a type of
     *             radiation.
     * 
     */
    EXPOSURE_UNIT,

    /**
     * {{block(Composition)}} composed of a mechanism that dispenses liquid
     *             or powered materials.
     * 
     */
    EXTRUSION_UNIT,

    /**
     * {{block(Composition)}} composed of a mechanism that produces a
     *             current of air.
     * 
     */
    FAN,

    /**
     * {{block(Composition)}} composed of a substance or structure that
     *             allows liquids or gases to pass through to remove suspended
     *             impurities or to recover solids.
     * 
     */
    FILTER,

    /**
     * {{block(Composition)}} composed of an electromechanical actuator
     *             that produces deflection of a beam of light or energy in response to
     *             electric current through its coil in a magnetic field.
     * 
     */
    GALVANOMOTOR,

    /**
     * {{block(Composition)}} composed of a mechanism that holds a part,
     *             stock material, or any other item in place.
     * 
     */
    GRIPPER,

    /**
     * {{block(Composition)}} composed of a chamber or bin that stores
     *             materials temporarily, typically being filled through the top and
     *             dispensed through the bottom.
     * 
     */
    HOPPER,

    /**
     * {{block(Composition)}} composed of a mechanism that measures linear
     *             motion or position.
     * 
     */
    LINEAR_POSITION_FEEDBACK,

    /**
     * {{block(Composition)}} composed of a mechanism that converts
     *             electrical, pneumatic, or hydraulic energy into mechanical energy.
     * 
     */
    MOTOR,

    /**
     * {{block(Composition)}} composed of a viscous liquid.
     * 
     */
    OIL,

    /**
     * {{block(Composition)}} composed of a unit that provides power to
     *             electric mechanisms.
     * 
     */
    POWER_SUPPLY,

    /**
     * {{block(Composition)}} composed of a mechanism or wheel that turns
     *             in a frame or block and serves to change the direction of or to
     *             transmit force.
     * 
     */
    PULLEY,

    /**
     * {{block(Composition)}} composed of an apparatus that raises, drives,
     *             exhausts, or compresses fluids or gases by means of a piston,
     *             plunger, or set of rotating vanes.
     * 
     */
    PUMP,

    /**
     * {{block(Composition)}} composed of a rotary storage unit for
     *             material.
     * 
     */
    REEL,

    /**
     * {{block(Composition)}} composed of a mechanism that provides a
     *             signal or measured value.
     * 
     */
    SENSING_ELEMENT,

    /**
     * {{block(Composition)}} composed of a mechanism that flattens or
     *             spreads materials.
     * 
     */
    SPREADER,

    /**
     * {{block(Composition)}} composed of one or more cells that converts
     *             chemical energy to electricity and serves as a source of power.
     * 
     */
    STORAGE_BATTERY,

    /**
     * {{block(Composition)}} composed of a mechanism that turns on or off
     *             an electric current or makes or breaks a circuit.
     * 
     */
    SWITCH,

    /**
     * {{block(Composition)}} composed of a surface that holds an object or
     *             material.
     * 
     */
    TABLE,

    /**
     * {{block(Composition)}} composed of a receptacle or container that
     *             holds material.
     * 
     */
    TANK,

    /**
     * {{block(Composition)}} composed of a mechanism that provides or
     *             applies a stretch or strain to another mechanism.
     * 
     */
    TENSIONER,

    /**
     * {{block(Composition)}} composed of a mechanism that transforms
     *             electric energy from a source to a secondary circuit.
     * 
     */
    TRANSFORMER,

    /**
     * {{block(Composition)}} composed of a mechanism that halts or
     *             controls the flow of a liquid, gas, or other material through a
     *             passage, pipe, inlet, or outlet.
     * 
     */
    VALVE,

    /**
     * {{block(Composition)}} composed of a container for liquid or
     *             powdered materials.
     * 
     */
    VAT,

    /**
     * {{block(Composition)}} composed of a fluid.
     * 
     */
    WATER,

    /**
     * {{block(Composition)}} composed of a string like piece or filament
     *             of relatively rigid or flexible material provided in a variety of
     *             diameters.
     * 
     */
    WIRE,

    /**
     * {{block(Composition)}} composed of an object or material on which a
     *             form of work is performed.
     * 
     */
    WORKPIECE,

    /**
     * {{block(Composition)}} composed of a heat exchange system that uses
     *             a fluid to transfer heat to the atmosphere.
     * 
     */
    COOLING_TOWER,

    /**
     * {{block(Composition)}} composed of a tool storage location
     *             associated with a {{block(ToolMagazine)}} or
     *             {{block(AutomaticToolChanger)}}.
     * 
     */
    POT,

    /**
     * {{block(Composition)}} composed of a storage or mounting location
     *             for a tool associated with a {{block(Turret)}},
     *             {{block(GangToolBar)}}, or {{block(ToolRack)}}.
     * 
     */
    STATION,

    /**
     * {{block(Composition)}} composed of a mechanism that physically moves
     *             a tool from one location to another.
     * 
     */
    TRANSFER_ARM,

    /**
     * {{block(Pot)}} for a tool awaiting transfer from a
     *             {{block(ToolMagazine)}} to {{term(spindle)}} or {{block(Turret)}}.
     * 
     */
    TRANSFER_POT,

    /**
     * {{block(Pot)}} for a tool removed from {{term(spindle)}} or
     *             {{block(Turret)}} and awaiting for return to a
     *             {{block(ToolMagazine)}}.
     * 
     */
    RETURN_POT,

    /**
     * {{block(Pot)}} for a tool awaiting transfer to a
     *             {{block(ToolMagazine)}} or {{block(Turret)}} from outside of the
     *             piece of equipment.
     * 
     */
    STAGING_POT,

    /**
     * {{block(Pot)}} for a tool to be removed from a
     *             {{block(ToolMagazine)}} or {{block(Turret)}} to a location outside
     *             of the piece of equipment.
     * 
     */
    REMOVAL_POT,

    /**
     * {{block(Pot)}} for a tool that is no longer usable for removal from
     *             a {{block(ToolMagazine)}} or {{block(Turret)}}.
     * 
     */
    EXPIRED_POT;

    public String value() {
        return name();
    }

    public static CompositionEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
