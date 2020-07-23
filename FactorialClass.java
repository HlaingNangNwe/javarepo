package com.nang;

import java.util.Scanner;

public class FactorialClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your number");
		int number=s.nextInt();
		int fact=1;
		int i=1;
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.print("Factorial of"+" "+number+" "+fact);
	}

}
