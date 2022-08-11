package com.firstStepApi.service;

import com.firstStepApi.common.exception.CustomException;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	public String testService() throws CustomException {
		return "123sad";
	}


}
