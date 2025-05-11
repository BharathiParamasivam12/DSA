package com.LeetCode.Easy.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
     public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        ThreeSum s = new ThreeSum();
        System.out.println(s.threeSum(new int[] {-1,0,1,2,-1,-4}));
        System.out.println(s.threeSum(new int[] {-1,0,1}));
        System.out.println(s.threeSum(new int[] {0,1,0}));
    }
}
