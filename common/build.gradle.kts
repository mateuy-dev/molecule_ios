
plugins {
    kotlin("multiplatform")
    id("app.cash.molecule")
}
apply(plugin= "app.cash.molecule")
group = "com.example"
version = "1.0-SNAPSHOT"

kotlin {

    ios()

    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val desktopMain by getting {
            dependencies {

            }
        }
    }
}
