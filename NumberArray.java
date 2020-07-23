package com.nang;
import java.util.*; 
public class NumberArray {
	// Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	public static void main(String args[]) {
		 int n, sum = 0;
		 int avg=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < a.length; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	            avg=sum/a.length;
	            
	           
	        }
	        System.out.println("Sum:"+sum);
	        System.out.println("Average:"+avg);
	        int max = getMax(a);
	        System.out.println("Maximum Value is: "+max);
	     
	        // Calling getMin() method for getting min value
	        int min = getMin(a);
	        System.out.println("Minimum Value is: "+min);
	    }
	
}
