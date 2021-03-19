package scratch;

class godfather{
	String id;
	
	godfather(){
		this.id = "Godfather";
		System.out.println("Godfather logged in.");
	}
	
	public String get_id() {
		return this.id;
	}
}

class father extends godfather{
	String id;
	
	father(){
		this.id = "Father";
		System.out.println("Father logged in.");
	}
	
	public String get_id() {
		return this.id;
	}
	
	public String get_parent_id() {
		return super.id;
	}
}

class child extends father{ 
	String id;
	
	child(){
		this.id = "Child";
		System.out.println("Child popped in.");
	}
	
	public String get_id() {
		return this.id;
	}
	
	public String get_parent_id() {
		return super.id;
	}
}

public class multiLevelInheritance {
	
	public static void main(String[] args) {
		child obj = new child();
		System.out.println(obj.get_id());
		System.out.println(obj.get_parent_id());
	}
}
