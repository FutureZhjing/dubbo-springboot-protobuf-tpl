package com.woofate.controller

import com.woofate.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@RequestMapping("/order")
@RestController
class OrderController(
  private val orderService: OrderService
) {

  @GetMapping("/hi")
  fun getUser(): String {
    return orderService.getOrder()
  }

}