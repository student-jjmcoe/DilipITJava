package com.shweta.operators;

public class LogicalOrConditionalOperators {

	public static void main(String[] args) {
		//people who got more than 70% and Female person, they are eligible
		//person 1
		int percentage = 80;
		char gender ='F';
		
		boolean result = percentage > 70 && gender =='F';
		System.out.println("is person 1 eligible : " +result);
		
		//person 2
		percentage = 90;
		gender ='M';
				
		result = percentage > 70 && gender =='F';
		System.out.println("is person 2 eligible : " +result);
 
		//person 3
	    percentage = 66;
		gender ='F';
				
		result = percentage > 70 || gender =='F';
		System.out.println("is person 3 eligible : "+result);
		
		System.out.println();
		String person1Country = "Pakistan";
		String person1Gender = "Male";
		String person1Skill ="Bowler";
		boolean result1 = person1Country =="India" && person1Gender == "Male" && person1Skill == "Bowler"; 
		System.out.println("is person 1 eligible : " +result1);
		
		
		String person2Country = "India";
		String person2Gender = "Female";
		String person2Skill ="Bowler";
		boolean result2 = person2Country =="India" && person2Gender == "Male" && person2Skill == "Bowler"; 
		System.out.println("is person 2 eligible : " +result2);
		
		String person3Country = "India";
		String person3Gender = "Male";
		String person3Skill ="Bowler";
		boolean result3 = person3Country =="India" && person3Gender == "Male" && person3Skill == "Bowler"; 
		System.out.println("is person 3 eligible : " +result3);
		
		String person4Country = "India";
		String person4Gender = "Male";
		String person4Skill ="Batting";
		boolean result4 = person4Country =="India" && person4Gender == "Male" && person4Skill == "Bowler"; 
		System.out.println("is person 4 eligible : " +result4);
		
		System.out.println();
		person1Country = "Pakistan";
		person1Gender = "Male";
		person1Skill ="Bowler";
		result1 = person1Country =="India" 
				&& (person1Gender == "Male" || person1Gender == "Female") 
				&& (person1Skill == "Bowler" || person1Skill == "Batter"); 
		System.out.println("is person 1 eligible : " +result1);
		
		person2Country = "India";
		person2Gender = "Female";
		person2Skill ="Keeper";
		result2 = person2Country =="India" 
				&& (person2Gender == "Male" || person2Gender == "Female") 
				&& (person2Skill == "Bowler" || person2Skill == "Batter"); 
		System.out.println("is person 2 eligible : " +result2);
		
		person3Country = "India";
		person3Gender = "Male";
		person3Skill ="Batting";
		result3 = person3Country =="India" 
				&& (person3Gender == "Male" || person3Gender == "Female") 
				&& (person3Skill == "Bowler" || person3Skill == "Batting");
		System.out.println("is person 3 eligible : " +result3);
		
		person4Country = "India";
		person4Gender = "Male";
		person4Skill ="Coach";
		result4 = person4Country =="India" 
				&& (person4Gender == "Male" || person4Gender == "Female") 
				&& (person4Skill == "Bowler" || person4Skill == "Batting");
		System.out.println("is person 4 eligible : " +result4);
	}

}
