
public class Fila <X>
{
    private Object[] vetor;
    private int ultimo=-1;

    public Fila (int tamanho) throws Exception
    {
        if (tamanho<1)
            throw new Exception ("Tamanho invalido");

        this.vetor = new Object [tamanho];
    }

    public void guarde (X x) throws Exception
    {
        if (x==null)
            throw new Exception ("Informacao ausente");

        if (this.ultimo == this.vetor.length-1)
            throw new Exception ("Nao cabe mais nada");

        this.ultimo++;
        this.vetor[this.ultimo] = x;

    }

    public X getItem () throws Exception
    {
        if (this.ultimo==-1)
            throw new Exception ("Nada guardado");

        return (X)this.vetor[0];
    }

    public void removaItem () throws Exception
    {
        if (this.ultimo==-1)
            throw new Exception ("Nada guardado");

        for (int i=0; i<this.ultimo; i++)
            this.vetor[i] = this.vetor[i+1];

        this.vetor[this.ultimo] = null;
        this.ultimo--;
    }


    public int getUltimo() {
        return ultimo;
    }

    public boolean vazia(){
        return true ? this.ultimo == -1 : false;
    }
}
