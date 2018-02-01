package com.cc.taxis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TaxisEurekaRegisterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxisEurekaRegisterServerApplication.class, args);
	}
}
