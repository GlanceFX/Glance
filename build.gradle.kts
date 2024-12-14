plugins {
    kotlin("jvm") version "2.0.0" apply false
}

allprojects {
    plugins.apply("java")


    group = "com.parakeetstudios.apparition"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}