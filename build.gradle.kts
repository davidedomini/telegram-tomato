plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "io.github.davidedomini"
version = "1.0"

sourceSets {
    main{
        kotlin {
            setSrcDirs(listOf("src/main/kotlin"))
        }
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.1.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}