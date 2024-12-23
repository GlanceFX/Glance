plugins {
    kotlin("jvm") version "2.0.0" apply false
}

allprojects {
    plugins.apply("java")
    plugins.apply("java-library")

    group = "com.glance"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}