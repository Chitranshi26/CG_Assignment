package com.capg.lab1;

import java.util.Scanner;


//Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1.
//Every subsequent value is the sum of the 2 values preceding it.
//Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?



public class Exercise03 {

	
	
	// Non-Recursive Method
	
//	public static int NonRecursiveFibonacciSeries(int size)
//	{
//		
//       int[] arr = new int[size];
//		
//		
//		arr[0] = 1;
//		arr[1] = 1;
//
//		      for(int i=2 ; i<size; i ++)
//		     {
//			     arr[i] = arr[i-1] + arr[i-2];
//			
//	         }
//	
//	return arr[size-1];	
//	}

	
	
	// Recursive Method
	
	public static int RecursiveFibonacciSeries(int size)
	{
	
       if ( (size == 0) || (size == 1) )
    	   return 1;
       
      return RecursiveFibonacciSeries(size-1) + RecursiveFibonacciSeries(size-2);
       
	}

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();   
         
         //Non-recursive method invokes
         
//    int nr =  NonRecursiveFibonacciSeries( size);
//    System.out.println(nr);
 
         
         // recursive method invokes
         
         int r = RecursiveFibonacciSeries(size-1);
         System.out.println(r);
         
		
	}

}
