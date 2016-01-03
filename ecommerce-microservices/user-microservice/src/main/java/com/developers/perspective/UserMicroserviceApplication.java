package com.developers.perspective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableDiscoveryClient
public class UserMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroserviceApplication.class, args);
    }
}
