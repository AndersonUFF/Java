public class Gerente extends Funcionario{
	int senha;
	int numFuncGerenciados;

	/*SOBREESCREVENDO O METODO getBonificacao*/
	@Override
	double getBonificacao(){
		return this.salario * 0.15;
	}
}