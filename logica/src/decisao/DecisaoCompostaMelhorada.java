package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaMelhorada {

	public static void main(String[] args) {
		/*
		 * Pe�am o total de faltas
		 * Se o total de faltas for maior que 20, o aluno esta reprovado
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
		Short faltas = Short.parseShort(JOptionPane.showInputDialog("Quantas faltas o aluno teve?"));
		float media = (nota1 + nota2) / 2;
		if (faltas > 20) {
			System.out.printf("O aluno %s, foi reprovado por faltas, quantidade de faltas %d\n", nome, faltas);
		}else if (media >= 6) {
			System.out.printf("O aluno %s, foi aprovado com uma uma m�dia de %.2f.\n", nome, media);
		}else if (media < 4) {
			System.out.printf("O aluno %s, foi reprovado com uma uma m�dia de %.2f.\n", nome, media);
		}else {
			System.out.printf("O aluno %s, ainda tem uma chance no exame, ficou com m�dia de %.2f.\n", nome, media);
		}

	}// metodo main

}// da classe