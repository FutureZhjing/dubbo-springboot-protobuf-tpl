package com.woofate.payload

import java.io.Serializable

/**
 * @author [FutureZhJing](mailto:FutureZhJing@qq.com)
 * @version 1.0
 */
data class User(
  var id: String? = null,
  var username: String? = null
) : Serializable