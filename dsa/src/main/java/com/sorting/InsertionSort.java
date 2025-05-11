package com.sorting;


/**
 * split the array into 2 segments; sorted and unsorted;
 * sorted just take the index element 0
 * loop from unsorted segment i =1 to n;
 * assign a temp value starts from 1st index
 * loop through j (sorted elements) and compare temp is small
 * if temp is small then do left shift by comparing values in sorted elements and place the temp in position 
 * j is used to do all these shifts and placement of values; 
 * Time complexity : o(n*n) -> worst (descending) - best -> o(n)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] input = new int[] {4,1,8,6,3,10,2};
        doInsertionSort(input);
    }

    public static void doInsertionSort(int[] input){
        for(int i=1; i<input.length; i++){
            int temp = input[i];
            int j = i-1; // sorted element

            while(j>=0 && temp < input[j]){
               input[j+1] = input[j] ;
               j--;
            }
            input[j+1] = temp;
            doDisplay(input);

        }
      
    }
    public static void doDisplay(int[] input){
        for(int i=0; i<input.length; i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();
    }
}
