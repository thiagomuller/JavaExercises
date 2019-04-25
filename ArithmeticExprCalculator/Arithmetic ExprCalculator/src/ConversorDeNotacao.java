import java.util.StringTokenizer;

public class ConversorDeNotacao {
    private Pilha pilha;
    private Fila fila;
    private StringTokenizer tokenizer;

    public ConversorDeNotacao(StringTokenizer tokenizer){
        try{
            this.tokenizer = tokenizer;
            this.pilha = new Pilha(this.tokenizer.countTokens());
            this.fila = new Fila(this.tokenizer.countTokens());
        } catch(Exception e){
            e.printStackTrace();
        }
    };


    public Fila converterParaPosFixo(){
        try{
            while(this.tokenizer.hasMoreTokens()){

                String nextElement = tokenizer.nextToken();

                if(nextElement.equals("(")){
                    pilha.guarde(nextElement.charAt(0));

                }else if (isNumero(nextElement)){
                    fila.guarde(nextElement);

                }else if(isOperador(nextElement.charAt(0)) && pilha.vazia()){
                    pilha.guarde(nextElement.charAt(0));

                }else if(isOperador(nextElement.charAt(0)) && !pilha.vazia()){
                    isOperadorEPilhaNaoVazia(nextElement, fila, pilha);
                }else if(nextElement.equals(")")){
                    isIgualAFechaParenteses(nextElement,fila, pilha);
                }
            }

            esvaziarORestoDaPilha(pilha);

            return fila;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void isIgualAFechaParenteses(String nextElement, Fila fila, Pilha pilha){
        try{
            if(pilha.getItem() != "("){
                char ultimoItemPilha = (char) pilha.getItem();
                pilha.removaItem();
                fila.guarde(ultimoItemPilha);
            }
            pilha.removaItem();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void isOperadorEPilhaNaoVazia(String nextElement, Fila fila, Pilha pilha){
        try{
            while(!pilha.vazia() && Tabela.isParaDesempilhar((char)pilha.getItem(), nextElement.charAt(0))){
                if(nextElement.charAt(0) == (char)pilha.getItem()){
                    char ultimoItemPilha = (char) pilha.getItem();
                    pilha.removaItem();
                    fila.guarde(ultimoItemPilha);
                    pilha.guarde(ultimoItemPilha);
                    break;
                }else{
                    char ultimoItemPilha = (char) pilha.getItem();
                    pilha.removaItem();
                    fila.guarde(ultimoItemPilha);
                }
            }
            if(!pilha.vazia() && !Tabela.isParaDesempilhar((char)pilha.getItem(), nextElement.charAt(0))){
                pilha.guarde(nextElement.charAt(0));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void esvaziarORestoDaPilha(Pilha pilha){
        try{
            while(!pilha.vazia()){
                if(pilha.getItem() != null && (char)pilha.getItem() != '(' && (char)pilha.getItem() != ')'){
                    fila.guarde(pilha.getItem());
                }
                pilha.removaItem();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public boolean isNumero(String str) {

        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isOperador(char c){
        return true ? c == '+' || c == '-' || c == '*' || c == '/' || c == '^' : false;
    }


}
