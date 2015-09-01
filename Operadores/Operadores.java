/*
	---OPERADORES---

	- Apresentando o conceito de OPERADORES


	++x é a mesmo que x = x + 1;

	---PRE-INCREMENTO---
	int x = 6;
	int y = ++x; // AQUI ELE FAZ O PRÉ - INCREMENTO DE X E ATRIBUI O VALOR A VARIAVÉL Y;


	---PÓS-INCREMENTO---
	int x = 6;
	int y = x++; // AQUI O PROGRAMA ATRIBUI O VALOR 6 A 'X' E DEPOIS ATRIBUI O VALOR DE 'X' A 'Y' E DEPOIS INCREMENTA O VALOR DE 'X' PARA 7

	---INSTANCEOFF---
	- COMPARA TIPOS DE VARIAVÉIS E RETORNA 'TRUE' OU 'FALSE';

	Integer v1 = 2; // AQUI DECLAREI UMA VARIAVÉL DO TIPO WRAPPER E DEFINIR UM VALOR DIRETAMENTE SEM UTILIZAR O OPERADOR 'NEW'. ISTO É UMA MELHORIA DO JAVA 7;
	System.out.println(v1 instanceof Integer);

	---OPERADORES DE ATRIBUIÇÃO---
	
	- FUNCIONA DO MESMO JEITO QUE FUNCIONA NA LINGUAGEM C;	
		+= SOMA
		-= SUBTRAÇÃO
		*= MULTIPLICAÇÃO
		/= DIVISÃO
		%= MODULO // RETORNARÁ O RESTO DA DIVISÃO;
*/

class Operadores {
	public static void main(String[] args){
		int x = 6;
		int y = x++;

		Integer v1 = 6;
		v1 /= 3; 

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("V1 = " + v1);
	}
}