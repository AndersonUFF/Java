import java.util.*;

class DogTestDrive {
	public static void main(String[] args) {
		Dog cachorro = new Dog();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do cachorro");
		cachorro.idade = sc.nextInt();
		System.out.println("Digite o sexo do cachorro");
		cachorro.sexo = sc.next().charAt(0);

		cachorro.rosnar();
		cachorro.latir();
	}
}