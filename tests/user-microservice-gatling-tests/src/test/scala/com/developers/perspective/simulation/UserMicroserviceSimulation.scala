package com.developers.perspective.simulation

/**
  * Created by dmumma on 11/20/15.
  */

import com.developers.perspective.util._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import com.developers.perspective.scenarios.{GetUsers, PostUser}

class UserMicroserviceSimulation extends Simulation {

  val httpConf = http.baseURL(Environemnt.baseURL)
                      .headers(Headers.commonHeader)

  val userMicroserviceScenarios = List(
    //PostAndGetUser.postAndGetUser.inject(atOnceUsers(1)),

    GetUsers.getUsers.inject(
      atOnceUsers(1),
      //rampUsers(100) over(1 seconds),
      //constantUsersPerSec(1000) during(15 seconds)
      rampUsersPerSec(1) to 100 during(30 seconds) // 6
      //rampUsersPerSec(10) to 20 during(10 minutes) randomized, // 7
      //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy(10 seconds), // 8
      //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy atOnceUsers(30), // 9
      //heavisideUsers(1000) over(20 seconds) // 10
    ),

    PostUser.postUser.inject(atOnceUsers(Environemnt.users.toInt))
      .throttle(reachRps(600) in (20 seconds), holdFor(60 seconds))
  )

  setUp(userMicroserviceScenarios)
    .protocols(httpConf)
    .maxDuration(1 minutes)
    .assertions(
      global.responseTime.max.lessThan(Environemnt.maxResponseTime.toInt)
    )
}