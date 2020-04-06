import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Character.isDigit;


public class Main {
    public static void main(String[] args) {
        Mensagens mensagens = new Mensagens();
        StringTokenizer tokenizer = mensagens.messagemAoUsuario();
        ConversorDeNotacao conversor = new ConversorDeNotacao();
        try{
            Fila fila = new Fila(tokenizer.countTokens());
            Pilha pilha = new Pilha(tokenizer.countTokens());
            Fila expressaoEmPoxFixo = conversor.converterParaPosFixo(pilha, fila, tokenizer);
            Calculadora calc = new Calculadora();
            double resultado = calc.calcularResultado(expressaoEmPoxFixo, pilha);
            System.out.println(resultado);
        } catch(Exception e){
            e.printStackTrace();
        }


    }

}
