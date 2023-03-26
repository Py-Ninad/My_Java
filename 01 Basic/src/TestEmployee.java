
public class TestEmployee {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "John", 23000, 4500);
		employee1.calculateSalary();
		employee1.displayEmployeeDetails();
		
		Employee.totalEmployees();
		
		Employee employee2 = new Employee(102, "Peter", 12000, 3400);
		employee2.calculateSalary();
		employee2.displayEmployeeDetails();
		
		Employee.totalEmployees();
	}
}
