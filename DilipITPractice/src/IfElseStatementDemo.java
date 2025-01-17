
public class IfElseStatementDemo {

	public static void main(String[] args) {
		System.out.println("Selection in progress");
		String country1 = "Pakistan";
		String gender1 = "Male";
		String skill1 = "Bowler";
		if(country1 == "India" && (gender1 =="Male"||gender1 =="Female") && (skill1 == "Bowler"||skill1 == "Batter"))
		{
			System.out.println("Congrats you are selected");
		}
		else {
			System.out.println("Sorry, Better luck next time");
		}
		System.out.println("Selection is complete");

	}

}
