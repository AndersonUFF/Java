public class CarroTestDrive{
	
	public static void main(String[] args){

		//INSTANCIANDO O OBJETO UTILIZANDO O METODO CONSTRUTOR VAZIO.
		Carro veiculo = new Carro(); // COMO EU TENHO O CONSTRUTOR VAZIO NA CLASSE "Carro", ESTA INSTANCIACAO E PERMITIDA.
		veiculo.marca = "fiat";
		veiculo.modelo = "fiat palio";
		veiculo.ano = 2000;
		veiculo.imprimeCarro();

		System.out.println();
		System.out.println();
		//INSTANCIANDO O OBJETO UTILIZANDO O METODO CONSTRUTOR COM PARAMETROS.
		Carro veiculo2 = new Carro("Volks","Golf",2002); // OS PARAMETROSS JA SAO SETADOS AUTOMATICAMENTE NAS VARIAVEIS DO OBJETO.
		veiculo2.imprimeCarro();
	}
}