/*
	----CLASSE JOPTIONPANE----

	- A classe JOptionPane é usada para realizar a entrada de dados do teclado com
	janelas gráficas.


	--METODO SHOWINPUTDIALOG--
	- Este metodo recebe como parametro uma "String" e retorna outra "String";
	 
	 //Aqui passamos uma string por parametro (No caso a pergunta) e o metodo retorna uma string; 	
	 String nome = JOptionPane.showInputDialog("Qual o seu nome?");

	--METODO SHOWMESSAGEDIALOG--
	- Este metodo recebe como parametros um ponteiro nulo(null) e uma String;
	
	//Aqui retornamos uma caixa de dialogo com o nome digitado no showInputDialog();
	JOptionPane.showMessageDialog(null, nome);
*/


import javax.swing.JOptionPane;

class EntradaOptionPane {
	public static void main(String[] args){
		String nome;
		int idade;
		int anoAtual;
		int anoNasc;

		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		//idade = JOptionPane.showInputDialog("Qual sua idade?");
		//anoAtual = JOptionPane.showInputDialog("Qual é o ano atual?");

		//anoNasc = anoAtual - idade;

		JOptionPane.showMessageDialog(null, nome);
	}
}