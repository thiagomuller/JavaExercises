package com.thiagomuller;

import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private static int B;
    private static int H;
    private static boolean flag;
    static{
        Main.sc = new Scanner(System.in);
        Main.B = sc.nextInt();
        Main.H = sc.nextInt();
        Main.flag = B > 0 && B < 100 && H > 0 && H < 100;
    }
    public static void main(String[] args) {
        if(flag){
            System.out.println("Area is: " + B*H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        int n = 10;
        String s = String.valueOf(10);
    }
}
