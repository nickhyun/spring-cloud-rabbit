package com.nicky.springcloudrabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRabbitApplication.class, args);
    }

}
