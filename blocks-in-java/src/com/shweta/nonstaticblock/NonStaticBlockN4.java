package com.shweta.nonstaticblock;

public class NonStaticBlockN4 {
	// instance block and instance variable executed from top to bottom
	{
		System.out.println("this is in instance block 1");
	}
    int a = m1();
    int m1(){
    	System.err.println("method called by instance variable a");
    	return 0;
    }
	public static void main(String[] args) {
		NonStaticBlockN4 t = new NonStaticBlockN4();
	}

}
