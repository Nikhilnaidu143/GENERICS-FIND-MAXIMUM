package com.find.maximum.generics;

public class Main_Find_Max {
	//main method
	public static void main(String[] args) {
		/** Displayed welcome message **/
	    System.out.println("------------FIND MAXIMUM USING GENERICS-------------");
	    
	    /** Test Cases for integers. **/
	    Find_Maximum ITC1 = new Find_Maximum(45 , 38 , 24 , 15 , 42); //TC-1.1 :- max num at first position.
	    ITC1.testMaximum();
	    Find_Maximum ITC2 = new Find_Maximum(18, 28, 19 , 10 , 12);  //TC-1.2 :- max num at second position.
	    ITC2.testMaximum();
	    Find_Maximum ITC3 = new Find_Maximum(75, 52, 120 , 80 , 117); //TC-1.3 :- max num at third position.
	    ITC3.testMaximum();
	    
	    /** Test cases for floats. **/
	    Find_Maximum FTC1 = new Find_Maximum(15.5f, 12.8f, 9.56f , 7.24f , 13.53f); //TC-1.1 :- max num at first position.
	    FTC1.testMaximum();
	    Find_Maximum FTC2 = new Find_Maximum(12.4f, 25.8f, 15.7f , 17.2f , 2.84f); //TC-1.2 :- max num at second position.
	    FTC2.testMaximum();
	    Find_Maximum FTC3 = new Find_Maximum(14.2f, 18.7f, 28.9f , 14.5f , 22.3f); //TC-1.3 :- max num at third position.
	    FTC3.testMaximum();
	    
	    /** Test cases for Strings. **/
	    Find_Maximum STC1 = new Find_Maximum("Yesdhani", "Nikhil", "Ajay", "Sam", "Ram");  //TC-1.1 :- max string at first position.
	    STC1.testMaximum();
	    Find_Maximum STC2 = new Find_Maximum("car", "train", "bike", "bus", "jeep");  //TC-1.2 :- max string at second position.
	    STC2.testMaximum();
	    Find_Maximum STC3 = new Find_Maximum("bat", "ball", "wickets", "Stump", "jersey"); //TC-1.3 :- max string at third position. 
	    STC3.testMaximum();
	}
}