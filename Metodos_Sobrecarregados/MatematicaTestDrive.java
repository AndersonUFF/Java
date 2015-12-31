import java.util.*;

public class MatematicaTestDrive{
	
	public static void main(String[] args){
		
		Matematica m = new Matematica();

		/* AQUI, DEPENDENDO DA QUANTIDADE DE PARAMETROS PASSADA, A PROPRIA
		 * JVM, DECIDE QUAL É O METODO A SER EXECUTADO.
		*/ 
		double media = m.media(); // PARA TESTAR INSIRA OS PARAMETROS NA CHAMADA DA FUNCAO.
		System.out.println(media);
		
	}
}