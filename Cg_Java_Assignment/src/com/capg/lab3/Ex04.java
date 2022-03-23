package com.capg.lab3;

public class Ex04 {
	
	public static int modifyNumber(int n){
	    String num = String.valueOf(n);
	    String ans = "";
	    int len = num.length();
	    for(int i=0;i<len-1;i++){
	        if((int)num.charAt(i)-(int)num.charAt(i+1) >=0){
	            int x = (int)num.charAt(i)-(int)num.charAt(i+1);
	            ans += String.valueOf(x);
	        }
	        else{
	            int x = (int)num.charAt(i+1)-(int)num.charAt(i);
	            ans += String.valueOf(x);
	        }
	    }
	    ans+=num.charAt(len-1);
	    return Integer.parseInt(ans);
	}

}
