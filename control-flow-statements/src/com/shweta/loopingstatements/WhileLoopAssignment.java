package com.shweta.loopingstatements;

public class WhileLoopAssignment {

	public static void main(String[] args) {
		//A person should complete 20 rounds of running track 
		//and need to say hi at every round
		int p = 1;
		while(p<=20) {
			System.out.println("Hii "+p);
			p++;
		}

		System.out.println();
		//100 students 100-200 student IDs print IDs
		int ID=100;
		while( ID<=200) {
			System.out.println("Person "+(ID-99) +"  ID= "+ID);
			ID++;
		}
		//333-999 divisible values by 5
		int i = 333;
		while(i<=999) {
			if(i%5 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
