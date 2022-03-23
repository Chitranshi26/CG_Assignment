package com.capg.lab6;

import java.util.Arrays;

public class Ex4 {

	public static int getSecondSmallest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
}
