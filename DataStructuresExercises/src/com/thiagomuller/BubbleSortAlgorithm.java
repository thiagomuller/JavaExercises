package com.thiagomuller;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] unsortedArray = {-22,45,10,-38,53,5,9};

        int partition = unsortedArray.length - 1;
        int buffer = 0;


        for(int v = 0; v < partition; v++){
            for(int i = 0; i < unsortedArray.length; i ++){
                if(i == partition || partition == 0){
                    break;
                }
                if(i < unsortedArray.length && unsortedArray[i] > unsortedArray[i + 1]){
                    buffer = unsortedArray[i + 1];
                    unsortedArray[i + 1] = unsortedArray[i];
                    unsortedArray[i] = buffer;
                }
            }
            partition --;
        }
        System.out.println(Arrays.toString(unsortedArray));
    }
}
