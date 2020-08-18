import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    java
    kotlin("jvm") version "1.3.10"
}

group = "org.arhan"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("http://dl.bintray.com/kotlin/kotlin-eap") }
    jcenter()
}

dependencies {

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.11")
    implementation("org.jetbrains.exposed:exposed:0.10.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")

    testCompile("junit", "junit", "4.12")
    compile(kotlin("script-runtime"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
