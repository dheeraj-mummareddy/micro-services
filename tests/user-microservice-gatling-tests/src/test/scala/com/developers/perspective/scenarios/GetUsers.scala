package com.developers.perspective.scenarios

/**
  * Created by dmumma on 11/19/15.
  */


import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetUsers {

  val getUsersHttp = http("get all users")
                        .get("/")
                        .check(status is 200)

  val getUsers = scenario("Get All users")
                .exec(getUsersHttp)
}
