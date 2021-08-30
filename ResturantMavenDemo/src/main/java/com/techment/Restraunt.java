package com.techment;

import java.util.List;

public class Restraunt {

	String restrauntName;
	
	Nutrition nutrition;

	IHotDrink hotDrink;
	ISoftDrink softDrink;
	List<String> employeeNames;
	
	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public void displayRestrauntDetails()
	{
		System.out.println("restraunt name :"+restrauntName);
	
		hotDrink.drink();
		softDrink.drink();
		 
		System.out.println(nutrition);
		
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	public void setEmployeeNames(List<String> employeeNames) {
		this.employeeNames = employeeNames;
	}

	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}


	
	
	
}