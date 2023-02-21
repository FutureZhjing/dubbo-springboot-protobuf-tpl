package com.woofate.service.impl

import com.woofate.service.UserService
import org.springframework.stereotype.Service

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@Service
class UserServiceImpl : UserService {

  override fun getUser(): String {
    return "hi, dubbo"
  }
}