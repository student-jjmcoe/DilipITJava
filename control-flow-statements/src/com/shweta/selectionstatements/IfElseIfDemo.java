package com.shweta.selectionstatements;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int cibilScore = 677;
		
		if(cibilScore<=500) {
			System.out.println("Cibil is in red zone, Loan rejected");
		}
		else if(cibilScore>=501 && cibilScore<=600) {
			System.out.println("Process, Verify : Income, Compony  details, Address");
		}
		else if(cibilScore>=601 && cibilScore<700) {
			System.out.println("Process, Verify : Income");
		}
		else if(cibilScore>=701 && cibilScore<750) {
			System.out.println("Process and checking limit, user limit approved");
		}
		else {
			System.out.println("Congratulations,Your Loan Approved");
		}

	}

}
