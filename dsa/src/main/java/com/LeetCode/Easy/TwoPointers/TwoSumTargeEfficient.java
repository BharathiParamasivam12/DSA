package com.LeetCode.Easy.TwoPointers;

public class TwoSumTargeEfficient {
    
    public static void main(String[] args) {
        int[] input = new int[]{2,3,7,11,15};
        int[] in = doCheck(input, 9);
        display(in);
        
    }
    public static int[] doCheck(int[] input, int target){
        int left =0;
        int right = input.length-1;
        while(left < right){
            int total = input[left] + input[right];
            if(total == target){
                return new int[]{left+1,right+1};
            }else if(total < target){
                left ++;
            }else{ // total > target
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void display(int[] in){
        for(int i=0; i<in.length;i++){
            System.out.println(in[i]);
        }
    }
}
