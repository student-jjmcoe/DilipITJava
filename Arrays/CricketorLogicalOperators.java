
public class CricketorLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country1 = "Pakistan";
		String gender1 = "Male";
		String skill1 = "Bowler";
		boolean result = country1 == "India" && gender1 =="Male" && skill1 == "Bowler";
		System.out.println("is person 1 eligible: "+result);
		
		String country2 = "India";
		String gender2 = "Female";
		String skill2 = "Bowler";
	    result = country2 == "India" && gender2 =="Male" && skill2 == "Bowler";
		System.out.println("is person 2 eligible: "+result);
		
		String country3 = "India";
		String gender3 = "Male";
		String skill3 = "Batting";
		result = country3 == "India" && gender3 =="Male" && skill3 == "Bowler";
		System.out.println("is person 3 eligible: "+result);
		
		String country4 = "India";
		String gender4 = "Male";
		String skill4 = "Bowler";
		result = country4 == "India" && gender4 =="Male" && skill4 == "Bowler";
		System.out.println("is person 4 eligible: "+result);
		
		 country1 = "Pakistan";
		 gender1 = "Male";
		 skill1 = "Bowler";
		 result = country1 == "India" && (gender1 =="Male"||gender1 =="Female") && (skill1 == "Bowler"||skill1 == "Batter");
		System.out.println("is person 1 eligible: "+result);
		
		 country2 = "India";
		 gender2 = "Female";
	     skill2 = "Keeper";
	    result = country2 == "India" && (gender2 =="Male"||gender2 =="Female") && (skill2 == "Bowler"||skill2 == "Batter");
		System.out.println("is person 2 eligible: "+result);
		
		 country3 = "India";
		 gender3 = "Male";
		 skill3 = "Batter";
		result = country3 == "India" && (gender3 =="Male"||gender3 =="Female") && (skill3 == "Bowler"||skill3 == "Batter");
		System.out.println("is person 3 eligible: "+result);
		
		 country4 = "India";
		 gender4 = "Male";
		 skill4 = "Coach";
		result = country4 == "India" && (gender4 =="Male"||gender4 =="Female") && (skill4 == "Bowler"||skill4 == "Batter");
		System.out.println("is person 4 eligible: "+result);
		
		//using ternary Op
		 country1 = "Pakistan";
		 gender1 = "Male";
		 skill1 = "Bowler";
		 String result2 = country1 == "India" && gender1 =="Male" && skill1 == "Bowler"? "Eligible" : "Not Eligible";
		 System.out.println(result2);
		 
		 country4 = "India";
		 gender4 = "Male";
		 skill4 = "Bowler";
		result2 = country4 == "India" && (gender4 =="Male"||gender4 =="Female") && (skill4 == "Bowler"||skill4 == "Batter")?"Eligible" : "Not Eligible";
		
		System.out.println(result2);
	}

}
