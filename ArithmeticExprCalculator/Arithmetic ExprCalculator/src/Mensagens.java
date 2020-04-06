import java.util.Scanner;
import java.util.StringTokenizer;

public class Mensagens {
    public StringTokenizer messagemAoUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão valida\n");
        String exp = scanner.nextLine().replace(" ","");
        StringTokenizer tokenizer = new StringTokenizer(exp, "+-*/^()", true);
        return tokenizer;
    }
}
