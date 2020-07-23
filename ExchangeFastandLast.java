package com.nang;

import java.util.Scanner;

public class ExchangeFastandLast {
	static String count(String str) {
		  // of given string 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
            // k stores index of first character 
            // and i is going to store index of last  
            // character.  
            int k = i; 
            while (i < ch.length && ch[i] != ' ')  
                i++; 
              
            // Swapping 
            char temp = ch[k]; 
            ch[k] = ch[i - 1]; 
            ch[i - 1] = temp; 
  
            // We assume that there is only one space 
            // between two words. 
        } 
        return new String(ch); 
    } 
    public static void main(String[] args) 
    { 
    	Scanner in = new Scanner(System.in);
		System.out.print("Enter your String: ");
        String oldstr = in.nextLine(); 
        System.out.println(count(oldstr)); 
    } 
} 