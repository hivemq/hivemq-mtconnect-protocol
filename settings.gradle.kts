rootProject.name = "hivemq-mtconnect-protocol"

pluginManagement {
    plugins {
        if (file("../hivemq-edge/edge-plugins").exists()) {
            includeBuild("../hivemq-edge/edge-plugins")
        }
    }
}
