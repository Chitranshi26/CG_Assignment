package com.capg.lab3;

import java.time.*;
import java.util.*;

public class Ex09 {
	  public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter year ");
	        int year = sc.nextInt();
	        System.out.println("Enter month ");
	        int month = sc.nextInt();
	        System.out.println("Enter day ");
	        int days = sc.nextInt();
	        LocalDate pdate = LocalDate.of(year, month, days);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
}



