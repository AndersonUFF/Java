import java.util.*;

public class FuncionarioTestDrive {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		Gerente gerente = new Gerente();

		System.out.println("Digite o nome do Funcionário");
		func.setNome(sc.next());

		System.out.println("Digite o salario do Funcionário");
		func.setSalario(sc.nextDouble());

		System.out.println("Nome: " + func.getNome());
		System.out.println("Salario: " + func.getSalario());

		/* NESTE CASO É INVOCADO O METODO getBonificacao()" DA CLASSE "FUNCIONARIO"*/
		System.out.println("A bonificacao e de: " + func.getBonificacao());

		System.out.println("Digite o nome do Gerente");
		gerente.setNome(sc.next());

		System.out.println("Digite o salario do Gerente");
		gerente.setSalario(sc.nextDouble());

		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salario: " + gerente.getSalario());

		/* NESTE CASO É INVOCADO O METODO getBonificacao()" DA CLASSE "GERENTE"*/
		System.out.println("A bonificacao e de: " + gerente.getBonificacao());
	}
}