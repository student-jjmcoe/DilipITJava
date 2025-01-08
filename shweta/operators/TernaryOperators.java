package com.shweta.operators;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 80;
		int b = 60;
		int result = a>b ? b : a;
		System.out.println("Smallest among two= "+result);
		
		int result2 = a>b ? a : b;
		System.out.println("Largest among two= "+result2);
		System.out.println();
		
		int Apercentage = 60;
		char Agender = 'F';
		String isEligible = Apercentage > 70 && Agender == 'F'? "Eligible": "Not Eligible";
		System.out.println(isEligible);
		
		int Bpercentage = 71;
		char Bgender = 'F';
		isEligible = Bpercentage > 70 && Bgender == 'F'? "Eligible": "Not Eligible";
		System.out.println(isEligible);
		
		int Cpercentage = 90;
		char Cgender = 'M';
		isEligible = Cpercentage > 70 && Cgender == 'F'? "Eligible": "Not Eligible";
		System.out.println(isEligible);

		System.out.println();
		String person1Country = "Pakistan";
		String person1Gender = "Male";
		String person1Skill ="Bowler";
		String result1 = person1Country =="India" && person1Gender == "Male" && person1Skill == "Bowler"? "Eligible":"Not Eligible"; 
		System.out.println(result1);
		
		
		String person2Country = "India";
		String person2Gender = "Female";
		String person2Skill ="Bowler";
		String resultOf2 = person2Country =="India" && person2Gender == "Male" && person2Skill == "Bowler"? "Eligible":"Not Eligible"; 
		System.out.println(resultOf2);
		
		String person3Country = "India";
		String person3Gender = "Male";
		String person3Skill ="Bowler";
		String result3 = person3Country =="India" && person3Gender == "Male" && person3Skill == "Bowler"? "Eligible":"Not Eligible"; 
		System.out.println(result3);
		
		String person4Country = "India";
		String person4Gender = "Male";
		String person4Skill ="Batting";
		String result4 = person4Country =="India" && person4Gender == "Male" && person4Skill == "Bowler"? "Eligible":"Not Eligible"; 
		System.out.println(result4);
		
		System.out.println();
		person1Country = "Pakistan";
		person1Gender = "Male";
		person1Skill ="Bowler";
		result1 = person1Country =="India" 
				&& (person1Gender == "Male" || person1Gender == "Female") 
				&& (person1Skill == "Bowler" || person1Skill == "Batter")? "Selected" : "Not Selected"; 
		System.out.println(result1);
		
		person2Country = "India";
		person2Gender = "Female";
		person2Skill ="Keeper";
		resultOf2 = person2Country =="India" 
				&& (person2Gender == "Male" || person2Gender == "Female") 
				&& (person2Skill == "Bowler" || person2Skill == "Batter")? "Selected" : "Not Selected"; 
		System.out.println(resultOf2);
		
		person3Country = "India";
		person3Gender = "Male";
		person3Skill ="Batting";
		result3 = person3Country =="India" 
				&& (person3Gender == "Male" || person3Gender == "Female") 
				&& (person3Skill == "Bowler" || person3Skill == "Batting")? "Selected" : "Not Selected";
		System.out.println(result3);
		
		person4Country = "India";
		person4Gender = "Male";
		person4Skill ="Coach";
		result4 = person4Country =="India" 
				&& (person4Gender == "Male" || person4Gender == "Female") 
				&& (person4Skill == "Bowler" || person4Skill == "Batting")? "Selected" : "Not Selected";
		System.out.println(result4);
	}

}
