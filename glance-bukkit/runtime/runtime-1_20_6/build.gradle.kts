plugins {
    id("io.papermc.paperweight.userdev") version "1.7.2"
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}

dependencies {
    paperweight.paperDevBundle("1.20.6-R0.1-SNAPSHOT")
    // paperweight.foliaDevBundle("1.20.6-R0.1-SNAPSHOT")

    implementation(project(":glance-bukkit:api:api-1_20_6"))
}

tasks {
    compileJava {
        options.release = 21
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
}
