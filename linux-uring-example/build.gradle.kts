plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {
    linuxX64 {
        binaries {
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

