package com.woofate.service.impl

import com.woofate.service.OrderService
import com.woofate.service.UserService
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
    val user = uerService.getUser("1")
    logger {}.info("创建订单")
    return "$user succeeded in creating the order"
  }
}