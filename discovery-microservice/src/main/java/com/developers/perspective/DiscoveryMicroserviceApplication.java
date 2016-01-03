package com.developers.perspective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dmumma on 11/12/15.
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryMicroserviceApplication.class, args);
    }
}
