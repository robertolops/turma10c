package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoEtapa2 {

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

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
		int adivinha = Integer.parseInt(JOptionPane.showInputDialog("tente adivinhar qual o numero digitado"));
		int tentativas = 1;
		while (numero != adivinha) {
			adivinha = Integer.parseInt(JOptionPane.showInputDialog("voc� errou, tente novamente"));
			tentativas = tentativas+1;
			if (adivinha == numero) {
				JOptionPane.showMessageDialog(null, "voc� adivinhou o numero, o n�mero � " + adivinha + " e o numero de tentativas foi " + tentativas);
			}else if (adivinha > numero) {	
				JOptionPane.showMessageDialog(null, "o numero � menor");
				//System.out.println("o numero � menor");
				//JOptionPane.showMessageDialog(null, "o numero � menor");
			} else {
				//System.out.println("o numero � maior");
				JOptionPane.showMessageDialog(null, "o numero � maior");
			}

		}
		//JOptionPane.showMessageDialog(null, "voc� adivinhou o numero, o n�mero � " + adivinha + " e o numero de tentativas foi " + tentativas);;
	}





}


