package com.shweta.constructors;

public class BioData {

	String name;
	long mobile;
	int age;
	
	BioData(String name, long mobile, int age){
		this.name = name;
		this.mobile = mobile;
		this.age = age;
	}
	BioData(String name, long mobile){
		this.name = name;
		this.mobile = mobile;
	}
	BioData(){
		
	}

	public static void main(String[] args) {
		BioData b1 = new BioData("Shweta",1234567890);
		BioData b2 = new BioData("Shweta",1234567890,21);
		BioData b3 = new BioData();
		
		System.out.println(b1.name+" "+b1.mobile+" "+b1.age);
		System.out.println(b2.name+" "+b2.mobile+" "+b2.age);
		System.out.println(b3.name+" "+b3.mobile+" "+b3.age);
	}

}
