package br.com.unixyz.modelo;


// implementação = principal = teste (camada onde tem o main()
// modelo = beans = javabeans = dto = to

/*
 * Design Patterns - padrões para escrita, que devem ser utilizados para programação Orientada a Objeto
 * DTO (Data Transfer Object)
 * - Todo atributo DEVE ser privado.
 * - Cada atributo deve possuir UM metodo de input (setter) e UM metodo de output (getter).
 * - Cada classe deve possuir no minimo dois construtores (u vazio e o outro cheio, 
 *   (um vazio e o outro cheio - com todos os atributos)
 */



public class Aluno {
	private int rm;
	private String nome;
	private String email;

	
	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public void setAll(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public String getAll() {
		return
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email + "\n";
	}

	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


















}//fim da classe
