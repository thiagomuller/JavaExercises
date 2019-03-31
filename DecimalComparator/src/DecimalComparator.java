public class DecimalComparator {

    public static void main(String[] args){
        double first = 3.1756;
        double second = 3.175;

        areEqualByThreeDecimalPlaces(first , second);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        int firstIntegerPart = (int) first;
        double firstFractionalPart = (first - firstIntegerPart);

        int secondIntegerPart = (int) second;
        double secondFractionalPart = (second - secondIntegerPart);


        System.out.println(firstFractionalPart);
        System.out.println(secondFractionalPart);

        return true;
    }
}
