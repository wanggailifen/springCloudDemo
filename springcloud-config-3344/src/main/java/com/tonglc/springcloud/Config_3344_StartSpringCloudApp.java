package com.tonglc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp
{
	//  两种方式访问
	//	http://127.0.0.1:3344/application/dev/master
	//	http://127.0.0.1:3344/application-dev.yml

	public static void main(String[] args)
	{
		SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
	}
}
