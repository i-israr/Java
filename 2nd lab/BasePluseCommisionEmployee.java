
public class BasePluseCommisionEmployee extends CommisionEmployee {
private double baseSalary;



public BasePluseCommisionEmployee(String firstName, String lastName, String sSN, double grossSale,
		double commissionRate, double baseSalary) {
	super(firstName, lastName, sSN, grossSale, commissionRate);
	this.baseSalary = baseSalary;
}

public double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

@Override
public double earnings() {
	return (getCommissionRate()*getGrossSale())+baseSalary;
}

@Override
public String toString() {
	return "BasePluseCommisionEmployee" + baseSalary + "Employee" + getFirstName() + getLastName() + getSSN() +getCommissionRate()+getGrossSale();
}



}
