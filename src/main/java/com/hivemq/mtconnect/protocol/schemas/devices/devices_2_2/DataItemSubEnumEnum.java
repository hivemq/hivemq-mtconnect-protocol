//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.devices.devices_2_2;

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
 *     <enumeration value="FAILED"/>
 *     <enumeration value="ABORTED"/>
 *     <enumeration value="ENDED"/>
 *     <enumeration value="WASTE"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="REQUEST"/>
 *     <enumeration value="RESPONSE"/>
 *     <enumeration value="ACTIVITY"/>
 *     <enumeration value="SEGMENT"/>
 *     <enumeration value="RECIPE"/>
 *     <enumeration value="OPERATION"/>
 *     <enumeration value="BINARY"/>
 *     <enumeration value="BOOLEAN"/>
 *     <enumeration value="ENUMERATED"/>
 *     <enumeration value="DETECT"/>
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
     * relating to or derived in the simplest manner from the fundamental
     *             units or measurements.
     * 
     */
    ABSOLUTE("ABSOLUTE"),

    /**
     * indication of the operating state of a mechanism.
     * 
     */
    ACTION("ACTION"),

    /**
     * measured or reported value of an {{term(observation)}}.
     * 
     */
    ACTUAL("ACTUAL"),

    /**
     * all actions, items, or activities being counted independent of the
     *             outcome.
     * 
     */
    ALL("ALL"),

    /**
     * measurement of alternating voltage or current. If not specified
     *             further in statistic, defaults to RMS voltage. **DEPRECATED** in
     *             *Version 1.6*.
     * 
     */
    ALTERNATING("ALTERNATING"),

    /**
     * A-Scale weighting factor on the frequency scale.
     * 
     */
    A_SCALE("A_SCALE"),

    /**
     * when multiple locations on a piece of bar stock being feed by a bar
     *             feeder are referenced as the indication of whether the end of that
     *             piece of bar stock has been reached.
     * 
     */
    AUXILIARY("AUXILIARY"),

    /**
     * actions, items, or activities being counted that do not conform to
     *             specification or expectation.
     * 
     */
    BAD("BAD"),

    /**
     * scale to measure the resistance to deformation of a surface.
     * 
     */
    BRINELL("BRINELL"),

    /**
     * B-Scale weighting factor on the frequency scale.
     * 
     */
    B_SCALE("B_SCALE"),

    /**
     * directive value including adjustments such as an offset or
     *             overrides.
     * 
     */
    COMMANDED("COMMANDED"),

    /**
     * amount of material consumed from an object or container during a
     *             manufacturing process.
     * 
     */
    CONSUMED("CONSUMED"),

    /**
     * state of the enabling signal or control logic that enables or
     *             disables the function or operation of the entity.
     * 
     */
    CONTROL("CONTROL"),

    /**
     * C-Scale weighting factor on the frequency scale.
     * 
     */
    C_SCALE("C_SCALE"),

    /**
     * elapsed time of a temporary halt of action.
     * 
     */
    DELAY("DELAY"),

    /**
     * DC current or voltage. **DEPRECATED** in *Version 1.6*.
     * 
     */
    DIRECT("DIRECT"),

    /**
     * setting or operator selection used to execute a test mode to confirm
     *             the execution of machine functions.
     * 
     */
    DRY_RUN("DRY_RUN"),

    /**
     * D-Scale weighting factor on the frequency scale.
     * 
     */
    D_SCALE("D_SCALE"),

    /**
     * relating to the expiration or end of useful life for a material or
     *             other physical item.
     * 
     */
    EXPIRATION("EXPIRATION"),

    /**
     * relating to the first use of a material or other physical item.
     * 
     */
    FIRST_USE("FIRST_USE"),

    /**
     * actions, items, or activities being counted that conform to
     *             specification or expectation.
     * 
     */
    GOOD("GOOD"),

    /**
     * relating to or derived from the last {{term(observation)}}.
     * 
     */
    INCREMENTAL("INCREMENTAL"),

    /**
     * relating to momentary activation of a function or a movement.
     *             **DEPRECATION WARNING**: May be deprecated in the future.
     * 
     */
    JOG("JOG"),

    /**
     * indication of the position of a mechanism that may move in a lateral
     *             direction.
     * 
     */
    LATERAL("LATERAL"),

    /**
     * scale to measure the elasticity of a surface.
     * 
     */
    LEEB("LEEB"),

    /**
     * reference to a length type tool offset variable.
     * 
     */
    LENGTH("LENGTH"),

    /**
     * state of the power source.
     * 
     */
    LINE("LINE"),

    /**
     * direction of motion of a linear motion.
     * 
     */
    LINEAR("LINEAR"),

    /**
     * indication that the subparts of a piece of equipment are under load.
     * 
     */
    LOADED("LOADED"),

    /**
     * setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    MACHINE_AXIS_LOCK("MACHINE_AXIS_LOCK"),

    /**
     * relating to the primary logic or motion program currently being
     *             executed.
     * 
     */
    MAIN("MAIN"),

    /**
     * relating to maintenance on the piece of equipment.
     * 
     */
    MAINTENANCE("MAINTENANCE"),

    /**
     * indication of the state of an operator controlled interlock that can
     *             inhibit the ability to initiate an unclamp action of an
     *             electronically controlled chuck.
     * 
     */
    MANUAL_UNCLAMP("MANUAL_UNCLAMP"),

    /**
     * related to the production of a material or other physical item.
     * 
     */
    MANUFACTURE("MANUFACTURE"),

    /**
     * maximum value.
     * 
     */
    MAXIMUM("MAXIMUM"),

    /**
     * minimum value.
     * 
     */
    MINIMUM("MINIMUM"),

    /**
     * scale to measure the resistance to scratching of a surface.
     * 
     */
    MOHS("MOHS"),

    /**
     * indication of the open or closed state of a mechanism.
     * 
     */
    MOTION("MOTION"),

    /**
     * no weighting factor on the frequency scale.
     * 
     */
    NO_SCALE("NO_SCALE"),

    /**
     * piece of equipment that is powered or performing any activity.
     * 
     */
    OPERATING("OPERATING"),

    /**
     * relating to the person currently responsible for operating the piece
     *             of equipment.
     * 
     */
    OPERATOR("OPERATOR"),

    /**
     * setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    OPTIONAL_STOP("OPTIONAL_STOP"),

    /**
     * overridden value.
     * 
     */
    OVERRIDE("OVERRIDE"),

    /**
     * piece of equipment is powered and functioning or
     *             {{block(Component)}} that are required to remain on are powered.
     * 
     */
    POWERED("POWERED"),

    /**
     * main or most important location of a piece of bar stock.
     * 
     */
    PRIMARY("PRIMARY"),

    /**
     * position provided by a measurement probe. **DEPRECATION WARNING**:
     *             May be deprecated in the future.
     * 
     */
    PROBE("PROBE"),

    /**
     * relating to production of a part or product on a piece of equipment.
     * 
     */
    PROCESS("PROCESS"),

    /**
     * directive value without offsets and adjustments.
     * 
     */
    PROGRAMMED("PROGRAMMED"),

    /**
     * reference to a radial type tool offset variable.
     * 
     */
    RADIAL("RADIAL"),

    /**
     * performing an operation faster or in less time than nominal rate.
     * 
     */
    RAPID("RAPID"),

    /**
     * remaining measure or count of an action, object or activity.
     * 
     */
    REMAINING("REMAINING"),

    /**
     * scale to measure the resistance to deformation of a surface.
     * 
     */
    ROCKWELL("ROCKWELL"),

    /**
     * direction of a rotary motion using the right hand rule convention.
     * 
     */
    ROTARY("ROTARY"),

    /**
     * identity of a control program that is used to specify the order of
     *             execution of other programs.
     * 
     */
    SCHEDULE("SCHEDULE"),

    /**
     * relating to the preparation of a piece of equipment for production
     *             or restoring the piece of equipment to a neutral state after
     *             production.
     * 
     */
    SET_UP("SET_UP"),

    /**
     * scale to measure the resistance to deformation of a surface.
     * 
     */
    SHORE("SHORE"),

    /**
     * setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    SINGLE_BLOCK("SINGLE_BLOCK"),

    /**
     * standard measure of an object or an action.
     * 
     */
    STANDARD("STANDARD"),

    /**
     * boundary when an activity or an event commences.
     * 
     */
    START("START"),

    /**
     * indication of the activation state of a mechanism represented by a
     *             {{block(Composition)}}.
     * 
     */
    SWITCHED("SWITCHED"),

    /**
     * goal of the operation or process.
     * 
     */
    TARGET("TARGET"),

    /**
     * relating to the end or completion of an activity or event.
     * 
     */
    TARGET_COMPLETION("TARGET_COMPLETION"),

    /**
     * setting or operator selection that changes the behavior of the
     *             controller on a piece of equipment.
     * 
     */
    TOOL_CHANGE_STOP("TOOL_CHANGE_STOP"),

    /**
     * remaining usable measure of an object or action.
     * 
     */
    USEABLE("USEABLE"),

    /**
     * indication of the position of a mechanism that may move in a
     *             vertical direction.
     * 
     */
    VERTICAL("VERTICAL"),

    /**
     * scale to measure the resistance to deformation of a surface.
     * 
     */
    VICKERS("VICKERS"),

    /**
     * piece of equipment performing any activity, the equipment is active
     *             and performing a function under load or not.
     * 
     */
    WORKING("WORKING"),

    /**
     * IPV4 network address of the {{block(Component)}}.
     * 
     */
    @XmlEnumValue("IPV4_ADDRESS")
    IPV_4_ADDRESS("IPV4_ADDRESS"),

    /**
     * IPV6 network address of the {{block(Component)}}.
     * 
     */
    @XmlEnumValue("IPV6_ADDRESS")
    IPV_6_ADDRESS("IPV6_ADDRESS"),

    /**
     * Gateway for the {{block(Component)}} network.
     * 
     */
    GATEWAY("GATEWAY"),

    /**
     * SubNet mask for the {{block(Component)}} network.
     * 
     */
    SUBNET_MASK("SUBNET_MASK"),

    /**
     * layer2 Virtual Local Network (VLAN) ID for the {{block(Component)}}
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
     * identifies whether the connection type is wireless.
     * 
     */
    WIRELESS("WIRELESS"),

    /**
     * license code to validate or activate the hardware or software.
     * 
     */
    LICENSE("LICENSE"),

    /**
     * version of the hardware or software.
     * 
     */
    VERSION("VERSION"),

    /**
     * date the hardware or software was released for general use.
     * 
     */
    RELEASE_DATE("RELEASE_DATE"),

    /**
     * date the hardware or software was installed.
     * 
     */
    INSTALL_DATE("INSTALL_DATE"),

    /**
     * corporate identity for the maker of the hardware or software.
     * 
     */
    MANUFACTURER("MANUFACTURER"),

    /**
     * universally unique identifier as specified in ISO 11578 or RFC 4122.
     * 
     */
    UUID("UUID"),

    /**
     * serial number that uniquely identifies a specific part.
     * 
     */
    SERIAL_NUMBER("SERIAL_NUMBER"),

    /**
     * material that is used to produce parts.
     * 
     */
    RAW_MATERIAL("RAW_MATERIAL"),

    /**
     * group of parts tracked as a lot.
     * 
     */
    LOT("LOT"),

    /**
     * group of parts produced in a batch.
     * 
     */
    BATCH("BATCH"),

    /**
     * material heat number.
     * 
     */
    HEAT_TREAT("HEAT_TREAT"),

    /**
     * particular part design or model.
     * 
     */
    PART_NUMBER("PART_NUMBER"),

    /**
     * group of parts having similarities in geometry, manufacturing
     *             process, and/or functions.
     * 
     */
    PART_FAMILY("PART_FAMILY"),

    /**
     * word or set of words by which a part is known, addressed, or
     *             referred to.
     * 
     */
    PART_NAME("PART_NAME"),

    /**
     * step in the process plan that this occurrence corresponds to.
     * 
     */
    PROCESS_STEP("PROCESS_STEP"),

    /**
     * process plan that a process occurrence belongs to.
     * 
     */
    PROCESS_PLAN("PROCESS_PLAN"),

    /**
     * authorization of a process occurrence.
     * 
     */
    ORDER_NUMBER("ORDER_NUMBER"),

    /**
     * word or set of words by which a process being executed (process
     *             occurrence) by the device is known, addressed, or referred to.
     * 
     */
    PROCESS_NAME("PROCESS_NAME"),

    /**
     * reference to a ISO 10303 Executable.
     * 
     */
    ISO_STEP_EXECUTABLE("ISO_STEP_EXECUTABLE"),

    /**
     * associated with the completion of an activity or event.
     * 
     */
    COMPLETE("COMPLETE"),

    /**
     * relating to logic or motion program currently executing.
     * 
     */
    ACTIVE("ACTIVE"),

    /**
     * actions or activities that were attempted , but failed to complete
     *             or resulted in an unexpected or unacceptable outcome.
     * 
     */
    FAILED("FAILED"),

    /**
     * actions or activities that were attempted, but terminated before
     *             they could be completed.
     * 
     */
    ABORTED("ABORTED"),

    /**
     * boundary when an activity or an event terminates.
     * 
     */
    ENDED("ENDED"),

    /**
     * amount discarded.
     * 
     */
    WASTE("WASTE"),

    /**
     * amount included in the {{term(part)}}.
     * 
     */
    PART("PART"),

    /**
     * {{term(request)}} by an {{block(Interface)}} for a task.
     * 
     */
    REQUEST("REQUEST"),

    /**
     * {{term(response)}} by an {{block(Interface)}} to a {{term(request)}}
     *             for a task.
     * 
     */
    RESPONSE("RESPONSE"),

    /**
     * phase or segment of a recipe or program.
     * 
     */
    ACTIVITY("ACTIVITY"),

    /**
     * phase of a recipe process.
     * 
     */
    SEGMENT("SEGMENT"),

    /**
     * process as part of product production; can be a subprocess of a
     *             larger process.
     * 
     */
    RECIPE("RECIPE"),

    /**
     * step of a discrete manufacturing process.
     * 
     */
    OPERATION("OPERATION"),

    /**
     * observed as a binary data type.
     * 
     */
    BINARY("BINARY"),

    /**
     * observed as a boolean data type.
     * 
     */
    BOOLEAN("BOOLEAN"),

    /**
     * observed as a set containing a restricted number of discrete values
     *             where each discrete value is named and unique. {{cite(ISO
     *             21961:2003, 013)}}
     * 
     */
    ENUMERATED("ENUMERATED"),

    /**
     * indicated by the presence or existence of something.
     * 
     */
    DETECT("DETECT");
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
