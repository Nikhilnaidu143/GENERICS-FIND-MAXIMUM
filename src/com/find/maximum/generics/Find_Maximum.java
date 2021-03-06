package com.find.maximum.generics;

/** Generic class **/
public class Find_Maximum <T extends Comparable<T>>{
	
	/* Constant variables */
	private final T VAR1;
	private final T VAR2;
	private final T VAR3;
	private final T VAR4;
	private final T VAR5;
		
	/** Constructor **/
	public Find_Maximum(T var1, T var2, T var3, T var4, T var5) {
		this.VAR1 = var1;
		this.VAR2 = var2;
		this.VAR3 = var3;
		this.VAR4 = var4;
		this.VAR5 = var5;
	}
	
	public T testMaximum() {
		T findMax = Find_Maximum.testMaximum(VAR1, VAR2, VAR3, VAR4, VAR5);
		printMax(findMax); //calling printMaximum method.
		return findMax;
	}
	
	/** Creating print maximum function **/
	public void printMax(T max) {
		System.out.println("\nMAXIMUM IS :- " + max);
	} 
	
	// Method by using generics 
	public static <T extends Comparable <T>> T testMaximum(T var1 , T var2 , T var3 , T var4 , T var5) {
		
		T max = var5;
		// comparing numbers using compareTo method.
	    if(var1.compareTo(var2)>0 && var1.compareTo(var3)>0 && var1.compareTo(var4)>0 && var1.compareTo(max)>0) {
	    	max = var1;
	    }
	    else if(var2.compareTo(var1)>0 && var2.compareTo(var3)>0 && var2.compareTo(var4)>0 && var2.compareTo(max)>0) {
	        max = var2;
	    }
	    else if(var3.compareTo(var1)>0 && var3.compareTo(var2)>0 && var3.compareTo(var4)>0 && var3.compareTo(max)>0){
	    	max = var3;
	    }
	    else if(var4.compareTo(var1)>0 && var4.compareTo(var2)>0 && var4.compareTo(var3)>0 && var4.compareTo(max)>0) {
	    	max = var4;
	    }
	    else {
	    	max = var5;
	    }
	    return max;
	}
}