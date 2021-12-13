package com.find.maximum.generics;

public class Find_Maximum {
	// Method with parameters as Integer
	public void integerMax(Integer N1 , Integer N2 , Integer N3) {

		// comparing numbers using compareTo method.
	    if(N1.compareTo(N2) > 0 && N1.compareTo(N3) > 0) {
	    	System.out.println("\n" + N1 + " is maximum.");
	    }
	    else if(N2.compareTo(N1) > 0 && N2.compareTo(N3) > 0) {
	        System.out.println("\n" + N2 + " is maximum.");
	    }
	    else {
	    	System.out.println("\n" + N3 + " is maximum.");
	    }
	}
}