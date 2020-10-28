package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController // Indica que a classe irá responder o protocolo HTTP (Métodos: GET/POST)
public class UsuarioController {
	
	@Autowired //Indica que o gerenciamento do atributo será feito pelo Spring
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll() {
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/usuario/{cod}")
	public ResponseEntity<Usuario> pesquisarUsuario(@PathVariable int cod) {
		Usuario objeto = dao.findById(cod).orElse(null);
		if (objeto == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);	
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
	return ResponseEntity.ok(resposta);
	
	}
	
	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> add(@RequestBody Usuario objeto){
		try {
			Usuario resposta = dao.save(objeto);
			return ResponseEntity.ok(resposta);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	@GetMapping("/usuarionome/{nome}")
	public ResponseEntity<List<Usuario>> getPequisaNome(@PathVariable String nome) {
		List<Usuario> lista = dao.findByNome(nome);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/usuariositau")
	public ResponseEntity<List<Usuario>> getUsersItau() {
		List<Usuario> todos = (List<Usuario>) dao.findAll();
		List<Usuario> resposta = new ArrayList<Usuario>();
		
		for (Usuario objeto : todos) {
			if(objeto.getEmail().indexOf("itau-unibanco.com.br")>-1) {
					resposta.add(objeto);
			}		
					
		}
		if(resposta.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	
	
	
}//final da classe
