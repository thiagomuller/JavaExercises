package MinElementChallenge;

import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int count;
        System.out.println("Please enter the quantity of numbers you're wishing to find the min of:\n");
        count = scanner.nextInt();
        int[] nums = readIntegers(count);
        int min = findMin(nums);
        System.out.println("The minimum value is : " + min);

    }

    public static int[] readIntegers(int count){
        int[] nums = new int[count];
        for(int i = 0; i < nums.length; i++){
            int stringIndex = i + 1;
            System.out.println("Please enter the " + stringIndex + "st value");
            nums[i] = scanner.nextInt();
        }

        return nums;
    }

    public static int findMin(int[] nums){
        int min = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                min = nums[i];
                continue;
            }
            else{
                if(nums[i] < min){
                    min = nums[i];
                }
            }
        }

        return min;

    }
}
