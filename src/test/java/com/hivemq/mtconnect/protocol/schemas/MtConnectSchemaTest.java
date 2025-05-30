/*
 * Copyright 2023-present HiveMQ GmbH
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.hivemq.mtconnect.protocol.schemas;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MtConnectSchemaTest {
    protected @NotNull Locale orginalLocale;

    @AfterEach
    protected void afterEach() {
        Locale.setDefault(orginalLocale);
    }

    @BeforeEach
    public void beforeEach() {
        orginalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @Test
    public void whenInputXmlIsAssets_1_2_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Assets_1_2.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/assets/assets-1-2.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2.MTConnectAssetsType
                    mtConnectAssetsType =
                    (com.hivemq.mtconnect.protocol.schemas.assets.assets_1_2.MTConnectAssetsType) element.getValue();
            assertThat(mtConnectAssetsType).isNotNull();
            assertThat(mtConnectAssetsType.getAssets().getAsset()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_0_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_0.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-0.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_0.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_0.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_1_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_1.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-1.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_1.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_1.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(3);
        }
    }

    @Test
    public void whenInputXmlIsIncorrectDevices_1_3_smstestbed_thenXmlValidationShouldFailed() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_3.getUnmarshaller();
        String xmlString = IOUtils.resourceToString("/devices/devices-1-3-smstestbed.xml", StandardCharsets.UTF_8);
        xmlString = xmlString.replace("<Header ", "<Test ");
        try (final StringReader stringReader = new StringReader(xmlString)) {
            assertThatThrownBy(() -> Objects.requireNonNull(unmarshaller).unmarshal(stringReader)).isInstanceOf(
                    JAXBException.class).hasMessageStartingWith("unexpected element");
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_3_smstestbed_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_3.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString(
                "/devices/devices-1-3-smstestbed.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_3.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_3.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(8);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_4_thenSchemaLocationShouldBeDetected() throws Exception {
        final String schemaLocation = MtConnectSchema.extractSchemaLocation(IOUtils.resourceToString(
                "/devices/devices-1-4.xml",
                StandardCharsets.UTF_8));
        assertThat(schemaLocation).isNotNull();
        final MtConnectSchema mtConnectSchema = MtConnectSchema.of(schemaLocation);
        assertThat(mtConnectSchema).isNotNull().isEqualTo(MtConnectSchema.Devices_1_4);
    }

    @Test
    public void whenInputXmlIsDevices_1_4_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_4.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-4.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_4.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_4.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_5_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_5.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-5.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_5.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_5.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_7_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_7.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-7.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_7.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_1_8_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_1_8.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-1-8.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_1_8.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsDevices_2_0_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_2_0.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-2-0.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_2_0.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(2);
        }
    }

    @Test
    public void whenInputXmlIsDevices_2_2_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Devices_2_2.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/devices/devices-2-2.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element =
                    (JAXBElement<?>) Objects.requireNonNull(unmarshaller).unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.devices.devices_2_2.MTConnectDevicesType
                    mtConnectDevicesType =
                    (com.hivemq.mtconnect.protocol.schemas.devices.devices_2_2.MTConnectDevicesType) element.getValue();
            assertThat(mtConnectDevicesType).isNotNull();
            assertThat(mtConnectDevicesType.getDevices().getDevice()).hasSize(1);
        }
    }

    @Test
    public void whenInputXmlIsStreams_1_3_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Streams_1_3.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/streams/streams-1-3.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3.MTConnectStreamsType
                    mtConnectStreamsType =
                    (com.hivemq.mtconnect.protocol.schemas.streams.streams_1_3.MTConnectStreamsType) element.getValue();
            assertThat(mtConnectStreamsType).isNotNull();
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream()).hasSize(1);
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream().get(0).getComponentStream()).hasSize(17);
        }
    }

    @Test
    public void whenInputXmlIsStreams_1_4_thenSchemaLocationShouldBeDetected() throws Exception {
        final String schemaLocation = MtConnectSchema.extractSchemaLocation(IOUtils.resourceToString(
                "/streams/streams-1-4.xml",
                StandardCharsets.UTF_8));
        assertThat(schemaLocation).isNotNull();
        final MtConnectSchema mtConnectSchema = MtConnectSchema.of(schemaLocation);
        assertThat(mtConnectSchema).isNotNull().isEqualTo(MtConnectSchema.Streams_1_4);
    }

    @Test
    public void whenInputXmlIsStreams_1_4_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Streams_1_4.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/streams/streams-1-4.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.streams.streams_1_4.MTConnectStreamsType
                    mtConnectStreamsType =
                    (com.hivemq.mtconnect.protocol.schemas.streams.streams_1_4.MTConnectStreamsType) element.getValue();
            assertThat(mtConnectStreamsType).isNotNull();
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream()).hasSize(1);
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream().get(0).getComponentStream()).hasSize(3);
        }
    }

    @Test
    public void whenInputXmlIsStreams_1_5_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Streams_1_5.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/streams/streams-1-5.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5.MTConnectStreamsType
                    mtConnectStreamsType =
                    (com.hivemq.mtconnect.protocol.schemas.streams.streams_1_5.MTConnectStreamsType) element.getValue();
            assertThat(mtConnectStreamsType).isNotNull();
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream()).hasSize(1);
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream().get(0).getComponentStream()).hasSize(4);
        }
    }

    @Test
    public void whenInputXmlIsStreams_2_0_thenXmlValidationShouldPass() throws Exception {
        final Unmarshaller unmarshaller = MtConnectSchema.Streams_2_0.getUnmarshaller();
        try (final StringReader stringReader = new StringReader(IOUtils.resourceToString("/streams/streams-2-0.xml",
                StandardCharsets.UTF_8))) {
            final JAXBElement<?> element = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
            assertThat(element.getValue()).isNotNull();
            final com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0.MTConnectStreamsType
                    mtConnectStreamsType =
                    (com.hivemq.mtconnect.protocol.schemas.streams.streams_2_0.MTConnectStreamsType) element.getValue();
            assertThat(mtConnectStreamsType).isNotNull();
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream()).hasSize(2);
            assertThat(mtConnectStreamsType.getStreams().getDeviceStream().get(0).getComponentStream()).hasSize(2);
        }
    }

    @Test
    public void whenSchemaLocationCouldBeNotStandard_thenDetectAsMuchAsPossible() throws IOException {
        final Map<String, MtConnectSchema> schemaMap = new HashMap<>();
        schemaMap.putAll(Map.of(
                "/assets/assets-1-2.xml", MtConnectSchema.Assets_1_2));
        schemaMap.putAll(Map.of(
                "/devices/devices-1-0.xml", MtConnectSchema.Devices_1_0,
                "/devices/devices-1-1.xml", MtConnectSchema.Devices_1_1,
                "/devices/devices-1-3-smstestbed.xml", MtConnectSchema.Devices_1_3,
                "/devices/devices-1-4.xml", MtConnectSchema.Devices_1_4,
                "/devices/devices-1-5.xml", MtConnectSchema.Devices_1_5,
                "/devices/devices-1-7.xml", MtConnectSchema.Devices_1_7,
                "/devices/devices-1-8.xml", MtConnectSchema.Devices_1_8,
                "/devices/devices-2-0.xml", MtConnectSchema.Devices_2_0,
                "/devices/devices-2-2.xml", MtConnectSchema.Devices_2_2));
        schemaMap.putAll(Map.of(
                "/streams/streams-1-3.xml", MtConnectSchema.Streams_1_3,
                "/streams/streams-1-4.xml", MtConnectSchema.Streams_1_4,
                "/streams/streams-1-5.xml", MtConnectSchema.Streams_1_5,
                "/streams/streams-2-0.xml", MtConnectSchema.Streams_2_0));
        for (final Map.Entry<String, MtConnectSchema> entry : schemaMap.entrySet()) {
            final String path = entry.getKey();
            final MtConnectSchema expectedSchema = entry.getValue();
            final String xmlString = IOUtils.resourceToString(path, StandardCharsets.UTF_8);
            final String schemaLocation = MtConnectSchema.extractSchemaLocation(xmlString);
            assertThat(expectedSchema).isNotNull();
            final MtConnectSchema schema = MtConnectSchema.of(schemaLocation);
            assertThat(schema).as("Cannot parse " + schemaLocation + " in " + path).isNotNull().isEqualTo(expectedSchema);
        }
    }
}
