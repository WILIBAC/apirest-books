package com.company.books.backend.response;

import java.util.*;

import com.company.books.backend.model.Categoria;

public class CategoriaResponse {
	
	private List<Categoria> categoria;

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

}
