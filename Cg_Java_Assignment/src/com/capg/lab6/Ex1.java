package com.capg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	
	public static List getValues(HashMap<Integer,Integer>mp){
        List<Integer> list=new ArrayList<Integer>();
        
        for (Integer key: mp.keySet()) {
            list.add(mp.get(key));
        }

        Collections.sort(list);
        return list;
    }

}
