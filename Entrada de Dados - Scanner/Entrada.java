/*
	Apresentar o conceito do como ler dados do teclado em JAVA.

	---CLASSE SCANNER---

	-----------------------------------IMPORTANTE--------------------------------------------------
	NAO PODEMOS NOMEAR A NOSSA CLASSE COM O MESMO NOME DE UMA CLASSE EXISTENTE NO JAVA.
	QUANDO NOMEAMOS A CLASSE DE 'Scanner' E TENTAMOS EXECUTAR A CLASSE 'Scanner' EXISTENTE NO JAVA
	OCORRE UM ERRO DE DUPLICATA, POIS A CLASSE 'Scanner' JA PERTENCE A DOCUMENTACAO DO JAVA.
	-----------------------------------------------------------------------------------------------

	Scanner sc = new Scanner(System.in); // instanciamos um objeto do tipo Scanner;
	int valor = sc.nextInt(); // lemos um inteiro do teclado e atribuimos o mesmo a variavel 'valor';
	String nome = sc.nextLine(); lemos uma string do teclado e atribuimos a mesma a variavél 'nome';
	char sexo = sc.next().charAt(0); // lemos um caracter do teclado e atribuimos o mesmo a variavel 'sexo';
*/

import java.util.*;

class Entrada {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor = sc.nextInt();

		System.out.println("O Valor digitado foi: " + valor);
		

	}
}