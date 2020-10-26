package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		/*
		 * Peçam o total de faltas
		 * Se o total de faltas for maior que 20, o aluno esta reprovado
		 */
		Short faltas = Short.parseShort(JOptionPane.showInputDialog("Quantas faltas o aluno teve?"));
		if (faltas > 20) {
			System.out.printf("O aluno foi reprovado por faltas, quantidade de faltas %d\n", faltas);
		} else {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
			float media = (nota1 + nota2) / 2;
			if (media >= 6) {
				System.out.printf("O aluno %s, foi aprovado com uma uma média de %.2f.\n", nome, media);
			}else if (media < 4) {
				System.out.printf("O aluno %s, foi reprovado com uma uma média de %.2f.\n", nome, media);
			}else {
				System.out.printf("O aluno %s, ainda tem uma chance no exame, ficou com média de %.2f.\n", nome, media);
			}
		}

	}// metodo main

}// da classe
