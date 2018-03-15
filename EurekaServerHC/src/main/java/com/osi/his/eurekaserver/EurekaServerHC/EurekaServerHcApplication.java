package com.osi.his.eurekaserver.EurekaServerHC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerHcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHcApplication.class, args);
	}
}
