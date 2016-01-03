/**
  * Created by dmumma on 11/19/15.
  */

package com.developers.perspective.util

import java.util

object Environemnt {
  val baseURL = scala.util.Properties.envOrElse("baseURL", "http://localhost:9001/users")
  val users = scala.util.Properties.envOrElse("numberOfUsers", "5000")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "5000") // in milliseconds

}
