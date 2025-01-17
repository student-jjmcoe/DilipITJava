package com.shweta.staticblock;

public class Information {

	static {
		System.out.println("this is static block");
		Information inf = new Information();
		inf.methodTwo();
		methodOne();
		
	}
	public static void main(String[] args) {
		System.out.println("this id main block");
        methodOne();
	}
	static {
		System.out.println("this is static block2");
		methodOne();
	}
	public static void methodOne() {
		System.out.println("this is static method");
	}
	public void methodTwo() {
		System.out.println("this is non-static method");
	}

}
