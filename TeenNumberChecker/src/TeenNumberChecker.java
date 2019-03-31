public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){
        if(isTeen(a)){
            return true;
        }
        else if(isTeen(b)){
            return true;
        }
        else if(isTeen(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isTeen(int number){
        if(number >= 13 && number <= 19){
            return true;
        }
        else{
            return false;
        }
    }

}
