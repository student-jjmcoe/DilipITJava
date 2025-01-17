package com.shweta.nonstaticblock;

//two constructors but one instance block as one object
public class NonStaticBlockN3 {

	{
		System.out.println("this is in instance block");
	}
	public NonStaticBlockN3(){
		this(10);
		System.out.println("this is in default constructor");
		
	}
	public NonStaticBlockN3(int a){
		System.out.println("this is in 1 parameter constructor");
	}
	public static void main(String[] args) {
		NonStaticBlockN3 x = new NonStaticBlockN3();
		System.out.println("this is in main method"); 

	}

}
