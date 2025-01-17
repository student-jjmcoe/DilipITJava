package com.shweta.selectionstatements;

public class SwitchStatementDiffDatatypes {

	public static void main(String[] args) {
		int a = 10;
		switch(a) {
		case 23:
			System.out.println("shweta");
			break;
		case 10:
			System.out.println("Siddhi");
			break;
		default :
			System.out.println("Not a best friend");
		}
		
//		float b =3.45f;
//		switch(b) {
//		case 3.56f:
//			System.out.println("Shreya");
//		    break;
//		case 3.45f:
//			System.out.println("Aditi");
//			break;
//		default:
//			System.out.println("Not human");
//			
//		}
		//not possible for float
		
		char ch = 'A';
		switch(ch) {
		case 'B' :
			System.out.println("Sanika");
			break;
		case 'A' :
			System.out.println("Namrata");
			break;
		default :
			System.out.println("Not a Btech student");
		}

	}

}
