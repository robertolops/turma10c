package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;
	
	// Sintaxe para os metodos 
	// <modificador> <Tipo do Retorno> <nomeMetodo> (<TipoParam> <nomeParam>) {

	//preencherEscuderia()
	//retornarEscuderia()
	public void preencherEscuderia(String pEscuderia) {
		escuderia = pEscuderia.toUpperCase();
	}
	public String retornarEscuderia() {
		return escuderia;
	}

	//preencherCor()
	//retornarCor()
	public void preencherCor(String pCor) {
		cor = pCor.toUpperCase();
	}

	public String retornarCor() {
		return cor;
	}

	//preencherValor()
	//retornarValor()
	public void preencherValor(float pValor) {
		valor = pValor;
	}
	public float retornarValor() {
		return valor;
	}


	//preencherLigar()
	//retornarLigar()
	public String ligar() {
		status = true;
		return "Carro ligado!";
	}

	public String desligar() {
		status = false;
		return "Carro desligado!";
	}

	public void acelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual = velocidadeAtual + pVelocidade;
		}
	}

	public void desacelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual = velocidadeAtual - pVelocidade;
			if (velocidadeAtual <0) {
				velocidadeAtual = 0;
			}
		}
	}

	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}	


}// fechar classe


