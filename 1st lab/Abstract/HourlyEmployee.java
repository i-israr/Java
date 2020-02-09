
public class HourlyEmployee extends Employee {
	
private double hourlyWage;
private int  hours;


	public HourlyEmployee(String name, double hourlyWage, int hours) {
	super(name);
	this.hourlyWage = hourlyWage;
	this.hours = hours;
}


	@Override
	public double calculateSalary() {
		return hourlyWage*hours;
	}
	
	
	
}
