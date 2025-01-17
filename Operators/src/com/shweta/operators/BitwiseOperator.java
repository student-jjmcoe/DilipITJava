package com.shweta.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println(10 & 7);
		System.out.println(4 & 6);
		System.out.println(2 & 4);
		
		System.out.println();
		System.out.println(10 | 7);
		System.out.println(4 | 6);
		System.out.println(2 | 4);
		
		System.out.println();
		System.out.println(~123);
		//add 1 and also changes sign //-124
		System.out.println(~ -123);
		//sub 1 and also changes sign //122 
	}

}
