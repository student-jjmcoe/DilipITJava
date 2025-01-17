package com.shweta.loopingstatements;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		//A person should complete 20 rounds of running track 
		//and need to say hi at every round
		int i = 1;
		do {
			System.out.println("Hii: "+i);
			i++;
		}while(i<=20);

		System.out.println();
		//100 students 100-200 student IDs print IDs
		int ID = 100;
		do {
			System.out.println("Student ID: "+ID);
			ID++;
		}while(ID<=200);
		
		//333-999 divisible values by 5
		int val = 333;
		do {
			if(val % 5 == 0) {
			System.out.println(val);
			}
		    val++;
		}while(val <= 999);

	}

}
