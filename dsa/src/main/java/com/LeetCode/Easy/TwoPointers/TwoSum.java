package com.LeetCode.Easy.TwoPointers;

public class TwoSum {

//     Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
    public static void main(String[] args) {
        twoSum(new int[] {2,7,11,15}, 9);
    }
      public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
       for(int i=0; i<numbers.length; i++){
        for(int j=i+1; j<numbers.length; j++){
            if(numbers[j] == target - numbers[i]){
                res[0] = i+1;
                res[1] = j+1;
            }
        }
       }
       System.out.println("i :"+res[0]+ "-j:"+res[1]);
       return res;
    }
}
