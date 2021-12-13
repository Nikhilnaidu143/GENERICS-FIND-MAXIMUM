package com.find.maximum.generics;

public class Main_Find_Max {
	//main method
	public static void main(String[] args) {
		/** Displayed welcome message **/
	    System.out.println("------------FIND MAXIMUM USING GENERICS-------------");

	    Find_Maximum object = new Find_Maximum();
	    
	    /** Test Cases for integers. **/
	    object.integerMax(45 , 38 , 24); //TC-1.1 :- max num at first position.
	    object.integerMax(18, 28, 19);  //TC-1.2 :- max num at second position.
	    object.integerMax(75, 52, 120); //TC-1.3 :- max num at third position.
	
	    /** Test cases for floats. **/
	    object.floatMax(15.5f, 12.8f, 9.56f); //TC-1.1 :- max num at first position.
	    object.floatMax(12.4f, 25.8f, 15.7f); //TC-1.2 :- max num at second position.
	    object.floatMax(14.2f, 18.7f, 28.9f); //TC-1.3 :- max num at third position.
	}
}