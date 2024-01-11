package org.example;

public class SumCalculator {
    public int sum(int n){
        if(n == 0){
            throw new IllegalArgumentException();
        }
        if(n == 1){
            return n;
        }
        return n + sum(n-1);
    }
}
