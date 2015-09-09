public class Aluno{
	
	String nome;
	float notaP1;
	float notaP2;
	float mediaAluno;
	
	float calculaMedia(){
		float mediaFinal = (notaP1 + notaP2)/2;
		return mediaFinal;
	}

	void imprimeAluno(){
		System.out.println("Nome: " + nome);
		System.out.println("Nota P1: " + notaP1);
		System.out.println("Nota P2: " + notaP2);
		System.out.println("Media Final: " + mediaAluno);
		System.out.println();
	}
}