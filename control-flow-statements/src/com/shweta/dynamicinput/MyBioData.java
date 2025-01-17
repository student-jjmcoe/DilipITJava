package com.shweta.dynamicinput;

import java.util.Scanner;

public class MyBioData {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Please enter name: ");
		String name = x.nextLine();
		
		System.out.println("Enter Your age:");
		int age = x.nextInt();
		
		System.out.println("Enter qualification:");
		String qualification = x.next();
		
		System.out.println("do you have percentage > 70 or not");
		boolean isPercentageQualified = x.nextBoolean();//true, false
		
		System.out.println("Enter Avg of Marks:");
		double avgOfMarks = x.nextDouble();
		
		System.out.println("******** Bio Data *********");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Qualification: "+qualification);
		System.out.println("percentage > 70?"+isPercentageQualified);
		System.out.println("Average of Marks: "+avgOfMarks);
	}

}
