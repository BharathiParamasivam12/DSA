package com.patterns;

public class Prefix {
    public static void main(String[] args) {
      //  Prefix.doPrefixFromZeroIndex(new int[]{1,2,3,3,4,5});
        
        Prefix.doPrefixForIndex(new int[]{1,2,3,3,4,5}, 1, 5);
        Prefix.doPrefixForIndex(new int[]{1,2,3,3,4,5}, 0, 5);
    }


    //when prefix starts from index 0  to all length of array, a -> p[i] = p[i-1] +a[i] 
    //we can deal with single loop "i"

    public static void doPrefixFromZeroIndex(int[] input){
        int[] p = new int[input.length];
        p[0] = input[0];
        for(int i=1; i<input.length-1;i++){
            p[i] = p[i-1]+input[i];
        }

        doDisplay(p);
    }


    // when prefix starts from any other number say (1,3) then solution should be
    // combination of p[i] = p[i-1] + a[i] & p[j] = p[j]-p[i-1] where i=1, j=3

    public static void doPrefixForIndex(int[] input, int start, int end){
        int[] p = new int[input.length];
        p[0] = input[0];
        int result = 0;
        for(int i=1; i<input.length; i++){
            p[i] = p[i-1] + input[i];
        }
        doDisplay(p);
        if(start == 0){
            result = p[end];
        }else{
            result = p[end] - p[start-1];
        }
        System.out.println("Sum of int array is : "+ result);
    }

    public static void doDisplay(int[] input){
        for(int i=0; i<input.length; i++){
            System.out.println("p["+i+"]"+input[i]);
        }
    }
}
