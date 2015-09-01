/*
	Apresentar os conceitos das CLASSES WRAPPER

	- Com as variavéis do tipo Wrapper é possivel converte-las 
	para outro tipo.

	---TIPOS WRAPPER---	
	.Double 	.Byte 	.Void
	.Integer 	.Float
	.Character 	.Short
	.Long 		.Boolean

	-----CONVERSAO USANDO CLASSE WRAPPER-----
	Ex:
	Uma String em Double.
	
	Double preco = new Double("12.45"); // instaciei um objeto do tipo double passando como parametro uma string;
	double d = preco.doubleValue(); // transformei a minha string em double e guardei o valor na variavél 'd';
	preco.intValue(); // transformei em inteiro e guardei o valor na variavél 'i';
	byte b = preco.byteValue(); // transformei em byte e guardei o valor na variavél 'b';

	---CONVERSAO ESTATICA---
	Ex: 
	Convertendo uma String

	double d1 = Double.parseDouble("12.45"); // transformei a minha string em double e guardei o valor na variavél 'd1';
	int i1 = Integer.parseInt("123"); // transformei em inteiro e guardei o valor na variavél 'i1';
	float f1 = Float.parseFloat("12.33"); // transformei em float e guardei o valor na variavél 'f1';

	---CONVERSAO DE BINARIO---
	Ex:

	int i2 = Integer.valueOf("101011",2); // transformando um valor binário em inteiro;
	int i3 = Integer.valueOf("101011",8); // transformando um valor octal para inteiro;
	int i4 = Integer.valueOf("101011",16); // transformando um valor hexadecimal para inteiro;

	---IMPORTANTE---
	- NO JAVA 7 É POSSIVEL ATRIBUIR O TIPO WRAPPER DIRETAMENTE A VARIAVEL AO INVÉS DE INSTANCIA-LA COM O OPERADOR 'NEW';
		EX:

		Integer x = 10;
		Integer y = 5;
		Integer soma = x + y;
		System.out.println("Soma: " + soma);
*/

class Wrapper{
	public static void main(String[] args){
		
		int i2 = Integer.valueOf("101011",2);
		int i3 = Integer.valueOf("101011",8); 
		int i4 = Integer.valueOf("101011",16);

		System.out.println("Valor: " + i2);
		System.out.println("Valor: " + i3);
		System.out.println("Valor: " + i4);
	}
}