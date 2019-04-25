package com.thiagomuller;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = Integer.valueOf(String.valueOf(sc.nextInt()).replaceFirst("^0+(?!$)", ""));
        int day = Integer.valueOf(String.valueOf(sc.nextInt()).replaceFirst("^0+(?!$)", ""));
        int year = sc.nextInt();
        Map<Integer, String> daysOfTheWeek = new HashMap<Integer, String>(){
            {
                put(1, "SUNDAY");
                put(2, "MONDAY");
                put(3, "TUESDAY");
                put(4, "WEDNESDAY");
                put(5, "THURSDAY");
                put(6, "FRIDAY");
                put(7, "SATURDAY");
            }
        };
        Calendar c = new GregorianCalendar(year,month,day);
        System.out.println(daysOfTheWeek.get(c.get(Calendar.DAY_OF_WEEK)));
    }
}
