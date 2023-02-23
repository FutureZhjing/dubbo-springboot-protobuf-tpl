package com.woofate.service.impl

import com.woofate.dubbo.tri.HelloRequest
import com.woofate.dubbo.tri.UserService
import com.woofate.service.OrderService
import mu.KotlinLogging.logger
import org.apache.dubbo.config.annotation.DubboReference
import org.springframework.stereotype.Service

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@Service
class OrderServiceImpl : OrderService {

  @DubboReference(version = "1.0")
  private lateinit var uerService: UserService

  override fun getOrder(): String {
    val res = uerService.sayHi(
      HelloRequest.newBuilder()
        .setName("futurezhjing")
        .build()
    )
    logger {}.info(res.toString())
    return "$res succeeded in creating the order"
  }
}