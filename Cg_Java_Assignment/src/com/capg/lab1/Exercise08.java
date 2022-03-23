package com.capg.lab1;

import java.util.Scanner;
import java.util.*;

//Exercise 8: Create a method to check if a number is a power of two or not
//Method Name 	checkNumber 
//Method Description 	Checks if the entered number is a power of two or not 
//Argument 	int n 
//Return Type 	boolean 
//Logic 	Check if the input is a power of two. 
//Ex: 8 is a power of 2 


public class Exercise08 {
	
	public static boolean checkNumber(int n) {
		
		for(int i=0;i<=n;i++)
	    {
			
       	 int q = (int) Math.pow(2,i);
       	 
		 if(q>n)
		    	 break;
		     
		     if(q==n)
					return true;
        }
	    
		return false;
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean output = checkNumber(n);
		System.out.println(output);
		
		if(output==true)
			System.out.println(n + " is a power of 2");
		
		else
			System.out.println(n + " is not a power of 2");
			
		
	}
}
