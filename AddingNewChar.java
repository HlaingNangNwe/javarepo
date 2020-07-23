package com.nang;
import java.util.*;  
public class AddingNewChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String str = in.nextLine();
		System.out.print("Enter your Character: ");
		char ch = in.next().charAt(0);
		str = str + ch;      // add char at the end of string
        System.out.println("Add char at the end" +" "+ str); // print the result 
        str = ch + str;      // add char at the beginning
        System.out.println("Add char at the end" +" "+ str); 
        System.out.print("Enter your removenumber: ");
		Integer n = in.nextInt();
        
        String removestr=str.substring(0, str.length() - n);
        System.out.println("Remove char at the end" +" "+ removestr); 
        
        
        
        // print the result 
       }  
	

}
