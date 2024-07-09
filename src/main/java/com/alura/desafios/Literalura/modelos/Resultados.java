package com.alura.desafios.Literalura.modelos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Resultados(
		@JsonAlias("results") List <Libros> libros
		) {
	
}
