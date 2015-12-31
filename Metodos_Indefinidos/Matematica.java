/*
	== ARGUMENTOS VARIAVEIS ==

	- SÃO METODOS COM UMA QUANTIDADE INDEFINIDA DE PARAMETROS.
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
}