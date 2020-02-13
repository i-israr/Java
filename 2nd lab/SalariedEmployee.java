
public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
		super(firstName, lastName, sSN);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings() {
     
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee" + weeklySalary + "Employee" + getFirstName() + getLastName() + getSSN();
	}
	
	
	
	
	
	
}
