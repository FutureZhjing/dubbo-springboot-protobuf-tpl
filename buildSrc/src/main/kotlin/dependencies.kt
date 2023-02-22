/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
object Version {
  const val kotlin = "1.7.22"
  const val spring_boot = "3.0.2"
  const val spring_dependency_management = "1.1.0"
  const val kotlin_logging_jvm = "3.0.4"
  const val hutool = "5.8.12"
  const val dubbo = "3.2.0-beta.5"
}

object Deps {
  const val spring_boot_starter = "org.springframework.boot:spring-boot-starter"
  const val spring_boot_starter_web = "org.springframework.boot:spring-boot-starter-web"
  const val kotlin_logging_jvm = "io.github.microutils:kotlin-logging-jvm:${Version.kotlin_logging_jvm}"
  const val zookeeper = "org.apache.zookeeper:zookeeper:3.7.0"

  object Dubbo {
    const val dubbo_spring_boot_starter = "org.apache.dubbo:dubbo-spring-boot-starter:${Version.dubbo}"
    const val dubbo_rpc_dubbo = "org.apache.dubbo:dubbo-rpc-dubbo:${Version.dubbo}"
    const val dubbo_registry_zookeeper = "org.apache.dubbo:dubbo-registry-zookeeper:${Version.dubbo}"
  }
}
