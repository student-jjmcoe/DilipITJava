package com.shweta.arrays.nonprimitive;

public class Employee {

	public int id;
	public String name;
	public double salary;
	
	//constructor
	public Employee(int empId, String empName, double empSalary) {
		id = empId;
		name =  empName;
		salary = empSalary;
	}
	public Employee() {
		
	}
	
	//Employee[] returntype
	public Employee[] getAllEmployees() {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee(1,"one",100000);
		employees[1]= new Employee(2,"two",200000);
		employees[2] = new Employee(3,"Three",300000);
		employees[3] = new Employee(4,"Four",400000);
		employees[4] = new Employee(5,"Five",500000);
		
		return employees;
	}
	public static void main(String[] args) {
		Employee obj = new Employee();
		Employee[] allEmp = obj.getAllEmployees();

		for(Employee emp : allEmp) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
		}
	}

}
