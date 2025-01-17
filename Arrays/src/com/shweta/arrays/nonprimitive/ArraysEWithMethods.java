package com.shweta.arrays.nonprimitive;

public class ArraysEWithMethods {

	public static void main(String[] args) {
		ArraysEWithMethods obj = new ArraysEWithMethods();
		String[] names = obj.getName();
        for(String nm : names) {
        	System.out.println(nm);
        }
	}
	//creating a method with return type of an array
	public String[] getName() {
		String[] names = {"shweta","Raj","Varsha","Suresh"};
		return names;
	}

}
