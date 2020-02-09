package com.example;

public class HourlyEmpoyee implements Employee {
	private double hourlyWage;
	private int  hours;
	
	
	
	public HourlyEmpoyee(double hourlyWage, int hours) {
		super();
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}



	@Override
	public double calculateSalary() {
		return hourlyWage*hours;
	}

	

}
