package com.nosql.nosqldemo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Usuario {
	@Id
	private String id;

	private String perfil;
	private String nome;
	private Date dataCadastro;

	private List<Telefone> telefones = new ArrayList<Telefone>();
}