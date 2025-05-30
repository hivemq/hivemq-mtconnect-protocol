# HiveMQ MTConnect Protocol

HiveMQ MTConnect Protocol is a Java implementation of the MTConnect protocol.

## Features

- Support MTConnect Schemas

| MTConnect Schema | Version   |
| ---------------- | --------- |
| Assets           | 1.2 - 2.4 |
| Devices          | 1.0 - 2.4 |
| Error            | 1.1 - 2.4 |
| Streams          | 1.1 - 2.4 |

- Support Conversion from MTConnect XML to Java Entities
- Support MTConnect Schema Version Detection

## Installation

### Maven

```xml
<dependency>
  <groupId>com.hivemq</groupId>
  <artifactId>hivemq-mtconnect-protocol</artifactId>
  <version>1.0.0</version>
</dependency>
<dependency>
    <groupId>jakarta.xml.bind</groupId>
    <artifactId>jakarta.xml.bind-api</artifactId>
    <version>4.0.2</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>4.0.5</version>
</dependency>
```

### Gradle

```kotlin
implementation 'com.hivemq:hivemq-mtconnect-protocol:1.0.0'
implementation 'jakarta.xml.bind:jakarta.xml.bind-api:4.0.2'
implementation 'com.sun.xml.bind:jaxb-impl:4.0.5'
```

### Gradle (Kotlin)

```kotlin
implementation("com.hivemq:hivemq-mtconnect-protocol:1.0.0")
implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.2")
implementation("com.sun.xml.bind:jaxb-impl:4.0.5")
```

## Quick Start

```java
// Extract the schema location from an XML string.
String schemaLocation = MtConnectSchema.extractSchemaLocation(xmlString);

// Get the MTConnect schema from a schema location.
MtConnectSchema schema = MtConnectSchema.of(schemaLocation);

// Convert an XML string to an MTConnect entity.
try (StringReader stringReader = new StringReader(xmlString)) {
    JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
    com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0.MTConnectStreamsType
            mtConnectStreamsType =
            (com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0.MTConnectStreamsType) element.getValue();
}
```

## Design

### Schema Validation

The [Schema](https://github.com/mtconnect/schema) validation is XSD based. That implies a considerable performance overhead if the validation is performed per message. In general, there are 2 options:

1. No Validation - Turn off the schema validation.
2. Complete Validation - Implement the validation in Java to improve the performance.

|                  | No Validation | Complete Validation |
| ---------------- | ------------- | ------------------- |
| Performance      | Excellent     | Slow                |
| Dev Cost         | Low           | High                |
| Malformed Schema | Allow         | Disallow            |
| Custom Schema    | Support       | Not Support         |
| Type Cast        | Loose         | Strict              |

### Schema Validation Code Generation

- Download [jaxb-ri](https://eclipse-ee4j.github.io/jaxb-ri/) and unzip it to `hivemq-mtconnect-protocol` folder.
- Download [Xerces2 Java Binary (XML Schema 1.1)](https://xerces.apache.org/mirrors.cgi) and unzip it to `hivemq-mtconnect-protocol` folder.
- `git clone https://github.com/mtconnect/schema.git` to to `hivemq-mtconnect-protocol` folder. Here is a sample directory structure.

```
hivemq-mtconnect-protocol
├── jaxb-ri
├── schema
└── xerces-2_12_2-xml-schema-1.1
```

- Run all test cases in `MtConnectSchemaPatchTest` to generate the schema patch files. By default, those test cases are skipped if `schema` folder is not found.
- Navigate to `schema` and run `./patch-script.sh` to generate all the XML entities.
- After all the XML entities are generated, run all test cases `MtConnectSchemaJsonAnnotationTest` to convert the XML annotations to Jackson annotations. This is a one-time process and the test case is able to generate the Jackson annotations in an incremental way. By default, those test cases are skipped if `jaxb-ri` or `xerces` is not found.

#### Known Issues

##### Property Already Defined

```sh
parsing a schema...
[ERROR] Property "Type" is already defined. Use <jaxb:property> to resolve this conflict.
  line 5174 of file:/.../schema/MTConnectDevices_1.5.xsd

[ERROR] The following location is relevant to the above error
  line 5064 of file:/.../schema/MTConnectDevices_1.5.xsd
```

This issue is caused by the absence of property `name` in `<xs:attribute ref='xlink:type' use='optional' fixed='locator'>...</xs:attribute>`. So the default property `name` becomes `type` which conflicts with the inherited property `type` as the `name`. Test cases in `MtConnectSchemaPatchTest` are able to fix this issue. One of the test cases generates some patch files like the one below to tell `xjc` to use the property `typeOfDeviceRelationship` instead of `type` as `name` so that the conflict can be resolved.

```xml
<?xml version='1.0' encoding='UTF-8'?>
<bindings xmlns="http://java.sun.com/xml/ns/jaxb"
    xmlns:xsi="http://www.w3.org/2000/10/XMLSchema-instance"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" version="2.1">
    <bindings schemaLocation="MTConnectDevices_1.5.xsd" version="1.0">
        <bindings node="//xs:complexType[@name='DeviceRelationshipType']">
            <bindings node=".//xs:attribute[@ref='xlink:type']">
                <property name="typeOfDeviceRelationship"/>
            </bindings>
        </bindings>
    </bindings>
</bindings>
```

##### EventType and EntryType

`EventType` and `EntryType` in streams 1.5+ are marked as `abstract='true'` and `mixed='true'`. That tells `xjc` to generate the `String content` property in the base types. However, in derived types the content can be a list of `Entry`, `Cell`, etc. nodes. Obviously `xjc` cannot generate a second `content` in the derived classes because `javac` doesn't allow that. So `xjc` silently ignores those `Entry`, `Cell`, etc. nodes. That causes the MTConnect XML data to be invalid. The workaround is to mark `mixed='false'` in both the base types and the derived types. Some test cases in `MtConnectSchemaPatchTest` are able to fix this issue by automating the patching process via XPath.

## Test

### Test Bed

There is a [Smart Manufacturing Systems (SMS) Test Bed](https://www.nist.gov/laboratories/tools-instruments/smart-manufacturing-systems-sms-test-bed) offering Volatile Data Stream (VDS).

- [VDS Schema](https://smstestbed.nist.gov/vds)
- [Real-time stream of most current value for each data item](https://smstestbed.nist.gov/vds/current)
- [Time series of most recent values collected for each data item](https://smstestbed.nist.gov/vds/sample)
- [Report of all data items available](https://smstestbed.nist.gov/vds/probe)

## Release Notes

- [Release Notes](RELEASE-NOTES.md)

## References

- [mtconnect.org](https://www.mtconnect.org/)
- [MTConnect Github](http://www.github.com/mtconnect)
- [MTConnect Schema](https://github.com/mtconnect/schema)
- [jaxb-ri](https://eclipse-ee4j.github.io/jaxb-ri/)
