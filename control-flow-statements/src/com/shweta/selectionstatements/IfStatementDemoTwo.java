package com.shweta.selectionstatements;

public class IfStatementDemoTwo {
	public static void main(String[] args) {
		String person1Country = "India";
		String person1Gender = "Male";
		String person1Skill = "Bowler";
		
		System.out.println("Selection in progress. Evaluating persons info");
		
		if(person1Country == "India" && (person1Gender == "Male" || person1Gender == "Female")
				&& (person1Skill == "Bowler" || person1Skill == "Batter")) {
			System.out.println("Congrats ! You got selected");
			System.out.println("Please contact +91 1234567890");
			System.out.println("Reach mumbai by nov 1st");
		}
		System.out.println("Selection is completed. visit Next time");
	}

}
