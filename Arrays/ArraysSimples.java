/*
	---CLASSE ARRAY---

	- APRESENTAR ALGUMAS FUNCIONALIDADES DA CLASSE ARRAY.

	String vetor[] = new String[3] // CRIANDO UM ARRAY DE STRING DE 3 POSIÇÕES;
	vetor.length; // O METODO '.length' RETORNA O TAMANHO DO ARRAY;
	
	--TRANSFORMANDO UM ARRAY EM STRING--
	Arrays.toString(vetor); // O METODO 'Arrays.toString()' TRANSFORMA O ARRAY EM STRING;

	--BUSCANDO ELEMENTO DENTRO DO ARRAY--
	Arrays.binarySearch(vetor,"elemento"); // O METODO 'Arrays.binarySearch()' RETORNA A 'POSIÇÃO' DO ELEMENTO NO ARRAY SE ELE EXISTIR NO MESMO;

	--ORDENANDO ARRAY---
	
	O METODO 'Arrays.sort()' ORDENA EM ORDEM CRESCENTE OU ALFABÉTICA OS ELEMENTOS DO ARRAY.
	ELE RECEBE COMO PARAMETROS O ARRAY, E O INTERVALO DE ORDENAÇÃO, OU SEJA, ORDENAR DA POSIÇÃO 'X' ATÉ A POSÇÃO 'Y';
	NO CASO ABAIXO EU ESTOU ORDENANDO DA POSIÇÃO 0 ATÉ A ULTIMA POSIÇÃO DO ARRAY. EU PODERIA ORDENAR DA POSIÇÃO 0 ATÉ
	A POSIÇÃO 3 POR EXEMPLO. A CHAMADA DO METODO FICARIA ASSIM: "Arrays.sort(vetor,0,3);".
	
	Arrays.sort(vetor,0,vetor.length);//ORDENANDO O MEU ARRAY DA PRIMEIRA ATÉ A ULTIMA POSIÇÃO.

*/


import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;

class ArraysSimples {
	public static void main (String[] args){
		final int MAX = 5;

		Scanner sc = new Scanner(System.in);
		String paises[] = new String[MAX];
		String result = "";
		String resultOrd = "";

		for(byte i = 0; i < MAX; i++){
			System.out.println("Digite o nome do pais");
			paises[i] = sc.nextLine();
		}

		/*IMPRIMINDO UM ARRAY EM CAIXA DE DIALOGO 'JOptionPane.showMessageDialog'*/
		for(byte i = 0; i < MAX; i++){
			result = result + " " + paises[i];
		}
		JOptionPane.showMessageDialog(null,"Os paises informados sao: " + result);
		
		Arrays.sort(paises,0,paises.length);
		for(byte i = 0; i < MAX; i++){
			resultOrd = resultOrd + " " + paises[i];
		}
		JOptionPane.showMessageDialog(null,"Os paises ordenados sao: " + resultOrd);
		
		/*IMPRIMINDO O TAMANHO DO ARRAY EM CAIXA DE DIALOGO 'JOptionPane.showMessageDialog'*/
		JOptionPane.showMessageDialog(null,"Tamanho do array: " + paises.length);


	}
}