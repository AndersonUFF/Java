import java.util.*;
import javax.swing.*;

class Vetores {
	public static void main(String[] args){
		int vet[];
		vet = new int[3];
		int i;
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		for(i = 0; i < 3; i++){
			String valor = JOptionPane.showInputDialog("Digite um valor");
			vet[i] = Integer.parseInt(valor);
		}
		
		//System.out.println();
		//for(i = 0; i < 3; i++){
		//	System.out.print(vet[i] + " ");
		//}
		
		for(i = 0; i < 3; i++){
			result = result + " " + vet[i];
		}
		JOptionPane.showMessageDialog(null, result);
	}
}