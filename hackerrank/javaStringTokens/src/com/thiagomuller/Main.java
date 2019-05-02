package com.thiagomuller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //He is a very very good boy, isn't he?
        String[] splitted = s.split("!|,|\\?|\\.|_|'|@|\\s");
        System.out.println(splitted.length);
        for(int i=0; i<splitted.length; i++){
            System.out.println(splitted[i]);
        }
        scan.close();
    }
}
