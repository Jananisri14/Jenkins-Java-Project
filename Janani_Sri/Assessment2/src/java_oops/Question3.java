package java_oops;
class Employee{
	int employeeId;
	String name;
	String designation;
	double salary;
	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100);
		System.out.println("Salary Increased" + percentage +"%");	
	}
	public void increaseSalary(double percentage, double bonus) {
		salary = salary + (salary * percentage / 100);
		System.out.println("Salary Increased : " + percentage +"% bonus :"+bonus);	
	}
}
public class Question3 {
	public static void main(String[] args) {
		Employee e = new Employee(14, "Janani", "Tester", 20000);
        System.out.println("Initial Employee Details:");
        e.displayInfo();
        e.increaseSalary(20);
        System.out.println("After Percentage Increased:");
        e.displayInfo();
        e.increaseSalary(5, 3000);
        System.out.println("After Percentage + Bonus Increased:");
        e.displayInfo();

	}
}