package com.company.books.backend.ejemplos.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@BeforeAll
	public static void primero() {
		System.out.println("primero");
	}
	
	@AfterAll
	public static void ultimo() {
		System.out.println("ultimo");
	}
	
	@BeforeEach
	public void instanciaObjeto() {
		calc = new Calculadora();
		System.out.println("@BeforeEach");
	}
	
	@AfterEach
	public void despuesTest() {
		System.out.println("@AfterEach");
	}
	
	@Test
	@DisplayName("Prueba que ocupa assertEqual")
	@Disabled("Esta prueba no se ejecutará ")
	public void calculadoraAssertEqualTest() {
		
		assertEquals(2, calc.sumar(1, 1));
		assertEquals(3, calc.restar(4, 1));
		assertEquals(9, calc.multiplicar(3, 3));
		assertEquals(2, calc.dividir(4, 2));
		
		System.out.println("calculadoraAssertEqualTest");
	}
	
	@Test
	public void calculadoraTrueFalse() {
		
		assertTrue(calc.sumar(1, 1) == 2);
		assertTrue(calc.restar(4, 1) == 3);
		assertFalse(calc.multiplicar(3, 3)  == 8);
		assertFalse(calc.dividir(4, 2) == 1);
		
		System.out.println("calculadoraTrueFalse");
		
	}

}
