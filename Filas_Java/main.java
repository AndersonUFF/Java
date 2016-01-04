public class main{
	public static void main(String[] args){
		
		Fila f = new Fila();
		f = f.criaFila(f);
		for(int i = 0; i < 5; i++){
			f = f.insereFila(f,i);
		}
		System.out.println("Fila antes do remove");
		f.imprimeFila(f);
		System.out.println();
		System.out.println();
		System.out.println("Fila depois do remove");
		f = f.removeFila(f);
		f.imprimeFila(f);
	}
}