package com.LeetCode.Easy.TwoPointers;

import java.util.Arrays;
import java.util.List;

public class ReverseStringVowels {
    public static void main(String[] args) {
        String str = "paramasivam";
        char[] input = str.toCharArray();
        doCheck(input);
        
    }
    public static void doCheck(char[] input){
        List<Character> list = Arrays.asList('a','e','i','o','u');
        int left =0;
        int right = input.length-1;
        while(left<right){

        if(!list.contains(input[left])){
            left++;
        }else if(!list.contains(input[right])){
            right--;
        }
        else{
            char temp = input[right];
            input[right] = input[left];
            input[left] = temp;
            left++;
            right--;
        }
    }
    display(input);

    }
    public static void display(char[] input){
        for(int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }
}
