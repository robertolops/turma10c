package br.com.casageral.modelo;

public class Televisao {

	private String marca;
	private float valor;
	private boolean status;
	private int canal;
	private int volume;

	// Sintaxe para os metodos 
	// <modificador> <Tipo do Retorno> <nomeMetodo> (<TipoParam> <nomeParam>) {


	public void preencherMarca(String pMarca) {
		marca = pMarca;
	}


	public String retornarMarca() {
		return marca.toUpperCase();
	}

	public void preencherValor(float pValor) {
		valor = pValor;
	}

	public float retornarValor() {
		return valor;
	}

	public String ligar() {
		status = true;
		return "Televis�o ligada.";
	}

	public String desligar() {
		status = false;
		canal = 0;
		return "Televis�o desligada.";
	}

	public boolean retornarStatus() {
		return status;
	}

	public void mudarCanal(int pCanal) {
		if (status == true) {
			canal = pCanal;
		}
		if (canal<0) {
			canal = 0;
		}

	}

	public int retornarCanal() {
		return canal;
	}

	public void aumentarVolume(int pVolume) {
		if (status==true) {
			volume+=pVolume;
		}
	}
	public void diminuirVolume(int pVolume) {
		if (status==true) {
			volume-=pVolume;
		}
		if (volume < 0) {
			volume = 0;
		}
	}

	public int retornarVolume() {
		return volume;
	}

	public String retornarTudo() {
		return 
				"Marca...: " + marca + "\n" +
				"Valor...: " + valor + "\n" +
				"Status..: " + status + "\n" +
				"Volume..: " + volume + "\n" +
				"Canal...: " + canal;
	}


}// final da classe