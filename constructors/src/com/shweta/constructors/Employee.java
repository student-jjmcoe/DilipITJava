package com.shweta.constructors;

public class Employee {

	//constructor overloading
	public Employee() {
		System.out.println("This is default constructor");
	}
	public Employee(int id) {
		System.out.println("This is 1 parameter constructor");
	}
	public Employee(String name) {
		System.out.println("This is String parameter constructor, name: "+name);
	}
	public Employee(int id, String name, double salary) {
		System.out.println("This is 3 parameter constructor");
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Salary is: "+salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e2  = new Employee(1234);
		Employee e3 = new Employee("Shweta");
		Employee e4 = new Employee(7,"Shweta",10000000);
	}

}
