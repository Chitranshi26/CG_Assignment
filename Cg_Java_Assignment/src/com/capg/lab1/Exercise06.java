package com.capg.lab1;

import java.util.Scanner;

//Exercise 6: Create a class with a method to find the difference between the sum of the squares and 
//the square of the sum of the first n natural numbers.
//
//
//Method Name 	calculateDifference 
//Method Description 	Calculate the difference 
//Argument 	int n 
//Return Type 	int - Sum 
//Logic 	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
//For Example if n is 10,you have to find 
//(1^2+2^2+3^2+….9^2+10^2)- 
//(1+2+3+4+5…+9+10)^2 


public class Exercise06 {

	public static int calculateDifference(int n) 
	{
		
		int sum = 0 , sums=0 , sqs=0 ;
		
		for(int i=1;i<=n;i++)
		{
		 sums = sums+(i*i) ; 
		 
		}
//		System.out.println("sums= " + sums); 
		
		for(int i=1;i<=n;i++)
		{
			 sqs = sqs + i;
		}
		 
		
		// System.out.println("sqs= " + sqs*sqs);
		
		sum = sums-(sqs*sqs);
	//	System.out.println("sum= " + sum); 
		
		return -sum;
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int diff = calculateDifference(n);
		System.out.println(diff);
		

	}

}
