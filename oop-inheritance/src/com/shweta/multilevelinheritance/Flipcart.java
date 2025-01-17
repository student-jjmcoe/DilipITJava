package com.shweta.multilevelinheritance;

import java.util.Scanner;

public class Flipcart {

	public static void main(String[] args) {
		// support all options
		PaymentFour allPayments = new PaymentFour();
		
		System.out.println("please select option for payment");
		System.out.println("1. net Banking");
		System.out.println("2. Debit card");
		System.out.println("3. Credit Card");
		System.out.println("4. UPI");
		
		Scanner s = new Scanner(System.in);
		int paymentOption = s.nextInt();
		
		if(paymentOption == 1) {
			allPayments.netBankingPayment();
		}
		else if(paymentOption == 2) {
			allPayments.debitCardPayment();
		}
		else if(paymentOption == 3) {
			allPayments.creditCardPayment();
		}
		else if(paymentOption == 4) {
			allPayments.upiPayment();
		}
		else{//also with switch
			System.out.println("invalid details");
		}
	}

}
44