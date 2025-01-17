package com.shweta.dynamicinput;

import java.util.Scanner;
public class CalculatorOperation {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter input values:");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		int result = x+y;
		System.out.println("Addition is : "+result);
		
		result = x-y;
		System.out.println("Substraction is : "+result);
		
	}
 
}
