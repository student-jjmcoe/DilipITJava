package com.shweta.this_super_keyword;

public class DefaultSuperConstructorC extends DefaultSuperConstructorP {

	DefaultSuperConstructorC(){
		//super();
		System.out.println("Child 0 args constructor");
	}
	public static void main(String[] args) {
		DefaultSuperConstructorC c = new DefaultSuperConstructorC();
	}

}
