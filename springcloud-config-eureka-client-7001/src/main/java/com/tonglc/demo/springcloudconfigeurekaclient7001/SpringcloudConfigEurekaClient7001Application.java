package com.tonglc.demo.springcloudconfigeurekaclient7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudConfigEurekaClient7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigEurekaClient7001Application.class, args);
    }

}
