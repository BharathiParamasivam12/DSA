package com.LeetCode.Easy.Array;

import java.util.stream.IntStream;

public class MoveZeros {
     public void moveZeroes(int[] nums) {
        int[] out = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++){
           if(nums[i]>0){
            out[j] = nums[i];
            j++;
           }
        }

        IntStream.of(out)
                .boxed()
                .map(i -> (int)i)
                .forEach(System.out::println);
        
    }

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
      //  mz.moveZeroes(new int[]{0,1,0,3,12});
       // mz.moveZeroes(new int[]{0});
       mz.moveZeroes(new int[]{0,1,0});
      
      
    }
}
