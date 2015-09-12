import java.util.*;

public class Dados {
	public static void main(String[] args){

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int numDado, numUser;

		numDado = r.nextInt(6) + 1;

		System.out.println("Escolha um valor de 1 a 6");
		numUser = sc.nextInt();

		if(numUser == numDado){
			System.out.println("Voce venceu!");
		} else {
			System.out.println("Voce perdeu!");
		}

		System.out.println("O Valor do dado foi: " + numDado);
	}
}