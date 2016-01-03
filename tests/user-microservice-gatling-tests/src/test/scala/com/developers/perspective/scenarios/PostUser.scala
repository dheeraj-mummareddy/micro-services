/**
  * Created by dmumma on 11/20/15.
  */
package com.developers.perspective.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object PostUser {

  val userString = "{\"firstName\":\"Scala\", \"lastName\":\"Java\",\"role\":\"ADMIN\"}"

  val postUserHttp = http("post user")
    .post("")
    .body(StringBody(userString))
    .check(status is 201)

  val postUser = scenario("post user")
    .exec(postUserHttp)
}