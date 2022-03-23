package com.capg.lab1;

import java.util.Scanner;

//Exercise 4: Write a Java program that prompts the user for an integer
//and then prints out all the prime numbers up to that Integer?


public class Exercise04 {
	
	public static void prime(int n)
	{
		for(int i=2;i<n;i++)  // 2 to 10
		{
		int count=0;
		for(int j=2 ; j<=i/2 ; j++ )
		{
			if(i%j == 0)
				count++;
		}
		
		if(count==0)
			System.out.print(i + " ");
			
		}
		
			}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		prime(n);
		

	}

}
