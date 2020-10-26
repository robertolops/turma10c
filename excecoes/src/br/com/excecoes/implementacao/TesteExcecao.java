package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es: n�o s�o controladas pelo programador.
		// Existem dois tipos:
		// A-) Checked: o Java verifica
		// B-) Unchecked: s� ocorre ap�s a compila��o
		try {
			int numero = Integer.parseInt("7");
			System.out.println("Resultado = " + (numero *10));
			
			String email=null;
			if (email==null) {
				throw new RuntimeException("Dado Corrompido");
		}
			System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada Inv�lida");
		}catch(NumberFormatException e) {
			System.out.println("N�mero Inv�lido");
			//e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("Objeto NUlo");
		}finally {
			System.out.println("Ate logo");
		}

	}

}
