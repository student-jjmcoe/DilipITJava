package com.shweta.loopingstatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//print until 100
		int value = getStartingValue();
		//Out of the loop we have to use latest incre/decrement value
		
		while(value<=100) {
			System.out.println(value);
			value++;
		}
		
		System.out.println("Outside while loop");
		System.out.println(value);
	}
	
	public static int getStartingValue()
	{
		return 5;
	}

}
