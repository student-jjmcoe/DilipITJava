package com.shweta.loopingstatements;

public class WhileLoopAssignment2 {

	public static void main(String[] args) {
        int num = 2;
        int count = 0;

        while (count < 1000) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
        }

    }

}
