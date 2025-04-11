package com.LeetCode.Easy;

import java.util.Arrays;
import java.util.List;

public class Snake {
     public  static int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0,row=0,column = 0;  // natural nos
        int output = 0;
        int [][] input = new int[n][n];
        for( row = 0; row<n; row++ ){
            for( column =0; column<n; column++){
                input[row][column] = i++;
                System.out.print(input[row][column]+" ");
            }
            System.out.println();         
        } 
        column=0;row =0;
        for(String com : commands){
            if (com.equals("RIGHT")){
                column = column +1;
               output = input[row][column];
            }
            if (com.equals("DOWN")){
                row = row+1;
                output = input[row][column];

            }if(com.equals("UP")){
                row = row -1;
                output = input[row][column];

            }if(com.equals("LEFT")){
                column = column-1;
                output = input[row][column];
            }

        }
        return output;
    }
    public static void main(String[] args) {
       int out =  Snake.finalPositionOfSnake(3, Arrays.asList("RIGHT","DOWN","UP"));
       System.out.println("The position of snake is :"+out);
    }
}
