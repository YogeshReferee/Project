package com.Employee1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SalaryException1 {
	@ExceptionHandler(SalaryException.class)
	public ResponseEntity<Object> get(SalaryException s) {
		return new ResponseEntity<Object>("SalaryException", HttpStatus.NOT_FOUND);
	}

}
