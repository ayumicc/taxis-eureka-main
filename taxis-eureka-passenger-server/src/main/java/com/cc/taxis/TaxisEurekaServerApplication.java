package com.cc.taxis;

import com.cc.mybatis.autoconfigure.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableDiscoveryClient            //通过该注解，实现服务发现，注册
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
@EnableGlobalMethodSecurity(prePostEnabled = true)
@MapperScan(basePackages = "com.cc.taxis.mapper")
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(ComponentExcludeScan.class)})
public class TaxisEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxisEurekaServerApplication.class, args);
	}
}
