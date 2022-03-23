package com.capg.lab3;

import java.util.Scanner;

public class Ex08 {

	
		 public static boolean solve(String s){
		        int n = s.length();
		        
		        for(int i=0;i<n-1;i++){
		            if(s.charAt(i+1)<s.charAt(i)){
		                return false;
		            }
		        }
		        return true;
		    }
		    
		    public static void main(String args[]){

		        Scanner sc=new Scanner(System.in);
		        String s = sc.nextLine();
		        
		        if(solve(s)){
		            System.out.println("positive");
		        }
		        else{
		            System.out.println("negative");
		        }
		        
		    }
}
	
