import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
  id("org.springframework.boot") version Version.spring_boot
  id("io.spring.dependency-management") version "1.1.0"
  kotlin("jvm") version "1.7.22"
  kotlin("plugin.spring") version "1.7.22"
  kotlin("kapt") version "1.7.22"
}

allprojects {

  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")
  apply(plugin = "org.jetbrains.kotlin.jvm")
  apply(plugin = "org.jetbrains.kotlin.kapt")
  apply(plugin = "org.jetbrains.kotlin.plugin.spring")

  group = "com.woofate.wiki"
  version = "0.2.0-SNAPSHOT"

  java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  repositories {
    mavenLocal()
    mavenCentral()
  }

  dependencies {
    implementation(Deps.spring_boot_starter)
    implementation(Deps.spring_boot_starter_web)
    implementation(Deps.Dubbo.dubbo_spring_boot_starter)
    api(Deps.Dubbo.dubbo_rpc_dubbo)

    // TODO delete after dubbo 3.2.0 released
    api(Deps.zookeeper)
    implementation("org.apache.curator:curator-framework:5.4.0")
    implementation("org.apache.curator:curator-recipes:5.4.0")
    implementation("org.apache.curator:curator-x-discovery:5.4.0")

    api(Deps.Dubbo.dubbo_registry_zookeeper) {
      exclude("org.apache.zookeeper", "zookeeper")
      exclude("org.apache.curator", "curator-framework")
      exclude("org.apache.curator", "curator-recipes")
      exclude("org.apache.curator", "curator-x-discovery")
    }
    implementation(Deps.kotlin_logging_jvm)
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))
  }

  tasks {
    withType<KotlinCompile> {
      kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = JavaVersion.VERSION_17.toString()
      }
    }

    withType<Test> {
      useJUnitPlatform()
    }

  }
}


subprojects {

  tasks {
    withType<Jar> {
      enabled = true
    }

    withType<BootJar> {
      enabled = true
    }

  }

}

