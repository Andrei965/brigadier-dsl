plugins {
    kotlin("jvm") version "2.2.0-Beta1"
    `java-library`
}

repositories {
    maven(url = "https://libraries.minecraft.net")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("com.mojang:brigadier:1.2.9")
}
