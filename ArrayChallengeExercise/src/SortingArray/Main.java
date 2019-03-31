package SortingArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int number = 5;
        ArrayList<Integer> array = getIntegers(number);
        ArrayList<Integer> sortedArray = sortArray(array);

        System.out.println("The non inversed array is: " + array.toString());
        System.out.println("The inversed array is: " + sortedArray.toString());

    }

    private static ArrayList<Integer> getIntegers(int number){
        System.out.println("Enter " + number + " integer values\n");
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int i = 0; i < number; i ++){
            System.out.println("Enter a number: ");
            values.add(scanner.nextInt());
        }

        return values;
    }

    private static ArrayList<Integer> sortArray(ArrayList<Integer> array){
        array.sort(Collections.reverseOrder());
        return array;
    }

    public static void printArray(ArrayList<Integer> array){
        for(int i = 0; i <  array.size() ; i++){
            System.out.println("Array position " + i + " with value " + array.get(i));
        }
    }
}
