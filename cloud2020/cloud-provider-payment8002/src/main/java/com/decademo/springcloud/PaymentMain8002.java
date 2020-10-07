package com.decademo.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author  DECADEMO
 * @date  2020/10/6 10:30
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.decademo.springcloud.dao")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}