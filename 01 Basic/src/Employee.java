
public class Employee {
	
	int empId;
	String empName;
	double basicSalary, grossSalary, netSalary, HRA, PT, PF, medical;
	static int count;
	
	public Employee() {
		count++;
	}

	public Employee(int empId, String empName, double basicSalary,
			double medical) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.medical = medical;
		HRA = 0.5 * basicSalary;
		PT = 200;
		PF = 0.12 * basicSalary;
		count++;
	}
	
	public void calculateSalary() {
		grossSalary = basicSalary + HRA + medical;
		netSalary = grossSalary - (PF + PT);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("\nEmployee ID : " + empId);
		System.out.println("Employee name : " + empName);
		System.out.println("Employee net salary : " + netSalary); 		
	}	
	
	public static void totalEmployees() {
		System.out.println("\nTotal no. of employees : " + count);
	}
}	










