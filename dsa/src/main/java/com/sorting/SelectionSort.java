package com.sorting;

/**
 * Selection sort takes a minimum value randmly at first 
 * then it compares the full array whats the min index? 
 * take that min position place at index =0 and swap the max to that position of min value
 * so its sort and swap method
 * Time complexity 0(n*n) -> best, worst, average ; 
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] input = new int[]{9,2,10,2,8,3};
        selectionSortRevise(input);
    }

    static int minIndex = -1;
    public static void doSelectionSort(int[] input){
        for(int i=0;i<input.length-1;i++){
           minIndex =i;
            for(int j=i+1; j<input.length;j++){ // i+1 because left side elements are sorted
                if(input[j] < input[minIndex]){  // check minimum and swap minimum index
                   minIndex = j;
                }
            }
            // swap values  out of the loop : reason : once the full loop ends then we can get the final min index 
                 int temp = input[i];
                    input[i] = input[minIndex];
                    input[minIndex] = temp;
                   doDisplay(input);            
        }
      
    }

    public static  void doDisplay(int[] input){
        for(int i=0; i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }


    public static void doSelectionSortAgain(int[] input){
        int min = 0;
        for(int i=0; i< input.length-1; i++){
            min = i;
            for(int j=i+1; j<input.length; j++){
                if(input[min]> input[j]){
                    min = j;
                }
                 doDisplay(input); 
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
           
        }
    }


    public static void selectionSortRevise(int[] input ){
        for(int i=0; i<input.length-1; i++){
            int min = i; 
            for(int j= i+1; j<input.length; j++){
                if(input[j] < input[min]){
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
            
        }
        doDisplay(input);
    }
}
