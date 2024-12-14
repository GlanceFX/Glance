plugins {
    id("io.papermc.paperweight.userdev") version "1.7.3" apply false
}

subprojects {
    apply(plugin = "io.papermc.paperweight.userdev")

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
}
