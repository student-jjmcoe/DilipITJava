package com.shweta.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a =  10;
		int b = +30;
		int c = -40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(-300);
        System.out.println(+300.9999);
        
        //++
        System.out.println("Increment operator : ++");
        int year = 2024;
        year++;//2025
        System.out.println(year);
        System.out.println(year++);//2025
        System.out.println(++year);//2027
        System.out.println(year);
        
        //--
        System.out.println("decrement operator : --");
        year = 2024;
        year--;//2023
        System.out.println(year);
        System.out.println(year--);//2023
        System.out.println(--year);//2021
        System.out.println(year);
        
        //Suffix/ prefix
        int x = 100;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
        
        int m = 999;
        int n = m++;
        System.out.println(m);
        System.out.println(n);
        
        int val1 = 200;
        System.out.println(val1++);
        System.out.println(++val1);
        System.out.println(val1--);
        System.out.println(--val1);
        
        // ! not operator
        //used with boolean values
        int age = 21;
        //age = !age;
        System.out.println("Not operator");
        boolean areYouMale = true;
        areYouMale = !areYouMale;
        System.out.println(areYouMale);
        System.out.println(!areYouMale);
       
	}

}
