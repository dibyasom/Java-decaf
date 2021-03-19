package q3;

public class Main extends Worker {
	// Class field.
	private float wage;
	
	Main(String name, float salaryRate){
		super(name, salaryRate);
		wage = 0.0f;
	}
	
	private void aboutAndPay() {
		this.aboutMe();
		System.out.println("My Wage -> Rs."+ this.wage+ "/-");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ComPay is overloaded, hance can calculate wage for both type of workers.
		Main dailyWorker = new Main("Dibyasom", 99999.9f);
		dailyWorker.wage = dailyWorker.ComPay(50);
		dailyWorker.aboutAndPay();
		
		Main salariedWorker = new Main("Divija", 99999.9f);
		salariedWorker.wage = salariedWorker.ComPay();
		salariedWorker.aboutAndPay();
	}

}
