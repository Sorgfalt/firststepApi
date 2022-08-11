package com.firstStepApi.controller;

import com.firstStepApi.common.exception.CustomException;
import com.firstStepApi.common.response.DataResponseService;
import com.firstStepApi.common.response.SingleDataResponse;
import com.firstStepApi.service.TestService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages={"com.firstStepApi.service"})
public class TestController {
	private final TestService testService;
	private final DataResponseService dataResponseService;

	public TestController(TestService testService, DataResponseService dataResponseService) {
		this.testService = testService;
		this.dataResponseService = dataResponseService;
	}

	@GetMapping("/connectTest")
	public SingleDataResponse<String> Test() throws CustomException {
		return dataResponseService.getSingleDataResponse(testService.testService());
	}
}
