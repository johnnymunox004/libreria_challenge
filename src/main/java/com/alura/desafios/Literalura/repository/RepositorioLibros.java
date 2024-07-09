package com.alura.desafios.Literalura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alura.desafios.Literalura.modelos.EntidadAutores;
import com.alura.desafios.Literalura.modelos.EntidadLibros;
import com.alura.desafios.Literalura.modelos.Libros;

@Repository
public interface RepositorioLibros extends JpaRepository <EntidadLibros, Long>{
	
	@Query("select distinct idiomas from EntidadLibros")
	List <String> idiomasDeLibros();
	
	@Query("select el from EntidadLibros el where el.idiomas ilike %:idioma%")
	List <EntidadLibros> librosDisponiblesEnIdioma(@Param("idioma") String idioma);
	
}