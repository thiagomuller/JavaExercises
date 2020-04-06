public class Calculadora {

    public double calcularResultado(Fila expressaoEmPoxFixo, Pilha pilhaDeNumeros){
        try{
            double primeiroOperando = 0.0;
            double segundoOperando = 0.0;
            char operador = ' ';
            double resultado = 0;
            while(expressaoEmPoxFixo.getUltimo() > - 1){
                Object proximoElemento = expressaoEmPoxFixo.getItem();


                if(proximoElemento.getClass().equals(String.class) && ConversorDeNotacao.isNumero((String)proximoElemento)){
                    pilhaDeNumeros.guarde(Double.parseDouble((String)proximoElemento));
                }else{
                    operador = (char) proximoElemento;
                    segundoOperando = (double) pilhaDeNumeros.getItem();
                    pilhaDeNumeros.removaItem();
                    primeiroOperando = (double) pilhaDeNumeros.getItem();
                    pilhaDeNumeros.removaItem();
                    resultado = fazerAConta(operador, primeiroOperando, segundoOperando);

                    pilhaDeNumeros.guarde(resultado);

                }

                expressaoEmPoxFixo.removaItem();
            }
            if(pilhaDeNumeros.getUltimo() > 0){
                segundoOperando = (double) pilhaDeNumeros.getItem();
                pilhaDeNumeros.removaItem();
                primeiroOperando = (double) pilhaDeNumeros.getItem();
                pilhaDeNumeros.removaItem();
                resultado = fazerAConta(operador, primeiroOperando , segundoOperando);
                pilhaDeNumeros.guarde(resultado);
                return resultado;
            }
            return resultado;

        }catch(Exception e){
            e.printStackTrace();
        }
        return 0.0;
    }


    public double fazerAConta(char op, double v1, double v2){
        double resultado;
        switch (op){
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
