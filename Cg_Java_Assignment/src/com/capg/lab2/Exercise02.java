
package com.capg.lab2;
import java.util.Arrays;
import java.util.Scanner;


//Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order.
//The elements in the left half should be completely in uppercase and the elements in the right half 
//should be completely in lower case. Return the resulting array.
//Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
//Method Name 	sortStrings
//Method Description 	accept an array of String objects and sort in
//Alphabetical order.
//Argument 	String[] arr
//Return Type 	String 
//Logic 	

public class Exercise02 {
	
	public static String[] sortStrings(String[] str) {
		
		int j = str.length;
		int size = str.length;
	
	Arrays.sort(str);   //ant bat cat net
		
		
		int cnt ;
		
		if(size%2==0)
		   cnt = size/2;
		
		else 
			cnt = (size/2) + 1;
		
		
			for(int i=0; i<cnt; i++)
			{
				str[i] = str[i].toUpperCase(); //4
				
			} 
		
			
			
			return str;

	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the String: ");
		int size = sc.nextInt(); 
		sc.nextLine();
		String[] str = new String[size];
		
		int j = str.length;
		for(int i=0; i<size; i++)
		{
			str[i] = sc.nextLine(); 
			
		} 
		
		   str = sortStrings(str);
		   
		   for(int i=0; i<j; i++)
			{
			   System.out.println(str[i]);
				
			} 
		  
	
	}

}