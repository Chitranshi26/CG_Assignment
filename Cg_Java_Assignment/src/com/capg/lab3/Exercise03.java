package com.capg.lab3;

import java.util.Scanner;

//Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
//Note: Consonant refers to all alphabets excluding vowels
//
//Method Name 	alterString 
//Method Description 	Replace consonants 
//Argument 	String 
//Return Type 	String 
//Logic 	Return the String replacing all the consonants with the next character. 
//For Example :JAVA should be changed as KAWA 




public class Exercise03 {
	
	public static String alterString(String str) {
		
		String temp="";
		for(int i=0 ; i<=str.length()-1;i++)
		{
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) ==  'i' ||str.charAt(i) ==  'o' || str.charAt(i) == 'u' ||str.charAt(i) ==  'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||str.charAt(i) ==  'O' || str.charAt(i) == 'U' )
			{
				 temp += str.charAt(i);
			}
			
			else
			{
				int cons = (int)str.charAt(i);
				cons += 1;
				
				char ch = (char)cons;
				temp += ch;
			}
		}
		
		return temp;
		
		
	}

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     
     String s = alterString(str);
     System.out.println(s);
     
	}

}
