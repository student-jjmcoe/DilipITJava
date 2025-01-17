package com.shweta.singleinheritance;

public class CVariables extends A{
	public void m2() {
		System.out.println("this is in m2 method of class B");
		m1();
		System.out.println("Current year is: "+year);
	}
	public static void main(String[] args) {
		B b = new B();
		b.m2();
        b.getDollerPrice();//calling A class method
	}

}
