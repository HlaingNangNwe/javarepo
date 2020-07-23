package com.nang;

import java.util.Arrays;
import java.util.Scanner;

public class Delimeter {
	public static void main(String args[]) {
		
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter String ");
	 String num=s.nextLine();
//	 int n=Integer.parseInt(num);
	 if(num.length() % 2 == 0) {
		 for(int i=0;i<num.length();i+=2) {
			 String result=num.substring(i,i+2)+',';
			 System.out.print(result);
		 }
		 
	 }else {
	 System.out.println("Enter odd string");
	 }
}
}
