package com.friend;

public class Snake extends Trust {
	
	// Class fields.
	Trust soul;
	
	Snake(){
		this.soul = null;
		System.out.println("I'm useless basically.");
	}
	
	Snake(int pass){
		this.soul = new Trust().protectedCreation(pass);
	}
	
	@Override
	Trust protectedCreation(int pass) {
		System.out.print("Overidden!");
		return (Trust.PASS == pass) ?new Snake() :null;
	}
	
	public static void main(String[] args) {
		System.out.println(new Snake(1234).soul);
	}
}
