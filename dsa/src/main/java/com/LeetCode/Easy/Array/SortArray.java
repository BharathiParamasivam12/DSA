package com.LeetCode.Easy.Array;

public class SortArray {

    // Bubble sort o(n*n)
    
    public static void main(String[] args) {
        int[] input = new int[] {8,9,2,10,2,7};
        System.out.println("Ascending order : ");
        doAscendingOrder(input);
        System.out.println("Descending order : ");
        doDescendingOrder(input);
    }
    public static void doAscendingOrder(int[] input){
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        SortArray.display(input);
    }
     public static void doDescendingOrder(int[] input){
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length;j++){
                if(input[i] < input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        display(input);
        
    }
    public static void display(int[] input){
        for(int i=0; i<input.length; i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}
