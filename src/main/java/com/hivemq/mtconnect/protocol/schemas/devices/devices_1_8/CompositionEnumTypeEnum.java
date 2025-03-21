//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8;

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
     * A mechanism for moving or controlling a mechanical part of a piece
     *             of equipment. It takes energy usually provided by air, electric
     *             current, or liquid and converts the energy into some kind of motion.
     * 
     */
    ACTUATOR,

    /**
     * An electronic component or circuit for amplifying power, electric
     *             current, or voltage.
     * 
     */
    AMPLIFIER,

    /**
     * A mechanical structure for transforming rotary motion into linear
     *             motion.
     * 
     */
    BALLSCREW,

    /**
     * An endless flexible band used to transmit motion for a piece of
     *             equipment or to convey materials and objects.
     * 
     */
    BELT,

    /**
     * A mechanism for slowing or stopping a moving object by the
     *             absorption or transfer of the energy of momentum, usually by means
     *             of friction, electrical force, or magnetic force.
     * 
     */
    BRAKE,

    /**
     * An interconnected series of objects that band together and are used
     *             to transmit motion for a piece of equipment or to convey materials
     *             and objects.
     * 
     */
    CHAIN,

    /**
     * A mechanism used to break material into smaller pieces.
     * 
     */
    CHOPPER,

    /**
     * A mechanism that holds a part, stock material, or any other item in
     *             place.
     * 
     */
    CHUCK,

    /**
     * An inclined channel for conveying material.
     * 
     */
    CHUTE,

    /**
     * A mechanism for interrupting an electric circuit.
     * 
     */
    CIRCUIT_BREAKER,

    /**
     * A mechanism used to strengthen, support, or fasten objects in place.
     * 
     */
    CLAMP,

    /**
     * A pump or other mechanism for reducing volume and increasing
     *             pressure of gases in order to condense the gases to drive
     *             pneumatically powered pieces of equipment.
     * 
     */
    COMPRESSOR,

    /**
     * A mechanical mechanism or closure that can cover a physical access
     *             portal into a piece of equipment allowing or restricting access to
     *             other parts of the equipment.
     * 
     */
    DOOR,

    /**
     * A mechanism that allows material to flow for the purpose of drainage
     *             from, for example, a vessel or tank.
     * 
     */
    DRAIN,

    /**
     * A mechanism used to measure rotary position.
     * 
     */
    ENCODER,

    /**
     * A mechanism for emitting a type of radiation
     * 
     */
    EXPOSURE_UNIT,

    /**
     * A mechanism for dispensing liquid or powered materials
     * 
     */
    EXTRUSION_UNIT,

    /**
     * Any mechanism for producing a current of air.
     * 
     */
    FAN,

    /**
     * Any substance or structure through which liquids or gases are passed
     *             to remove suspended impurities or to recover solids.
     * 
     */
    FILTER,

    /**
     * An electromechanical actuator that produces deflection of a beam of
     *             light or energy in response to electric current through its coil in
     *             a magnetic field.
     * 
     */
    GALVANOMOTOR,

    /**
     * A mechanism that holds a part, stock material, or any other item in
     *             place.
     * 
     */
    GRIPPER,

    /**
     * A chamber or bin in which materials are stored temporarily,
     *             typically being filled through the top and dispensed through the
     *             bottom.
     * 
     */
    HOPPER,

    /**
     * A mechanism that measures linear motion or position.
     * 
     */
    LINEAR_POSITION_FEEDBACK,

    /**
     * A mechanism that converts electrical, pneumatic, or hydraulic energy
     *             into mechanical energy.
     * 
     */
    MOTOR,

    /**
     * A viscous liquid.
     * 
     */
    OIL,

    /**
     * A unit that provides power to electric mechanisms.
     * 
     */
    POWER_SUPPLY,

    /**
     * A mechanism or wheel that turns in a frame or block and serves to
     *             change the direction of or to transmit force.
     * 
     */
    PULLEY,

    /**
     * An apparatus raising, driving, exhausting, or compressing fluids or
     *             gases by means of a piston, plunger, or set of rotating vanes.
     * 
     */
    PUMP,

    /**
     * A rotary storage unit for material
     * 
     */
    REEL,

    /**
     * A mechanism that provides a signal or measured value.
     * 
     */
    SENSING_ELEMENT,

    /**
     * A mechanism for flattening or spreading materials
     * 
     */
    SPREADER,

    /**
     * A component consisting of one or more cells, in which chemical
     *             energy is converted into electricity and used as a source of power.
     * 
     */
    STORAGE_BATTERY,

    /**
     * A mechanism for turning on or off an electric current or for making
     *             or breaking a circuit.
     * 
     */
    SWITCH,

    /**
     * A surface for holding an object or material
     * 
     */
    TABLE,

    /**
     * A receptacle or container for holding material.
     * 
     */
    TANK,

    /**
     * A mechanism that provides or applies a stretch or strain to another
     *             mechanism.
     * 
     */
    TENSIONER,

    /**
     * A mechanism that transforms electric energy from a source to a
     *             secondary circuit.
     * 
     */
    TRANSFORMER,

    /**
     * Any mechanism for halting or controlling the flow of a liquid, gas,
     *             or other material through a passage, pipe, inlet, or outlet.
     * 
     */
    VALVE,

    /**
     * A container for liquid or powdered materials
     * 
     */
    VAT,

    /**
     * A fluid.
     * 
     */
    WATER,

    /**
     * A string like piece or filament of relatively rigid or flexible
     *             material provided in a variety of diameters.
     * 
     */
    WIRE,

    /**
     * An object or material on which a form of work is performed.
     * 
     */
    WORKPIECE,

    /**
     * A heat exchange system that uses a fluid to transfer heat to the
     *             atmosphere.
     * 
     */
    COOLING_TOWER,

    /**
     * A tool storage location associated with a {{block(ToolMagazine)}} or
     *             {{block(AutomaticToolChanger)}}.
     * 
     */
    POT,

    /**
     * A storage or mounting location for a tool associated with a
     *             {{block(Turret)}}, {{block(GangToolBar)}}, or {{block(ToolRack)}}.
     * 
     */
    STATION,

    /**
     * A mechanism for physically moving a tool from one location to
     *             another.
     * 
     */
    TRANSFER_ARM,

    /**
     * A {{block(Pot)}} for a tool awaiting transfer from a
     *             {{block(ToolMagazine)}} to {{term(Spindle)}} or {{block(Turret)}}.
     * 
     */
    TRANSFER_POT,

    /**
     * A {{block(Pot)}} for a tool removed from {{term(Spindle)}} or
     *             {{block(Turret)}} and awaiting for return to a
     *             {{block(ToolMagazine)}}.
     * 
     */
    RETURN_POT,

    /**
     * A {{block(Pot)}} for a tool awaiting transfer to a
     *             {{block(ToolMagazine)}} or {{block(Turret)}} from outside of the
     *             piece of equipment.
     * 
     */
    STAGING_POT,

    /**
     * A {{block(Pot)}} for a tool to be removed from a
     *             {{block(ToolMagazine)}} or {{block(Turret)}} to a location outside
     *             of the piece of equipment.
     * 
     */
    REMOVAL_POT,

    /**
     * A {{block(Pot)}} for a tool that is no longer useable for removal
     *             from a {{block(ToolMagazine)}} or {{block(Turret)}}.
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
