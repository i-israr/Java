package com.example;

public class Emplyee extends Person {
	private int salary;

	public Emplyee(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Emplyee [salary=" + salary + "]";
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
