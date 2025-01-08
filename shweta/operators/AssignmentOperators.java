package com.shweta.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
	
		//normal Assignment i.e. = equal
		int a = 20;
		String name = "Shweta";
		System.out.println(a+"\n"+name);
		
		//Augmented Assignment
		int data = 10;
		data = data + 10;
		System.out.println(data);
		
		int val = 20;
		val+=10;
		System.out.println(val);
		
		int num = 30;
		num-=4;
		System.out.println(num);
		
		int x = 15;
		x*=2;
	    System.out.println(x);
	    
	    int y = 20;
	    y/=2;
	    System.out.println(y);
	    
	    int z = 7;
	    z%=2;
	    System.out.println(z);

	}

}
