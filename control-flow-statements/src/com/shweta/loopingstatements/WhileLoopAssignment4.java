package com.shweta.loopingstatements;

public class WhileLoopAssignment4 {

	public static void main(String[] args) {
		// print values divisible by 11 from 333 to 888
		int num = 333;
		while(num<=888) {
			if(num % 11 == 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
