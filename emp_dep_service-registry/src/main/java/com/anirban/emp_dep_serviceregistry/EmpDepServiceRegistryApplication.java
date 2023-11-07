package com.anirban.emp_dep_serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmpDepServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDepServiceRegistryApplication.class, args);
	}

}
