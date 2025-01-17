package com.shweta.singleinheritance;

public class A {

	int year = 2024;
	public void m1() {
		System.out.println("this is in m1 method of A class");		
	}
	public int getDollerPrice() {
		System.out.println("This is A class method get doller");
		return 89;
	}
	public static void main(String[] args) {
		A a = new A();
		//a.m2();
		B b = new B();
		b.m2();

	}

}
