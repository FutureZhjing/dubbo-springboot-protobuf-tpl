package com.woofate.service.impl

import com.woofate.payload.User
import com.woofate.service.UserService
import org.apache.dubbo.config.annotation.DubboService

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@DubboService(version = "1.0")
class UserServiceImpl : UserService {

  override fun getUser(uid: String) = User(uid, "FutureZhjing")

}