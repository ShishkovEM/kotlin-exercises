rootProject.name = "kotlin-exercises"

pluginManagement{
    val kotlinVersion: String by settings
    val foojayResolverConventionVersion: String by settings

    plugins{
        kotlin("jvm") version kotlinVersion
        id("org.gradle.toolchains.foojay-resolver-convention") version foojayResolverConventionVersion
    }
}

include("m1-init")
