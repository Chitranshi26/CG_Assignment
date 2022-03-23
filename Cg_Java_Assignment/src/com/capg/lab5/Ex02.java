package com.capg.lab5;

import java.util.*;

class UserException extends Exception{
    public UserException(String message) {
        super(message);
    }
}


public class Ex02 {
	
	 public static void validate(String fname,String lname){
	        try{
	            if(fname=="" && lname=="")
	                throw new UserException("Name is Not Valid! Enter Firstname And Lastname!");
	            else{
	                System.out.println("Name is validate: "+fname+" "+lname);
	            }
	        }
	        catch (UserException e){
	            System.out.println(e.getMessage());
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String fname= sc.next();
	        String lname= sc.next();
	        
	        validate(fname,lname);
	        
	    }
	}






