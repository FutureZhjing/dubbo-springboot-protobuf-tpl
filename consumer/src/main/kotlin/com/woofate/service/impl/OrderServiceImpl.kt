package com.woofate.service.impl

import com.woofate.service.OrderService
import org.springframework.stereotype.Service

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@Service
class OrderServiceImpl : OrderService {

  override fun getOrder(): String {
    return "order detail"
  }
}