package com.techment;

public class Nutrition {
	   int calorie;
	   boolean healthy;
	   double sugar;
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Nutrition [calorie=" + calorie + ", healthy=" + healthy + ", sugar=" + sugar + "]";
	}
	   
	}