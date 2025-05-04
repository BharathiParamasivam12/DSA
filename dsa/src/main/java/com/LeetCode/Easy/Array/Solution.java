package com.LeetCode.Easy.Array;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int minus = 0;
     
     //   String s = "MCMXCIV";
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
        int k=0;
    while(input[k+1] != null){
       for(int i=0; i<input.length; i++){
            String in = input[i];

            if(map.containsKey(in)){
                count = map.get(in) + count;
            }
            if(in.equals("I")){
                if(input[i+1].equals("V" ) || input[i+1].equals( "X")){
                    minus = minus +2;
                }
            }
             if(in.equals("X")){
                if(input[i+1].equals("L" ) || input[i+1].equals( "C")){
                    minus = minus +20;
                }
            }
             if(in.equals("C")){
                if(input[i+1].equals("D" ) || input[i+1].equals( "M")){
                    minus = minus + 200;
                }
            }        
       }
       k++;
        }
            return count- minus;
         
    }
}
