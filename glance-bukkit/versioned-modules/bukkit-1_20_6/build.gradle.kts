plugins {
    id("io.papermc.paperweight.userdev") version "1.7.3"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

dependencies {
    paperweight.paperDevBundle("1.20.6-R0.1-SNAPSHOT")
}