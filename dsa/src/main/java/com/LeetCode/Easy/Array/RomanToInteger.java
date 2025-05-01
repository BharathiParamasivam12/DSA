package com.LeetCode.Easy.Array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        String[] input = s.split("");
        for(String i : input){
           if(map.containsKey(i)){
                count = map.get(i) + count;
           }
        
        }
        System.out.println(count);
        
    }
}
