package repeticao;

import javax.swing.JOptionPane;

public class DesafioFor {

	public static void main(String[] args) {

		/*
		 * 1�) Crie um programa que pergunte ao usu�rio 
		 * o seu n�vel de escolaridade (M�dio, Superior ou P�s) 
		 * enquanto a resposta for v�lida, ir� computando os totais 
		 * dos n�veis digitados, no final apresente somente o n�vel 
		 * que foi mais votado
		 */


		String escolaridade="";
		int totalM=0;
		int totalS=0;
		int totalP=0;
		do {
			escolaridade = JOptionPane.showInputDialog("Digite <M> ou <S> ou <P>").toUpperCase();
			if (escolaridade.equals("M")) {
				totalM=totalM+1;
			}else if (escolaridade.equals("S")) {
				totalS=totalS+1;
			}else if (escolaridade.equals("P")) {
				totalP=totalP+1;
			}
		}while(escolaridade.equals("M") || escolaridade.equals("S") || escolaridade.equals("P"));
		if (totalM>totalS && totalM>totalP) {
			System.out.println("Maioria das pessoas possui n�vel M�dio de escolaridade, quantidade de pessoa: " + totalM);
		}else if (totalS>totalM && totalS>totalP) {
			System.out.println("Maioria das pessoas possui n�vel Superior de escolaridade, quantidade de pessoa: " + totalS);
		}else {
			System.out.println(("Maioria das pessoas possui n�vel P�s de escolaridade, quantidade de pessoa: " + totalP));
		}
		System.out.println("Total de n�vel de escolaridade M�dio: " + totalM);
		System.out.println("Total de n�vel de escolaridade Superior: " + totalS);
		System.out.println("Total de n�vel de escolaridade P�s: " + totalP);
		
		



	}

}

