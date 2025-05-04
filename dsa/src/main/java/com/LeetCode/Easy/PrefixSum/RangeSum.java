package com.LeetCode.Easy.PrefixSum;

class RangeSum {
 private static int[] p ;
    public static void NumArray(int[] nums) {
    p = new int[nums.length];
      if(nums.length>0){
        p[0] = nums[0];
        for(int i=1; i< nums.length; i++){
            p[i] = p[i-1] + nums[i];
        }
      }

    }
    
    public static int sumRange(int start, int end) {
      if(start == 0)
        return p[end];
    else
        return (p[end]-p[start-1]);
    }

    public static void main(String[] args) {
        RangeSum.NumArray(new int[]{-2,0,3,-5,2,-1});
        System.out.println( RangeSum.sumRange(0, 2));
        System.out.println( RangeSum.sumRange(2, 5));
        
    }
}