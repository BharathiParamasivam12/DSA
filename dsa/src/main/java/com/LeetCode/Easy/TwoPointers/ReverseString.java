package com.LeetCode.Easy.TwoPointers;

public class ReverseString {
    public  static void reverseString(char[] s) {
        int i=0; 
        int j= s.length-1;
        while(i<j){
                char temp = s[j];
                s[j] = s[i];
                s[i] = temp;
                i++;
                j--;
            }
            System.out.println(s);
        }
      
    
    public static void main(String[] args) {
        ReverseString.reverseString(new char[]{'b','h','a','r','a','t','h','i'});
    }

}
