package com.nosql.nosqldemo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nosql.nosqldemo.entidades.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String> {
}