
public class HourlyEmplyee extends Employee{
	private double wage;
	private double hours;
	public HourlyEmplyee(String firstName, String lastName, String sSN, double wage, double hours) {
		super(firstName, lastName, sSN);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double earnings() {
		double result=0;
		if (hours <= 40) {
			result = wage * hours;
		}
		else if(hours > 40) {
			result = 40*wage+(hours-40)*wage*1.5;
		}
		return result;
	}
	@Override
	public String toString() {
		return "HourlyEmplyee" + wage + hours + "Employee" + getFirstName() + getLastName() + getSSN();
	}
	
	
	

}
