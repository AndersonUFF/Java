import java.util.*;

public class FuncionarioTestDrive {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		Gerente gerente = new Gerente();

		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'func.Nome' PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO,
		* UTILIZAMOS O METODO 'func.setNome()', PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO E 
		* ALOCAR ESTE VALOR NA VARIAVEL 'Nome' DA CLASSE 'FUNCIONARIO'	
		*/
		System.out.println("Digite o nome do Funcionário");
		func.setNome(sc.next());

		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'func.Nome' PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO,
		* UTILIZAMOS O METODO 'func.setSalario()', PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO E 
		* ALOCAR ESTE VALOR NA VARIAVEL 'Salario' DA CLASSE 'FUNCIONARIO'.	
		*/
		System.out.println("Digite o salario do Funcionário");
		func.setSalario(sc.nextDouble());
		
		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'func.Nome' E 'func.salario' PARA "RECUPERAR" O VALORES DIGITADOS PELO USUÁRIO,
		* UTILIZAMOS OS METODOS 'func.getNome()' E 'func.getSalario()', PARA "RECUPERAR" OS VALORES DIGITADOS PELO USUÁRIO E 
		* QUE ESTÃO ALOCADOS ESTE NAS VARIAVEIS 'Nome' E 'salario' DA CLASSE 'FUNCIONARIO'.	
		*/
		System.out.println("Nome: " + func.getNome());
		System.out.println("Salario: " + func.getSalario());

		/* NESTE CASO É INVOCADO O METODO getBonificacao()" DA CLASSE "FUNCIONARIO"*/
		System.out.println("A bonificacao e de: " + func.getBonificacao());

		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'gerente.Nome' PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO,
		* UTILIZAMOS O METODO 'gerente.setNome()', PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO E 
		* ALOCAR ESTE VALOR NA VARIAVEL 'Nome' DA CLASSE 'GERENTE', QUE É UMA HERANÇA DA CLASSE
		* 'FUNCIONARIO'.	
		*/
		System.out.println("Digite o nome do Gerente");
		gerente.setNome(sc.next());

		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'gerente.salario' PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO,
		* UTILIZAMOS O METODO 'gerente.setSalario()', PARA "RECEBER" O VALOR DIGITADO PELO USUÁRIO E 
		* ALOCAR ESTE VALOR NA VARIAVEL 'Nome' DA CLASSE 'GERENTE', QUE É UMA HERANÇA DA CLASSE
		* 'FUNCIONARIO'.	
		*/
		System.out.println("Digite o salario do Gerente");
		gerente.setSalario(sc.nextDouble());


		/*
		* AQUI AO INVÉS DE UTILIZARMOS 'gerente.Nome' e 'gerente.salario' PARA "RECUPERAR" OS VALORES DIGITADOS PELO USUÁRIO,
		* UTILIZAMOS OS METODOS 'gerete.getNome()' E 'gerente.getSalario()' PARA "RECUPERAR" O VALORES QUE FORAM DIGITADOS PELO USUÁRIO E 
		* QUE ESTÃO ALOCADOS NAS VARIAVEIS 'Nome' E 'salario' DA CLASSE 'GERENTE', QUE É UMA HERANÇA DA CLASSE 'FUNCIONÁRIO'.  	
		*/
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salario: " + gerente.getSalario());

		/* NESTE CASO É INVOCADO O METODO getBonificacao()" DA CLASSE "GERENTE"*/
		System.out.println("A bonificacao e de: " + gerente.getBonificacao());
	}
}