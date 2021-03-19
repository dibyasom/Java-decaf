package q3;

public abstract class Worker {
	
	protected String name;
	protected float salaryRate;
	
	Worker(String name, float salaryRate){
		this.name = name;
		this.salaryRate = salaryRate;
	}
	
	protected void aboutMe() {
		System.out.println("~~Worker Data~~ (Served from Parent Class)"
							+ "\nName -> " + this.name + " Yo!"
							+ "\nSalary Rate -> Rs." + this.salaryRate + "/- only.");
	}
	
	protected Float ComPay(int hours) {
		return hours*this.salaryRate;
	}
	protected Float ComPay() {
		return 40.0f*this.salaryRate;
	}
}
