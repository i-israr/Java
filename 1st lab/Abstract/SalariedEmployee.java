
public  class  SalariedEmployee extends Employee {
private double weeklySalary;
	

	
	public SalariedEmployee(String name, double weeklySalary) {
	super(name);
	this.weeklySalary = weeklySalary;
}



	@Override
	public double calculateSalary() {
		return weeklySalary;
	}



	public double getWeeklySalary() {
		return weeklySalary;
	}



	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}



	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

	
	

}
