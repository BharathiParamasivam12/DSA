package com.CommonProb;

public class FindFactorial {
    public static void main(String[] args) {
        int input = 5; int out = 1;
        
        for(int i=1; i<=input; i++){
            out = out * i;
        }
        System.out.println(out);
    }
}
