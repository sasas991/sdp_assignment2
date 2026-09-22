plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.example.factorymethod.Main"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runFactoryMethod") {
    group = "application"
    description = "run factory method example"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.factorymethod.Main")
}

tasks.register<JavaExec>("runAbstractFactory") {
    group = "application"
    description = "run abstract factory example"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.abstractfactory.Main")
}