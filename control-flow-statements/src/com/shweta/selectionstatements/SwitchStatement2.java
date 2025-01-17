package com.shweta.selectionstatements;

import java.util.Scanner;

public class SwitchStatement2 {
	public static void main(String[] args) {
		int a,b,c,ch;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=x.nextInt();
		b=x.nextInt();
		System.out.println("Enter choice \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		ch = x.nextInt();
		
		switch(ch) {
		case 1:
			c = a+b;
			System.out.println("Addition="+c);
			break;
		case 2:
			c = a-b;
			System.out.println("Substraction="+c);
			break;
		case 3:
			c = a*b;
			System.out.println("Multiplication="+c);
			break;
		case 4:
			c = a/b;
			System.out.println("Division="+c);
			break;					
		}
	}

}
