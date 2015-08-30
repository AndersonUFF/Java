/*
	@ Anderson
	
	O PROGRAMA DESCOBRE O ANO EM QUE O USUARIO NASCEU.

*/


import java.util.*;
import javax.swing.*;

class Tarefa {
	public static void main(String[] args){
		String strnome;
		String strIdade;
		String strAnoNasc;
		String strAnoAtual;
		int idade;
		int anoNasc;
		int anoAtual;

		/* LEIO DO TECLADO O NOME DO USUARIO E ATRIBUO A VARIAVEL 'nome'
		UTILIZADO CAIXA DE DIALOGO 'JOptionPane.showInputDialog' */
		strnome = JOptionPane.showInputDialog("Qual o seu nome?");

		/* LEIO DO TECLADO A IDADE DO USUARIO E ATRIBUO A VARIAVEL 'stridade'
		UTILIZADO CAIXA DE DIALOGO 'JOptionPane.showInputDialog' */
		strIdade = JOptionPane.showInputDialog("Qual a sua idade");

		/* LEIO DO TECLADO O ANO ATUAL DO USUARIO E ATRIBUO A VARIAVEL 'strAnoAtual'
		UTILIZADO CAIXA DE DIALOGO 'JOptionPane.showInputDialog'*/
		strAnoAtual = JOptionPane.showInputDialog("Informe o ano atual");

		idade = Integer.parseInt(strIdade); // TRANSFORMO A VARIAVEL "strIdade" EM INTEIRO E ATRIBUO O VALOR A VARIAVEL "idade";
		anoAtual = Integer.parseInt(strAnoAtual); // TRANSFORMO A VARIAVEL "strAnoAtual" EM INTEIRO E ATRIBUO O VALOR A VARIAVEL "anoAtual";

		anoNasc = anoAtual - idade; // REALIZO O CALCULO PARA ACHAR O ANO DE NASCIMENTO DO USUARIO;
		
		/* TRASFORMO A VARIAVEL "anoNasc" EM STRING E EXIBO NA CAIXA DE DIALOGO "JOptionPane.showMessageDialog" */
		JOptionPane.showMessageDialog(null, Integer.toString(anoNasc));
		
	}
}