import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Calculadora {
    private Pilha pilha;
    private double v1;
    private double v2;
    private char op;
    private ConversorDeNotacao conversor;

    public Calculadora() {}

    public void messagemAoUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão valida\n");
        String exp = scanner.nextLine().replace(" ","");
        StringTokenizer tokenizer = new StringTokenizer(exp, "+-*/^()", true);
        this.conversor = new ConversorDeNotacao(tokenizer);
        Fila filaResultante = conversor.converterParaPosFixo();
        try{
            this.pilha = new Pilha(filaResultante.getUltimo());
            double resultadoFinal = calcularResultado(filaResultante);
            System.out.println("O resultado final é: " + resultadoFinal);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public double calcularResultado(Fila filaResultante){
        try{
            double resultado = 0;
            while(filaResultante.getUltimo() > - 1){
                Object proximoElemento = filaResultante.getItem();


                if(proximoElemento.getClass().equals(String.class) && conversor.isNumero((String)proximoElemento)){
                    pilha.guarde(Double.parseDouble((String)proximoElemento));
                }else{
                    op = (char) proximoElemento;
                    v2 = (double) pilha.getItem();
                    pilha.removaItem();
                    v1 = (double) pilha.getItem();
                    pilha.removaItem();
                    resultado = fazerAConta(op);

                    pilha.guarde(resultado);

                }

                filaResultante.removaItem();
            }
            if(pilha.getUltimo() > 0){
                v2 = (double) pilha.getItem();
                pilha.removaItem();
                v1 = (double) pilha.getItem();
                pilha.removaItem();
                resultado = fazerAConta(op);
                pilha.guarde(resultado);
                return resultado;
            }
            return resultado;

        }catch(Exception e){
            e.printStackTrace();
        }
        return 0.0;
    }


    public double fazerAConta(char op){
        double resultado;
        switch (this.op){
            case '+':
                resultado = v1 + v2;
                return resultado;
            case '-':
                resultado = v1 - v2;
                return resultado;
            case '*':
                resultado = v1 * v2;
                return resultado;
            case '/':
                resultado = v1 / v2;
                return resultado;
            case '^':
                resultado = Math.pow(v1, v2);
                return resultado;
        }
        return 0.0;
    }

}
