public class Funcionario {
	private String nome;
	private double salario;

	//METODO SET: ENTRADA DE DADOS
	void setNome(String nomeFunc){
		this.nome = nomeFunc;
	}

	//METODO GET: RECUPERAÇÃO DE DADOS 
	String getNome(){
		return nome;
	}
	
	//METODO SET: ENTRADA DE DADOS
	void setSalario(double salarioFunc){
		this.salario = salarioFunc;
	}

	//METODO GET: RECUPERAÇÃO DE DADOS
	double getSalario(){
		return salario;
	}

	//METODO GET: RECUPERAÇÃO DE DADOS
	double getBonificacao(){
		return this.salario * 0.10;
	}
}