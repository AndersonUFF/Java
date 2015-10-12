import java.util.*;

public class MysqlAlunoTestDrive {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno");
		aluno.nome = sc.next();
		
		System.out.println("Digite o sobrenome do Aluno");
		aluno.sobreNome = sc.next();
		
		System.out.println("Digite a nota da P1");
		aluno.notaP1 = sc.nextDouble();
		
		System.out.println("Digite a nota da P2");
		aluno.notaP2 = sc.nextDouble();
		
		aluno.mediaFinal = aluno.calculaMedia();
		aluno.situacao = aluno.verificaSituacao(aluno.mediaFinal);
		
		aluno.imprimeAluno();
		
		System.out.println();
		System.out.println("Deseja salvar? S/N");
		char opcao = sc.next().charAt(0);
		if((opcao == 's')||(opcao == 'S')){
			boolean Ok = aluno.salvarAluno();
			if(Ok){
				System.out.println("Aluno salvo com sucesso!");
			}else{
				System.out.println("O aluno nao foi salvo no banco de dados");
			}
		}else{
			System.out.println("OK! Você nao deseja salvar o aluno");
		}
	}

}
