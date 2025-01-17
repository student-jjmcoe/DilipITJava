package com.shweta.loopingstatements;

public class ForLoopDemo {

	public static void main(String[] args) {
		//print 0 to 100 : Ascending order
		for(int val = 0; val <= 100; val = val+1) {
			System.out.println("The number= "+val);
		}
		
		System.out.println();
		//print 200 to 100
		for(int val = 200; val>=100; val= val-1) {
			System.out.println("The number= "+val);
		}
		
		System.out.println();
		//print values from -10 to -300
		for(int i= -10; i>=-300; i--) {
			System.out.println("The number= "+i);
		}

	}

}
