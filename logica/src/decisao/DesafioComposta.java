package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		// pe�a a entrada de veiculos, capacidade de passageiros
		// exiba a mensagem:
		// "veiculo categoria A", se a capacidade de passageiros for igual a 2
		// "Veiculo categoria B", se a capacidade de passageiros for entre 4 e 7
		// "veiculo categoria C", se a acpacidade de passageiros for maior que 7

		Short capacidade = Short.parseShort(JOptionPane.showInputDialog("Qual a capacidade do ve�culo?"));
		if (capacidade == 2) {
			JOptionPane.showMessageDialog(null, "Ve�culo Categoria A - " + capacidade + " passageiros");
		}else if (capacidade > 7) {
			JOptionPane.showMessageDialog(null, "Ve�culo Categoria C - " + capacidade + " passageiros");
		}else if (capacidade >= 4) {
			JOptionPane.showMessageDialog(null, "Ve�culo Categoria B - " + capacidade + " passageiros");
		}else {
			JOptionPane.showMessageDialog(null, "Categoria Desconhecida - " + capacidade + " passageiros");
		}

	}

}
