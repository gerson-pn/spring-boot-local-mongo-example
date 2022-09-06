package com.nosql.nosqldemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nosql.nosqldemo.entidades.Telefone;
import com.nosql.nosqldemo.entidades.Usuario;
import com.nosql.nosqldemo.servicos.impl.ServicoUsuarioImpl;

@SpringBootApplication
public class NosqldemoApplication implements CommandLineRunner {

	@Autowired
	private ServicoUsuarioImpl servico;

	public static void main(String[] args) {
		SpringApplication.run(NosqldemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario novo = new Usuario();
		novo.setNome("Pedro Alcantara");
		novo.setPerfil("administrador");
		novo.setDataCadastro(new Date());
		
		Telefone tel1 = new Telefone();
		tel1.setDdd("00");
		tel1.setNumero("999999999");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("00");
		tel2.setNumero("888888888");
		
		novo.getTelefones().add(tel1);
		novo.getTelefones().add(tel2);
		
		servico.criar(novo);
	}
}