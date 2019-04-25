import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = 0;
            String resultString = "";
            for(int j = 0; j < n; j ++){
                result = result + ((int)Math.pow(2,j)) * b;
                if(j  == 0){
                    result = result + a;
                    resultString += String.valueOf(result);
                }else{
                    resultString += " " + String.valueOf(result);
                }
            }
            System.out.println(resultString);
        }
    }
}
