package com.LeetCode.Easy.Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayEx {
     public int minOperations(int[] nums, int k) {
        Set<Integer> count = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k)
                return -1;
            else if(nums[i]>k){
                count.add(nums[i]);
            }
        }
        return count.size();
    }

    public static void main(String[] args) {
        ArrayEx array = new ArrayEx();
        System.out.println(array.minOperations(new int[]{9,7,5,3}, 1));

    }
}
