package com.thiagomuller.series;

public class Series {
    public static int nSum(int n){
        int result = 0;
        for(int i = 0; i <= n; i++){
            result += i;
        }
        return result;
    }

    public static int factorial(int n){
        int result = 1;
        for(var i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n){
        int result = (n-1) + (n-2);
        return result;
    }
}