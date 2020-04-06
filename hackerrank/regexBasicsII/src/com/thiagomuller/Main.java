package com.thiagomuller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String byteDigits = "([0-2]*[0-5]*[0-5]+){1}";
            String pattern = "\\A" + byteDigits + "\\.{1}" + byteDigits + "\\.{1}" + byteDigits + "\\.{1}" + byteDigits + "\\z";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(sc.nextLine());
            if(m.find()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
