//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The types of measurements available
 * 
 * <p>Java class for DataItemEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTUATOR"/>
 *     <enumeration value="ACCELERATION"/>
 *     <enumeration value="ACCUMULATED_TIME"/>
 *     <enumeration value="AMPERAGE"/>
 *     <enumeration value="ANGLE"/>
 *     <enumeration value="ANGULAR_ACCELERATION"/>
 *     <enumeration value="ANGULAR_VELOCITY"/>
 *     <enumeration value="AXIS_FEEDRATE"/>
 *     <enumeration value="CLOCK_TIME"/>
 *     <enumeration value="CONCENTRATION"/>
 *     <enumeration value="CONDUCTIVITY"/>
 *     <enumeration value="DISPLACEMENT"/>
 *     <enumeration value="ELECTRICAL_ENERGY"/>
 *     <enumeration value="EQUIPMENT_TIMER"/>
 *     <enumeration value="FILL_LEVEL"/>
 *     <enumeration value="FLOW"/>
 *     <enumeration value="FREQUENCY"/>
 *     <enumeration value="GLOBAL_POSITION"/>
 *     <enumeration value="LENGTH"/>
 *     <enumeration value="LEVEL"/>
 *     <enumeration value="LINEAR_FORCE"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="MASS"/>
 *     <enumeration value="PATH_FEEDRATE"/>
 *     <enumeration value="PATH_POSITION"/>
 *     <enumeration value="PH"/>
 *     <enumeration value="POSITION"/>
 *     <enumeration value="POWER_FACTOR"/>
 *     <enumeration value="PRESSURE"/>
 *     <enumeration value="PROCESS_TIMER"/>
 *     <enumeration value="RESISTANCE"/>
 *     <enumeration value="ROTARY_VELOCITY"/>
 *     <enumeration value="SOUND_LEVEL"/>
 *     <enumeration value="SPINDLE_SPEED"/>
 *     <enumeration value="STRAIN"/>
 *     <enumeration value="TEMPERATURE"/>
 *     <enumeration value="TENSION"/>
 *     <enumeration value="TILT"/>
 *     <enumeration value="TORQUE"/>
 *     <enumeration value="VELOCITY"/>
 *     <enumeration value="VISCOSITY"/>
 *     <enumeration value="VOLT_AMPERE"/>
 *     <enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     <enumeration value="VOLTAGE"/>
 *     <enumeration value="WATTAGE"/>
 *     <enumeration value="ACTIVE_AXES"/>
 *     <enumeration value="ACTUATOR_STATE"/>
 *     <enumeration value="ALARM"/>
 *     <enumeration value="AVAILABILITY"/>
 *     <enumeration value="AXIS_COUPLING"/>
 *     <enumeration value="AXIS_FEEDRATE_OVERRIDE"/>
 *     <enumeration value="AXIS_INTERLOCK"/>
 *     <enumeration value="AXIS_STATE"/>
 *     <enumeration value="BLOCK"/>
 *     <enumeration value="BLOCK_COUNT"/>
 *     <enumeration value="CHUCK_INTERLOCK"/>
 *     <enumeration value="CHUCK_STATE"/>
 *     <enumeration value="CODE"/>
 *     <enumeration value="COMPOSITION_STATE"/>
 *     <enumeration value="CONTROLLER_MODE"/>
 *     <enumeration value="CONTROLLER_MODE_OVERRIDE"/>
 *     <enumeration value="COUPLED_AXES"/>
 *     <enumeration value="DIRECTION"/>
 *     <enumeration value="DOOR_STATE"/>
 *     <enumeration value="EMERGENCY_STOP"/>
 *     <enumeration value="END_OF_BAR"/>
 *     <enumeration value="EQUIPMENT_MODE"/>
 *     <enumeration value="EXECUTION"/>
 *     <enumeration value="FUNCTIONAL_MODE"/>
 *     <enumeration value="HARDNESS"/>
 *     <enumeration value="INTERFACE_STATE"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="LINE_LABEL"/>
 *     <enumeration value="LINE_NUMBER"/>
 *     <enumeration value="MATERIAL"/>
 *     <enumeration value="MESSAGE"/>
 *     <enumeration value="OPERATOR_ID"/>
 *     <enumeration value="PALLET_ID"/>
 *     <enumeration value="PART_COUNT"/>
 *     <enumeration value="PART_ID"/>
 *     <enumeration value="PART_NUMBER"/>
 *     <enumeration value="PATH_FEEDRATE_OVERRIDE"/>
 *     <enumeration value="PATH_MODE"/>
 *     <enumeration value="POWER_STATE"/>
 *     <enumeration value="POWER_STATUS"/>
 *     <enumeration value="PROGRAM"/>
 *     <enumeration value="PROGRAM_COMMENT"/>
 *     <enumeration value="PROGRAM_EDIT"/>
 *     <enumeration value="PROGRAM_EDIT_NAME"/>
 *     <enumeration value="PROGRAM_HEADER"/>
 *     <enumeration value="ROTARY_MODE"/>
 *     <enumeration value="ROTARY_VELOCITY_OVERRIDE"/>
 *     <enumeration value="SERIAL_NUMBER"/>
 *     <enumeration value="SPINDLE_INTERLOCK"/>
 *     <enumeration value="TOOL_ASSET_ID"/>
 *     <enumeration value="TOOL_ID"/>
 *     <enumeration value="TOOL_NUMBER"/>
 *     <enumeration value="TOOL_OFFSET"/>
 *     <enumeration value="USER"/>
 *     <enumeration value="WIRE"/>
 *     <enumeration value="WORK_OFFSET"/>
 *     <enumeration value="WORKHOLDING_ID"/>
 *     <enumeration value="COMMUNICATIONS"/>
 *     <enumeration value="DATA_RANGE"/>
 *     <enumeration value="HARDWARE"/>
 *     <enumeration value="LOGIC_PROGRAM"/>
 *     <enumeration value="MOTION_PROGRAM"/>
 *     <enumeration value="SYSTEM"/>
 *     <enumeration value="ASSET_CHANGED"/>
 *     <enumeration value="ASSET_REMOVED"/>
 *     <enumeration value="OPEN_DOOR"/>
 *     <enumeration value="CLOSE_DOOR"/>
 *     <enumeration value="OPEN_CHUCK"/>
 *     <enumeration value="CLOSE_CHUCK"/>
 *     <enumeration value="MATERIAL_FEED"/>
 *     <enumeration value="MATERIAL_CHANGE"/>
 *     <enumeration value="MATERIAL_RETRACT"/>
 *     <enumeration value="PART_CHANGE"/>
 *     <enumeration value="MATERIAL_LOAD"/>
 *     <enumeration value="MATERIAL_UNLOAD"/>
 *     <enumeration value="VOLUME_SPATIAL"/>
 *     <enumeration value="VOLUME_FLUID"/>
 *     <enumeration value="CAPACITY_SPATIAL"/>
 *     <enumeration value="CAPACITY_FLUID"/>
 *     <enumeration value="DENSITY"/>
 *     <enumeration value="DEPOSITION_VOLUME"/>
 *     <enumeration value="DEPOSITION_RATE_VOLUMETRIC"/>
 *     <enumeration value="DEPOSITION_ACCELERATION_VOLUMETRIC"/>
 *     <enumeration value="DEPOSITION_MASS"/>
 *     <enumeration value="DEPOSITION_DENSITY"/>
 *     <enumeration value="PROCESS_TIME"/>
 *     <enumeration value="DATE_CODE"/>
 *     <enumeration value="MATERIAL_LAYER"/>
 *     <enumeration value="WAIT_STATE"/>
 *     <enumeration value="PART_DETECT"/>
 *     <enumeration value="DEVICE_UUID"/>
 *     <enumeration value="CUTTING_SPEED"/>
 *     <enumeration value="PATH_FEEDRATE_PER_REVOLUTION"/>
 *     <enumeration value="PROGRAM_NEST_LEVEL"/>
 *     <enumeration value="PROGRAM_LOCATION_TYPE"/>
 *     <enumeration value="PROGRAM_LOCATION"/>
 *     <enumeration value="TOOL_GROUP"/>
 *     <enumeration value="VARIABLE"/>
 *     <enumeration value="VARIABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemEnumTypeEnum")
@XmlType(name = "DataItemEnumTypeEnum")
@XmlEnum
public enum DataItemEnumTypeEnum {


    /**
     * A mechanism for moving or controlling a mechanical part of a piece
     *             of equipment. It takes energy usually provided by air, electric
     *             current, or liquid and converts the energy into some kind of motion.
     * 
     */
    ACTUATOR,

    /**
     * The measurement of the rate of change of velocity.
     * 
     */
    ACCELERATION,

    /**
     * The measurement of accumulated time for an activity or event.
     * 
     */
    ACCUMULATED_TIME,

    /**
     * The measurement of electrical current.
     * 
     */
    AMPERAGE,

    /**
     * The measurement of angular position.
     * 
     */
    ANGLE,

    /**
     * The measurement rate of change of angular velocity.
     * 
     */
    ANGULAR_ACCELERATION,

    /**
     * The measurement of the rate of change of angular position.
     * 
     */
    ANGULAR_VELOCITY,

    /**
     * The measurement of the feedrate of a linear axis.
     * 
     */
    AXIS_FEEDRATE,

    /**
     * The value provided by a timing device at a specific point in time.
     * 
     */
    CLOCK_TIME,

    /**
     * The measurement of the percentage of one component within a mixture
     *             of components
     * 
     */
    CONCENTRATION,

    /**
     * The measurement of the ability of a material to conduct electricity.
     * 
     */
    CONDUCTIVITY,

    /**
     * The measurement of the change in position of an object.
     * 
     */
    DISPLACEMENT,

    /**
     * The measurement of electrical energy consumption by a component.
     * 
     */
    ELECTRICAL_ENERGY,

    /**
     * The measurement of the amount of time a piece of equipment or a
     *             sub-part of a piece of equipment has performed specific activities.
     * 
     */
    EQUIPMENT_TIMER,

    /**
     * The measurement of the amount of a substance remaining compared to
     *             the planned maximum amount of that substance.
     * 
     */
    FILL_LEVEL,

    /**
     * The measurement of the rate of flow of a fluid.
     * 
     */
    FLOW,

    /**
     * The measurement of the number of occurrences of a repeating event
     *             per unit time.
     * 
     */
    FREQUENCY,

    /**
     * DEPRECATED in Version 1.1
     * 
     */
    GLOBAL_POSITION,

    /**
     * The measurement of the length of an object.
     * 
     */
    LENGTH,

    /**
     * DEPRECATED in Version 1.2. See filllevel sample
     * 
     */
    LEVEL,

    /**
     * The measurement of the push or pull introduced by an actuator or
     *             exerted on an object.
     * 
     */
    LINEAR_FORCE,

    /**
     * The measurement of the actual versus the standard rating of a piece
     *             of equipment.
     * 
     */
    LOAD,

    /**
     * The measurement of the mass of an object(s) or an amount of
     *             material.
     * 
     */
    MASS,

    /**
     * The measurement of the feedrate for the axes, or a single axis,
     *             associated with a path component-a vector.
     * 
     */
    PATH_FEEDRATE,

    /**
     * A measured or calculated position of a control point associated with
     *             a controller element, or path element if provided, of a piece of
     *             equipment.
     * 
     */
    PATH_POSITION,

    /**
     * A measure of the acidity or alkalinity of a solution.
     * 
     */
    PH,

    /**
     * A measured or calculated position of a component element as reported
     *             by a piece of equipment.
     * 
     */
    POSITION,

    /**
     * The measurement of the ratio of real power flowing to a load to the
     *             apparent power in that AC circuit.
     * 
     */
    POWER_FACTOR,

    /**
     * The measurement of force per unit area exerted by a gas or liquid.
     * 
     */
    PRESSURE,

    /**
     * The measurement of the amount of time a piece of equipment has
     *             performed different types of activities associated with the process
     *             being performed at that piece of equipment.
     * 
     */
    PROCESS_TIMER,

    /**
     * The measurement of the degree to which a substance opposes the
     *             passage of an electric current.
     * 
     */
    RESISTANCE,

    /**
     * The measurement of the rotational speed of a rotary axis.
     * 
     */
    ROTARY_VELOCITY,

    /**
     * The measurement of a sound level or sound pressure level relative to
     *             atmospheric pressure.
     * 
     */
    SOUND_LEVEL,

    /**
     * DEPRECATED in Version 1.2. Replaced by rotaryvelocity sample
     * 
     */
    SPINDLE_SPEED,

    /**
     * The measurement of the amount of deformation per unit length of an
     *             object when a load is applied.
     * 
     */
    STRAIN,

    /**
     * The measurement of temperature.
     * 
     */
    TEMPERATURE,

    /**
     * The measurement of a force that stretches or elongates an object.
     * 
     */
    TENSION,

    /**
     * The measurement of angular displacement.
     * 
     */
    TILT,

    /**
     * The measurement of the turning force exerted on an object or by an
     *             object.
     * 
     */
    TORQUE,

    /**
     * The measurement of the rate of change of position of a component.
     * 
     */
    VELOCITY,

    /**
     * The measurement of a fluids resistance to flow.
     * 
     */
    VISCOSITY,

    /**
     * The measurement of the apparent power in an electrical circuit,
     *             equal to the product of root-mean-square (RMS) voltage and RMS
     *             current (commonly referred to as VA).
     * 
     */
    VOLT_AMPERE,

    /**
     * The measurement of reactive power in an AC electrical circuit
     *             (commonly referred to as VAR).
     * 
     */
    VOLT_AMPERE_REACTIVE,

    /**
     * The measurement of electrical potential between two points.
     * 
     */
    VOLTAGE,

    /**
     * The measurement of power flowing through or dissipated by an
     *             electrical circuit or piece of equipment.
     * 
     */
    WATTAGE,

    /**
     * The set of axes currently associated with a path or controller
     *             structural element.
     * 
     */
    ACTIVE_AXES,

    /**
     * Represents the operational state of an apparatus for moving or
     *             controlling a mechanism or system.
     * 
     */
    ACTUATOR_STATE,

    /**
     * DEPRECATED: Replaced with condition category category data items in
     *             Version 1.1.0.
     * 
     */
    ALARM,

    /**
     * Represents the agent's ability to communicate with the data
     *             source.
     * 
     */
    AVAILABILITY,

    /**
     * Describes the way the axes will be associated to each other. This is
     *             used in conjunction with coupledaxes event to indicate the way they
     *             are interacting.
     * 
     */
    AXIS_COUPLING,

    /**
     * The value of a signal or calculation issued to adjust the feedrate
     *             of an individual linear type axis.
     * 
     */
    AXIS_FEEDRATE_OVERRIDE,

    /**
     * An indicator of the state of the axis lockout function when power
     *             has been removed and the axis is allowed to move freely.
     * 
     */
    AXIS_INTERLOCK,

    /**
     * An indicator of the controlled state of a linear or rotary component
     *             representing an axis.
     * 
     */
    AXIS_STATE,

    /**
     * The line of code or command being executed by a controller
     *             structural element.
     * 
     */
    BLOCK,

    /**
     * The total count of the number of blocks of program code that have
     *             been executed since execution started.
     * 
     */
    BLOCK_COUNT,

    /**
     * An indication of the state of an interlock function or control logic
     *             state intended to prevent the associated chuck component from being
     *             operated.
     * 
     */
    CHUCK_INTERLOCK,

    /**
     * An indication of the operating state of a mechanism that holds a
     *             part or stock material during a manufacturing process. It may also
     *             represent a mechanism that holds any other mechanism in place within
     *             a piece of equipment.
     * 
     */
    CHUCK_STATE,

    /**
     * DEPRECATED in Version 1.1.
     * 
     */
    CODE,

    /**
     * An indication of the operating condition of a mechanism represented
     *             by a composition type element.
     * 
     */
    COMPOSITION_STATE,

    /**
     * The current operating mode of the controller component.
     * 
     */
    CONTROLLER_MODE,

    /**
     * A setting or operator selection that changes the behavior of a piece
     *             of equipment.
     * 
     */
    CONTROLLER_MODE_OVERRIDE,

    /**
     * Refers to the set of associated axes.
     * 
     */
    COUPLED_AXES,

    /**
     * The direction of motion.
     * 
     */
    DIRECTION,

    /**
     * The operational state of a door type component or composition
     *             element.
     * 
     */
    DOOR_STATE,

    /**
     * The current state of the emergency stop signal for a piece of
     *             equipment, controller path, or any other component or subsystem of a
     *             piece of equipment.
     * 
     */
    EMERGENCY_STOP,

    /**
     * An indication of whether the end of a piece of bar stock being feed
     *             by a bar feeder has been reached.
     * 
     */
    END_OF_BAR,

    /**
     * An indication that a piece of equipment, or a sub-part of a piece of
     *             equipment, is performing specific types of activities.
     * 
     */
    EQUIPMENT_MODE,

    /**
     * The execution status of the controller.
     * 
     */
    EXECUTION,

    /**
     * The current intended production status of the device or component.
     * 
     */
    FUNCTIONAL_MODE,

    /**
     * The measurement of the hardness of a material.
     * 
     */
    HARDNESS,

    /**
     * An indication of the operational state of an interface component
     *             component.
     * 
     */
    INTERFACE_STATE,

    /**
     * DEPRECATED in Version 1.4.0.
     * 
     */
    LINE,

    /**
     * An optional identifier for a block event of code in a program event.
     * 
     */
    LINE_LABEL,

    /**
     * A reference to the position of a block of program code within a
     *             control program.
     * 
     */
    LINE_NUMBER,

    /**
     * The identifier of a material used or consumed in the manufacturing
     *             process.
     * 
     */
    MATERIAL,

    /**
     * Any text string of information to be transferred from a piece of
     *             equipment to a client software application.
     * 
     */
    MESSAGE,

    /**
     * The identifier of the person currently responsible for operating the
     *             piece of equipment.
     * 
     */
    OPERATOR_ID,

    /**
     * The identifier for a pallet.
     * 
     */
    PALLET_ID,

    /**
     * The count of parts produced.
     * 
     */
    PART_COUNT,

    /**
     * An identifier of a part in a manufacturing operation.
     * 
     */
    PART_ID,

    /**
     * An identifier of a part or product moving through the manufacturing
     *             process. The valid data value must be a text string.
     * 
     */
    PART_NUMBER,

    /**
     * The value of a signal or calculation issued to adjust the feedrate
     *             for the axes associated with a path component that may represent a
     *             single axis or the coordinated movement of multiple axes.
     * 
     */
    PATH_FEEDRATE_OVERRIDE,

    /**
     * Describes the operational relationship between a path structural
     *             element and another path structural element for pieces of equipment
     *             comprised of multiple logical groupings of controlled axes or other
     *             logical operations.
     * 
     */
    PATH_MODE,

    /**
     * The indication of the status of the source of energy for a
     *             structural element to allow it to perform its intended function or
     *             the state of an enabling signal providing permission for the
     *             structural element to perform its functions.
     * 
     */
    POWER_STATE,

    /**
     * DEPRECATED in Version 1.1.0.
     * 
     */
    POWER_STATUS,

    /**
     * The name of the logic or motion program being executed by the
     *             controller component.
     * 
     */
    PROGRAM,

    /**
     * A comment or non-executable statement in the control program. The
     *             valid data value must be a text string.
     * 
     */
    PROGRAM_COMMENT,

    /**
     * An indication of the status of the controller components program
     *             editing mode. On many controls, a program can be edited while
     *             another program is currently being executed.
     * 
     */
    PROGRAM_EDIT,

    /**
     * The name of the program being edited. This is used in conjunction
     *             with programedit event when in active value state. The valid data
     *             value must be a text string.
     * 
     */
    PROGRAM_EDIT_NAME,

    /**
     * The non-executable header section of the control program.
     * 
     */
    PROGRAM_HEADER,

    /**
     * The current operating mode for a rotary type axis.
     * 
     */
    ROTARY_MODE,

    /**
     * The value of a command issued to adjust the programmed velocity for
     *             a rotary type axis. This command represents a percentage change to
     *             the velocity calculated by a logic or motion program or set by a
     *             switch for a rotary type axis.
     * 
     */
    ROTARY_VELOCITY_OVERRIDE,

    /**
     * The serial number associated with a component, asset
     *             mtconnectassets, or device. The valid data value must be a text
     *             string.
     * 
     */
    SERIAL_NUMBER,

    /**
     * An indication of the status of the spindle for a piece of equipment
     *             when power has been removed and it is free to rotate.
     * 
     */
    SPINDLE_INTERLOCK,

    /**
     * The identifier of an individual tool asset.The valid data value must
     *             be a text string.
     * 
     */
    TOOL_ASSET_ID,

    /**
     * DEPRECATED in Version 1.2.0. See toolassetid event. The identifier
     *             of the tool currently in use for a given path.
     * 
     */
    TOOL_ID,

    /**
     * The identifier assigned by the controller component to a cutting
     *             tool when in use by a piece of equipment. The valid data value must
     *             be a text string.
     * 
     */
    TOOL_NUMBER,

    /**
     * A reference to the tool offset variables applied to the active
     *             cutting tool associated with a path in a controller type component.
     * 
     */
    TOOL_OFFSET,

    /**
     * The identifier of the person currently responsible for operating the
     *             piece of equipment.
     * 
     */
    USER,

    /**
     * A string like piece or filament of relatively rigid or flexible
     *             material provided in a variety of diameters.
     * 
     */
    WIRE,

    /**
     * A reference to the offset variables for a work piece or part
     *             associated with a path in a controller type component.
     * 
     */
    WORK_OFFSET,

    /**
     * The identifier for the current workholding or part clamp in use by a
     *             piece of equipment. The valid data value must be a text string.
     * 
     */
    WORKHOLDING_ID,

    /**
     * An indication that the piece of equipment has experienced a
     *             communications failure.
     * 
     */
    COMMUNICATIONS,

    /**
     * An indication that the value of the data associated with a measured
     *             value or a calculation is outside of an expected range.
     * 
     */
    DATA_RANGE,

    /**
     * An indication of a fault associated with the hardware subsystem of
     *             the structural element.
     * 
     */
    HARDWARE,

    /**
     * An indication that an error occurred in the logic program or
     *             programmable logic controller (PLC) associated with a piece of
     *             equipment.
     * 
     */
    LOGIC_PROGRAM,

    /**
     * An indication that an error occurred in the motion program
     *             associated with a piece of equipment.
     * 
     */
    MOTION_PROGRAM,

    /**
     * A general purpose indication associated with an electronic component
     *             of a piece of equipment or a controller that represents a fault that
     *             is not associated with the operator, program, or hardware.
     * 
     */
    SYSTEM,

    /**
     * The value of the cdata for the event MUST be the assetid of the
     *             asset that has been added or changed. There will not be a separate
     *             message for new assets.
     * 
     */
    ASSET_CHANGED,

    /**
     * The value of the cdata for the event MUST be the assetid of the
     *             asset that has been removed. The asset will still be visible if
     *             requested with the includeremoved parameter as described in the
     *             protocol section. When assets are removed they are not moved to the
     *             beginning of the most recently modified list.
     * 
     */
    ASSET_REMOVED,

    /**
     * Service to open a door.
     * 
     */
    OPEN_DOOR,

    /**
     * Service to close a door.
     * 
     */
    CLOSE_DOOR,

    /**
     * Service to open a chuck.
     * 
     */
    OPEN_CHUCK,

    /**
     * Service to close a chuck.
     * 
     */
    CLOSE_CHUCK,

    /**
     * Service to advance material or feed product to a piece of equipment
     *             from a continuous or bulk source.
     * 
     */
    MATERIAL_FEED,

    /**
     * Service to change the type of material or product being loaded or
     *             fed to a piece of equipment.
     * 
     */
    MATERIAL_CHANGE,

    /**
     * Service to remove or retract material or product.
     * 
     */
    MATERIAL_RETRACT,

    /**
     * Service to change the part or product associated with a piece of
     *             equipment to a different part or product.
     * 
     */
    PART_CHANGE,

    /**
     * Service to load a piece of material or product.
     * 
     */
    MATERIAL_LOAD,

    /**
     * Service to unload a piece of material or product.
     * 
     */
    MATERIAL_UNLOAD,

    /**
     * The geometric volume of an object or container.
     * 
     */
    VOLUME_SPATIAL,

    /**
     * The fluid volume of an object or container.
     * 
     */
    VOLUME_FLUID,

    /**
     * The geometric capacity of an object or container.
     * 
     */
    CAPACITY_SPATIAL,

    /**
     * The fluid capacity of an object or container.
     * 
     */
    CAPACITY_FLUID,

    /**
     * The volumetric mass of a material per unit volume of that material.
     * 
     */
    DENSITY,

    /**
     * The spatial volume of material to be deposited in an additive
     *             manufacturing process.
     * 
     */
    DEPOSITION_VOLUME,

    /**
     * The rate at which a spatial volume of material is deposited in an
     *             additive manufacturing process.
     * 
     */
    DEPOSITION_RATE_VOLUMETRIC,

    /**
     * The rate of change in spatial volume of material deposited in an
     *             additive manufacturing process.
     * 
     */
    DEPOSITION_ACCELERATION_VOLUMETRIC,

    /**
     * The mass of the material deposited in an additive manufacturing
     *             process.
     * 
     */
    DEPOSITION_MASS,

    /**
     * The density of the material deposited in an additive manufacturing
     *             process per unit of volume.
     * 
     */
    DEPOSITION_DENSITY,

    /**
     * The time and date associated with an activity or event. processtime
     *             event MUST be reported in ISO 8601 format.
     * 
     */
    PROCESS_TIME,

    /**
     * The time and date code associated with a material or other physical
     *             item. datecode event MUST be reported in ISO 8601 format.
     * 
     */
    DATE_CODE,

    /**
     * Identifies the layers of material applied to a part or product as
     *             part of an additive manufacturing process. The valid data value MUST
     *             be an integer.
     * 
     */
    MATERIAL_LAYER,

    /**
     * An indication of the reason that execution event is reporting a
     *             value of wait. The valid data value MUST be poweringup,
     *             poweringdown, partload, partunload, toolload, toolunload,
     *             materialload event, materialunload event, secondaryprocess, pausing,
     *             or resuming.
     * 
     */
    WAIT_STATE,

    /**
     * An indication designating whether a part or work piece has been
     *             detected or is present. The valid data value MUST be present or
     *             notpresent.
     * 
     */
    PART_DETECT,

    /**
     * The identifier of another piece of equipment that is temporarily
     *             associated with a component of this piece of equipment to perform a
     *             particular function. The valid data value MUST be a NMTOKEN XML
     *             type.
     * 
     */
    DEVICE_UUID,

    /**
     * The speed difference (relative velocity) between the cutting
     *             mechanism and the surface of the workpiece it is operating on.
     * 
     */
    CUTTING_SPEED,

    /**
     * The feedrate for the axes, or a single axis.
     * 
     */
    PATH_FEEDRATE_PER_REVOLUTION,

    /**
     * An indication of the nesting level within a control program that is
     *             associated with the code or instructions that is currently being
     *             executed. If an Initial Value is not defined, the nesting level
     *             associated with the highest or initial nesting level of the program
     *             MUST default to zero (0). The value reported for programnestlevel
     *             event MUST be an integer.
     * 
     */
    PROGRAM_NEST_LEVEL,

    /**
     * Defines whether the logic or motion program defined by program event
     *             is being executed from the local memory of the controller or from an
     *             outside source. The valid data value MUST be local or external.
     * 
     */
    PROGRAM_LOCATION_TYPE,

    /**
     * The Uniform Resource Identifier (URI) for the source file associated
     *             with program event.
     * 
     */
    PROGRAM_LOCATION,

    /**
     * An identifier for the tool group associated with a specific tool.
     *             Commonly used to designate spare tools.
     * 
     */
    TOOL_GROUP,

    /**
     * A data value whose meaning may change over time due to changes in
     *             the opertion of a piece of equipment or the process being executed
     *             on that piece of equipment.
     * 
     */
    VARIABLE;

    public String value() {
        return name();
    }

    public static DataItemEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
