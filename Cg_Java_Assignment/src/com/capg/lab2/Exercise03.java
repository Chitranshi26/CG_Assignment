package com.capg.lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

//Exercise 3: Create a method which accepts an integer array,
//reverse the numbers in the array and returns the resulting array in sorted order
//Method Name 	getSorted 
//Method Description 	Return the resulting array after reversing the numbers and sorting it 
//Argument 	int [] 
//Return Type 	int 
//Logic 	Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
//Hint 
//Convert the numbers to String to reverse it 


public class Exercise03 {
	
	public static int[] getSorted(int[] array)
	{
		int size = Array.getLength(array);
		
		
		for(int i=0;i<size;i++)
		{
			String str = String.valueOf(array(i)),temp = null ;
			for( int j = str. length() -1 ; j>=0;j--)
			temp+= str. charAt(j) ;
			
		}
		
		
	
		
		return array;
		
		
	
		
	
		
	}

	private static char[] array(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}

	}

}
