package com.pblgllgs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigSb3ColApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSb3ColApplication.class, args);
    }

}
