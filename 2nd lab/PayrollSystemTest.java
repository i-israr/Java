
public class PayrollSystemTest {
	public static void main( String[] args ) {
		SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith",
		"111-11-1111", 800.00 );
		HourlyEmplyee hourlyEmployee = new HourlyEmplyee( "Karen", "Price", "222-22-2222", 16.75, 40 );
		CommisionEmployee commissionEmployee = new CommisionEmployee("Sue","Jones", "333-33-3333", 10000, .06 );
		BasePluseCommisionEmployee basePlusCommissionEmployee =new BasePluseCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
		System.out.println( "Employees processed individually:\n" );
		System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee, "earned",
		salariedEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",hourlyEmployee, "earned",
		hourlyEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",commissionEmployee, "earned",
		commissionEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",basePlusCommissionEmployee,"earned",
		basePlusCommissionEmployee.earnings() );
		// create four-element Employee array
		Employee[] employees = new Employee[ 4 ];
		employees[0] = new HourlyEmplyee( "Israr", "Ulhaq", "221", 1.5, 30 );
		employees[1] = new CommisionEmployee("Kashi","nazar", "312", 120, .26 );
		employees[2] = new SalariedEmployee( "Zeshan", "But","1123", 230.20 );
		employees[3] =new BasePluseCommisionEmployee("Majid", "Khan", "4123", 512, .34, 200 );
		
		System.out.println( "Employees processed polymorphically:\n" );
		// generically process each element in array employees
		for ( Employee currentEmployee : employees )
		{
		System.out.println( currentEmployee ); // invokes toString
		// determine whether element is a BasePlusCommissionEmployee
		if ( currentEmployee instanceof BasePluseCommisionEmployee ) {
		// downcast Employee reference to
		// BasePlusCommissionEmployee reference
			BasePluseCommisionEmployee employee =( BasePluseCommisionEmployee )
		currentEmployee;
		employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
		System.out.printf(
		"new base salary with 10%% increase is: $%,.2f\n",
		employee.getBaseSalary() );
	}
		}
	}
		}