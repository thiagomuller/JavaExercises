package com.thiagomuller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //He is a very very good boy, isn't he?
        StringBuilder result = new StringBuilder();
        String[] splitted = s.split("!|,|\\?|\\.|_|'|@|\\s");
        int counter = 0;
        for(int i=0; i<splitted.length; i++){
            if(!splitted[i].equals("")){
                result.append(splitted[i] + "\n");
                counter ++;
            }
        }
        System.out.println(counter);
        System.out.println(result);
        scan.close();
    }
}
