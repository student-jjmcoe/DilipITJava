
public class TernaryOperator {

	public static void main(String[] args) {
		//min of two no.
		int a=60;
		int b=80;
		int result = a > b ? b : a;
		System.out.println("Min of Two="+result);
		
		//max of two no.
			    result = a > b ? a : b;
				System.out.println("Max of two="+result);
				
		//people who got more than 70% and female are eligible
				float percent= 75;
				char gender ='M';
				String result2 = percent > 70 && gender =='F'? "Eligible" : "Not eligible";
				System.out.println(result2);
	}

}
