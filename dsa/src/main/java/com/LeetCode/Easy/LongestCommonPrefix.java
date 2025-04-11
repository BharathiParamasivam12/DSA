package com.LeetCode.Easy;

import java.util.HashSet;

public class LongestCommonPrefix {
   public static int longestCommonPrefix(int[] arr1, int[] arr2) {
	HashSet<Integer> set = new HashSet<>();

	for(int val : arr1){
		String str = val+"";
		int len = str.length();
		for(int i=0; i<len; i++){
			int curr = Integer.parseInt(str.substring(0, i+1));
			set.add(curr);
		}
	}

	int ans = 0;
	for(int val : arr2){
		String str = val+"";
		int len = str.length();

		for(int i=ans; i<len; i++){
			int curr = Integer.parseInt(str.substring(0, i+1));
			if(set.contains(curr)){
				ans = i+1;
			}
		}

	}

	return ans;
}

    public static void main(String[] args) {
        System.out.println(LongestCommonPrefix.longestCommonPrefix(new int[] { 1, 10, 100 }, new int[] { 1000 }));
    }
}
