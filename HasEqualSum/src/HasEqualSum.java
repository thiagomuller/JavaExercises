public class HasEqualSum {

    public static void main(String[] args){
        int first = 1;
        int second = -1;
        int third = 0;

        System.out.println(hasEqualSum(first, second, third));
    }

    public static boolean hasEqualSum(int first, int second, int third){
        if(first + second == third){
            return true;
        }
        else{
            return false;
        }
    }

}


