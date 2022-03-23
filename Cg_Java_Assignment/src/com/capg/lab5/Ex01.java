package com.capg.lab5;

import java.util.Scanner;

class UserException extends Exception{
    public UserException(String message) {
        super(message);
    }
}

public class Ex01 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age<15){
                throw new UserException("Age is not valid!");
            }
            else{
                System.out.println("Age is Valid");
            }
        }
        catch (UserException e){
            System.out.println(e.getMessage());
        }

    }

}



