import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i*2;
        }
        System.out.println("The nonreversed array is : " + Arrays.toString(nums));
        reverse(nums);
    }

    public static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for(int i = 1; i < array.length + 1; i++){
            reversedArray[i - 1] = array[array.length - i];
        }

        System.out.println("The reversed array is: " + Arrays.toString(reversedArray));
    }
}
