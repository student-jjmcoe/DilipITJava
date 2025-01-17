package com.shweta.interfaces;

import java.io.*;
public class ICICILoanApplication implements LoanInfo {

	public String getLoanType() {
		System.out.println("This is implementation of methos in interface LoanInfo");
		
		return "car loan";
	}
	public String getBankName() {
		return "ICICI bank";
	}
	public double calculateEmiValue(long amount, int year, double roi) {
		long p = amount;
		int t = year;
		t = t/12;
		double r = roi;
		
		double EMI =(p * t* Math.pow(1+r, t))/(Math.pow(1+r, t)-1);
		System.out.println("Emi= "+EMI);
		return 0;
	}
	public String getBankLocation() {
		return "Hydrabad";
	}
	public static void main(String[] args) {
		ICICILoanApplication a = new ICICILoanApplication();
		a.getLoanType();
		a.getBankName();
        a.calculateEmiValue(1290000, 26, 13);
	}
}
