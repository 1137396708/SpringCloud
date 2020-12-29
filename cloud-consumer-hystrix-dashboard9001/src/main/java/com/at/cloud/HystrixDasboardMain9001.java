package com.at.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDasboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDasboardMain9001.class,args);
    }
}
