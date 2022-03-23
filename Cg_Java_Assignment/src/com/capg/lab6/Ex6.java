package com.capg.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex6 {

	public static List<Integer> votersList(HashMap<Integer,Integer>mp){
        List<Integer>list = new ArrayList<>();
        for(Integer key : mp.keySet()){
            if(mp.get(key)>18){
                list.add(key);
            }
        }
        return list;
    }
	
}
