package com.datastructures;

public class Array {
    public static void main(String[] args) {
        Array.singleDimensionArray();
        Array.twoDimensionalArray();
        Array.multiDimensionalArray();
    }
    public static void singleDimensionArray(){
        System.out.println("Single Dimensional array : +++++++++++");
        int[] input = new int[5];   //static array
        for(int i = 0; i<input.length;i++){
            System.out.println(i);
        }
        System.out.println("Two dimensional array ++++++++++++++++++++++++");
    }
    
    public static void twoDimensionalArray(){
        int[][] matrix = new int[3][3];
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       
        for(int i=0; i<grid.length;i++){  // row
            for(int j=0; j<grid[i].length;j++){ //column for each row
                  System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
      System.out.println("+++++++++++++++Jagged array : ");
      int[][] jagged = {
        {1,2},
        {1,2,3},
        {7}
      };

      for(int row =0; row<jagged.length;row++){
        for(int column=0; column<jagged[row].length; column++){
            System.out.print(jagged[row][column]+" ");
        }
        System.out.println();
      }

    }
    public static void multiDimensionalArray(){
        int [][][] cube = {   // layer = 2; row = 3; column =4
            {   {1,2,3,4}, 
                {5,6,7,8}, 
                {9,0,1,2} 
            },
            {
                {10,12,12,13},
                {14,15,16,17},
                {18,19,20,21}
            }
        };
        System.err.println("==========Three dimensional array ==============");
       for(int layer=0; layer<cube.length; layer++){
            for(int row = 0; row<cube[layer].length; row++){
                for(int column = 0; column<cube[layer][row].length;column++){
                    System.out.print(cube[layer][row][column] + " ");
                }
                System.out.println();
            }
             System.out.println();
       }
    }
}
