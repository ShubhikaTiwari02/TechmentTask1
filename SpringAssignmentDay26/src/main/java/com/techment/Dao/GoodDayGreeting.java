package com.techment.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements Greeting {

	String greeting = " Have a good Day..";

	@Override
	public String greet() {
		return greeting;
	}

	public GoodDayGreeting() {

	}

	public GoodDayGreeting(String greeting) {
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
