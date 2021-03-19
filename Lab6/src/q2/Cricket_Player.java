package q2;

import java.util.Scanner; 

public final class Cricket_Player extends Player{
	
	// Class field.
	private String sport;
	private String role;
	
	Cricket_Player(String name, float height, float weight, String role){
		super(name, height, weight);
		this.role = role;
		this.sport = "Cricket";
	}
	
	public final void myRole() {
		System.out.println("I'm "+ role+ " in Cricket!");
	}
	
	public static void main(String[] args) {
		// Fetch Inputs;	
		Scanner input = new Scanner(System.in);
		System.out.println("Player Name? "); String name = input.next();
		System.out.println("Height? "); Float height = input.nextFloat();
		System.out.println("Weight? "); Float weight = input.nextFloat();
		System.out.println("Role in Cricket-team? "); String role = input.next();
		input.close();
		
		Cricket_Player myPlayer = new Cricket_Player(name, height, weight, role);	
		// Display basic data from Parent class, Player.
		myPlayer.aboutPlayer();
		myPlayer.myRole();
	}
}
