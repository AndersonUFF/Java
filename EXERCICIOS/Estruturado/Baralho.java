import java.util.Random;

public class Matrizes {
	public static void main(String[] args){

		final int MAX = 52;
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","D","J","K"};
		String[] naipes = {"Copas","Espada","Ouro","Paus"};

		Random r = new Random();

		for(byte i = 0; i < MAX; i++){
			
			/*AQUI O PROGRAMA ESCOLHE ALEATORIAMENTE UMA FACE E UM NAIPE. OS PARAMETROS 'faces.length' e 'naipes.length'
			REALIZA A ESCOLHA ALEATORIA DA POSIÇÃO DO VETOR.*/
			String carta = faces[r.nextInt(faces.length)] + " " + naipes[r.nextInt(naipes.length)];
			System.out.println(carta);
		}
	}
}