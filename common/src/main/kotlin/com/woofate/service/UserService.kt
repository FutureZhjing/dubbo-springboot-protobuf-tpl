package com.woofate.service

import com.woofate.payload.User

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
interface UserService {

  fun getUser(uid: String): User?

}