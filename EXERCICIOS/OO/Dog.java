class Dog {
	int idade;
	char sexo;

	void rosnar(){
		System.out.println("Grrrrr");
	}


	void latir(){
		if(idade > 3){
			if(sexo == 'm'){
				System.out.println("RUFF! RUFF!");
			} else {
				System.out.println("RAU!! RAU!!");
			}
		} else {
			System.out.println("Caim Caim Caim");
		}
	}
}