package assessment2;
class Employee{
	int employeeId;
	String name;
	String desgination;
	double salary;
	
	Employee(int employeeId,String name,String desgination,double salary){
		this.employeeId=employeeId;
		this.name=name;
		this.desgination=desgination;
		this.salary=salary;
	}
	
	public void displayInfo() {
		System.out.println("---------employee details-------------------");
		System.out.println("the EmployeeId:"+employeeId);
		System.out.println("the EmployeeName:"+name);
		System.out.println("the Employee Desingation:"+desgination);
		System.out.println("the Employee salary:"+salary);
		System.out.println("--------------------------------------------");
	}
	
	public void increseSalary(double percentage) {
		salary+=salary*(percentage/100);

	}
	
	public void increaseSalary(double percentage, double bonus) {
		 salary += salary * (percentage / 100) + bonus;
	}
}
public class Sum2 {

	public static void main(String[] args) {
		Employee employee =new Employee(1001,"haritha", "Tester", 35000);
		employee.displayInfo();
		
		employee.increseSalary(10);
		System.out.println("employee details after the increse in salary by percentage");
		employee.displayInfo();
		
		employee.increaseSalary(20, 2000);
		System.out.println("employee details after the increse in salary by percentage and bonus.");
		employee.displayInfo();
		

	}

}
