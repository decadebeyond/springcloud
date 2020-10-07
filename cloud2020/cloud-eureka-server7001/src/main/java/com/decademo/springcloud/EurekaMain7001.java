package com.decademo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author  DECADEMO
 * @date  2020/10/5 20:34
 **/
@SpringBootApplication
@EnableEurekaServer /*  注册服务中心  */
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
