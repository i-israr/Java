package com.example;

public class Main {

	public static void main(String[] args) {
		Employee [] employes = new Employee[2];
		
		employes[0] = new SalariedEmployee(100.3);
		employes[1] = new HourlyEmpoyee(102,8);
		
		for (int i = 0; i < employes.length; i++) {
			System.out.println(employes[i].calculateSalary());
		}
		
		
	
	}

}
