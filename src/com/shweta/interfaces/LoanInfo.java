package com.shweta.interfaces;

public interface LoanInfo {
	// method should return String value
	// method should not take any arguments and method name is getLoanType
	String getLoanType() ;
	String getBankName() ;
    public double calculateEmiValue(long amount, int year, double roi);
}
