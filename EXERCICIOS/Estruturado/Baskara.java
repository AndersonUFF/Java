/*
	---CALCULA RAIZES---

	O PROGRAMA CALCULA AS RAIZES REAIZ DE UMA EQUAÇÃO UTILIZANDO JOPTIONPANE.
*/


import javax.swing.JOptionPane;

public class Baskara {
	public static void main(String[] args){
		double dblA,dblB,dblC,delta;
		String strA,strB,strC;

		/* Recebo do usuario os valores de A,B e C do tipo STRING e utilizando CAIXA DE DIALOGO (JOptionPane)
		a atribuo estes valores as variaveis strA, strB e strC.*/
		strA = JOptionPane.showInputDialog("Informe o valor de A"); 
		strB = JOptionPane.showInputDialog("Informe o valor de B");
		strC = JOptionPane.showInputDialog("Informe o valor de C");

		/* Aqui trasformo os valores STRINGS das variaveis strA, strB e strC em tipo DOUBLE
		e atribuo estes as variaveis dblA, dblB e dblC respectivamente*/
		dblA = Double.parseDouble(strA);
		dblB = Double.parseDouble(strB);
		dblC = Double.parseDouble(strC);

		delta = (dblB * dblB) - (4 * dblA * dblC); // calculo o valor de DELTA;
		
		/* Se DELTA for negativo, ou seja, menor que 0, então imprime 'Nao existem raizes reaiz' 
		CASO CONTRÁRIO, ou seja, delta MAIOR OU IGUAL A ZERO, imprime as raizes usando caixa de dialogo
		(JOptionPane.showMessageDialog)*/
		if(delta < 0){
			JOptionPane.showMessageDialog(null,"Delta menor que 0! Nao existem raizes reais.");
		} else {
			double x1 = (-dblB + Math.sqrt(delta)) / 2*dblA;
			double x2 = (-dblB - Math.sqrt(delta)) / 2*dblA;
			JOptionPane.showMessageDialog(null,"X1 = " + x1 + " e X2 = " +x2 );
		}
	
	}
}