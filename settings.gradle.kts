@file:Suppress("UnstableApiUsage")

rootProject.name = "auto-version"

include("semantic-versioning")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
