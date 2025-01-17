package com.shweta.multilevelinheritance;

import java.util.Scanner;
public class PaymentOne {

	// n methods
	public String netBankingPayment() {
		//Details
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your netbanking user name");
		String userName = s.nextLine();
		
		System.out.println("please Enter your netbanking passsword");
		String password = s.nextLine();

		System.out.println("payment complete by usin net banking ");
		return "Payment Success, Thanks, Visit Again";
	}
	public static void main(String[] args) {

	}

}
