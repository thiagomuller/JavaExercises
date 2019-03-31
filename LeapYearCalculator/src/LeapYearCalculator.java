public class LeapYearCalculator {

    public static void main(String[] args){
        int year = 2000;
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
                return true;
            }
            else if(year % 4 == 0 && year % 100 != 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
