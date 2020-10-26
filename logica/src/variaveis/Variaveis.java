package variaveis;

import javax.swing.JOptionPane;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Parse => convers�o entre tipos incompat�veis (String => primitivo)
		 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
		 * 
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => numeros inteiros (-127 // +128)
		 * short => numeros inteiros (-32k // + 32k)
		 * int => numeros inteiros (-2bilhoes // +2bilhoes)
		 * long => numeros inteiros 
		 * float => numeros reais
		 * double => numeros reais (possui o dobro de precis�o nas casas decimais)
		 * 
		 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean = Boolean
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
		double imc = peso / (altura*altura);
		System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f.\n", nome, idade, imc);
		//System.out.println("nome: " + nome);
		//System.out.println("idade: " + idade);
		// %f => numeros reais /// %s => Strings /// %d => inteiros
		//System.out.printf("imc: %.2f\n", imc);
		
	}

}
