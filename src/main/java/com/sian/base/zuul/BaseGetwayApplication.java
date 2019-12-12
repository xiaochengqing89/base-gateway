package com.sian.base.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseGetwayApplication.class, args);
    }

}
