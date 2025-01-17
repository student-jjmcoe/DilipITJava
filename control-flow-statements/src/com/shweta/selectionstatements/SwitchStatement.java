package com.shweta.selectionstatements;

public class SwitchStatement {

	public static void main(String[] args) {
		//Req - preparing weekday activities
		
		String weekdayName ="FRI";
		
		switch(weekdayName) {
		case "MON" : 
			System.out.println("Please find monday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		case "TUS" : 
			System.out.println("Please find Tuseday activities : ");
			System.out.println("Walk,  Game, visit place");
			break;
		case "WEN" : 
			System.out.println("Please find Wedensday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		case "THU" : 
			System.out.println("Please find thursday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		case "FRI" : 
			System.out.println("Please find Friday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		case "SAT" : 
			System.out.println("Please find Saturday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		case "SUN" : 
			System.out.println("Please find Sunday activities : ");
			System.out.println("Walk, Study, Game");
			break;
		default :
			System.out.println("Invalid day");
		}

	}

}
