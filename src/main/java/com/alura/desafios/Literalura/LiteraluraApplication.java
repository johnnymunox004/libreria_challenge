package com.alura.desafios.Literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alura.desafios.Literalura.principal.Consultas;
import com.alura.desafios.Literalura.repository.RepositorioLibros;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{
	
	@Autowired
	private RepositorioLibros repoLibros;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Consultas consulta = new Consultas(repoLibros);
		
		consulta.menu();
		
	}
	
}
