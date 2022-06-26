package com.upskill.assighnment1;

public class Assignment_1_2 {


	/*Problem 02: A rectangle width and length are: 9 and 13 inches.
	Write a method to display the perimeter of rectangle in console output. */


		public static void main(String[] args) {
		        rectangleperimeter ();

			    System.out.println("Return type method the perimeter of the rectangle" + returnperimeter());
		        
		        
		        
		}
		        
		        

		//static method
		public static void rectangleperimeter() {
			int a = 9;
		    int b = 13;
		    int result = 2*(a+b);
		    
		    System.out.println("The perimeter of RecTangleperimeter wild and length 9,13 is::: " + result );
		    
		}
		    
		    public static int returnperimeter() {
				int a = 9;
			    int b = 13;
			    int result = 2*(a+b);
			    return result;
					
		}


	
}


