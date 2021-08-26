package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.Dao.Greeting;

@Service("hellw")
public class GreeterService {

	@Autowired
	@Qualifier("morningGreeting")
	Greeting greeting;

	public String displayService() {
		return greeting.greet();
	}

}
