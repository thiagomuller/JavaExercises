public class SecondsAndMinuteChallenge {


    public static void main(String[] argds){
        getDurationString(8153);
    }

    public static String getDurationString(long minutes , long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        else {
            long hour = minutes / 60;
            long remainingMinutes = (minutes % 60);

            System.out.println(hour + " H " + remainingMinutes + " M " + seconds + " S");
            return hour + " H " + remainingMinutes + " M " + seconds + " S";
        }
    }


    public static void getDurationString(long seconds){
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        getDurationString(minutes , remainingSeconds);
    }

}
