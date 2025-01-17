package com.shweta.multilevelinheritance;

import java.util.Scanner;

public class PaymentThree extends PaymentTwo {

	public String creditCardPayment() {
		//Details
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your Card number");
		String cardNumber = s.nextLine();
		
		System.out.println("please Enter your cvv");
		int cvv = s.nextInt();

		System.out.println("please Enter your expiry month and year : MM/YY");
		String expiryData = s.next();
		System.out.println("payment complete by using creditCard ");
		return "Payment Success, Thanks, Visit Again";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
