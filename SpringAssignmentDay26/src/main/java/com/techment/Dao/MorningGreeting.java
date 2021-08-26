package com.techment.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements Greeting {

	String greeting = " Good morning...";

	@Override
	public String greet() {
		return greeting;
	}

	public MorningGreeting() {

	}

	public MorningGreeting(String greeting) {

		super();
		this.greeting = greeting;

	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {

		this.greeting = greeting;
	}

}
