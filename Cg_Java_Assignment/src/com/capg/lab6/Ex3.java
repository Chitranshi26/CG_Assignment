package com.capg.lab6;

import java.util.HashMap;

public class Ex3 {

	public static HashMap<Integer, Integer> getSquares(int[] arr){
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ans.containsKey(arr[i])){
                continue;
            }
            else{
                int val = arr[i]*arr[i];
                ans.put(arr[i],val);
            }
        }
        
        return ans;
    }
	
}
