package com.shweta.arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		//for each loop;
		double[] marksAvg = {66.66,77.77,44,55,90.99,88,66,45};
		
		//using initialization
		double[] avgOfMarks = new double[7];
		avgOfMarks[0]=66.66;
		avgOfMarks[1]=77;
		avgOfMarks[2]=44.44;
		avgOfMarks[3]=55;
		avgOfMarks[4]=90.89;
		avgOfMarks[5]=88.99;
		avgOfMarks[6]=66;
		//print All the values 
		for(double avg : marksAvg) {
			System.out.println(avg);
		}
		System.out.println();
		//print All the values 
				for(double avg : avgOfMarks) {
					System.out.println(avg);
				}
		
		System.out.println();
		//print above array values: 3rd position to 7th position
		for(int i=2;i<7;i++) {
			System.out.println(marksAvg[i]);
		}
		System.out.println();
		//print above array values: 3rd position to 7th position
		for(int i=2;i<7;i++) {
			System.out.println(avgOfMarks[i]);
		}
		
		System.out.println();
		System.out.println("Printing alternative values:");
		//print alternative array values
		for(int i=0;i<marksAvg.length;i+=2) {
			System.out.println(marksAvg[i]);
		}
		System.out.println();
		System.out.println("Printing alternative values:");
		//print alternative array values
		for(int i=0;i<avgOfMarks.length;i+=2) {
			System.out.println(avgOfMarks[i]);
		}
		
		System.out.println();
		//add 5% to all aobve students average
		System.out.println("add 5% to all aobve students average");
		for(double avg : marksAvg) {
			System.out.println(avg+5);
		}
		
		System.out.println();
		//add 5% to all aobve students average
		System.out.println("add 5% to all aobve students average");
		for(double avg : avgOfMarks) {
			System.out.println(avg+5);
		}
	}
}


