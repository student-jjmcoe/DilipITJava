
public class IfStatementdemo {

	public static void main(String[] args) {
		System.out.println("Checking given number is even or odd");
		int number = 88;
		if(number % 2==0) {
			System.out.println("Given number"+ number +"is even");
		}
		System.out.println("Checking given number is even or odd is comleted");
		System.out.println("Thank You");
		
		//2.example cricket example
		System.out.println("Selection in progress");
		String country1 = "India";
		String gender1 = "Male";
		String skill1 = "Bowler";
		if(country1 == "India" && (gender1 =="Male"||gender1 =="Female") && (skill1 == "Bowler"||skill1 == "Batter"))
		{
			System.out.println("Congrats you are selected");
		}
		System.out.println("Selection is complete");
	}

}
