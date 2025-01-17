package com.shweta.nonstaticblock;

public class NonStaticBlockN5 {
	// instance block and instance variable executed from top to bottom
	int a = m1();
    int m1(){
    	System.err.println("method called by instance variable a");
    	return 0;
    }
		{
			System.out.println("this is in instance block 1");
		}
	    
		public static void main(String[] args) {
			NonStaticBlockN5 t = new NonStaticBlockN5();
		}

}
