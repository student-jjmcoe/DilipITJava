package com.shweta.nonstaticblock;

public class NonStaticBlockN1 {

	{
		System.out.println("this is instance block");
	}
	NonStaticBlockN1(){
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		// simple example
		NonStaticBlockN1 n = new NonStaticBlockN1();
		System.out.println("this is main method");
	}

}
