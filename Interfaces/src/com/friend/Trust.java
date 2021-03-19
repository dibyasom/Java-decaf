package com.friend;

public class Trust implements Trustable{
	//static field
	final static int PASS = 1234;
	
	// Class fields
	String status;
	
	Trust(){
		this.status = "Server Down :(";
	}
	
	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return this.getClass().toString();
	}
	
	//Password based, object creation.
	Trust protectedCreation(int pass) {
		return (Trust.PASS == pass) ?new Trust() :null;
	}
	
	static void main(String[] args) {
		System.out.println(new Trust().whoAmI());
	}
	
}
