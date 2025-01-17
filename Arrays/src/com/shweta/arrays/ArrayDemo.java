package com.shweta.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// creating an array
		int[] numbers = {10,20,30};
		// size of an array = arrayName.length;
		System.out.println("Size of numbers : "+numbers.length);
		double[] prices = {99.99,88.88,44,56};
		String[] names = {"Shweta","Siddhi","Aditi","Shreya","pooja","Sanika"};
		
		// array of student id's
		int[] studentIds = {10,33,22,55,77,44,11,99,30,50};
		System.out.println("size of array studentIds: "+studentIds.length);
		//get 5th position values
		int value = studentIds[5];
		System.out.println(value);
		
		value = studentIds[7];
	     System.out.println("before putting "+value);
		//putting value in array
		studentIds[7]= 7777;
		 value = studentIds[7];
	     System.out.println("After putting "+value);
	     
//	     value = studentIds[10]; array index out of bound 
//	     System.out.println(value);
	     
	     int[] marks = {555, 600, 777,888,444,666,777,999,777,888,567,987,345,900,600};
	     //print all array values
	     
	     for(int i=0; i<marks.length;i++) {
	    	 System.out.println(marks[i]);
	     }
	}

}
