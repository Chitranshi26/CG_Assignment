package com.capg.lab3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		 
		        int nl=1,nw=0;           
		        char ch;
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter File name: ");
		        String str=sc.nextLine();
		        
		        int n=str.length();
		        
		        
		        for(int i=0;i<n;i++){
		            ch=str.charAt(i);
		            if(ch=='\n')
		                nl++;
		            else if(ch==' ')
		                nw++;
		        }
		        System.out.println("Number of lines : "+nl);
		        System.out.println("Number of words : "+(nl+nw));
		        System.out.println("Number of characters : "+n);
		                       

		            }
		}