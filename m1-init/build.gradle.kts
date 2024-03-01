plugins {
    kotlin("jvm")
}

group = "ru.eshishkov.kotlin.exercises"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))
}

kotlin {
    jvmToolchain(20)
}
