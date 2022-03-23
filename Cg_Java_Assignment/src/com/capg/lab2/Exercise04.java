package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
//Return the resulting array in descending order
//
//Method Name 	modifyArray 
//Method Description 	Remove duplicates 
//Argument 	int [] 
//Return Type 	int [] 
//Logic 	Remove the duplicate elements in the array and sort it in descending order 
//



public class Exercise04 {
	
	public int[] modifyArray(int arr[]) {
		Arrays.sort(arr);
		int i, j = 0, n = arr.length;
		for (i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		while (j < n) {
			arr[j++] = 0;
		}

		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
		return arr;
	}
	
		public static void main(String[] args) {
			int n, i;
			Exercise04 four = new Exercise04();
			
			System.out.println("Enter number of Elements in the array :");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			System.out.println("Enter the elements of the array :");
			int[] arr = new int[n];
			for (i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();

			System.out.println("Output:");
			four.modifyArray(arr);
			for (i = 0; i < n; i++) {
				if(arr[i]!=0)
				System.out.print(arr[i] + " ");
}
		}
}
