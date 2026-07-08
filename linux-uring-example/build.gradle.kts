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
        linuxX64Main.dependencies {
            implementation(project(":linux-uring"))
        }
    }
}

