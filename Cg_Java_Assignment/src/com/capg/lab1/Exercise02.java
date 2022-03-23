package com.capg.lab1;

import java.util.Scanner;

public class Exercise02 
{
	
	// Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons.
	// On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select one of three lights:");
		System.out.println("1. For red");
		System.out.println("2. For yellow");
		System.out.println("3. For green");
		
		//String input = new String();
		int input = sc.nextInt();
		
		
		switch(input)
		{
			
			case 1 :
				System.out.println("stop");
				break;
				
			case 2 :
				System.out.println("ready");
				break;
				
			case 3 :	
				System.out.println("go");
				break;
				
	  }
	}
}
