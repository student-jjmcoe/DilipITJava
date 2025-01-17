package com.shweta.staticblock;

public class Test {

	static {
		System.out.println("test class static block");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();

	}

}
