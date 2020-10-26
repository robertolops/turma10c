package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setQtde(Magica.i("Qtde"));
		p.setValorCompra(Magica.f("Valor de Compra"));
		p.setValorVenda(Magica.f("Valor de Venda"));
		
		//getDesconto(); totalCompras(); totalVendas(); ajustarValores();
		
		System.out.println("Total de Compra:" + p.totalCompra());
		System.out.println("Total de Venda: " + p.totalVenda());
		System.out.println("Venda com 10% de desconto: " + p.getDesconto());
		System.out.println("Venda com X% de desconto: " + p.getDesconto(Magica.f("Porcentual de desconto:")));
		p.ajustarValores(Magica.f("Valor a ser adicionado"));
		System.out.println(p.getValorCompra());
		System.out.println(p.getValorVenda());

	}

}
