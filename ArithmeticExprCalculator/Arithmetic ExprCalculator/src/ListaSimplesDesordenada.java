public class ListaSimplesDesordenada <X> implements Cloneable
{
    private class No
    {
        private X  info;
        private No prox;

        public No (X i, No p)
        {
            this.info = i;
            this.prox = p;
        }

        public No (X i)
        {
            this.info = i;
            this.prox = null;
        }

        public X getInfo ()
        {
            return this.info;
        }

        public No getProx ()
        {
            return this.prox;
        }

        public void setInfo (X i)
        {
            this.info = i;
        }

        public void setProx (No p)
        {
            this.prox = p;
        }
    } //fim da classe No

    private No primeiro, ultimo;

    public void insiraNoInicio (X i) throws Exception
    {
        if (i==null)
            throw new Exception ("Informacao ausente");

        this.primeiro = new No (i,this.primeiro);

        if (this.ultimo==null)
            this.ultimo=this.primeiro;
    }

    public void insiraNoFim (X i) throws Exception
    {
        if (i==null)
            throw new Exception ("Informacao ausente");

        if (this.ultimo==null) // && this.primeiro==null
        {
            this.ultimo   = new No (i);
            this.primeiro = this.ultimo;
        }
        else
        {
            this.ultimo.setProx (new No (i));
            this.ultimo = this.ultimo.getProx();
        }
    }

    public void removaDoInicio () throws Exception
    {
        if (this.primeiro==null/*&&this.ultimo==null*/)
            throw new Exception ("Nada a remover");

        if (this.primeiro==this.ultimo)
        {
			this.primeiro=null;
			this.ultimo  =null;
			return;
		}

		this.primeiro = this.primeiro.getProx();
    }

    public void removaDoFim () throws Exception
    {
        if (this.primeiro==null/*&&this.ultimo==null*/)
            throw new Exception ("Nada a remover");

        if (this.primeiro==this.ultimo)
        {
			this.primeiro=null;
			this.ultimo  =null;
			return;
		}

		No atual;
		for (atual=this.primeiro;
		     atual.getProx()!=this.ultimo;
		     atual=atual.getProx())
		     /*comando vazio*/;

		atual.setProx(null);
		this .ultimo=atual;
    }

    public void remova (X i) throws Exception
    {
		// achar o i em algum no a partir de this.primeiro
		// remover o no
		// adequar, se necessario, this.primeiro e this.ultimo
		// excecao se this.primeiro (e this.ultimo) for null
	}

    public boolean tem (X i) throws Exception
    {
		for (No atual=this.primeiro;
			 atual!=null;
			 atual=atual.getProx())
             if (i.equals(atual.getInfo()))
                 return true;

        return false;
    }

    public String toString ()
    {
        String ret="[";

        No atual=this.primeiro;

        while (atual!=null)
        {
            ret=ret+atual.getInfo();

            if (atual!=this.ultimo)
                ret=ret+",";

            atual=atual.getProx();
        }

        return ret+"]";
    }

    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (this.getClass()!=obj.getClass())
            return false;

        ListaSimplesDesordenada<X> lista =
       (ListaSimplesDesordenada<X>)obj;

        No atualDoThis =this .primeiro,
           atualDaLista=lista.primeiro;

        while (atualDoThis !=null &&
               atualDaLista!=null)
        {
            if (!atualDoThis .getInfo().equals(
                 atualDaLista.getInfo()))
                return false;

            atualDoThis =atualDoThis .getProx();
            atualDaLista=atualDaLista.getProx();
        }

        if (atualDoThis!=null)
            return false;

        if (atualDaLista!=null)
            return false;

        return true;
    }

    public int hashCode ()
    {
        int ret=666;

		for (No atual=this.primeiro;
			 atual!=null;
			 atual=atual.getProx())
			 ret = 17*ret + atual.getInfo().hashCode();

	    return ret;
    }

    public boolean vazia(){
        return this.primeiro == null && this.ultimo == null;
    }

    public Object pegarUltimoItem(){
        return ultimo.getInfo();
    }

    public Object pegarPrimeiroItem(){
        return primeiro.getInfo();
    }
//
//    // construtor de copia
//    public ListaSimplesDesordenada (ListaSimplesDesordenada<X> modelo) throws Exception
//    {
//		// fazer
//	}
//
//	public Object clone ()
//	{
//		// fazer
//	}
}