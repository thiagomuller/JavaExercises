package com.thiagomuller;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();


        List<Locale> locales = new ArrayList<>(Arrays.asList(
                Locale.US, new Locale("en", "in"), Locale.CHINA, Locale.FRANCE
        ));


        for(int i=0; i<locales.size(); i++){
            NumberFormat currencyFormatter =
                    NumberFormat.getCurrencyInstance(locales.get(i));

            if(locales.get(i).getCountry().equals("US")){
                System.out.println("US: " + currencyFormatter.format(payment));
            }
            if(locales.get(i).getCountry().equals("IN")){
                System.out.println("India: " + currencyFormatter.format(payment));
            }
            if(locales.get(i).getCountry().equals("CN")){
                System.out.println("China: " + currencyFormatter.format(payment));
            }
            if(locales.get(i).getCountry().equals("FR")){
                System.out.println("France: " + currencyFormatter.format(payment));
            }
        }
    }
}
