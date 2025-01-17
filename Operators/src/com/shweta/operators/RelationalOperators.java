package com.shweta.operators;

public class RelationalOperators {

	public static void main(String[] args) {
		System.out.println("== operator");
		int value1 = 1000;
		int value2 = 2000;
        System.out.println(value1 == value2);
        
        int x = 88;
        double y = 88.1;
        
        boolean sameOrNot = x == y;
        System.out.println(sameOrNot);
        
        System.out.println("!= operator");
        int a = 100;
        int b = 200;
        
        boolean isSame = a != b;
        System.out.println(isSame);
        
        b = 100;
        isSame = a != b;
        System.out.println(isSame);
        
        System.out.println("> operator");
        int yourSalary = 3000000;
        int friendSalary = 2500000;
        System.out.println(yourSalary > friendSalary);
        System.out.println(friendSalary > yourSalary);
       
        friendSalary = 3000000;
        System.out.println(yourSalary > friendSalary);
        System.out.println(friendSalary > yourSalary);
        
        System.out.println(">= operator");
        yourSalary = 3000000;
        friendSalary = 2500000;
        System.out.println(yourSalary >= friendSalary);
        System.out.println(friendSalary >= yourSalary);
        
        int sal1 = 3000;
        int sal2 = 3001;
        System.out.println(sal1 >= sal2);
        System.out.println(sal2 >= sal1);
        System.out.println(sal1 = sal2);
        System.out.println(sal1 < sal2);
        
        System.out.println("< , <= operators");
        int p =100;
        int q = 99;
        System.out.println(p < q);
        System.out.println(p <= q);
        System.out.println(q < p);
        System.out.println(q <= p);
        
        q = 100;
        System.out.println(p < q);
        System.out.println(p <= q);
        System.out.println(q < p);
        System.out.println(q <= p);
	}

}
