package com.nang;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userInput1;
		int userInput2;
		System.out.print("Enter first number : " );
		userInput1 = in.nextInt();
		System.out.println(userInput1);
		System.out.print("Enter second number : " );
		userInput2 = in.nextInt();
		System.out.println(userInput2);
		
		for( int i = userInput1; i <=userInput2; i++) {
			for( int j = 1; j <= 12; j++) {
				int result = i*j;
				System.out.println(i + "*" + j + "=" + result );
			}
			System.out.println();
		}
		
	}

}
