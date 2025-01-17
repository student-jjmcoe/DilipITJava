package com.shweta.loopingstatements;

public class ForLoopInfo {

	public static void main(String[] args) {
		// Inside for loop initialization is optional
		int i = 0;
		for(;i<10;i++) {
			System.out.println(i);
		}
		i = 0;
		//in initialization any number of sysout(); possible seperated by coma ,
		for(System.out.println("Shweta"),System.out.println("Devayani");i<10;i++) {
			System.out.println("XYZ");
		}
		
		//more than one initialization is not possible
//		for(int i=0,int j = 10;j<45;j++) {
//			System.out.println(j);
//		}
		
		//declaring two variables is possible
		for(int k=0,j=0;i<20;i++) {
			System.out.println("Shweta");
		}
		
		//conditional part is optional but infinite loop
//		for(i=2; ;i++) {
//			System.out.println("S");
//		}
		
		//increment decrement part is optional
		for(i=4;i<10;) {
			System.out.println(i);
			i++;
		}
		//in the increment/decrement any number of sop(); are possible seperated by coma,
		for(i=4;i<10;System.out.println("shweta"),System.out.println("Hello")) {
			System.out.println(i);
			i++;
		}
		
		//inside for loop each and every part is optional
		for(;;) {
			
		}
		
		//Unreachable statement
//		for(i=1;i>0;i++) {
//			System.out.println("ssc");
//		}
//		System.out.println("Rest of the code");
		
//		for(i=1;true;i++) {
//			System.out.println("ssc");
//		}
//		System.out.println("Rest of the code");
		
		
	}

}
