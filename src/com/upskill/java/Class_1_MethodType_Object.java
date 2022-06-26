package com.upskill.java;

public class Class_1_MethodType_Object {
	
	static int hourlyIncome = 65; //Manual QA = 40-55$, Automation QA = 50-70$, SDET = 60-80$

	public static void main(String[] args) {
		
		//Static Method - can call directly
		weeklyIncomeVoid();
		
		//Void non-static Method - have to create class object and call it
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();
		//class name      object name = new class name ()
	
		myobj.annualIncomeVoid();
		
		int monthly = Class_1_MethodType_Object.monthlyincomeReturn();
		System.out.println("Monthly Income ::: " + monthly);
		
		
		
		System.out.println("JOB title:::" +jobtitle());

	}
	
/* 	Types of Methods
  	1.Void Method
   	2.Static Method
   	3.Return Type Method   */
	
	
	//Void non-static Method
	public void annualIncomeVoid(){
		int annual = hourlyIncome * 2000;
		System.out.println("Annual Income ::: " + annual);
	}
	
	//Static Method
	public static void weeklyIncomeVoid(){
		int weekly = hourlyIncome * 40;
		System.out.println("Weekly Income ::: " + weekly);
	}
		
		//Return type method - non-static
		public static int monthlyincomeReturn() {
			int monthly = hourlyIncome * 180;
			return monthly ;
}

	    //Return type method - static
			public int monthlyincomeReturn2() {
				int monthly = hourlyIncome * 180;
				return monthly;
				  
			}
			public static String jobtitle() {
				String title = "QA Automation Engineer";
				return title;
						
			}
				


}