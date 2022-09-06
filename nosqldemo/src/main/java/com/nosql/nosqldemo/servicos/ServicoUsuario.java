package com.nosql.nosqldemo.servicos;

import java.util.List;

import com.nosql.nosqldemo.entidades.Usuario;

public interface ServicoUsuario {
	public List<Usuario> obterTodos();

	public Usuario obterPorId(String id);

	public void criar(Usuario novo);
	
	public void remover(Usuario alvo);
}