package com.example;

public class SalariedEmployee implements Employee {
	private double weeklySalary;
	
	
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}


	@Override
	public double calculateSalary() {
		return weeklySalary;
	}

}
