package decisao;

import javax.swing.JOptionPane;

public class OrdemCrescente {

	public static void main(String[] args) {
		//   Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente. 
		
		Short N1 = Short.parseShort(JOptionPane.showInputDialog("Digite o primeiro n�mero inteiro."));
		Short N2 = Short.parseShort(JOptionPane.showInputDialog("Digite o segundo n�mero inteiro."));
		Short N3 = Short.parseShort(JOptionPane.showInputDialog("Digite o terceiro n�mero inteiro."));
			
		if (N1 > N2 && N2 > N3) {
			JOptionPane.showMessageDialog(null, "A sequencia de n�meros �: " + N3 + ", " + N2 + ", " + N1);
		}
		if (N1 > N3 && N2 > N2) {
			JOptionPane.showMessageDialog(null, "A sequencia de n�meros �: " + N2 + ", " + N3 + ", " + N1);
		}
		if (N2 > N1 && N1 > N3) {
			JOptionPane.showMessageDialog(null, "A sequencia de n�meros �: " + N3 + ", " + N1 + ", " + N2);
		}
		if (N2 > N3 && N3 > N1) {
			JOptionPane.showMessageDialog(null, "A sequencia de n�meros �: " + N1 + ", " + N3 + ", " + N2);
		}
	}

}
