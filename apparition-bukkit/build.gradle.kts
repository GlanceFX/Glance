dependencies {
    implementation(project(":apparition-core"))
    implementation(project(":apparition-api"))

    // Include versioned modules
    implementation(project(":apparition-bukkit:versioned-modules:bukkit-1_20"))
    implementation(project(":apparition-bukkit:versioned-modules:bukkit-1_21"))
}