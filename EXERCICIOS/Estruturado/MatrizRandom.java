/*
	O PROGRAMA PREENCHE UMA MATRIZ ALEATORIAMENTO COM VALORES DIFERENTES;
*/

import java.util.*;

public class MatrizRandom{

	/* METODO PARA VERIFICAR SE O VALOR GERADO RANDOMICAMENTE JA SE ENCONTRA NA MATRIZ*/
	public static Boolean verificaMatriz(int[][] matriz, int valorRandom, final int MAX){

		/* SE O VALOR EXISTE NA MATRIZ RETORNA 'TRUE' SENAO RETORNA 'FALSE' */
		for (int l = 0; l < MAX; l++){
			for (int c = 0; c < MAX; c++){
				if(valorRandom == matriz[l][c]){
					return true;
				}
			}
		}
		return false;
	}

	/* METODO PARA IMPRIMIR A MATRIZ */
	public static void imprimeMatriz(int[][] matriz, final int MAX){
		for(int l = 0; l < MAX; l++){
			for (int c = 0; c < MAX; c++){
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}		
	}

	public static void main(String[] args){
		
		final int MAX = 4;
		
		int[][] matriz = new int[MAX][MAX];
		Random r = new Random();

		/* AQUI ESTOU INICIALIZANDO MINHA MATRIZ COM VALOR '0'*/
		for(int l = 0; l < MAX; l++){
			for (int c = 0; c < MAX; c++){
				matriz[l][c] = 0;
			}
		}

		imprimeMatriz(matriz,MAX); // IMPRIMINDO A MATRIZ
			
		int lin = 0;
		int col = 0;

		while(lin < MAX){
			while(col < MAX){
				
				int valorRandom = r.nextInt(MAX * MAX) + 1; // GERANDO VALORES RANDOMICOS 1 ATE (MAX * MAX);
				
				/*CHAMADA DO METODO QUE VERIFICA SE O VALOR GERADO RANDOMICAMENTE JA EXISTE NA MATRIZ */
				Boolean existe = verificaMatriz(matriz,valorRandom,MAX); 
				
				/* REALIZANDO A INSERCAO DO VALOR SE ELE NAO EXISTE NA MATRIZ */
				if(existe == false){
					matriz[lin][col] = valorRandom;
					col++;
				}

				/* SE PASSAR DO ULTIMO INDICE DE COLUNA, VAI PARA A PROXIMA LINHA */
				if(col == MAX){
					lin++;
				}
			}
			col = 0; // VOLTO PARA O PRIMEIRO INDICE DA COLUNA DA NOVA LINHA A SER PERCORRIDA.
		}
		
		System.out.println();
		System.out.println();

		imprimeMatriz(matriz,MAX); // IMPRIMINDO A MATRIZ
	}
}