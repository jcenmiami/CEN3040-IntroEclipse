/*
 * 
 */
package com.ezitapps;

public class IntroEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the Intro Eclipse Assignment for class CEN3040");
		
		String fName = "";
		String lName = "";
		
		if (args == null || args.length < 2) {
			System.out.println("We need to arguments to make this work!");
		} else {
			fName = args[0];
			lName = args[1];
			
			// Call methods to print the result
			// Send both parameters for First and Last Name
			// Args was set in Eclipse automatically.
			printResult(fName, lName);
		}
		
		
		
	}
	/*
	 * 
	 */
	
	public static void printResult(String fName, String lName){
		System.out.println("You first name is " + fName + " and your last name is " + lName);
		System.out.println("You full name is " + fName + " " + lName + " the end.");
	}

}
