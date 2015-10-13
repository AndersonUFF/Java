import java.util.*;

public class Aluno {
	
	String nome;
	String sobreNome;
	double notaP1;
	double notaP2;
	double mediaFinal;
	String situacao;
	
	double calculaMedia(){
		double media = (notaP1 + notaP2)/2;
		return media;
	}
	
	String verificaSituacao(double mediaFinal){
		if(mediaFinal >= 6.0){
			return "AP";
		}else{
			if(mediaFinal <= 3.9){
				return "VS";
			}else{
				return "REP";
			}
		}
	}
	
	public boolean salvarAluno(){
		BancoDadosMysql bancoDados = new BancoDadosMysql();
		bancoDados.conectar();
		if(bancoDados.estaConectado()){
			bancoDados.inserirAluno(nome, sobreNome, notaP1, notaP2, mediaFinal, situacao);
			bancoDados.desconectar();
			return true;
		}else{
			System.out.println("Não foi possivel conectar ao banco de dados!");
			return false;
		}
	}
	
	void imprimeAluno(){
		System.out.print("Nome: " + nome);
		System.out.println(" " + sobreNome);
		System.out.println("Nota P1: " + notaP1);
		System.out.println("Nota P2: " + notaP2);
		System.out.println("Media Final: " + mediaFinal);
		System.out.println("Status: " + situacao);
	}
}
