package com.woofate

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = ["com.woofate.service"])
class ProviderAppRunner

fun main(args: Array<String>) {
  runApplication<ProviderAppRunner>(*args)
}