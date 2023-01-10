package com.cauchy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.cauchy.springcloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider.class, args);
    }
}
