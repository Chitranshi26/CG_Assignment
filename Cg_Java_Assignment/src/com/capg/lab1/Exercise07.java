package com.capg.lab1;

import java.util.Scanner;

//Exercise 7: Create a method to check if a number is an increasing number
//Method Name 	checkNumber 
//Method Description 	Check if a number is an increasing number 
//Argument 	int number 
//Return Type 	boolean 
//Logic 	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
//For Example : 134468 is an increasing number 


import java.util.*;
public class Exercise07 {
	
	public static boolean checkNumber(int number)
	{
		String str = Integer.toString(number);
		
		for(int i=0 ; i<= str.length()-2 ; i++) // 1234
		{
			if(str.charAt(i) > str.charAt(i+1))
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

	boolean var = checkNumber(number);
	
	if(var == true)
	{
		System.out.println(number + " is an increasing number ");
	}
	else
		System.out.println(number + " is NOT an increasing number ");
	}
}
