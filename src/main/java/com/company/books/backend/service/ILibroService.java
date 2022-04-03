package com.company.books.backend.service;

import org.springframework.http.ResponseEntity;

import com.company.books.backend.model.Libro;
import com.company.books.backend.response.LibroResponseRest;

public interface ILibroService {
	
	public ResponseEntity<LibroResponseRest> buscarLibros();
	public ResponseEntity<LibroResponseRest> buscarPorId(Long id);
	public ResponseEntity<LibroResponseRest> crear(Libro libro);
	public ResponseEntity<LibroResponseRest> actualizar(Libro libro, Long id);
	public ResponseEntity<LibroResponseRest> eliminar(Long id);

}
