package com.shweta.branchingstatements;

public class BranchingStatementDemo {

			public static void main(String[] args) {
				for(int i=10; i<=30; i++) {
					System.out.println("The value is : "+i);
					
					if(i == 25) {
						break;
					}
					System.out.println("It is valid value");
				}
				
				System.out.println();
				for(int i=10 ; i<=30; i++) {
					if(i%17 != 0 ) {
						continue;
					}
					
						System.out.println("Found Value:"+i);
				}
				
				System.out.println();
				BranchingStatementDemo b = new BranchingStatementDemo();
				System.out.println(b.calculate(10,20,"Mul"));
			}
			 public int calculate(int a, int b, String operation) {
				 if(operation == "Add")
				     return a+b;
				 else if(operation == "Sub")
					 return a-b;
				 else if(operation == "Mul")
					 return a*b;
				 else if(operation == "Div")
					 return a/b;
				 return 0;
			
			 }

}
