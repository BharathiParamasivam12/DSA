package com.sorting;

/**
 * Bubble sort -> Adjacent elements compare [j] [j+1]-   takes the largest number from the array and keep that at end by swaping 
 * time complexity : o(n) - best if already sorted; o(n*n) - best, average 
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] input = new int[]{4,7,2,1,10,8,3};
        doBubbleSortAgain(input);
       //  doBubbleSort(new int[]{1, 2 ,3 ,4 ,7, 8 ,10});

    }

    public static void doBubbleSort(int[] input){
        boolean swapped = false;
        int n= input.length;
        for(int i=0; i<n-1;i++){ // outer loop starts from 0 to n-1
            swapped = false;
            for(int j=0; j<n-1; j++){ // adjacent swap test j=0 to j< n-i-1/n-1 because it sorts and keep the last big element sorted.
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped = true;
                }
                
            }
            doDisplay(input);
             if(!swapped)
                break;
        }
    }

    public static void doBubbleSortAgain(int[] input){
        for(int i=0; i<input.length-1; i++){
            for(int j=0; j<input.length-i-1; j++){
                if(input[j]<input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
                 doDisplay(input);
            }
           
        }
    }

     public static  void doDisplay(int[] input){
        for(int i=0; i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}
