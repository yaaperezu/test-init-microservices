package com.osi.his.yp.sadr.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osi.his.yp.sadr.model.PingRequest;
import com.osi.his.yp.sadr.model.PingResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
@RequestMapping("/sadr")
public class SadrController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/ping")
    @ApiOperation(value = "ping", nickname = "ping", response = PingResponse.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 201, message = "Created"), @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public PingResponse ping(@ApiParam(value = "request", required = true) @RequestBody(required = true) PingRequest request) {

		logger.info("--> ping received");
		logger.info("--> id: {}", request.getId());
		logger.info("--> content: {}", request.getMessage());

		return new PingResponse("Hello from Sadr - " + request.getId() + " - " + request.getMessage());
	}

}
