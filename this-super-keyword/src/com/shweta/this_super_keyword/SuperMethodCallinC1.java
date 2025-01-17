package com.shweta.this_super_keyword;

public class SuperMethodCallinC1 extends SuperMethodCallinP1 {
	public void m1() {
		System.out.println("Child m1 method");
	}

	public void m2() {
		this.m1();
		super.m1();
	}
	public static void main(String[] args) {
		SuperMethodCallinC1 c = new SuperMethodCallinC1();
		c.m2();

	}

}
