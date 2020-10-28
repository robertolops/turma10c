package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
	public List<Usuario> findByNome(String nome);

}

