/*
	Apresentar os conceitos de Variavéis
	@ ANDERSON TEIXEIRA

	---TIPOS PRIMITIVOS---
	
	byte b = 127; // até 100
	short s = 32768; // até 32000
	int i = 2_000_000_000 // até 2 Bilhões
	long l = 9_000_000_000_000_000_000 // até 9 Quintilhões

	//IEEE 754
	double d = 1.7976931348623157E+308 // IEEE 754

	---CONSTANTES---
	- As variavéis constantes, por regra do JAVA, são sempre escritas com letras maiusculas;
	- Se a variavél for uma palavra composta, devemos usar o underline e não p camelcase;
	
	 Exemplos:

	final double PI = 3.14;
	final char SEXO_MASCULINO = 'M';
	final char SEXO_FEMININO = 'F';


*/

public class Variavel {
	public static void main(String[] args){

		int num = 30;
		int num2 = 5;
		int soma = num + num2;
		System.out.print("A soma é: " + soma);
	}
}