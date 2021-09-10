package com.techment.exception;

import org.springframework.util.MultiValueMap;

public class IDNotFoundException extends RuntimeException {



	public IDNotFoundException(String msg) {
		super(msg);
		
	}

	public MultiValueMap<String, String> getMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
