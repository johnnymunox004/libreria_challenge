package com.alura.desafios.Literalura.servicios;

public interface IConversorDatos {
	<T> T convertirAClase(String json, Class<T> clase);
}
