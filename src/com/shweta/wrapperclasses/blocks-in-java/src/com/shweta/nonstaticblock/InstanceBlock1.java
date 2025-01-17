package com.shweta.nonstaticblock;

public class InstanceBlock1 {

	static {
		System.out.println("this is in static block");
	}
	{
		System.out.println("this is in instance block");
	}
	public InstanceBlock1(){
		System.out.println("this is in default constructor");
	}
	public InstanceBlock1(int s){
		System.out.println("this is in 1 parameter constructor");
	}
	{
		System.out.println("this is in instance block 2");
	}
	public static void main(String[] args) {

		System.out.println("this is in main method");
		InstanceBlock1 n = new InstanceBlock1();
		InstanceBlock1 n1  = new InstanceBlock1();
		InstanceBlock1 n2 = new InstanceBlock1(20);
	}

}
