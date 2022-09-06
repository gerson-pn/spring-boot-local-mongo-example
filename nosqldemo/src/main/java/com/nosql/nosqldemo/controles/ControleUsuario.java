package com.nosql.nosqldemo.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nosql.nosqldemo.entidades.Usuario;
import com.nosql.nosqldemo.servicos.impl.ServicoUsuarioImpl;

@RestController
public class ControleUsuario {

	@Autowired
	private ServicoUsuarioImpl servico;

	@GetMapping("/usuarios")
	public List<Usuario> usuarios() {
		return servico.obterTodos();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario usuario(@PathVariable String id) { 
		return servico.obterPorId(id);
	}
	
	@PostMapping("/usuario/cadastrar")
	public void cadastrar(@RequestBody Usuario novo) {
		servico.criar(novo);
	}
	
	@DeleteMapping("/usuario/remover/{id}")
	public void remover(@PathVariable String id) {
		Usuario alvo = servico.obterPorId(id);
		servico.remover(alvo);
	}
}