rootProject.name = "hivemq-mtconnect-protocol"

pluginManagement {
    includeBuild("../hivemq-edge/edge-plugins")
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../hivemq-edge/gradle/libs.versions.toml"))
        }
    }
}
