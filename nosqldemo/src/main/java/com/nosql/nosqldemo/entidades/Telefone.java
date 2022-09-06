package com.nosql.nosqldemo.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Telefone {
	@Id
	private String id;
	
	private String ddd;
	private String numero;
}