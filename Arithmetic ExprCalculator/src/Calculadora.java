import java.util.Objects;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Calculadora {


    private String expression;
    private Fila fila;
    private Pilha pilha;
    StringTokenizer tokenizer  = new StringTokenizer(expression,"+-*/^()",true);

    public Calculadora(String expression) {
        this.expression = expression;

        try{
            Fila fila = new Fila(20);
            Pilha pilha = new Pilha(20);
            this.fila = fila;
            this.pilha = pilha;

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void tokenizerHandler(StringTokenizer tokenizer){

        while(tokenizer.hasMoreTokens()){
            String nextElement = tokenizer.nextToken();

            if(nextElement.equals("(")){
                try {

                    this.pilha.guarde(nextElement);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if (Pattern.compile("(/d)*").matcher(nextElement).find()){
                try {

                    this.fila.guarde(nextElement);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                try{
                    Object topo = this.pilha.getItem();
                    Tabela.isParaDesempilhar(topo, nextElement);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        }
    }



}
