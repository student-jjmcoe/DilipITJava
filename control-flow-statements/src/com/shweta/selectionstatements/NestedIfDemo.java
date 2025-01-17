package com.shweta.selectionstatements;

public class NestedIfDemo {

	public static void main(String[] args) {
		int num = 35;
		if(num>=0) {
			if(num%2 == 0) {
				System.out.println("number is positive as well as even");
			}
			else {
				System.out.println("number is positive as well as Odd");
			}
		}
		else{
			if(num%2 == 0) {
				System.out.println("number is Negative as well as even");
			}
			else {
				System.out.println("number is Negative as well as Odd");
			}
		}
	}

}
