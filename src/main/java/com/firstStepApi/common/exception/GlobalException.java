package com.firstStepApi.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalException {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ErrorResponse> handleCustomException(final CustomException e){
		log.error(e.getClass().getName());
		log.error(e.getLocalizedMessage());
		log.error("handleEntityNotFoundException = ", e);
		final ErrorCode errorCode = e.getErrorCode();
		final ErrorResponse response = ErrorResponse.of(errorCode);
		return new ResponseEntity<>(response, HttpStatus.valueOf(errorCode.getStatus()));
	}

}
