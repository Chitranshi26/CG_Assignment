package com.capg.lab6;

import java.util.Arrays;

public class Ex7 {
	
public static int[] getSorted(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            String num = Integer.toString(arr[i]);
            String temp = "";
            for(int j=num.length()-1;j>=0;j--){
                temp+=num.charAt(j);
            }
            arr[i]=Integer.parseInt(temp);  
        }
        Arrays.sort(arr);
        return arr;
    }

}
