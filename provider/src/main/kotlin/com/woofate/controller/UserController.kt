package com.woofate.controller

import com.woofate.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
@RequestMapping("/usr")
@RestController
class UserController(
  private val userService: UserService
) {

  @GetMapping("/hi")
  fun getUser(): String {
    return userService.getUser()
  }

}