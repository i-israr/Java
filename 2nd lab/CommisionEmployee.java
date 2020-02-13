
public class CommisionEmployee extends Employee {
private double grossSale;
private double commissionRate;

public CommisionEmployee(String firstName, String lastName, String sSN, double grossSale, double commissionRate) {
	super(firstName, lastName, sSN);
	this.grossSale = grossSale;
	this.commissionRate = commissionRate;
}

public double getGrossSale() {
	return grossSale;
}

public void setGrossSale(double grossSale) {
	this.grossSale = grossSale;
}

public double getCommissionRate() {
	return commissionRate;
}

public void setCommissionRate(double commissionRate) {
	this.commissionRate = commissionRate;
}

@Override
public double earnings() {
	return  commissionRate * grossSale;
	
}
@Override
public String toString() {
	return "CommisionEmployee" + grossSale + commissionRate + "Employee" + getFirstName() + getLastName() + getSSN();
}



}
