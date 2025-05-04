package com.LeetCode.Easy.PrefixSum;

public class SubArray {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int count =1;
        int i;
        for(i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
            count++;
            if(prefix[i] == k)
              {  break; }
        }
        return  count;
    }

    public static void main(String[] args) {
        SubArray s = new SubArray();
       System.out.println( s.subarraySum(new int[] {1,2,1,2,1}, 3));
    }

}
