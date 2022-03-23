package com.capg.lab1;

import java.util.Scanner;

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number


public class Exercise01
{

	public static int SumOfCubes(int input) 
	{
		
		int m,sum=0;
		
		while(input>0)
		{
			
			m = input%10;
	        sum+=(m*m*m);
	        input=input/10;	
		}
		
	    return sum;
		
	}
	

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int a = SumOfCubes(input);
		System.out.println(a);
		
		
	}

}
