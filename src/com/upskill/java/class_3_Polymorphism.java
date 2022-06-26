package com.upskill.java;

/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

public class class_3_Polymorphism {
	
	public static void main(String[] args){

		car(4, "Red");

	}
	
	//Method Overloading
	
	public static void car(){
		System.out.println("My Car is Audi !");
	}
	
	public static void car(int door){
		System.out.println("My Car is Audi, it has door : " + door);
	}
	
	public static void car (String color){
		System.out.println("My Car is Audi, its color : " + color);
	}
	
	public static void car(int door, String color){
		System.out.println("My Car is Audi, it has door : " + door + " ; its Color : " + color);
	}

}


//method overriding


























