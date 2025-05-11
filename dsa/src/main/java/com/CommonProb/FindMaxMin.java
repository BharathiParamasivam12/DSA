package com.CommonProb;

public class FindMaxMin {
      //Find max element in array
        public static void main(String[] args) {
        int[] input = new int[]{9,7,2,6,10,8};
        int max = input[0];
        int min =input[0];
        for(int i=1; i<input.length;i++){
            if(max < input[i]){
                max = input[i];
            }
            if(min > input[i]){
                min = input[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
