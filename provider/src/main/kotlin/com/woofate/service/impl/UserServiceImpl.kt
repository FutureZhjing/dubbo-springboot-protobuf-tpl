package com.woofate.service.impl

import com.woofate.dubbo.tri.*
import mu.KotlinLogging.logger
import org.apache.dubbo.config.annotation.DubboService

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@DubboService(version = "1.0")
class UserServiceImpl : UserService {

  override fun sayHi(request: HelloRequest?): HelloReply {
    logger {}.info("request from grpc ${request}")
    return HelloReply.newBuilder()
      .setMessage("message reply by dubbo")
      .build()
  }
}