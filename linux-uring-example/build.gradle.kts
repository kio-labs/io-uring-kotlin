plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {
    listOf(
        linuxX64(),
        linuxArm64()
    ).forEach {
        it.binaries {
            executable {
                entryPoint("main")
            }
        }
    }

    sourceSets {
        linuxMain.dependencies {
            implementation(project(":linux-uring"))
        }
    }
}

