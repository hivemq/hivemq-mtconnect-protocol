//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.hivemq.mtconnect.protocol.schemas.assets.assets_1_7;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A {{property(representation,DataItem)}} specifies the format and
 *         structure of the information for an {{term(observation)}}. The default
 *         {{property(representation,DataItem)}} is `VALUE` indicating the format
 *         as specified in {{citetitle(MTCPart3)}}. A
 *         {{property(representation,DataItem)}}, other than `VALUE`, will modify
 *         the element name of the {{term(observation)}} by appending the pascal
 *         case of the {{property(representation,DataItem)}} as follows:
 *         \begin{itemize} \item A {{block(DataItem)}} with {{property(type)}}
 *         `TEMPERATURE` and {{property(representation,DataItem)}} of `TIME_SERIES`
 *         becomes `TemperatureTimeSeries` \item **DEPRECATED** A
 *         {{block(DataItem)}} with {{property(type)}} `PART_COUNT` and
 *         {{property(representation,DataItem)}} of `DISCRETE` becomes
 *         `PartCountDiscrete` \item A {{block(DataItem)}} with {{property(type)}}
 *         `VARIABLE` and {{property(representation,DataItem)}} of `DATA_SET`
 *         becomes `VariableDataSet` \item A {{block(DataItem)}} with
 *         {{property(type)}} `WORK_OFFSET` and
 *         {{property(representation,DataItem)}} of `TABLE` becomes
 *         `WorkOffsetTable` \end{itemize} The following constraints apply to each
 *         {{property(representation,DataItem)}}: \begin{itemize} \item A
 *         {{block(DataItem)}} with {{property(representation,DataItem)}}
 *         `TIME_SERIES` **MUST** have a {{property(category,DataItem)}} `SAMPLE`
 *         \item \DEPRECATED A {{block(DataItem)}} with
 *         {{property(representation,DataItem)}} `DISCRETE` **MUST** have a
 *         {{property(category,DataItem)}} `EVENT` \item A {{block(DataItem)}} with
 *         {{property(representation,DataItem)}} `DATA_SET` **MUST** have a
 *         {{property(category,DataItem)}} `EVENT` or `SAMPLE` \item A
 *         {{block(DataItem)}} with {{property(representation,DataItem)}} `TABLE`
 *         **MUST** have a {{property(category,DataItem)}} `EVENT` or `SAMPLE`
 *         \end{itemize} The following sections provide semantic information for
 *         the {{block(Representation)}} model. !Representation.png! Note: See
 *         {{sect(Representation Schema Diagrams)}} for XML schema.
 * 
 * <p>Java class for RepresentationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RepresentationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TIME_SERIES"/>
 *     <enumeration value="VALUE"/>
 *     <enumeration value="DATA_SET"/>
 *     <enumeration value="DISCRETE"/>
 *     <enumeration value="TABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@com.fasterxml.jackson.annotation.JsonTypeName(value = "RepresentationType")
@XmlType(name = "RepresentationType")
@XmlEnum
public enum RepresentationType {


    /**
     * A series of sampled data. The data is reported for a specified
     *             number of samples and each sample is reported with a fixed period.
     * 
     */
    TIME_SERIES,

    /**
     * The measured value of the sample data. If no
     *             {{property(representation,DataItem)}} is specified for a data item,
     *             the {{property(representation,DataItem)}} **MUST** be determined to
     *             be `VALUE`.
     * 
     */
    VALUE,

    /**
     * The reported value(s) are represented as a set of
     *             {{termplural(key-value pair)}}. Each reported value in the
     *             {{term(Data Set)}} **MUST** have a unique key.
     * 
     */
    DATA_SET,

    /**
     * **DEPRECATED** as a {{property(representation)}} in *MTConnect
     *             Version. 1.5*. Replaced by the {{property(discrete,DataItem)}}
     *             attribute of a {{block(DataItem)}}.
     * 
     */
    DISCRETE,

    /**
     * A {{term(Table)}} is a two dimensional set of {{termplural(key-value
     *             pair)}} where the {{block(Entry)}} represents a row, and the value
     *             is a set of {{term(key-value pair)}} {{block(Cell)}} elements. The
     *             {{term(Table)}} follows the same behavior as the {{term(Data Set)}}
     *             for change tracking, clearing, and history. When an {{block(Entry)}}
     *             changes, all {{block(Cell)}} elements update as a single unit
     *             following the behavior of a {{term(Data Set)}}. Note 1 to Entry: It
     *             is best to use the {{block(Variable)}} {{block(DataItem)}}
     *             {{property(type)}} if the {{block(Cell)}} elements represent
     *             multiple semantic types. Each {{block(Entry)}} in the
     *             {{term(Table)}} **MUST** have a unique key. Each {{block(Cell)}} of
     *             each {{block(Entry)}} in the {{term(Table)}} **MUST** have a unique
     *             key. See {{cite(Section 5.6.5)}} of {{citetitle(MTCPart3)}}, for a
     *             description of {{block(Entry)}} and {{block(Cell)}} elements.
     * 
     */
    TABLE;

    public String value() {
        return name();
    }

    public static RepresentationType fromValue(String v) {
        return valueOf(v);
    }

}
