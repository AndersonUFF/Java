package Getters_Setters;
import java.util.*;

public class ContaTestDrive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		char fim = 's';
		while((fim == 'S')||(fim == 's')){
			
			System.out.println("Tecle 1 para criar uma NOVA CONTA");
			System.out.println("Tecle 2 se já possui conta");
			int op = sc.nextInt();
			if(op == 1){
				System.out.println("Digite nome do titular da conta ");
				conta.setTitularConta(sc.next());
				
				System.out.println("Digite o CPF do titular da conta");
				conta.setCpf(sc.next());
				
				System.out.println("Cadastre uma senha");
				conta.setSenha(sc.next());
				System.out.println("Informe o valor de deposito para a abertura da conta");
				if((conta.criarConta())&&(conta.depositar(sc.nextDouble()))){
					System.out.println("Conta criada com sucesso!");
					
				} else {
					System.out.println("Não foi possivel criar a conta");
					
				}
			} else {
				System.out.println("Digite o número da conta");
				conta.setNumConta(sc.nextInt());
				
				System.out.println("Digite a senha da conta");
				conta.setSenha(sc.next());
				
				if(conta.entrar()){
					System.out.println("Menu:");
					System.out.println("1 - Ver saldo");
					System.out.println("2 - Sacar");
					System.out.println("3 - Depositar");
					
					op = sc.nextInt();
					
					switch(op){					
						case 1:{
							System.out.println("Digite o número da conta");
							conta.setNumConta(sc.nextInt());
							System.out.println("Digite a senha da conta");
							conta.setSenha(sc.next());
							conta.verSaldo();
							break;
						}
						case 2:{
							System.out.println("Digite o número da conta");
							conta.setNumConta(sc.nextInt());
							System.out.println("Digite a senha da conta");
							conta.setSenha(sc.next());
							conta.verSaldo();
							System.out.println();
							System.out.println("Digite o valor do saque");
							if(conta.sacar(sc.nextDouble())){
								
								System.out.println("Saque realizado com sucesso");
								conta.verSaldo();
							} else {
								System.out.println("Dados incosistentes");
							}
							break;
						}
						case 3:{
							System.out.println("Digite o número da conta");
							conta.setNumConta(sc.nextInt());
							System.out.println("Digite a senha da conta");
							conta.setSenha(sc.next());
							conta.verSaldo();
							break;
						}
					}
				} else {
					System.out.println("Dados incosistentes");
				}
			}
			
			System.out.println("Deseja realizar outra operação? S/N");
			fim = sc.next().charAt(0);
		}
	}
}
