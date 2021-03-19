package com.pizza.base;

public class crust {
	public String size;
	public String crustType;
	public String base;

	public crust(){
		size = "Regular";
		crustType = "Hand-Tossed";
	}

	public crust(String size, String crustType){
		this.size = size;
		this.crustType = crustType;
	}

	public String bake(){
		base = size + " " + crustType;
		return ("Baked " + base);
	}
}
