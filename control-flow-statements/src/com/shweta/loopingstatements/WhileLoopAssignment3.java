package com.shweta.loopingstatements;

public class WhileLoopAssignment3 {

	public static void main(String[] args) {
//print Odd numbers from 500 - 200
		
        int num2 = 500;
        while(num2>=200) {
        	if(num2 %2 != 0) {
        		System.out.println(num2);
        	}
        	num2--;
        }

	}

}
