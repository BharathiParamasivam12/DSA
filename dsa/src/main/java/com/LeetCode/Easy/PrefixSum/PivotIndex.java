package com.LeetCode.Easy.PrefixSum;

public class PivotIndex {
     public static int pivotIndex(int[] nums) {
      // Formula : Totalsum - leftsum = rightsum 
      int totalSum = 0;
      int leftSum = 0;
      for(int i=0; i<nums.length; i++){
       // totalSum = totalSum + nums[i];
        totalSum += nums[i];
      }

      for(int i=0; i<nums.length; i++){
        if(totalSum - leftSum-nums[i] == leftSum){
            return i;
        }
        leftSum+=nums[i];  
      }
        return -1;

    }

    public static void main(String[] args) {
     System.out.println(   PivotIndex.pivotIndex(new int[]{1,7,3,6,5,6}));
     System.out.println(   PivotIndex.pivotIndex(new int[]{1,2,3}));
    }
}
