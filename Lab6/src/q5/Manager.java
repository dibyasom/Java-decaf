package q5;

public class Manager extends Employee{
	// manager attributes.
	private String department;
	
	Manager(String name, String empid, Float salary, String department){
		super(name,empid,salary);
		this.department = department;
		System.out.println("Promoted to Manager ;)");
	}
	
	// Driver function to utilise all defined classes, and methods.
	public static void main(String[] args) {
		// Creating object of class manager, which itself inherits class employee.
		Manager myManager = new Manager("Dibyasom", "ISRO-007", 99999999.99f, "ISRO-occupymars");
		System.out.println("Name -> " + myManager.getName()); // Using getter method.
																// as attributes are private.
		System.out.println("Salary -> " + myManager.getSalary());
		System.out.println("Incrementing salary by 15%");
		myManager.increaseSalary(15.0f); // Parent class method, updates private attribute salary.
		System.out.println("New Salary -> Rs."+ myManager.getSalary() + "/- only.");
	}
}
