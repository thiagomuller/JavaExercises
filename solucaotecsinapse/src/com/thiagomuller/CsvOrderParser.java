package com.thiagomuller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvOrderParser {
    private List<Order> ordersOfDesiredMonth;
    private int desiredMonth;
    private String csvFile;
    private String line;
    private BufferedReader bufferedReader;

    public CsvOrderParser(String csvFile, int desiredMonth) {
        this.csvFile = csvFile;
        this.desiredMonth = desiredMonth;
        this.ordersOfDesiredMonth = new ArrayList<>();
        this.line = "";
        this.bufferedReader = null;
    }

    public List<Order> mapCSVFileToOrderList() {
        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                List<String> currentLineInFile = Arrays.asList(line.split(";"));
                if (counter > 0 && compareMonth(currentLineInFile)) {
                    String currentItem = currentLineInFile.get(0);
                    double currentQty = Double.valueOf(currentLineInFile.get(1));
                    double currentPrice = Double.valueOf(currentLineInFile.get(3).replace(',', '.'));
                    this.ordersOfDesiredMonth.add(new Order(currentItem, currentQty, currentPrice));
                }
                counter++;
            }

            return ordersOfDesiredMonth;

        } catch (FileNotFoundException file) {
            System.out.println("File not found, please verify if the file is in the specified address, of if the address is correct!");
            file.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public boolean compareMonth(List<String> currentLineInFile){
        int month = Integer.valueOf(currentLineInFile.get(2).split("/")[1]);
        if(month == desiredMonth){
            return true;
        }
        return false;
    }


}
