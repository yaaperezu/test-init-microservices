package com.osi.his.clienttest.ClientConfigServerHC.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	public TestController() {

	}

	@Value("${variable}")
	private String variableFromConfigServer;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getVariableFromConfigServer() {
		return variableFromConfigServer;
	}
	
}
