package q1;

public abstract class PrivateDaddy {
	// Declaring a few private member/ class fields.
	private String whoDaddy;
	
	PrivateDaddy(){
		whoDaddy = "Gandhi!"; 
	}
	
	protected String getDaddy() {
		return this.whoDaddy;
	}
}
