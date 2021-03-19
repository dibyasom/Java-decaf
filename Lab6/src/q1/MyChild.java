package q1;

public final class MyChild extends PrivateDaddy {
	String childName;
	
	MyChild(){
		super();
		childName = "India";
	}
	
	public static void main(String[] args) {
		
		MyChild baby = new MyChild();
		System.out.println("Daddy-> "+whoDaddy);
		System.out.println("Child-> "+baby.childName);
	}
}
