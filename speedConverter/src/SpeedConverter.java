public class SpeedConverter {

    public static void main(String[] args){
        double kilometersPerHour = 2;


        printConversion(kilometersPerHour);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour == 0){
            return -1;
        }
        else{
            double milesPerHour =  kilometersPerHour / 1.609;
            long roundedMilesPerHour = Math.round(milesPerHour);

            return roundedMilesPerHour;
        }
    }


    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + "km/h = " + result + "mi/h");
    }

}
