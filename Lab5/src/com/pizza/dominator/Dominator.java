package com.pizza.dominator;

// Importing dependencies.
import com.pizza.base.crust;
import java.util.*;

public class Dominator extends crust{
	private String[] toppings;
	private boolean extraCheese;
	
	Dominator(){
		super();
		toppings = new String[5];
		extraCheese = false;
	}

	Dominator(String size, String crustType, boolean extraCheese){
		super(size, crustType);
		toppings = new String[5];
		this.extraCheese = extraCheese;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Dibyanos Peeza,\n\tIt's finger-lickin good!!\n\t(Source: Verified customers ;)");
		System.out.println("Pizza size (Smol/Casual/Insane)-> ");
		String size = input.next();

		System.out.println("Crust (Cheeseburst/Cheeseburst/Same) -> ");
		String crustType = input.next();

		input.close();
		
		// Default pizza;
		Dominator myPizza = new Dominator();
		System.out.println(myPizza.bake());

		// Creating custom pizza;
		Dominator mySpecialPizza = new Dominator(size, crustType, true);
		System.out.println(mySpecialPizza.bake());
	}

}
