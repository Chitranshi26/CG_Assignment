package com.capg.lab5;

import java.util.Scanner;

class EmployeeException extends Exception{
    public EmployeeException(String message){
        super(message);
    }
}

public class Ex03 {
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int sal= sc.nextInt();
	        try{
	            if(sal<3000){
	                throw new EmployeeException("Your Salary is less than 3000");
	            }
	            else{
	                System.out.println("Your Salary is: "+sal);
	            }
	        }
	        catch (EmployeeException e){
	            System.out.println(e.getMessage());
	        }
	    }
	}








