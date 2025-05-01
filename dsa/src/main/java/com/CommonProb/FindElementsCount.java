package com.CommonProb;

public class FindElementsCount {
    public static void main(String[] args) {
        FindElementsCount.doLogicWithLengthFunc(new int[]{2,3,5,7});
         FindElementsCount.doLogicWithOutLengthFunc(12345);
    }
    public static void doLogicWithLengthFunc(int[] input){
        int count = 0; 
        for(int i=0; i<=input.length-1; i++){
            count++;
        }
        System.err.println("count : "+count);
    }

     public static void doLogicWithOutLengthFunc(int input){
        int count = 0; 
        while(input>0){
            input = input/10;
                count++;
               
        }
        System.err.println("count wo function : "+count);
    }



}
