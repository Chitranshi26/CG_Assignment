package com.capg.lab6;

import java.util.Arrays;

public class Ex5 {
	
	public static int getSecondSmallest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

}
