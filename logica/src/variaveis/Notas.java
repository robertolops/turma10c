package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// Input=> nome, disciplina, duas notas. 
		// Exibir o nome do aluno, a média e a disciplina.
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
		float media = (nota1 + nota2) / 2;
		System.out.printf("O aluno %s, tem uma média de %.2f na disciplina %s.\n", nome, media, disciplina);
		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media);
		
	}

}
