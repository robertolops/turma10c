package repeticao;

import javax.swing.JOptionPane;

public class DesafioFor2 {

	public static void main(String[] args) {
		
		/*
		 * 2�) Monte um programa que solicite a idade e o 
		 * nome das pessoas. Ao terminar, (quando o usu�rio 
		 * responder "SIM", que ele quer terminar) o programa dever� exibir:
		 * *** a pessoa mais velha (nome e idade), 
		 * **** a pessoa mais nova (nome e idade), 
		 * * a quantidade de pessoas maiores de idade e 
		 * ** a m�dia entre as idades que foram digitadas.
		 */
		 int iVelha = 0;
		 String nVelha ="";
		 int iNova = 1000;
		 String nNova ="";
		 int qm = 0;
		 int qtde = 0;
		 int somaidade = 0;
		 Short idade = 0;
		 String interrompe = "N";
		 
		 do {
			 
			 idade = Short.parseShort(JOptionPane.showInputDialog("Digite a sua idade"));
			 String nome = (JOptionPane.showInputDialog("Digite o seu nome"));
			 System.out.println("nome: " + nome + "\n" + "idade: " + idade);
			 qtde++;
			 somaidade=somaidade+idade;
			 if (iVelha>idade) {
				 iVelha=iVelha;
				 nVelha=nVelha;
			 }else {
				 iVelha=idade;
				 nVelha=nome;
			 }
			 
			 if (iNova < idade) {
				 iNova=iNova;
				 nNova = nNova;
			 }else {
				 iNova=idade;
				 nNova=nome;
			 }
					 
			 if (idade>=18) {
				 qm++;
			 }else {
				 qm=qm;
			 }
			 
			 interrompe = (JOptionPane.showInputDialog("deseja finalizar? <S> ou <N>").toUpperCase());
		 } while (interrompe.equals("N"));
		 System.out.println("\nNome da pessoa mais velha: " + nVelha);
		 System.out.println("Idade da pessoa mais velha: " + iVelha + "\n");
		 System.out.println("Nome da pessoa mais nova: " + nNova);
		 System.out.println("Idade da pessoa mais nova: " + iNova);
		 System.out.println("\nQuantidade de pessoas maiores de idade: " + qm);
		 System.out.println("M�dia da soma das idades: " + (somaidade/qtde) + "\n");
		 System.out.println("programa encerrado");
				
		}

	}


