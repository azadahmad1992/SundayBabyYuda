package com.upskill.java;

public abstract class Class_5_AbstractClass {
	
	//Abstract class has both abstract method and regular method
	
	//Abstract Method
	
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iColor();
	
	public abstract void iSeat();
	
	//Regular Method
	//Abstract class has both abstract method and regular method 
	public void engine(){
		String eng = "V6";
		System.out.println("Car Engine : " + eng);
	}
	
	public void name(){
		String name = "BMW";
		System.out.println("Car Name : " + name);
	}
	
	public int van(){
		int vanNum = 1;
		return vanNum;
	}
}

