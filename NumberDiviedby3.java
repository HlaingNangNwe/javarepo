package com.nang;

public class NumberDiviedby3 {

	 // Result function with N 
    static void result(int N) 
    {      
        // iterate from 0 to N 
        for (int num = 0; num < N; num++) 
        {      
            // Short-circuit operator is used  
            if (num % 3 == 0)
            	 continue;
                System.out.print(num + " "); 
        } 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
        // input goes here 
        int N = 100; 
           
        // Calling function 
        result(N); 
    } 

}
