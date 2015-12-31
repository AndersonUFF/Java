/*
* == METODOS CONSTRUTORES ==
* 
* - PODEMOS CRIAR METODOS CONSTRUTORES VAZIOS E COM PARAMETROS.
*/

public class Carro{
	
	String marca;
	String modelo;
	int ano;

	/*
	* ESTE METODO CONSTRUTOR PERMITE QUE SE INICIALIZE UM OBJETO SEM PARAMETROS.
	* EXEMPLO: "Carro veiculo = new Carro();"
	*/
	public Carro(){

	}

	/*
	* ESTE METODO CONSTRUTOR PERMITE QUE SE INICIALIZE UM OBJETO COM PARAMETROS.
	* EXEMPLO: "Carro veiculo = new Carro("Fiat","Fiat Palio",2000);"
	*/
	public Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	/*
	*  == IMPORTANTE ==
	*  
	*  POSSO CRIAR CLASSES SEM OS CONSTRUTORES VAZIOS?
	*  RESP: SIM! POREM NAO SERA PERMITIDO QUE SE INICIE O METODO SEM PARAMETROS.
	*  EXEMPLO: "Carro veiculo = new Carro();".
	*  NESTE CASO, A JVM NAO IRA ENCONTRAR O METODO CONSTRUTOR "Carro()" E PROVAVELMENTE DARA ERRO AO COMPILAR O PROGRAMA.
	*  ESTA SITUAÇÃO E IGUAL AO DOS METODOS SOBRECARREGADOS, QUE A JVM EXECUTA O METODO MAIS APROPRIADO DEPENDENDO DA QTD DE PARAMETROS.
	*  COMO NAO EXISTE UM METODO SEM PARAMETROS, ELE IRA TENTAR EXECUTAR O COM PARAMETROS. POREM NAO FORAM INFORMADOS PARAMETROS NA CHAMADA DO METODO.
	*/

	public void imprimeCarro(){
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
	}
}