package com.shweta.singleinheritance;

public class B extends A {

	public void m2() {
		System.out.println("this is in m2 method of class B");
//		A x = new A();
//		x.m1();
		m1();
		
		int value = getDollerPrice();
		System.out.println(value);
	}
	public static void main(String[] args) {
		B b = new B();
		b.m2();
        b.getDollerPrice();//calling A class method
	}

}
