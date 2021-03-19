package q2;

public abstract class Player {
	
	protected String name;
	protected float height;
	protected float weight;
	
	Player(String name, float height, float weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	protected void aboutPlayer() {
		System.out.println("~~Player Data~~ (Served from Parent Class)"
							+ "\nName -> " + this.name + " Yo!"
							+ "\nHeight ->" + this.height + "Ft"
							+ "\nWeight -> " + this.weight + "Kg only/-");
	}
}
