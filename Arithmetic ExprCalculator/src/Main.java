import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Character.isDigit;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão valida\n");
        String exp = scanner.next().trim();
        Calculadora calc = new Calculadora(exp);


    }

}
