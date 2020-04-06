package com.thiagomuller;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidRegex {
    public static void main(String[] args) {
        String regex = "\\s";
        int testCases = 10;
        while(testCases>0){
            Scanner in = new Scanner(System.in);
            try{
                String pattern = in.nextLine();
            }catch(NoSuchElementException e){
                break;
            }catch(PatternSyntaxException p){
                System.out.println("Invalid");
            }
        }


    }
}
