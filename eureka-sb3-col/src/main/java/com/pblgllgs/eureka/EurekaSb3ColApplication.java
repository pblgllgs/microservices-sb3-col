package com.pblgllgs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSb3ColApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSb3ColApplication.class, args);
    }

}
