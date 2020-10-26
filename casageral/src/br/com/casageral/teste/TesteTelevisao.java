package br.com.casageral.teste;

import javax.swing.JOptionPane;

import br.com.casageral.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao objeto = null;
		Televisao tv = new Televisao();

		tv.preencherMarca(JOptionPane.showInputDialog( "Qual a marca da televis�o?"));
		System.out.println(tv.retornarMarca());

		tv.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da televisao?")));
		System.out.println(tv.retornarValor());

		if (JOptionPane.showConfirmDialog(null, "Ligar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(tv.ligar());
		}else{
			System.out.println(tv.desligar());
		}

		
		tv.mudarCanal(Integer.parseInt(JOptionPane.showInputDialog("Qual canal deseja assitir?")));
		System.out.println(tv.retornarCanal());

		
		tv.aumentarVolume(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do volume desejado:")));
		System.out.println(tv.retornarVolume());
		
		tv.diminuirVolume(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do volume desejado:")));
		System.out.println(tv.retornarVolume());

		System.out.println(tv.retornarTudo());
		
		if (JOptionPane.showConfirmDialog(null, "Desligar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(tv.desligar());
		}
		
		System.out.println(tv.retornarTudo());

	}//final do public void
}// final da classe


