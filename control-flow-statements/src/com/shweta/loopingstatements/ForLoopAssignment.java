package com.shweta.loopingstatements;

public class ForLoopAssignment {

	public static void main(String[] args) {
		//A person should complete 20 rounds of running track 
		//and need to say hi at every round
		
		for(int p=1; p<=20; p++) {
			System.out.println("Hii "+p);
		}

		System.out.println();
		//100 students 100-200 student IDs print IDs
		for(int ID=100; ID<=200; ID++) {
			System.out.println("Person "+(ID-99) +"  ID= "+ID);
		}
		//333-999 divisible values by 5
		for(int i = 333; i<=999 ;i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
	}

}
