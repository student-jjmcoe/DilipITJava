package com.shweta.dynamicinput;

import java.util.Scanner;

public class FullNameOfUser {

	public static void main(String[] args) {
		// Take first name
		// Take Second name
		
		String firstname;
		String lastName;
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		firstname = x.next();
		System.out.println("Enter Second Name");
		lastName = x.next();
		
		System.out.println("Full Name: "+firstname+" "+lastName);
		
		
	}

}
