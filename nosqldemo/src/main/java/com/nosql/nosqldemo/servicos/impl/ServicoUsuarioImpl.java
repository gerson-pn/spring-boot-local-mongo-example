package com.nosql.nosqldemo.servicos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosql.nosqldemo.entidades.Usuario;
import com.nosql.nosqldemo.repositorios.RepositorioUsuario;
import com.nosql.nosqldemo.servicos.ServicoUsuario;

@Service
public class ServicoUsuarioImpl implements ServicoUsuario {

	@Autowired
	private RepositorioUsuario repositorio;

	@Override
	public List<Usuario> obterTodos() {
		return repositorio.findAll();
	}

	@Override
	public Usuario obterPorId(String id) {
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void criar(Usuario novo) {
		repositorio.save(novo);
	}

	@Override
	public void remover(Usuario alvo) {
		repositorio.delete(alvo);
	}

}
