package com.find.maximum.generics;

public class Main_Find_Max {
	//main method
	public static void main(String[] args) {
		/** Displayed welcome message **/
	    System.out.println("------------FIND MAXIMUM USING GENERICS-------------");
	    
	    /** Test Cases for integers. **/
	    Find_Maximum.testMaximum(45 , 38 , 24 , 15 , 42); //TC-1.1 :- max num at first position.
	    Find_Maximum.testMaximum(18, 28, 19 , 10 , 12);  //TC-1.2 :- max num at second position.
	    Find_Maximum.testMaximum(75, 52, 120 , 80 , 117); //TC-1.3 :- max num at third position.
	
	    /** Test cases for floats. **/
	    Find_Maximum.testMaximum(15.5f, 12.8f, 9.56f , 7.24f , 13.53f); //TC-1.1 :- max num at first position.
	    Find_Maximum.testMaximum(12.4f, 25.8f, 15.7f , 17.2f , 2.84f); //TC-1.2 :- max num at second position.
	    Find_Maximum.testMaximum(14.2f, 18.7f, 28.9f , 14.5f , 22.3f); //TC-1.3 :- max num at third position.
	
	    /** Test cases for Strings. **/
	    Find_Maximum.testMaximum("Yesdhani", "Nikhil", "Ajay", "Sam", "Ram");  //TC-1.1 :- max string at first position.
	    Find_Maximum.testMaximum("car", "train", "bike", "bus", "jeep");  //TC-1.2 :- max string at second position.
	    Find_Maximum.testMaximum("bat", "ball", "wickets", "Stump", "jersey"); //TC-1.3 :- max string at third position. 
	}
}