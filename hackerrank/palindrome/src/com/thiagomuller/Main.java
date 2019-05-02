package com.thiagomuller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] wordAsArray = A.toCharArray();
        char[] reversedWordAsArray = new char[wordAsArray.length];

        for(int i=0; i<wordAsArray.length; i++){
            if(i == 0){
                reversedWordAsArray[i] = wordAsArray[wordAsArray.length - 1];
            } else{
                reversedWordAsArray[i] = wordAsArray[wordAsArray.length - (i+1)];
            }
        }

        boolean isPalindrome = true;
        for(int i=0; i <wordAsArray.length; i++) {
            if (reversedWordAsArray[i] != wordAsArray[i]) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome ? "Yes":"No");

    }
}
