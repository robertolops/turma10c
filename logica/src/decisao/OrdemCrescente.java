package decisao;

import javax.swing.JOptionPane;

public class OrdemCrescente {

	public static void main(String[] args) {
		//   Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. 
		
		Short N1 = Short.parseShort(JOptionPane.showInputDialog("Digite o primeiro número inteiro."));
		Short N2 = Short.parseShort(JOptionPane.showInputDialog("Digite o segundo número inteiro."));
		Short N3 = Short.parseShort(JOptionPane.showInputDialog("Digite o terceiro número inteiro."));
			
		if (N1 > N2 && N2 > N3) {
			JOptionPane.showMessageDialog(null, "A sequencia de números é: " + N3 + ", " + N2 + ", " + N1);
		}
		if (N1 > N3 && N2 > N2) {
			JOptionPane.showMessageDialog(null, "A sequencia de números é: " + N2 + ", " + N3 + ", " + N1);
		}
		if (N2 > N1 && N1 > N3) {
			JOptionPane.showMessageDialog(null, "A sequencia de números é: " + N3 + ", " + N1 + ", " + N2);
		}
		if (N2 > N3 && N3 > N1) {
			JOptionPane.showMessageDialog(null, "A sequencia de números é: " + N1 + ", " + N3 + ", " + N2);
		}
	}

}
