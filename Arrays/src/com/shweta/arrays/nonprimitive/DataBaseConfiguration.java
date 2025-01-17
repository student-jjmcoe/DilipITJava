package com.shweta.arrays.nonprimitive;

public class DataBaseConfiguration {

	public static void main(String[] args) {
		System.out.println("In main method");
		System.out.println("size of string array of main method: "+args.length);
		String[] names = new String[5];
		studentNames(names);

		for(String arg : args) {
			System.out.println(arg );
		}
	}
	public static void studentNames(String[] names) {
		
	}

}
