plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":glance-api"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}