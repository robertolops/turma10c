package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Para informar o SpringBoot que esta classe tem uma tabela no BD
@Table(name="TB_USUARIO")
public class Usuario {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) //para indicar que este campo é gerado automaticamente
	@Id //para indicar que este atributo faz ligação com a PK da tabela usuario
	@Column(name="id") // @Column usado para associar as variveis da classe com os campos do banco de dados
	private int codigo;
	
	@Column(name="nome", length=40)
	private String nome;
	
	@Column(name="email", length=70)
	private String email;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="fotos", length=100)
	private String foto;
	
	//getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	//construtor cheio e vazio
	public Usuario(int codigo, String nome, String email, String senha, String foto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	public Usuario() {
		super();
	}
	
	

}//final da classe
