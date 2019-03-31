public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else{
            if(barking && hourOfDay < 8 || barking && hourOfDay > 22){
                return true;
            }
            else if(barking && hourOfDay >= 8 || barking && hourOfDay <= 22){
                return false;
            }
            else{
                return false;
            }
        }
    }
}
