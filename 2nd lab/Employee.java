
public abstract class  Employee {
private String firstName;
private String lastName;
private String SSN;

public abstract double earnings(); 


public Employee(String firstName, String lastName, String sSN) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	SSN = sSN;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSSN() {
	return SSN;
}

public void setSSN(String sSN) {
	SSN = sSN;
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
}
}
