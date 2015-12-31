import java.util.*;

public class MatematicaTestDrive{
	
	public static void main(String[] args){
		
		Matematica soma = new Matematica();

		/* ESTE METODO SÓ PODE MANDAR 2 PARAMETROS. 
		*/
		System.out.println("A soma dos 2 valores é: " + soma.somaDoisValores(2,5));

		/* JA ESTE PODE MANDAR UMA QUANTIDADE INDEFINIDA DE PARAMETROS.
		*/	
		System.out.println("A soma dos 2 valores é: " + soma.somaVariosValores(2,5,5,1));

		
	}
}