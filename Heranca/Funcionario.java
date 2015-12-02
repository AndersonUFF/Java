public class Funcionario {
	String nome;
	double salario;

	void setNome(String nomeFunc){
		this.nome = nomeFunc;
	}
	String getNome(){
		return nome;
	}
	
	void setSalario(double salarioFunc){
		this.salario = salarioFunc;
	}
	double getSalario(){
		return salario;
	}

	double getBonificacao(){
		return this.salario * 0.10;
	}
}