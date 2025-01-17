package com.shweta.nonstaticblock;

public class NonStaticBlockN2 {

		{
			System.out.println("this is instance block1");
		}
		{
			System.out.println("this is instance block2");
		}
		
		NonStaticBlockN2(){
			System.out.println("this is static block");
		}
		{
			System.out.println("this is instance block3");
		}
		public static void main(String[] args) {
			// simple example
			NonStaticBlockN2 n = new NonStaticBlockN2();
			System.out.println("this is main method");
		}
		{
			System.out.println("this is instance block4");
		}

}
