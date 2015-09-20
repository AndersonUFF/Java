import java.util.*;

public class AlunoTestDrive{
	public static void main(String[] args){
		final int MAX = 3;

		Scanner sc = new Scanner(System.in);
		Aluno[] novoAluno = new Aluno[MAX];
		Double totalMedias = 0.0;

		for(byte i = 0; i < MAX; i++){
			
			novoAluno[i] = new Aluno();

			System.out.println("Digite o nome do Aluno");
			novoAluno[i].nome = sc.next();

			/*COLOCAR VIRGULA AO INVÉS DE PONTO EX: 9,5 E NÃO 9.5*/
			System.out.println("Digite a nota da primeira prova");
			novoAluno[i].notaP1 = sc.nextFloat();
			
			System.out.println("Digite a nota da segunda prova");
			novoAluno[i].notaP2 = sc.nextFloat();

			novoAluno[i].mediaAluno = novoAluno[i].calculaMedia();
			totalMedias += novoAluno[i].mediaAluno;
		}

		Turma mediaTurma = new Turma();
		mediaTurma.mediaAlunos = totalMedias;
		mediaTurma.totalAlunos = MAX;

		for(byte i = 0; i < MAX; i++)
			novoAluno[i].imprimeAluno();

		System.out.println("A Media da Turma foi: " + mediaTurma.calculaMediaTurma());
	}
}