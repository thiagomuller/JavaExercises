package com.thiagomuller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "welcometojava";
        int interval = 3;
        String smallest = "";
        String largest = "";
        for(int i=0; i<=s.length() - interval; i++){
            if(i == 0){
                smallest = s.substring(i,interval+i);
                largest = s.substring(i,interval+i);
            }
            if(s.substring(i, interval+i).compareTo(smallest)<0){
                smallest = s.substring(i,interval+i);
            }
            if(s.substring(i,interval+i).compareTo(largest)>0){
                largest = s.substring(i,interval+i);
            }
        }

        System.out.println(smallest + "\n" + largest);
    }
}
