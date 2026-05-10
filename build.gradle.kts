import net.ltgt.gradle.errorprone.errorprone

plugins {
    java
    jacoco
    id("net.ltgt.errorprone") version "3.1.0"
}

group = "edu.teamrocket"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    errorprone("com.google.errorprone:error_prone_core:2.28.0")
}

tasks.withType<JavaCompile>().configureEach {
    options.errorprone.isEnabled.set(true)
    options.errorprone.disableWarningsInGeneratedCode.set(true)
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

jacoco {
    toolVersion = "0.8.12"
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}
