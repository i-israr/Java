
public abstract class Employee {

	private String name;
	public abstract double calculateSalary(); 



public Employee(String name) {
		super();
		this.name = name;
	}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
