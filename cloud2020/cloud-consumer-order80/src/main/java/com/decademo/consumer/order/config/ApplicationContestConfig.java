package com.decademo.consumer.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContestConfig {

    @Bean
    @LoadBalanced // 添加负载均衡服务
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
