package q4;

public class Trunk {
	// Class field
	Float ordinary, urgent, lightning; // 1: Ordinary, 2: Urgent, 3: Lightning
	
	Trunk(){
		this.ordinary = 1.0f;
		this.urgent = 1.5f;
		this.lightning = 3.5f;
	}
	
	private Float genBill(int type, float duration) {
		return ordinary*duration;
	}
	
	private Float genBill(int type, double duration) {
		return urgent*(float)duration;
	}
	
	private Float genBill(float duration) {
		return lightning*duration;
	}
	
	public static void main(String[] args) {
		Trunk ordCall = new Trunk(), 
			  urgCall = new Trunk(),
			  lightningCall = new Trunk();
		
		System.out.println("Ordinary Call Bill -> "+ ordCall.genBill(1, 30.0f));
		System.out.println("Urgent Call Bill -> "+ urgCall.genBill(1, 30.0));
		System.out.println("Lightning Call Bill -> "+ lightningCall.genBill(30.0f));
	}
}
