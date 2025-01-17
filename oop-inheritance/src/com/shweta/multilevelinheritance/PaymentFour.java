package com.shweta.multilevelinheritance;

import java.util.Scanner;

public class PaymentFour extends PaymentThree{

	public String upiPayment() {
		//Details
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter upi id");
		String upiId = s.next();
		System.out.println("payment complete by using UPI ");
		
		return "Payment Success, Thanks, Visit Again";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
