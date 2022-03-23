package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
//Method Name 	getSecondSmallest 
//Method Description 	Get the second smallest element in the array 
//Argument 	int[] 
//Return Type 	int 
//Logic 	Sort the array and return the second smallest element in the array 


public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		
			System.out.println(array[1]);
		
		
		

	}

}
