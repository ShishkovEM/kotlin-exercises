plugins {
    kotlin("jvm") apply false
}

group = "ru.eshishkov.kotlin.exercises"
version = "1.0-SNAPSHOT"

allprojects{
    repositories {
        mavenCentral()
    }
}

subprojects{
    group = rootProject.group
    version = rootProject.version
}
