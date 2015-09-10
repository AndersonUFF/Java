/*
	----CLASSE ARRAYLIST----

	- APRESENTAR A CLASSE ESPECIAL PARA CRIAÇÃO E MANIPULAÇÃO DE ARRAYS.

*/

import java.util.Scanner;
import java.util.ArrayList;

public class ArraysLista {
	public static void main(String[] args){

		final int MAX = 5;
		
		/* CRIANDO UM ArrayList STRING CHAMADO "cores".*/
		ArrayList<String> cores = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String cor;

		/* AQUI PREENCHE O ArrayList 'cores' UTILIZANDO O METODO "cores.add(<indice>,<cor>)", ONDE
		OS PARAMETROS SÃO O INDICE ONDE A COR SERÁ ADICIONADA E A PROPRIA COR. */
		for(byte i = 0; i < MAX; i++){
			
			System.out.println("Informe uma cor");
			cor = sc.nextLine();
			cores.add(i,cor);		
		}

		/*IMPRIMINDO O ARRAYLIST UTILIZANDO O METODO "cores.toString()"
		NOTE QUE NÃO É PRECISO CRIAR UM 'FOR' PARA IMPRIMIR O ARRAYLIST COMPLETAMENTE.*/
		System.out.println(cores.toString());
		System.out.println();
		
		/* O METODO 'cores.size() RETORNA O TAMANHO DO ARRAYLIST', OU SEJA, 
		SE O ARRAY POSSUIR 'N' ELEMENTOS SEU TAMANHO SERÁ IGUAL À 'N' */
		System.out.println("O Tamanho do ArrayList é: " + cores.size());
		System.out.println();

		/* O METODO "cores.indesOf()" RETORNA A POSIÇÃO DO ARRAYLIST EM QUE SE ENCONTRA A COR 'PRETO'
		SEMPRE DEVEMOS PASSAR COMO PARAMETRO DO METODO O ELEMENTO QUE QUEREMOS SABER SUA POSIÇÃO.*/
		System.out.println("O indice da cor PRETO é: " + cores.indexOf("preto"));

		/* O METODO "cores.get()" RETORNA O CONTEUDO DO INDICE INFORMADO. SEMPRE DEVEMOS PASSAR COMO PARAMETRO
		DO METODO O INDICE QUE QUEREMOS SABER SEU ELEMENTO.*/
		System.out.println("O conteudo do indice 3 é: " + cores.get(3));

		/* O METODO "cores.remove" REMOVE O CONTEUDO INFORMADO NO PARAMETRO. NESTE CASO REMOVEMOS A COR "PRETO" DO ARRAYLIST.*/
		cores.remove("preto");
		System.out.println(cores.toString()); // NOVAMENTE IMPRIMINDO O ARRAYLIST.
		
		/* O METODO "corest.contains()" RETORNA SE O ELEMENTO INFORMADO NO PARAMETRO EXISTE NO ARRAYLIST. NESTE CASO QUEREMOS SABER SE
		A COR "PRETO"  EXISTE NO ARRAYLIST. */
		System.out.println("O ArrayList contem a cor Preto? " + cores.contains("preto"));

	}
}