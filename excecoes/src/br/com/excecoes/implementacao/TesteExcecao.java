package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exceções: não são controladas pelo programador.
		// Existem dois tipos:
		// A-) Checked: o Java verifica
		// B-) Unchecked: só ocorre após a compilação
		try {
			int numero = Integer.parseInt("7");
			System.out.println("Resultado = " + (numero *10));
			
			String email=null;
			if (email==null) {
				throw new RuntimeException("Dado Corrompido");
		}
			System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada Inválida");
		}catch(NumberFormatException e) {
			System.out.println("Número Inválido");
			//e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("Objeto NUlo");
		}finally {
			System.out.println("Ate logo");
		}

	}

}
