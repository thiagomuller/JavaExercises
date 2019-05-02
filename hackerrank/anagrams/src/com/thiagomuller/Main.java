package com.thiagomuller;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        Instant start = Instant.now();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed + " milliseconds");
    }

    public static boolean isAnagram(String a, String b){
        Map<Character, Integer> firstWord = new HashMap<>();
        Map<Character, Integer> secondWord = new HashMap<>();

        char[] arrayOfA = a.toLowerCase().toCharArray();
        char[] arrayOfB = b.toLowerCase().toCharArray();

        boolean isAnagram = true;

        if(arrayOfA.length != arrayOfB.length) isAnagram = false;

        for(int i=0; i<arrayOfA.length; i++){
            if(!firstWord.containsKey(arrayOfA[i])){
               firstWord.put(arrayOfA[i],1);
            } else{
                firstWord.put(arrayOfA[i], firstWord.get(arrayOfA[i]) + 1);
            }
        }

        for(int i=0; i<arrayOfB.length; i++){
            if(!secondWord.containsKey(arrayOfB[i])){
                secondWord.put(arrayOfB[i],1);
            } else{
                secondWord.put(arrayOfB[i], secondWord.get(arrayOfB[i]) + 1);
            }
        }

        for(Character key : firstWord.keySet()){
            if(!secondWord.containsKey(key) || !(firstWord.get(key).equals(secondWord.get(key)))){
                isAnagram = false;
            }
        }

        if(isAnagram){
            return true;
        }

        return false;

    }
}
