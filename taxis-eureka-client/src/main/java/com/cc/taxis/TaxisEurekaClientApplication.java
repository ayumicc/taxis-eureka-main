package com.cc.taxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableTurbine
@EnableHystrixDashboard
@EnableCircuitBreaker
//@EnableAdminServer
public class TaxisEurekaClientApplication {

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return restTemplateBuilder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(TaxisEurekaClientApplication.class, args);
	}
}