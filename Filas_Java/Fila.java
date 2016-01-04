public class Fila{
	No primeiro;
	No ultimo;

	public Fila(){}

	public Fila criaFila(Fila f){
		f.primeiro = null;
		f.ultimo = null;
		return f;
	}

	public Fila insereFila(Fila f, int info){
		
		No novo = new No();
		novo.setInfo(info);

		if(f.primeiro == null){
			novo.setProx(f.primeiro);
			f.primeiro = f.ultimo = novo;
			novo = f.primeiro.getProx();
		} else {
			novo.setProx(f.ultimo.getProx());
			f.ultimo.setProx(novo);
			f.ultimo = novo;
			novo = novo.getProx();
		}
		return f;
	}

	public Fila removeFila(Fila f){
		if(f.primeiro == null){
			System.out.println("Fila vazia!");
			return f;
		}
		
		No pont = f.primeiro;
		f.primeiro = f.primeiro.getProx();
		pont.setProx(null);
		pont = pont.getProx();
		return f;
	}

	public void imprimeFila(Fila f){
		No pont;
		for(pont = f.primeiro; pont != null; pont = pont.getProx())
			System.out.print(pont.getInfo());
	}
}