import java.lang.reflect.*;

public class Pilha <X>
{
    private Object[] vetor;
    private int ultimo=-1;

    public Pilha (int tamanho) throws Exception
    {
        if (tamanho<1)
            throw new Exception ("Tamanho invalido");

        this.vetor = new Object [tamanho];
    }

    public X meuCloneDeX (X x)
    {
        //return x.clone();
        X ret = null;

        try
        {
            Class<?> classe = x.getClass();
            Class<?>[] tipos = null; // null pq quero clone sem parametros
            Method metodo = classe.getMethod ("clone", tipos);
            Object[] parametros = null; // null pq quero clone sem parametros
            ret = (X)metodo.invoke(x,parametros);
        }
        catch (Exception erro)
        {} // sei que nao vai ocorrer erro pq nao vou chamar método que nao existe, nao vou passar parametro errados, etc

        return ret;
    }
    public void guarde (X x) throws Exception
    {
        if (x==null)
            throw new Exception ("Informacao ausente");

        if (this.ultimo == this.vetor.length-1)
            throw new Exception ("Nao cabe mais nada");

        this.ultimo++;

        if (x instanceof Cloneable)
            this.vetor[this.ultimo] = meuCloneDeX(x);
        else
            this.vetor[this.ultimo] = x;
    }

    public X getItem () throws Exception
    {
        if (this.ultimo == -1)
            throw new Exception ("Nada guardado");

        if (this.vetor[this.ultimo] instanceof Cloneable)
            return meuCloneDeX ((X)this.vetor[this.ultimo]);
        else
            return (X)this.vetor[this.ultimo];
    }

    public void removaItem () throws Exception
    {
        if (this.ultimo==-1)
            throw new Exception ("Nada guardado");

        this.vetor[this.ultimo] = null;
        this.ultimo--;
    }

    // este método é obrigatório SEMPRE
    public String toString ()
    {
        return (this.ultimo+1) +
                " elementos" +
                (this.ultimo!=-1?
                        ", sendo o ultimo "+this.vetor[this.ultimo]:
                        "");
    }

    // este método é obrigatório SEMPRE
    // serve para comparar this com obj
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Pilha<X> pil = (Pilha<X>)obj;

        if (this.ultimo != pil.ultimo)
            return false;

        for (int i=0; i<this.ultimo; i++)
            if (!this.vetor[i].equals(pil.vetor[i]))
                return false;

        return true;
    }

    // Este método é obrigatório SEMPRE
    // DEVO gerar hashCodes iguais para objetos que
    // o equals diz serem iguais.
    // PROCURO gerar hashCodes diferentes para objetos
    // que o equals diz serem diferentes.
    public int hashCode ()
    {
        int ret=1/*só ñ pode ser 0*/;

        for (int i=0; i<=this.ultimo; i++)
            ret = ret*2/*um nro primo quer*/ + this.vetor[i].hashCode();

        ret = ret*2/*um nro primo qquer*/ + new Integer (this.ultimo).hashCode();

        return ret;
    }

    // um metodo obrigatorio FREQUENTEMENTE
    public Pilha (Pilha<X> modelo) throws Exception // construtor de copia
    {
        if (modelo==null)
            throw new Exception ("Modelo ausente");

        this.vetor = new Object [modelo.vetor.length];

        for (int i=0; i<=modelo.ultimo; i++)
            this.vetor[i] = modelo.vetor[i];

        this.ultimo = modelo.ultimo;
    }

    // um metodo obrigatorio FREQUENTEMENTE
    public Object Clone ()
    {
        Pilha<X> ret=null;

        try
        {
            ret = new Pilha<X> (this);
        }
        catch (Exception erro)
        {} // sei que nao vai dar erro

        return ret;
    }
    // os 2 métodos acima estao sempre juntos,
    // seja na ausencia, seja na presenca.
    // estao presentes, quando a classe tem
    // métodos além do(s) construtor(es) que
    // alteram atributos; nao tendo métodos
    // que alteram atributos, os 2 métodos acima
    // ficam proibidos.

    // O método compareTo é RARAMENTE obrigatorio;
    // quando nao é obrigatorio, é proibido;
    // para ter compareTo é preciso encontrar um
    // criterio de comparacao que nos permita
    // comparar 2 objetos da classe, digamos A e B
    // e enquadra-los numa das seguintes possibilidades
    // A<B ou A>B ou A=B; nesta classe ele nao existirá.
}
