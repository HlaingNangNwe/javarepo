package com.nang;
import java.util.*;  
public class CreateNewArray {
//	static String convert(String st) {
//		char [] ch=st.toCharArray();
//		
//	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String: ");
	 	String str = sc.nextLine(); 
	 	System.out.print("Enter your NewString: ");
	 	String newstr=sc.nextLine();    
			int len = str.length();
			if(len >= 3) {
//				System.out.println( str.substring(0, 3));
				String st=str.substring(0, 3);
				String result =st+newstr+st;
				System.out.println(result);
				
			}else if(len == 1) {
				System.out.println( (str.charAt(0)+"##"));
			}else
				System.out.println("###");
		
			}
		
	}


