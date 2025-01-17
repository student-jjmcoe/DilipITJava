package com.shweta.arrays;

public class ArraysAssignment2 {

	public static void main(String[] args) {
		int[] values = {73434,324,35,45656,57,58,67,89,789,97,789789};
		
		//sum of array values
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum = sum+values[i];
		}
		System.out.println("Sum="+sum);
		
		//identify max value
		int max;
		max=values[0];
		for(int i=0;i<values.length;i++) {
			if(max < values[i])
				max = values[i];
		}
		System.out.println("Max="+max);
		
		//identify min values
		int min;
		min=values[0];
		for(int i=0;i<values.length;i++) {
			if(min > values[i])
				min = values[i];
		}
		System.out.println("Min="+min);
		
		//average of array values
		sum=0;
		for(int i=0;i<values.length;i++) {
			sum = sum+values[i];
		}
		int avg = sum/values.length;
		System.out.println("Average="+avg);
		
		//Identify duplicate values from an array
		for(int i=0;i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[j]==values[i]) {
					System.out.println(j+" ");
				}
			}
		}

	}

}
