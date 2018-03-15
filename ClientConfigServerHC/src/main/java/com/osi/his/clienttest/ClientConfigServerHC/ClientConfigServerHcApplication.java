package com.osi.his.clienttest.ClientConfigServerHC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigServerHcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientConfigServerHcApplication.class, args);
	}
}