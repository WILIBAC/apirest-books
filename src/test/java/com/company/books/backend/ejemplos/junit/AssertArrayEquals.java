package com.company.books.backend.ejemplos.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AssertArrayEquals {
	
	@Test
	public void pruebaArregloiguales() {
		String [] arre1 = { "a", "b"};
		String [] arre2 = { "a", "b"};
		String [] arre3 = { "a", "b", "c"};
		
		assertArrayEquals(arre1, arre2);
		//assertArrayEquals(arre1, arre3);
		//assertArrayEquals(arre2, arre3);
	}

}
