package com.capg.lab6;

import java.util.HashMap;

public class Ex2 {

	
	public static HashMap<Character, Integer> countChars(char[] arr){
        HashMap<Character, Integer> ans = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ans.containsKey(arr[i])){
                ans.put(arr[i],ans.get(arr[i])+1);
            }
            else{
                ans.put(arr[i],1);
            }
        }
        
        return ans;
    }
}
