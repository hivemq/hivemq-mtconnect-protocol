//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The sub-types for a measurement
 * 
 * <p>Java class for DataItemSubEnumEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataItemSubEnumEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABSOLUTE"/>
 *     <enumeration value="ACTION"/>
 *     <enumeration value="ACTUAL"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="ALTERNATING"/>
 *     <enumeration value="A_SCALE"/>
 *     <enumeration value="AUXILIARY"/>
 *     <enumeration value="BAD"/>
 *     <enumeration value="BRINELL"/>
 *     <enumeration value="B_SCALE"/>
 *     <enumeration value="COMMANDED"/>
 *     <enumeration value="CONSUMED"/>
 *     <enumeration value="CONTROL"/>
 *     <enumeration value="C_SCALE"/>
 *     <enumeration value="DELAY"/>
 *     <enumeration value="DIRECT"/>
 *     <enumeration value="DRY_RUN"/>
 *     <enumeration value="D_SCALE"/>
 *     <enumeration value="EXPIRATION"/>
 *     <enumeration value="FIRST_USE"/>
 *     <enumeration value="GOOD"/>
 *     <enumeration value="INCREMENTAL"/>
 *     <enumeration value="JOG"/>
 *     <enumeration value="LATERAL"/>
 *     <enumeration value="LEEB"/>
 *     <enumeration value="LENGTH"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="LINEAR"/>
 *     <enumeration value="LOADED"/>
 *     <enumeration value="MACHINE_AXIS_LOCK"/>
 *     <enumeration value="MAIN"/>
 *     <enumeration value="MAINTENANCE"/>
 *     <enumeration value="MANUAL_UNCLAMP"/>
 *     <enumeration value="MANUFACTURE"/>
 *     <enumeration value="MAXIMUM"/>
 *     <enumeration value="MINIMUM"/>
 *     <enumeration value="MOHS"/>
 *     <enumeration value="MOTION"/>
 *     <enumeration value="NO_SCALE"/>
 *     <enumeration value="OPERATING"/>
 *     <enumeration value="OPERATOR"/>
 *     <enumeration value="OPTIONAL_STOP"/>
 *     <enumeration value="OVERRIDE"/>
 *     <enumeration value="POWERED"/>
 *     <enumeration value="PRIMARY"/>
 *     <enumeration value="PROBE"/>
 *     <enumeration value="PROCESS"/>
 *     <enumeration value="PROGRAMMED"/>
 *     <enumeration value="RADIAL"/>
 *     <enumeration value="RAPID"/>
 *     <enumeration value="REMAINING"/>
 *     <enumeration value="ROCKWELL"/>
 *     <enumeration value="ROTARY"/>
 *     <enumeration value="SCHEDULE"/>
 *     <enumeration value="SET_UP"/>
 *     <enumeration value="SHORE"/>
 *     <enumeration value="SINGLE_BLOCK"/>
 *     <enumeration value="STANDARD"/>
 *     <enumeration value="START"/>
 *     <enumeration value="SWITCHED"/>
 *     <enumeration value="TARGET"/>
 *     <enumeration value="TARGET_COMPLETION"/>
 *     <enumeration value="TOOL_CHANGE_STOP"/>
 *     <enumeration value="USEABLE"/>
 *     <enumeration value="VERTICAL"/>
 *     <enumeration value="VICKERS"/>
 *     <enumeration value="WORKING"/>
 *     <enumeration value="IPV4_ADDRESS"/>
 *     <enumeration value="IPV6_ADDRESS"/>
 *     <enumeration value="GATEWAY"/>
 *     <enumeration value="SUBNET_MASK"/>
 *     <enumeration value="VLAN_ID"/>
 *     <enumeration value="MAC_ADDRESS"/>
 *     <enumeration value="WIRELESS"/>
 *     <enumeration value="LICENSE"/>
 *     <enumeration value="VERSION"/>
 *     <enumeration value="RELEASE_DATE"/>
 *     <enumeration value="INSTALL_DATE"/>
 *     <enumeration value="MANUFACTURER"/>
 *     <enumeration value="UUID"/>
 *     <enumeration value="SERIAL_NUMBER"/>
 *     <enumeration value="RAW_MATERIAL"/>
 *     <enumeration value="LOT"/>
 *     <enumeration value="BATCH"/>
 *     <enumeration value="HEAT_TREAT"/>
 *     <enumeration value="PART_NUMBER"/>
 *     <enumeration value="PART_FAMILY"/>
 *     <enumeration value="PART_NAME"/>
 *     <enumeration value="PROCESS_STEP"/>
 *     <enumeration value="PROCESS_PLAN"/>
 *     <enumeration value="ORDER_NUMBER"/>
 *     <enumeration value="PROCESS_NAME"/>
 *     <enumeration value="ISO_STEP_EXECUTABLE"/>
 *     <enumeration value="COMPLETE"/>
 *     <enumeration value="ACTIVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "DataItemSubEnumEnum")
@XmlType(name = "DataItemSubEnumEnum")
@XmlEnum
public enum DataItemSubEnumEnum {


    /**
     * Relating to or derived in the simplest manner from the fundamental
     *             units or measurements.
     * 
     */
    ABSOLUTE("ABSOLUTE"),

    /**
     * An indication of the operating state of a mechanism.
     * 
     */
    ACTION("ACTION"),

    /**
     * The measured value.
     * 
     */
    ACTUAL("ACTUAL"),

    /**
     * The number of parts produced.
     * 
     */
    ALL("ALL"),

    /**
     * The measurement of alternating voltage or current. If not specified
     *             further in statistic, defaults to RMS voltage.
     * 
     */
    ALTERNATING("ALTERNATING"),

    /**
     * A Scale weighting factor.
     * 
     */
    A_SCALE("A_SCALE"),

    /**
     * When multiple locations on a piece of bar stock being feed by a bar
     *             feeder are referenced as the indication of whether the end of that
     *             piece of bar stock has been reached.
     * 
     */
    AUXILIARY("AUXILIARY"),

    /**
     * The number of parts produced that do not conform to specification.
     * 
     */
    BAD("BAD"),

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    BRINELL("BRINELL"),

    /**
     * B Scale weighting factor.
     * 
     */
    B_SCALE("B_SCALE"),

    /**
     * The commanded value.
     * 
     */
    COMMANDED("COMMANDED"),

    /**
     * The amount of material consumed from an object or container during a
     *             manufacturing process.
     * 
     */
    CONSUMED("CONSUMED"),

    /**
     * The state of the enabling signal or control logic that enables or
     *             disables the function or operation of the structural element.
     * 
     */
    CONTROL("CONTROL"),

    /**
     * C Scale weighting factor.
     * 
     */
    C_SCALE("C_SCALE"),

    /**
     * A piece of equipment or process waiting for an event or an action to
     *             occur.
     * 
     */
    DELAY("DELAY"),

    /**
     * The measurement of DC current or voltage.
     * 
     */
    DIRECT("DIRECT"),

    /**
     * A setting or operator selection used to execute a test mode to
     *             confirm the execution of machine functions.
     * 
     */
    DRY_RUN("DRY_RUN"),

    /**
     * D Scale weighting factor.
     * 
     */
    D_SCALE("D_SCALE"),

    /**
     * The time and date code relating to the expiration or end of useful
     *             life for a material or other physical item.
     * 
     */
    EXPIRATION("EXPIRATION"),

    /**
     * The time and date code relating the first use of a material or other
     *             physical item.
     * 
     */
    FIRST_USE("FIRST_USE"),

    /**
     * The number of parts produced that conform to specification.
     * 
     */
    GOOD("GOOD"),

    /**
     * Relating to or derived from the last {{term(observation)}}.
     * 
     */
    INCREMENTAL("INCREMENTAL"),

    /**
     * The feedrate specified by a logic or motion program when operating
     *             in a manual state or method (jogging).
     * 
     */
    JOG("JOG"),

    /**
     * An indication of the position of a mechanism that may move in a
     *             lateral direction.
     * 
     */
    LATERAL("LATERAL"),

    /**
     * A scale to measure the elasticity of a surface.
     * 
     */
    LEEB("LEEB"),

    /**
     * A reference to a length type tool offset variable.
     * 
     */
    LENGTH("LENGTH"),

    /**
     * The state of the power source.
     * 
     */
    LINE("LINE"),

    /**
     * The direction of motion of a linear motion.
     * 
     */
    LINEAR("LINEAR"),

    /**
     * Subparts of a piece of equipment are under load.
     * 
     */
    LOADED("LOADED"),

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    MACHINE_AXIS_LOCK("MACHINE_AXIS_LOCK"),

    /**
     * Relating to the primary logic or motion program currently being
     *             executed.
     * 
     */
    MAIN("MAIN"),

    /**
     * Relating to maintenance on the piece of equipment.
     * 
     */
    MAINTENANCE("MAINTENANCE"),

    /**
     * An indication of the state of an operator controlled interlock that
     *             can inhibit the ability to initiate an unclamp action of an
     *             electronically controlled chuck.
     * 
     */
    MANUAL_UNCLAMP("MANUAL_UNCLAMP"),

    /**
     * Related to the production of a material or other physical item.
     * 
     */
    MANUFACTURE("MANUFACTURE"),

    /**
     * The maximum value.
     * 
     */
    MAXIMUM("MAXIMUM"),

    /**
     * The minimum value.
     * 
     */
    MINIMUM("MINIMUM"),

    /**
     * A scale to measure the resistance to scratching of a surface.
     * 
     */
    MOHS("MOHS"),

    /**
     * An indication of the open or closed state of a mechanism.
     * 
     */
    MOTION("MOTION"),

    /**
     * No weighting factor on the frequency scale.
     * 
     */
    NO_SCALE("NO_SCALE"),

    /**
     * A piece of equipment that is powered or performing any activity.
     * 
     */
    OPERATING("OPERATING"),

    /**
     * Relating to the person currently responsible for operating the piece
     *             of equipment.
     * 
     */
    OPERATOR("OPERATOR"),

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    OPTIONAL_STOP("OPTIONAL_STOP"),

    /**
     * The overridden value.
     * 
     */
    OVERRIDE("OVERRIDE"),

    /**
     * A piece of equipment is powered and functioning or
     *             {{termplural(Component)}} that are required to remain on are
     *             powered.
     * 
     */
    POWERED("POWERED"),

    /**
     * The main or most important location **MUST** be designated as the
     *             end of a piece of bar stock.
     * 
     */
    PRIMARY("PRIMARY"),

    /**
     * The value provided by a measurement probe.
     * 
     */
    PROBE("PROBE"),

    /**
     * Relating to production of a part or product on a piece of equipment.
     * 
     */
    PROCESS("PROCESS"),

    /**
     * The programmed value.
     * 
     */
    PROGRAMMED("PROGRAMMED"),

    /**
     * A reference to a radial type tool offset variable.
     * 
     */
    RADIAL("RADIAL"),

    /**
     * The feedrate specified by a logic or motion program when operating
     *             in a rapid positioning mode.
     * 
     */
    RAPID("RAPID"),

    /**
     * The remaining measure of an object or an action.
     * 
     */
    REMAINING("REMAINING"),

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    ROCKWELL("ROCKWELL"),

    /**
     * The direction of a rotary motion using the right hand rule
     *             convention.
     * 
     */
    ROTARY("ROTARY"),

    /**
     * The identity of a control program that is used to specify the order
     *             of execution of other programs.
     * 
     */
    SCHEDULE("SCHEDULE"),

    /**
     * Relating to the preparation of a piece of equipment for production
     *             or restoring the piece of equipment to a neutral state after
     *             production.
     * 
     */
    SET_UP("SET_UP"),

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    SHORE("SHORE"),

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    SINGLE_BLOCK("SINGLE_BLOCK"),

    /**
     * The standard measure of an object or an action.
     * 
     */
    STANDARD("STANDARD"),

    /**
     * Relating to the beginning of an activity or event.
     * 
     */
    START("START"),

    /**
     * An indication of the activation state of a mechanism represented by
     *             a {{term(Composition)}}.
     * 
     */
    SWITCHED("SWITCHED"),

    /**
     * The targeted or desired value.
     * 
     */
    TARGET("TARGET"),

    /**
     * Relating to the end or completion of an activity or event.
     * 
     */
    TARGET_COMPLETION("TARGET_COMPLETION"),

    /**
     * A setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    TOOL_CHANGE_STOP("TOOL_CHANGE_STOP"),

    /**
     * The remaining usable measure of an object or action.
     * 
     */
    USEABLE("USEABLE"),

    /**
     * An indication of the position of a mechanism that may move in a
     *             vertical direction.
     * 
     */
    VERTICAL("VERTICAL"),

    /**
     * A scale to measure the resistance to deformation of a surface.
     * 
     */
    VICKERS("VICKERS"),

    /**
     * A piece of equipment performing any activity, the equipment is
     *             active and performing a function under load or not.
     * 
     */
    WORKING("WORKING"),

    /**
     * The IPV4 network address of the component.
     * 
     */
    @XmlEnumValue("IPV4_ADDRESS")
    IPV_4_ADDRESS("IPV4_ADDRESS"),

    /**
     * The IPV6 network address of the component.
     * 
     */
    @XmlEnumValue("IPV6_ADDRESS")
    IPV_6_ADDRESS("IPV6_ADDRESS"),

    /**
     * The Gateway for the component network.
     * 
     */
    GATEWAY("GATEWAY"),

    /**
     * The SubNet mask for the component network.
     * 
     */
    SUBNET_MASK("SUBNET_MASK"),

    /**
     * The layer2 Virtual Local Network (VLAN) ID for the component
     *             network.
     * 
     */
    VLAN_ID("VLAN_ID"),

    /**
     * Media Access Control Address. The unique physical address of the
     *             network hardware.
     * 
     */
    MAC_ADDRESS("MAC_ADDRESS"),

    /**
     * Identifies whether the connection type is wireless.
     * 
     */
    WIRELESS("WIRELESS"),

    /**
     * The license code to validate or activate the hardware or software.
     * 
     */
    LICENSE("LICENSE"),

    /**
     * The version of the hardware or software.
     * 
     */
    VERSION("VERSION"),

    /**
     * The date the hardware or software was released for general use.
     * 
     */
    RELEASE_DATE("RELEASE_DATE"),

    /**
     * The date the hardware or software was installed.
     * 
     */
    INSTALL_DATE("INSTALL_DATE"),

    /**
     * The corporate identity for the maker of the hardware or software.
     * 
     */
    MANUFACTURER("MANUFACTURER"),

    /**
     * The globally unique identifier as specified in ISO 11578 or RFC
     *             4122.
     * 
     */
    UUID("UUID"),

    /**
     * A serial number that uniquely identifies a specific part.
     * 
     */
    SERIAL_NUMBER("SERIAL_NUMBER"),

    /**
     * A singular piece of material.
     * 
     */
    RAW_MATERIAL("RAW_MATERIAL"),

    /**
     * A group of parts tracked as a lot.
     * 
     */
    LOT("LOT"),

    /**
     * A group of parts produced in a batch.
     * 
     */
    BATCH("BATCH"),

    /**
     * A material heat number.
     * 
     */
    HEAT_TREAT("HEAT_TREAT"),

    /**
     * A particular part design or model.
     * 
     */
    PART_NUMBER("PART_NUMBER"),

    /**
     * A group of parts having similarities in geometry, manufacturing
     *             process, and/or functions.
     * 
     */
    PART_FAMILY("PART_FAMILY"),

    /**
     * A word or set of words by which a part is known, addressed, or
     *             referred to.
     * 
     */
    PART_NAME("PART_NAME"),

    /**
     * A step in the process plan that this occurrence corresponds to.
     * 
     */
    PROCESS_STEP("PROCESS_STEP"),

    /**
     * A process plan that a process occurrence belongs to.
     * 
     */
    PROCESS_PLAN("PROCESS_PLAN"),

    /**
     * The authorization of a process occurrence.
     * 
     */
    ORDER_NUMBER("ORDER_NUMBER"),

    /**
     * A word or set of words by which a process being executed (process
     *             occurrence) by the device is known, addressed, or referred to.
     * 
     */
    PROCESS_NAME("PROCESS_NAME"),

    /**
     * A reference to a ISO 10303 Executable.
     * 
     */
    ISO_STEP_EXECUTABLE("ISO_STEP_EXECUTABLE"),

    /**
     * Associated with the completion of an activity or event.
     * 
     */
    COMPLETE("COMPLETE"),

    /**
     * Relating to logic or motion program currently executing.
     * 
     */
    ACTIVE("ACTIVE");
    private final String value;

    DataItemSubEnumEnum(String v) {
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
    public static DataItemSubEnumEnum fromValue(String v) {
        for (DataItemSubEnumEnum c: DataItemSubEnumEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
