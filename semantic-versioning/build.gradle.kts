plugins {
    alias(libs.plugins.kotlin)
}

kotlin {
    jvm()
    linuxX64()
    macosArm64()
    mingwX64()

    explicitApi()

    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.kotest.assertions.core)
            }
        }
    }
}
