package com.woofate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@SpringBootApplication
class ProviderAppRunner

fun main(args: Array<String>) {
  runApplication<ProviderAppRunner>(*args)
}