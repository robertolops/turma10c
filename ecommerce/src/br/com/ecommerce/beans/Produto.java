package br.com.ecommerce.beans;

public class Produto {
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

	
	
	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public Produto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}
	
	public String getAll() {
		return 
				"ID.............: " + id + "\n" +
				"Descri��o......: " + descricao + "\n" +
				"Valor de Venda.: " + valorVenda + "\n" +
				"Valor de Compra: " + valorCompra + "\n" +
				"Quantidade.....: " + qtde;
				
	}
	
	public float totalVenda() {
		return valorVenda * qtde;

	}
		
	public float totalCompra() { 
		return valorCompra * qtde;
	}

	public float getDesconto() {
		return valorVenda* (float) 0.9;
	}
	
	public void ajustarValores(float valor) {
		valorVenda = valorVenda+valor;
		valorCompra = valorCompra+valor;
	}
	
	public float getDesconto(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}
	
}
