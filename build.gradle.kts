import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.internal.config.LanguageFeature

plugins {
    kotlin("jvm") version "2.1.20"
}

group = "me.anton"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    implementation("org.junit.jupiter:junit-jupiter-api:5.10.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.8.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
//    explicitApi()
//    explicitApiWarning()
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }

    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }

    sourceSets.all {
        languageSettings {
            enableLanguageFeature(LanguageFeature.ContextReceivers.name)
            enableLanguageFeature(LanguageFeature.WhenGuards.name)
            version = 2.0
        }
    }

}

//
//
//tasks.withType<KotlinCompile> {
//    compilerOptions {
//        freeCompilerArgs.set(listOf("-Xcontext-receivers"))
//        jvmTarget.set(JvmTarget.JVM_17)
//    }
//}