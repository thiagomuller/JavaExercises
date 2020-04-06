import java.util.StringTokenizer;

public class ConversorDeNotacao {

    public Fila converterParaPosFixo(Pilha pilhaDeOperadores, Fila expressaoEmPosFixo, StringTokenizer tokenizer){
        try{
            while(tokenizer.hasMoreTokens()){
                String nextElement = tokenizer.nextToken();
                enviarParaPilhaOuPosFixa(pilhaDeOperadores, expressaoEmPosFixo, nextElement);
            }

            esvaziarORestoDaPilha(pilhaDeOperadores, expressaoEmPosFixo);

            return expressaoEmPosFixo;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void enviarParaPilhaOuPosFixa(Pilha pilhaDeOperadores, Fila expressaoEmPosFixo, String nextElement) throws Exception{
        if(nextElement.equals("(")){
            pilhaDeOperadores.guarde(nextElement.charAt(0));

        }else if (isNumero(nextElement)){
            expressaoEmPosFixo.guarde(nextElement);

        }else if(isOperador(nextElement.charAt(0)) && pilhaDeOperadores.vazia()){
            pilhaDeOperadores.guarde(nextElement.charAt(0));

        }else if(isOperador(nextElement.charAt(0)) && !pilhaDeOperadores.vazia()){
            isOperadorEPilhaNaoVazia(nextElement, expressaoEmPosFixo, pilhaDeOperadores);
        }else if(nextElement.equals(")")){
            isIgualAFechaParenteses(expressaoEmPosFixo, pilhaDeOperadores);
        }
    }

    public void isIgualAFechaParenteses(Fila fila, Pilha pilha) throws Exception{
        if(pilha.getItem() != "("){
            char ultimoItemPilha = (char) pilha.getItem();
            pilha.removaItem();
            fila.guarde(ultimoItemPilha);
        }
        pilha.removaItem();
    }

    public void isOperadorEPilhaNaoVazia(String nextElement, Fila expressaoEmPosFixo, Pilha pilhaDeOperadores) throws Exception{
        while(!pilhaDeOperadores.vazia() && Tabela.isParaDesempilhar((char)pilhaDeOperadores.getItem(), nextElement.charAt(0))){
            char ultimoItemPilha = (char) pilhaDeOperadores.getItem();
            expressaoEmPosFixo.guarde(ultimoItemPilha);
            pilhaDeOperadores.removaItem();
        }
        pilhaDeOperadores.guarde(nextElement.charAt(0));
    }

    public void esvaziarORestoDaPilha(Pilha pilha, Fila fila) throws Exception{
        while(!pilha.vazia()){
            if(pilha.getItem() != null && (char)pilha.getItem() != '(' && (char)pilha.getItem() != ')'){
                fila.guarde(pilha.getItem());
            }
            pilha.removaItem();
        }

    }

    public static boolean isNumero(String str){

        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isOperador(char c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }


}
