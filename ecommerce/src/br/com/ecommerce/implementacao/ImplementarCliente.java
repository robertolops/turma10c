package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		int resposta = Magica.i("Digite <1> PF ou <2> PJ");
				if (resposta==1) {
					c = new PessoaFisica(
							1,
							"Regina",
							"1234-4321",
							new Endereco(),
							"123.456.789-00",
							"00.000.000-x"							
							);
				}else if (resposta==2) {
					c = new PessoaJuridica(
							1,
							"Regina",
							"1234-4321",
							new Endereco(),
							"00.000.000/0001-00",
							"000.000.000.000",
							"Sr. Joaozinho"						
							);
				}

		System.out.println(c.getAll());
				
				
				
				
	}// fim do MAIN

}// fim da classe
