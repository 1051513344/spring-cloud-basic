package com.laoxu.userconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 开启Eureka客户端
@EnableFeignClients // 开启Feign功能
public class UserConsumerDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerDemo2Application.class, args);
    }

}
