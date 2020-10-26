package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoEtapa3 {

	public static void main(String[] args) {
		/*
		 * Um jogo de adivinha��o
		 * o jogador 1 digita u numero inteiro
		 * o jogador 2 tem que adivinhar o numero que foi digitado pelo jogador 1
		 * enquanto ele nao acertar o jogo continua perguntando o numero
		 * 
		 * etapa 2
		 * acrescente uma contagem de tentativas do jogador 2, e apresente
		 * quantas tentativas ele usou para acertar o numero
		 * 
		 * etapa3
		 * acrescente dicas para o jogador 2, indicando se o numero
		 * que ele esta tentando adivinhar � maior ou menor do que o que ele chutou
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero a ser advinhado"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor");
			}
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou com " + contador + " tentativa(s).");
	}
}