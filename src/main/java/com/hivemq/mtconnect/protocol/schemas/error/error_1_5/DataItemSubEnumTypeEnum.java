//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.error.error_1_5;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The sub-types for a measurement
 * 
 * <p>Java class for DataItemSubEnumTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemSubEnumTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTUAL"/>
 *     <enumeration value="MAXIMUM"/>
 *     <enumeration value="MINIMUM"/>
 *     <enumeration value="DIRECT"/>
 *     <enumeration value="TARGET"/>
 *     <enumeration value="COMMANDED"/>
 *     <enumeration value="OVERRIDE"/>
 *     <enumeration value="PROGRAMMED"/>
 *     <enumeration value="RAPID"/>
 *     <enumeration value="WORKING"/>
 *     <enumeration value="STANDARD"/>
 *     <enumeration value="USEABLE"/>
 *     <enumeration value="PROBE"/>
 *     <enumeration value="PROCESS"/>
 *     <enumeration value="A_SCALE"/>
 *     <enumeration value="B_SCALE"/>
 *     <enumeration value="C_SCALE"/>
 *     <enumeration value="D_SCALE"/>
 *     <enumeration value="NO_SCALE"/>
 *     <enumeration value="ALTERNATING"/>
 *     <enumeration value="MANUAL_UNCLAMP"/>
 *     <enumeration value="ACTION"/>
 *     <enumeration value="LATERAL"/>
 *     <enumeration value="MOTION"/>
 *     <enumeration value="SWITCHED"/>
 *     <enumeration value="VERTICAL"/>
 *     <enumeration value="DRY_RUN"/>
 *     <enumeration value="MACHINE_AXIS_LOCK"/>
 *     <enumeration value="OPTIONAL_STOP"/>
 *     <enumeration value="SINGLE_BLOCK"/>
 *     <enumeration value="TOOL_CHANGE_STOP"/>
 *     <enumeration value="LINEAR"/>
 *     <enumeration value="ROTARY"/>
 *     <enumeration value="AUXILIARY"/>
 *     <enumeration value="PRIMARY"/>
 *     <enumeration value="DELAY"/>
 *     <enumeration value="LOADED"/>
 *     <enumeration value="OPERATING"/>
 *     <enumeration value="POWERED"/>
 *     <enumeration value="BRINELL"/>
 *     <enumeration value="LEEB"/>
 *     <enumeration value="MOHS"/>
 *     <enumeration value="ROCKWELL"/>
 *     <enumeration value="SHORE"/>
 *     <enumeration value="VICKERS"/>
 *     <enumeration value="ABSOLUTE"/>
 *     <enumeration value="INCREMENTAL"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="BAD"/>
 *     <enumeration value="GOOD"/>
 *     <enumeration value="REMAINING"/>
 *     <enumeration value="JOG"/>
 *     <enumeration value="CONTROL"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="RADIAL"/>
 *     <enumeration value="LENGTH"/>
 *     <enumeration value="MAINTENANCE"/>
 *     <enumeration value="OPERATOR"/>
 *     <enumeration value="SET_UP"/>
 *     <enumeration value="COMPLETE"/>
 *     <enumeration value="CONSUMED"/>
 *     <enumeration value="START"/>
 *     <enumeration value="TARGET_COMPLETION"/>
 *     <enumeration value="MANUFACTURE"/>
 *     <enumeration value="EXPIRATION"/>
 *     <enumeration value="FIRST_USE"/>
 *     <enumeration value="SCHEDULE"/>
 *     <enumeration value="MAIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemSubEnumTypeEnum")
@XmlType(name = "DataItemSubEnumTypeEnum")
@XmlEnum
public enum DataItemSubEnumTypeEnum {


    /**
     * The measured value of the data item type given by a sensor or
     *             encoder.
     * 
     */
    ACTUAL,

    /**
     * Maximum value of a data entity or attribute.
     * 
     */
    MAXIMUM,

    /**
     * The minimum value of a data entity or attribute.
     * 
     */
    MINIMUM,

    /**
     * The measurement of DC current or voltage.
     * 
     */
    DIRECT,

    /**
     * The desired measure or count for a data item value.
     * 
     */
    TARGET,

    /**
     * A value specified by the controller type component.
     * 
     */
    COMMANDED,

    /**
     * DEPRECATED: The operators overridden value.
     * 
     */
    OVERRIDE,

    /**
     * The value of a signal or calculation specified by a logic or motion
     *             program or set by a switch.
     * 
     */
    PROGRAMMED,

    /**
     * The value of a signal or calculation issued to adjust the feedrate
     *             of a component or composition that is operating in a rapid
     *             positioning mode.
     * 
     */
    RAPID,

    /**
     * A piece of equipment performing any activity, the equipment is
     *             active and performing a function under load or not.
     * 
     */
    WORKING,

    /**
     * The standard or original length of an object.
     * 
     */
    STANDARD,

    /**
     * The remaining useable length of an object.
     * 
     */
    USEABLE,

    /**
     * The position provided by a measurement probe.
     * 
     */
    PROBE,

    /**
     * The measurement of the time from the beginning of production of a
     *             part or product on a piece of equipment until the time that
     *             production is complete for that part or product on that piece of
     *             equipment. This includes the time that the piece of equipment is
     *             running, producing parts or products, or in the process of producing
     *             parts.
     * 
     */
    PROCESS,

    /**
     * A Scale weighting factor. This is the default weighting factor if no
     *             factor is specified
     * 
     */
    A_SCALE,

    /**
     * B Scale weighting factor
     * 
     */
    B_SCALE,

    /**
     * C Scale weighting factor
     * 
     */
    C_SCALE,

    /**
     * D Scale weighting factor
     * 
     */
    D_SCALE,

    /**
     * No weighting factor on the frequency scale
     * 
     */
    NO_SCALE,

    /**
     * The measurement of alternating voltage or current. If not specified
     *             further in statistic, defaults to RMS voltage.
     * 
     */
    ALTERNATING,

    /**
     * An indication of the state of an operator controlled interlock that
     *             can inhibit the ability to initiate an unclamp action of an
     *             electronically controlled chuck. The valid data value must be active
     *             value or inactive value. When manualunclamp subtype is active value,
     *             it is expected that a chuck cannot be unclamped until manualunclamp
     *             subtype is set to inactive value.
     * 
     */
    MANUAL_UNCLAMP,

    /**
     * An indication of the operating state of a mechanism represented by a
     *             composition type component. The operating state indicates whether
     *             the composition element is activated or disabled. The valid data
     *             value must be active value or inactive value.
     * 
     */
    ACTION,

    /**
     * An indication of the position of a mechanism that may move in a
     *             lateral direction. The mechanism is represented by a composition
     *             type component. The position information indicates whether the
     *             composition element is positioned to the right, to the left, or is
     *             in transition. The valid data value must be right value, left value,
     *             or transitioning value.
     * 
     */
    LATERAL,

    /**
     * An indication of the open or closed state of a mechanism. The
     *             mechanism is represented by a composition type component. The
     *             operating state indicates whether the state of the composition
     *             element is open, closed, or unlatched. The valid data value must be
     *             open value, unlatched value, or closed value.
     * 
     */
    MOTION,

    /**
     * An indication of the activation state of a mechanism represented by
     *             a composition type component. The activation state indicates whether
     *             the composition element is activated or not. The valid data value
     *             must be on value or off value.
     * 
     */
    SWITCHED,

    /**
     * An indication of the position of a mechanism that may move in a
     *             vertical direction. The mechanism is represented by a composition
     *             type component. The position information indicates whether the
     *             composition element is positioned to the top, to the bottom, or is
     *             in transition. The valid data value must be up value, down value, or
     *             transitioning value.
     * 
     */
    VERTICAL,

    /**
     * A setting or operator selection used to execute a test mode to
     *             confirm the execution of machine functions. The valid data value
     *             must be on value or off value. When dryrun subtype is on value, the
     *             equipment performs all of its normal functions, except no part or
     *             product is produced. If the equipment has a spindle, spindle
     *             operation is suspended.
     * 
     */
    DRY_RUN,

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment. The valid data value must be on
     *             value or off value. When machineaxislock subtype is on value,
     *             program execution continues normally, but no equipment motion occurs
     * 
     */
    MACHINE_AXIS_LOCK,

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment. The valid data value must be on
     *             value or off value. The program execution is stopped after a
     *             specific program block is executed when optionalstop subtype is on
     *             value. In the case of a G-Code program, a program block event
     *             containing a M01 code designates the command for an optionalstop
     *             subtype. execution event must change to optionalstop subtype after a
     *             program block specifying an optional stop is executed and the
     *             optionalstop subtype selection is on value.
     * 
     */
    OPTIONAL_STOP,

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment. The valid data value must be on
     *             value or off value. Program execution is paused after each block
     *             event of code is executed when singleblock subtype is on value. When
     *             singleblock subtype is on value, execution event must change to
     *             interrupted value after completion of each block event of code.
     * 
     */
    SINGLE_BLOCK,

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment. The valid data value must be on
     *             value or off value. Program execution is paused when a command is
     *             executed requesting a cutting tool to be changed. execution event
     *             must change to interrupted value after completion of the command
     *             requesting a cutting tool to be changed and toolchangestop subtype
     *             is on value.
     * 
     */
    TOOL_CHANGE_STOP,

    /**
     * The direction of motion of a linear motion.
     * 
     */
    LINEAR,

    /**
     * The rotational direction of a rotary motion using the right hand
     *             rule convention. The valid data value must be clockwise value or
     *             counterclockwise value.
     * 
     */
    ROTARY,

    /**
     * When multiple locations on a piece of bar stock are referenced as
     *             the indication for the endofbar event, the additional location(s)
     *             must be designated as auxiliary subtype indication(s) for the
     *             endofbar event.
     * 
     */
    AUXILIARY,

    /**
     * Specific applications MAY reference one or more locations on a piece
     *             of bar stock as the indication for the endofbar event. The main or
     *             most important location must be designated as the primary subtype
     *             indication for the endofbar event. If no subtype is specified,
     *             primary subtype must be the default endofbar event indication.
     * 
     */
    PRIMARY,

    /**
     * A piece of equipment waiting for an event or an action to occur.
     * 
     */
    DELAY,

    /**
     * Subparts of a piece of equipment are under load.
     * 
     */
    LOADED,

    /**
     * A piece of equipment are powered or performing any activity.
     * 
     */
    OPERATING,

    /**
     * Primary power is applied to the piece of equipment and, as a
     *             minimum, the controller or logic portion of the piece of equipment
     *             is powered and functioning or components that are required to remain
     *             on are powered.
     * 
     */
    POWERED,

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    BRINELL,

    /**
     * A scale to measure the elasticity of a surface.
     * 
     */
    LEEB,

    /**
     * A scale to measure the resistance to scratching of a surface.
     * 
     */
    MOHS,

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    ROCKWELL,

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    SHORE,

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    VICKERS,

    /**
     * The position of a block of program code relative to the beginning of
     *             the control program.
     * 
     */
    ABSOLUTE,

    /**
     * The position of a block of program code relative to the occurrence
     *             of the last linelabel event encountered in the control program.
     * 
     */
    INCREMENTAL,

    /**
     * The count of all the parts produced. If the subtype is not given,
     *             this is the default.
     * 
     */
    ALL,

    /**
     * Indicates the count of incorrect parts produced.
     * 
     */
    BAD,

    /**
     * Indicates the count of correct parts made.
     * 
     */
    GOOD,

    /**
     * Remaining measure of an object or an action.
     * 
     */
    REMAINING,

    /**
     * The feedrate specified by a logic or motion program, by a pre-set
     *             value, or set by a switch as the feedrate for the axes.
     * 
     */
    JOG,

    /**
     * The state of the enabling signal or control logic that enables or
     *             disables the function or operation of the structural element.
     * 
     */
    CONTROL,

    /**
     * The state of the power source for the structural element.
     * 
     */
    LINE,

    /**
     * A reference to a radial type tool offset variable.
     * 
     */
    RADIAL,

    /**
     * A reference to a length type tool offset variable.
     * 
     */
    LENGTH,

    /**
     * Action related to maintenance on the piece of equipment.
     * 
     */
    MAINTENANCE,

    /**
     * The identifier of the person currently responsible for operating the
     *             piece of equipment.
     * 
     */
    OPERATOR,

    /**
     * The identifier of the person currently responsible for preparing a
     *             piece of equipment for production or restoring the piece of
     *             equipment to a neutral state after production.
     * 
     */
    SET_UP,

    /**
     * Completion of an action.
     * 
     */
    COMPLETE,

    /**
     * The amount of bulk material consumed from an object or container
     *             during a manufacturing process.
     * 
     */
    CONSUMED,

    /**
     * The time and date associated with the beginning of an activity or
     *             event.
     * 
     */
    START,

    /**
     * The projected time and date associated with the end or completion of
     *             an activity or event.
     * 
     */
    TARGET_COMPLETION,

    /**
     * The time and date code relating to the production of a material or
     *             other physical item.
     * 
     */
    MANUFACTURE,

    /**
     * The time and date code relating to the expiration or end of useful
     *             life for a material or other physical item.
     * 
     */
    EXPIRATION,

    /**
     * The time and date code relating the first use of a material or other
     *             physical item.
     * 
     */
    FIRST_USE,

    /**
     * The identity of a control program that is used to specify the order
     *             of execution of other programs.
     * 
     */
    SCHEDULE,

    /**
     * The identity of the primary logic or motion program currently being
     *             executed. It is the starting nest level in a call structure and may
     *             contain calls to sub programs.
     * 
     */
    MAIN;

    public String value() {
        return name();
    }

    public static DataItemSubEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
