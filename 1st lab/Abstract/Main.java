
public class Main {

	public static void main(String[] args) {
		
		
		Employee [] employes = new Employee[2];
		
		employes[0] = new SalariedEmployee("Zubair",10000.4);
		employes[1] = new HourlyEmployee("Umair",1450.10,8);
		
		for (int i = 0; i < employes.length; i++) {
			System.out.println(employes[i].getName() + "," + employes[i].calculateSalary());
		}

	}

}        //calc
//employees[se][he]
              //calc 
