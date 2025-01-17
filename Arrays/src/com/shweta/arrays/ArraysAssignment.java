package com.shweta.arrays;

public class ArraysAssignment {

	public static void main(String[] args) {
		String[] names = {"Siddhi","Shreya","Aditi","Pooja","Sanika","Mrudali"};
		
		//get last person name
		System.out.println("LAST NAME: "+names[names.length-1]);
		
		//get first name
		System.out.println("First name: "+names[0]);

		System.out.println();
		//all names
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		//names in reverse order
		for(int i=(names.length-1);i>=0;i--) {
			System.out.println(names[i]);
		}
		//alternative names
		System.out.println();
		for(int i=0;i<names.length;i+=2) {
			System.out.println(names[i]);
		}
	}

}
