package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// 
		// Crie as variaveis para armazenar:
		// nome do produto, código, valor e qtde.
		// Exiba no final o nome do produto, o total e o total com 10% de desconto
		
		
		/*
		 * Parse => conversão entre tipos incompatíveis (String => primitivo)
		 * Primitivo => são os tipos que fazem parte da linguagem (começam com letras minusculas)
		 * 
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => numeros inteiros (-127 // +128)
		 * short => numeros inteiros (-32k // + 32k)
		 * int => numeros inteiros (-2bilhoes // +2bilhoes)
		 * long => numeros inteiros 
		 * float => numeros reais
		 * double => numeros reais (possui o dobro de precisão nas casas decimais)
		 * 
		 * Classe Wrapper => são classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean = Boolean
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
		double total = qtde * valor;
		double total10 = total * 0.9;
		System.out.printf("O produto %s, possui o código %d e o valor dele é R$ %.2f, com desconto de 10%%, o valor é R$ %.2f.\n", nome, codigo, valor, total10);
		System.out.println("nome..............: " + nome);
		System.out.println("codigo............: " + codigo);
		System.out.println("valor unitario....: " + valor);
		System.out.println("qtde..............: " + qtde);
		System.out.println("total.............: " + total);
		System.out.println("total com desconto: " + total10);

	}

}
