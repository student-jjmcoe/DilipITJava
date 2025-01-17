package com.shweta.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int age = 21;
		Integer age1 = new Integer(22);
		Integer age2 = new Integer("23");
		
		System.out.println("age= "+age+" age1= "+age1+" age2= "+age2);

		Character ch = new Character('S');
		System.out.println("Ch= "+ch);
		
		//The constructor Integer(int) has been deprecated since version 9 and marked for removal
		//so will use bellow
		Integer age3 = Integer.valueOf(34);
		System.out.println("Age3= "+age3);
		
		//Autoboxing and unboxing
		int marks = 67;
		Integer marks2 = marks;//Autoboxing
		System.out.println("Marks2= "+marks2);
		long x = 99;
		Long y = x;
		char ch2 = 'D';
		Character ch3 = ch2;
		
		Integer val = 12;
		int val2 = val;//Autounboxing
		System.out.println("Val2= "+val2);
		
		//toString()
		Integer i1 = Integer.valueOf(56);
		String str = i1.toString();
		System.out.println(str);
		
		Integer i2 = Integer.valueOf(50);
		String str2 = i2.toString();
		System.out.println(str2);
		
		System.out.println("i1 + i2= "+(i1+i2));
		System.out.println("str + str2= "+(str+str2));
	}
}
