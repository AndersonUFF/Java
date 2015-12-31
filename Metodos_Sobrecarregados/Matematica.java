/*
	== METODOS SOBRECARREGADOS ==

	- SÃO METODOS COM O MESMO NOME, PORÉM EXECUTAM TAREFAS DIFERENTES.
	- TODO METODO SOBRECARREGADO DEVE POSSUIR UMA ASSINATURA.
*/
public class Matematica{

	/*
	* ESTE METODO "DEVE" RECEBER 2 PARAMETROS INTEIROS. NÃO PODE RECEBER NEM MAIS QUE 2 OU MENOS QUE 2.
	*/
	public int somaDoisValores(int valor1, int valor2){
		return valor1 + valor2;
	}

	// ESTE METODO PODE RECEBER UMA QUANTIDADE INDEFINIDA DE PARAMETROS.
	public int somaVariosValores(int ... valores){
		
		int totalSoma = 0;

		//for each para percorrer o array valores
		for(int v: valores){
			totalSoma += v;
		}
		return totalSoma;
	}


	// METODO QUE RECEBE 2 PARAMETROS INTEIROS E CALCULA A MEDIA.
	public double media(int x, int y){
		System.out.println("double media(int x, int y)"); // ASSINATURA DO METODO
		return (x + y)/2;
	}

	
	// METODO RECEBE DUAS STRINGS COMO PARAMETROS, TRANSFORMA ESTAS EM INTEIROS, REALIZA E RETORNA A MEDIA.
	public double media(String x, String y){
		System.out.println("double media(String x, String y)"); // ASSINATURA DO METODO
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy)/2;
	}

	// METODO RECEBE UMA QUANTIDADE INDEFINIDA DE VALORES E CALCULA A MEDIA DESTES.
	public double media(int ... valores){
		System.out.println("double media(double ... valores)");
		return this.somaVariosValores(valores)/valores.length;
	}
}