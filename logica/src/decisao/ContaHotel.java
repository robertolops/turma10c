package decisao;

import javax.swing.JOptionPane;

public class ContaHotel {

	public static void main(String[] args) {
		/*
		 * Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
			A taxa de servi�os � de: 
			R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
			Monte uma aplica��o que apresente a conta do cliente 
		 */
	Short qtde = Short.parseShort(JOptionPane.showInputDialog("Qual foi a quantidade de di�rias?"));
	if (qtde < 15) {
		JOptionPane.showMessageDialog(null, "Total da estadia � de: R$ " + ((80*qtde)+(qtde*8)));
	} else if (qtde == 15) {
		JOptionPane.showMessageDialog(null, "Total da estadia � de: R$ " + ((80*qtde)+(qtde*6)));
	} else {	
		JOptionPane.showMessageDialog(null, "Total da estadia � de: R$ " + ((80*qtde)+(qtde*5.5)));
	}
	}

}
